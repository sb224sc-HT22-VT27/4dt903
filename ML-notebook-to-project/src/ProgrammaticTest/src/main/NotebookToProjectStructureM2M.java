package main;

import java.io.IOException;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import notebookMM.*;
import notebookMM.util.NotebookJSONParser;
import projectStructureMM.*;

/**
 * M2M Transformation: NotebookModel -> ProjectStructure
 * Transforms a Jupyter notebook model into a project structure model.
 */
public class NotebookToProjectStructureM2M {
    
    private ProjectStructureMMFactory factory;
    
    public NotebookToProjectStructureM2M() {
        this.factory = ProjectStructureMMFactory.eINSTANCE;
    }
    
    /**
     * Transform a NotebookModel into a ProjectStructure
     * @param notebook The source notebook model
     * @return The target project structure model
     */
    public ProjectStructure transform(NotebookModel notebook) {
        if (notebook == null) {
            throw new IllegalArgumentException("Notebook cannot be null");
        }
        
        // Create project structure
        ProjectStructure projectStructure = factory.createProjectStructure();
        
        // Set project name from notebook name or default
        String projectName = notebook.getName();
        if (projectName == null || projectName.isEmpty()) {
            projectName = "NotebookProject";
        }
        projectStructure.setName(projectName);
        
        // Create src directory
        Directory srcDir = factory.createDirectory();
        srcDir.setName("src");
        projectStructure.getFilesystemelement().add(srcDir);
        
        // Create main.py with all imports and code
        File mainPy = factory.createFile();
        mainPy.setName("main.py");
        
        // Build complete content for main.py - NO APPENDING
        String mainPyContent = buildMainPyContent(notebook);
        mainPy.setContent(mainPyContent);
        
        srcDir.getFilesystemelement().add(mainPy);
        
        // Create data directory
        Directory dataDir = factory.createDirectory();
        dataDir.setName("data");
        projectStructure.getFilesystemelement().add(dataDir);
        
        // Create README.md with notebook structure
        File readme = factory.createFile();
        readme.setName("README.md");
        
        // Build complete content for README.md - NO APPENDING
        String readmeContent = buildReadmeContent(notebook);
        readme.setContent(readmeContent);
        
        projectStructure.getFilesystemelement().add(readme);
        
        return projectStructure;
    }
    
    /**
     * Build the complete content for main.py file
     * This method constructs the entire string at once, not by appending
     */
    private String buildMainPyContent(NotebookModel notebook) {
        StringBuilder content = new StringBuilder();
        
        // Add header comment
        content.append("# Generated from Jupyter Notebook: ").append(notebook.getName()).append("\n\n");
        
        // Add all imports
        List<String> imports = notebook.getAllImports();
        if (!imports.isEmpty()) {
            content.append("# Imports\n");
            for (String imp : imports) {
                content.append(imp).append("\n");
            }
            content.append("\n");
        }
        
        // Add main function
        content.append("def main():\n");
        
        // Add code from all code cells
        List<CodeCell> codeCells = notebook.getCodeCells();
        if (!codeCells.isEmpty()) {
            content.append("    # Code from notebook cells\n");
            for (CodeCell cell : codeCells) {
                String source = cell.getSource();
                if (source != null && !source.trim().isEmpty()) {
                    // Indent each line of source code
                    String[] lines = source.split("\n");
                    for (String line : lines) {
                        if (!line.trim().startsWith("import ") && !line.trim().startsWith("from ")) {
                            content.append("    ").append(line).append("\n");
                        }
                    }
                    content.append("\n");
                }
            }
        } else {
            content.append("    pass\n");
        }
        
        // Add main execution
        content.append("\nif __name__ == '__main__':\n");
        content.append("    main()\n");
        
        // Return the complete string - built in one go
        return content.toString();
    }
    
    /**
     * Build the complete content for README.md file
     * This method constructs the entire string at once, not by appending
     */
    private String buildReadmeContent(NotebookModel notebook) {
        StringBuilder content = new StringBuilder();
        
        // Add title
        String projectName = notebook.getName() != null ? notebook.getName() : "Notebook Project";
        content.append("# ").append(projectName).append("\n\n");
        
        // Add description
        content.append("This project was generated from a Jupyter Notebook.\n\n");
        
        // Add notebook structure
        content.append("## Notebook Structure\n\n");
        List<MarkdownCell> markdownCells = notebook.getMarkdownCells();
        if (!markdownCells.isEmpty()) {
            for (MarkdownCell cell : markdownCells) {
                if (cell.isHeader()) {
                    int level = cell.getHeaderLevel();
                    String title = cell.extractTitle();
                    // Create markdown header with appropriate level
                    for (int i = 0; i < level; i++) {
                        content.append("#");
                    }
                    content.append(" ").append(title).append("\n");
                }
            }
        } else {
            content.append("No structure information available.\n");
        }
        
        content.append("\n## Usage\n\n");
        content.append("```bash\n");
        content.append("python src/main.py\n");
        content.append("```\n");
        
        // Return the complete string - built in one go
        return content.toString();
    }
    
    /**
     * Save the ProjectStructure model to an XMI file
     */
    public void saveModel(ProjectStructure projectStructure, String outputPath) throws IOException {
        // Register the XMI resource factory
        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap()
            .put("xmi", new XMIResourceFactoryImpl());
        
        // Register the package
        ProjectStructureMMPackage.eINSTANCE.eClass();
        
        // Create resource set and resource
        ResourceSet resourceSet = new ResourceSetImpl();
        URI uri = URI.createFileURI(outputPath);
        Resource resource = resourceSet.createResource(uri);
        
        // Add the project structure to the resource
        resource.getContents().add(projectStructure);
        
        // Save the resource
        resource.save(null);
    }
    
    /**
     * Main method for testing the M2M transformation
     */
    public static void main(String[] args) {
        String inputDir = "../../input/";
        String outputDir = "../../output/";
        
        try {
            // Parse notebook
            NotebookJSONParser parser = new NotebookJSONParser();
            NotebookModel notebook = parser.parseNotebook(
                inputDir + "Customer-Churn-Prediction/simple_classification.ipynb"
            );
            
            // Validate notebook
            if (!notebook.validate()) {
                System.err.println("Invalid notebook structure!");
                return;
            }
            
            // Check if Python
            if (!notebook.getMetadata().isPythonKernel()) {
                System.err.println("Only Python notebooks supported!");
                return;
            }
            
            System.out.println("=== M2M Transformation ===");
            System.out.println("Transforming notebook: " + notebook.getName());
            
            // Perform M2M transformation
            NotebookToProjectStructureM2M transformer = new NotebookToProjectStructureM2M();
            ProjectStructure projectStructure = transformer.transform(notebook);
            
            System.out.println("Project structure created: " + projectStructure.getName());
            System.out.println("Number of root elements: " + projectStructure.getFilesystemelement().size());
            
            // Save the model
            String outputPath = outputDir + "ProjectStructureModel.xmi";
            transformer.saveModel(projectStructure, outputPath);
            
            System.out.println("Model saved to: " + outputPath);
            System.out.println("\n=== Transformation Complete ===");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

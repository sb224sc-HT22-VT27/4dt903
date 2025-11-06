package main;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import projectStructMM.*;

/**
 * Programmatic test for ProjectStructMM model.
 * This demonstrates loading and traversing a project structure model.
 */
public class ProjectStructureAnalyzer {
    
    public static void main(String[] args) {
        // Register the XMI resource factory
        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
        
        // Register the package
        ProjectStructMMPackage.eINSTANCE.eClass();
        
        // Create a resource set
        ResourceSet resourceSet = new ResourceSetImpl();
        
        try {
            // Load the model - use command line argument if provided
            String modelPath = args.length > 0 ? args[0] : "../ProjectStructM2T/models/sample-project.xmi";
            URI uri = URI.createFileURI(modelPath);
            Resource resource = resourceSet.getResource(uri, true);
            
            // Get the root Project element
            Project project = (Project) resource.getContents().get(0);
            
            System.out.println("=== Project Structure Analysis ===");
            System.out.println("Project Name: " + project.getName());
            System.out.println("Description: " + project.getDescription());
            System.out.println();
            
            // Analyze structure
            System.out.println("=== Structure Overview ===");
            System.out.println("Root Folders: " + project.getFolders().size());
            System.out.println("Root Files: " + project.getFiles().size());
            System.out.println();
            
            // Display folder structure
            System.out.println("=== Folder Structure ===");
            for (Folder folder : project.getFolders()) {
                displayFolder(folder, 0);
            }
            
            // Display root files
            System.out.println("\n=== Root Files ===");
            for (File file : project.getFiles()) {
                System.out.println("- " + file.getName() + " (" + file.getFileType() + ")");
                if (file.getContent() != null && !file.getContent().isEmpty()) {
                    int lineCount = file.getContent().split("\n", -1).length - 1;
                    if (lineCount < 1) lineCount = 1; // Minimum 1 line for non-empty content
                    System.out.println("  Content: " + lineCount + " lines");
                }
            }
            
            // Statistics
            System.out.println("\n=== Statistics ===");
            int totalFolders = countFolders(project);
            int totalFiles = countFiles(project);
            System.out.println("Total Folders: " + totalFolders);
            System.out.println("Total Files: " + totalFiles);
            
            System.out.println("\n✓ Model loaded and traversed successfully!");
            
        } catch (Exception e) {
            System.err.println("Error loading model:");
            e.printStackTrace();
        }
    }
    
    /**
     * Recursively display folder structure
     */
    private static void displayFolder(Folder folder, int level) {
        String indent = "  ".repeat(level);
        System.out.println(indent + "📁 " + folder.getName() + "/");
        
            // Display files in this folder
            for (File file : folder.getFiles()) {
                System.out.println(indent + "  📄 " + file.getName());
            }
        
        // Recursively display subfolders
        for (Folder subfolder : folder.getSubfolders()) {
            displayFolder(subfolder, level + 1);
        }
    }
    
    /**
     * Count total number of folders recursively
     */
    private static int countFolders(Project project) {
        int count = project.getFolders().size();
        for (Folder folder : project.getFolders()) {
            count += countSubfolders(folder);
        }
        return count;
    }
    
    private static int countSubfolders(Folder folder) {
        int count = folder.getSubfolders().size();
        for (Folder subfolder : folder.getSubfolders()) {
            count += countSubfolders(subfolder);
        }
        return count;
    }
    
    /**
     * Count total number of files recursively
     */
    private static int countFiles(Project project) {
        int count = project.getFiles().size();
        for (Folder folder : project.getFolders()) {
            count += countFilesInFolder(folder);
        }
        return count;
    }
    
    private static int countFilesInFolder(Folder folder) {
        int count = folder.getFiles().size();
        for (Folder subfolder : folder.getSubfolders()) {
            count += countFilesInFolder(subfolder);
        }
        return count;
    }
}

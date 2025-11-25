package main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;

import notebookMM.NotebookMMPackage;
import notebookMM.NotebookModel;
import notebookMM.util.NotebookJSONParser;
import projectStructureMM.Directory;
import projectStructureMM.File;
import projectStructureMM.FileSystemElement;
import projectStructureMM.ProjectStructure;
import projectStructureMM.ProjectStructureMMPackage;

/**
 * Full Pipeline: T2M -> M2M -> M2T
 * 
 * This class connects the pipeline from Text-to-Model (T2M), Model-to-Model
 * (M2M), and Model-to-Text (M2T) into one seamless execution.
 * 
 * T2M: Parses .ipynb files to NotebookModel 
 * M2M: Uses NotebookToProject.qvto to transform NotebookModel to ProjectStructure 
 * M2T: Generates Python project files from ProjectStructure
 */
public class FullPipeline {

	/** Path to the QVT-O transformation file */
	private static final String QVTO_TRANSFORMATION_PATH = "../NotebookToProjectM2M/transforms/NotebookToProject.qvto";

	private final NotebookJSONParser parser;

	public FullPipeline() {
		this.parser = new NotebookJSONParser();
		// Register EMF packages
		NotebookMMPackage.eINSTANCE.eClass();
		ProjectStructureMMPackage.eINSTANCE.eClass();
	}

	/**
	 * Execute the full pipeline for a single notebook file
	 * 
	 * @param inputPath  Path to the .ipynb file
	 * @param outputPath Base directory for generated output
	 */
	public void execute(String inputPath, String outputPath) throws IOException {
		System.out.println("=== Full Pipeline Execution ===");
		System.out.println("Input: " + inputPath);
		System.out.println("Output: " + outputPath);
		System.out.println();

		// Step 1: T2M - Parse notebook to model
		System.out.println("Step 1: T2M - Parsing notebook to model...");
		NotebookModel notebookModel = textToModel(inputPath);
		System.out.println("  Parsed notebook: " + notebookModel.getName());
		System.out.println("  Cells: " + notebookModel.getCells().size());
		System.out.println();

		// Step 2: M2M - Transform NotebookModel to ProjectStructure
		System.out.println("Step 2: M2M - Transforming to project structure...");
		ProjectStructure projectStructure = modelToModel(notebookModel);
		System.out.println("  Project name: " + projectStructure.getName());
		System.out.println("  Elements: " + projectStructure.getFilesystemelement().size());
		System.out.println();

		// Step 3: M2T - Generate files from ProjectStructure
		System.out.println("Step 3: M2T - Generating project files...");
		modelToText(projectStructure, outputPath);
		System.out.println();

		System.out.println("=== Pipeline Complete ===");
	}

	/**
	 * Execute the full pipeline for all notebooks in a directory
	 * 
	 * @param inputDir  Directory containing .ipynb files
	 * @param outputDir Base directory for generated output
	 */
	public void executeAll(String inputDir, String outputDir) throws IOException {
		List<String> notebooks = findIpynbFiles(inputDir);

		if (notebooks.isEmpty()) {
			System.err.println("No .ipynb files found in " + inputDir);
			return;
		}

		System.out.println("Found " + notebooks.size() + " notebook(s) to process\n");

		for (String notebookPath : notebooks) {
			try {
				// Compute relative output path
				Path inputRoot = Paths.get(inputDir).toAbsolutePath().normalize();
				Path notebookFile = Paths.get(notebookPath).toAbsolutePath().normalize();
				Path relativePath = inputRoot.relativize(notebookFile.getParent());

				String projectOutputDir = Paths.get(outputDir).resolve(relativePath).toString();

				execute(notebookPath, projectOutputDir);
				System.out.println();
			} catch (Exception e) {
				System.err.println("Error processing: " + notebookPath);
				e.printStackTrace();
			}
		}
	}

	// ==================== T2M: Text to Model ====================

	/**
	 * T2M: Parse a Jupyter notebook file to NotebookModel
	 */
	private NotebookModel textToModel(String filePath) throws IOException {
		NotebookModel notebook = parser.parseNotebook(filePath);

		// Validate notebook
		if (!notebook.validate()) {
			throw new IOException("Invalid notebook structure: " + filePath);
		}

		// Only Python notebooks
		if (notebook.getMetadata() != null && !notebook.getMetadata().isPythonKernel()) {
			throw new IOException("Non-Python notebook not supported: " + filePath);
		}

		return notebook;
	}

	// ==================== M2M: Model to Model ====================

	/**
	 * M2M: Transform NotebookModel to ProjectStructure using QVT-O transformation.
	 * This executes the NotebookToProject.qvto transformation file.
	 */
	private ProjectStructure modelToModel(NotebookModel notebook) throws IOException {
		// Resolve and validate the QVT-O transformation path
		Path transformationPath = Paths.get(QVTO_TRANSFORMATION_PATH).toAbsolutePath().normalize();
		if (!Files.exists(transformationPath)) {
			throw new IOException("QVT-O transformation file not found: " + transformationPath);
		}

		// Load the QVT-O transformation
		URI transformationURI = URI.createFileURI(transformationPath.toString());
		
		TransformationExecutor executor = new TransformationExecutor(transformationURI);

		// Create input extent with the NotebookModel
		List<EObject> inputObjects = new ArrayList<>();
		inputObjects.add(notebook);
		ModelExtent input = new BasicModelExtent(inputObjects);

		// Create output extent for the ProjectStructure
		ModelExtent output = new BasicModelExtent();

		// Create execution context
		ExecutionContextImpl context = new ExecutionContextImpl();
		context.setConfigProperty("keepModeling", true);

		// Execute the transformation
		ExecutionDiagnostic result = executor.execute(context, input, output);

		// Check for errors
		if (result.getSeverity() != Diagnostic.OK) {
			throw new IOException("QVT-O transformation failed: " + result.getMessage());
		}

		// Get the output ProjectStructure
		List<EObject> outputObjects = output.getContents();
		if (outputObjects.isEmpty()) {
			throw new IOException("QVT-O transformation produced no output");
		}

		// Find the ProjectStructure in the output
		for (EObject obj : outputObjects) {
			if (obj instanceof ProjectStructure) {
				return (ProjectStructure) obj;
			}
		}

		throw new IOException("QVT-O transformation did not produce a ProjectStructure");
	}

	// ==================== M2T: Model to Text ====================

	/**
	 * M2T: Generate files from ProjectStructure This replicates the logic from
	 * generate.mtl (Acceleo template)
	 */
	private void modelToText(ProjectStructure project, String baseOutputDir) throws IOException {
		Path projectDir = Paths.get(baseOutputDir, project.getName());
		Files.createDirectories(projectDir);

		System.out.println("  Generating project at: " + projectDir);

		for (FileSystemElement element : project.getFilesystemelement()) {
			generateElement(element, projectDir);
		}
	}

	/**
	 * Recursively generate files and directories
	 */
	private void generateElement(FileSystemElement element, Path parentDir) throws IOException {
		if (element instanceof Directory) {
			Directory dir = (Directory) element;
			Path dirPath = parentDir.resolve(dir.getName());
			Files.createDirectories(dirPath);
			System.out.println("  Created directory: " + dirPath);

			// Generate child elements
			for (FileSystemElement child : dir.getFilesystemelement()) {
				generateElement(child, dirPath);
			}
		} else if (element instanceof File) {
			File file = (File) element;
			Path filePath = parentDir.resolve(file.getName());

			// Build file content
			StringBuilder content = new StringBuilder();
			for (String line : file.getContent()) {
				content.append(line).append("\n");
			}

			Files.writeString(filePath, content.toString());
			System.out.println("  Created file: " + filePath);
		}
	}

	// ==================== Utility Methods ====================

	/**
	 * Find all .ipynb files in a directory recursively
	 */
	private List<String> findIpynbFiles(String directory) throws IOException {
		List<String> results = new ArrayList<>();

		Files.walk(Paths.get(directory)).filter(Files::isRegularFile)
				.filter(path -> path.toString().endsWith(".ipynb"))
				.forEach(path -> results.add(path.toAbsolutePath().toString()));

		return results;
	}

	// ==================== Main Entry Point ====================

	public static void main(String[] args) {
		FullPipeline pipeline = new FullPipeline();

		// Default paths
		String inputDir = "../../input/";
		String outputDir = "output/generated/";

		// Parse command line arguments
		if (args.length >= 2) {
			inputDir = args[0];
			outputDir = args[1];
		} else if (args.length == 1) {
			inputDir = args[0];
		}

		try {
			pipeline.executeAll(inputDir, outputDir);
		} catch (IOException e) {
			System.err.println("Pipeline execution failed: " + e.getMessage());
			e.printStackTrace();
		}
	}
}

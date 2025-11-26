package main;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;

import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;

import ProjectStructureM2T.main.Generate;
import notebookMM.NotebookMMPackage;
import notebookMM.NotebookModel;
import notebookMM.util.NotebookJSONParser;
import projectStructureMM.ProjectStructure;
import projectStructureMM.ProjectStructureMMPackage;

/**
 * Full Pipeline: T2M -> M2M -> M2T
 * 
 * This class connects the pipeline from Text-to-Model (T2M), Model-to-Model
 * (M2M), and Model-to-Text (M2T) into one seamless execution.
 * 
 * T2M: Uses NotebookJSONParser (EMF) to parse .ipynb files to NotebookModel
 * M2M: Executes NotebookToProject.qvto (QVT-O) to transform NotebookModel to
 * ProjectStructure M2T: Uses Generate.java (Acceleo) to generate Python project
 * files from ProjectStructure
 */
public class FullPipeline {
	private static final String QVTO_TRANSFORMATION_PATH = "../NotebookToProjectM2M/transforms/NotebookToProject.qvto";
	
	/** Supported data file extensions to copy to the generated project's data directory */
	private static final Set<String> DATA_FILE_EXTENSIONS = Set.of("json", "csv", "yaml", "jpg", "txt");

	private final NotebookJSONParser parser;
	private final ResourceSet resourceSet;

	public FullPipeline() {
		this.parser = new NotebookJSONParser();

		// Register EMF packages
		NotebookMMPackage.eINSTANCE.eClass();
		ProjectStructureMMPackage.eINSTANCE.eClass();

		// Create and configure resource set
		this.resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("projectStructureMM",
				new XMIResourceFactoryImpl());
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("notebookMM",
				new XMIResourceFactoryImpl());
		resourceSet.getPackageRegistry().put(NotebookMMPackage.eNS_URI, NotebookMMPackage.eINSTANCE);
		resourceSet.getPackageRegistry().put(ProjectStructureMMPackage.eNS_URI, ProjectStructureMMPackage.eINSTANCE);
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

		// Step 1: T2M - Parse notebook to model using EMF
		System.out.println("Step 1: T2M - Parsing notebook to NotebookModel (EMF)...");
		NotebookModel notebookModel = textToModel(inputPath);
		System.out.println("  Parsed notebook: " + notebookModel.getName());
		System.out.println("  Cells: " + notebookModel.getCells().size());
		System.out.println();

		// Step 2: M2M - Transform NotebookModel to ProjectStructure using QVT-O
		System.out.println("Step 2: M2M - Executing NotebookToProject.qvto (QVT-O)...");
		ProjectStructure projectStructure = modelToModel(notebookModel);
		System.out.println("  Project name: " + projectStructure.getName());
		System.out.println("  Elements: " + projectStructure.getFilesystemelement().size());
		System.out.println();

		// Step 3: M2T - Generate files from ProjectStructure using Acceleo
		System.out.println("Step 3: M2T - Generating project files using generate.mtl (Acceleo)...");
		modelToText(projectStructure, outputPath);
		System.out.println();
		
		// Step 4: Copy data files from input to generated project's data directory
		System.out.println("Step 4: Copying data files to generated project...");
		copyDataFiles(inputPath, outputPath, projectStructure.getName());
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
			// break; // TODO: Remove
		}
	}

	/**
	 * T2M: Parse a Jupyter notebook file to NotebookModel using EMF
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

	/**
	 * M2M: Transform NotebookModel to ProjectStructure using QVT-O transformation.
	 * Executes NotebookToProject.qvto with CodeClassificationLib.qvto library.
	 * 
	 * @throws IOException if the transformation fails or produces invalid output
	 */
	private ProjectStructure modelToModel(NotebookModel notebook) throws IOException {
		// Resolve and validate the QVT-O transformation path
		Path transformationPath = Paths.get(QVTO_TRANSFORMATION_PATH).toAbsolutePath().normalize();
		if (!Files.exists(transformationPath)) {
			throw new IOException("QVT-O transformation file not found: " + transformationPath);
		}

		try {
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
			// keepModeling=true ensures the transformation keeps model elements in memory
			// for proper cross-reference resolution during transformation
			context.setConfigProperty("keepModeling", true);

			// Set the log for transformation messages
			context.setLog(new org.eclipse.m2m.qvt.oml.util.WriterLog(new java.io.OutputStreamWriter(System.out)));

			// Execute the transformation
			ExecutionDiagnostic result = executor.execute(context, input, output);

			// Check for errors
			if (result.getSeverity() != Diagnostic.OK) {
				StringBuilder errorMsg = new StringBuilder("QVT-O transformation failed: ");
				errorMsg.append(result.getMessage());
				if (!result.getChildren().isEmpty()) {
					for (Diagnostic child : result.getChildren()) {
						errorMsg.append("\n  - ").append(child.getMessage());
					}
				}
				throw new IOException(errorMsg.toString());
			}

			// Get the output ProjectStructure
			List<EObject> outputObjects = output.getContents();
			if (outputObjects.isEmpty()) {
				throw new IOException("QVT-O transformation produced no output");
			}

			// Find the ProjectStructure in the output
			for (EObject obj : outputObjects) {
				if (obj instanceof ProjectStructure) {
					System.out.println("  Notebook transformed to Project!");
					return (ProjectStructure) obj;
				}
			}

			throw new IOException("QVT-O transformation did not produce a ProjectStructure");
		} catch (IOException e) {
			throw e;
		} catch (Exception e) {
			throw new IOException("QVT-O transformation error: " + e.getMessage(), e);
		}
	}

	/**
	 * M2T: Generate files from ProjectStructure using Acceleo (generate.mtl). Uses
	 * the existing Generate class from ProjectStructureM2T.
	 */
	private void modelToText(ProjectStructure project, String baseOutputDir) throws IOException {
		// Create output directory
		Path outputDir = Paths.get(baseOutputDir);
		Files.createDirectories(outputDir);

		// Create and execute the Acceleo generator
		File targetFolder = outputDir.toFile();
		Generate generator = new Generate(project, targetFolder, new ArrayList<>());
		generator.doGenerate(new BasicMonitor());

		System.out.println("  Generated project at: " + outputDir.resolve(project.getName()));

	}

	/**
	 * Copy data files from the input notebook's directory to the generated project's data directory.
	 * Handles files with extensions: json, csv, yaml, jpg, txt
	 * 
	 * Files are copied from two locations in order:
	 * 1. The notebook's parent directory
	 * 2. A 'data' subdirectory (if it exists)
	 * 
	 * Note: If a file with the same name exists in both locations, the file from the 'data'
	 * subdirectory takes precedence (overwrites the first copy).
	 * 
	 * @param inputPath   Path to the input .ipynb file
	 * @param outputPath  Base directory for generated output
	 * @param projectName Name of the generated project
	 * @throws IOException if there is an error creating directories or copying files
	 */
	private void copyDataFiles(String inputPath, String outputPath, String projectName) throws IOException {
		Path inputFile = Paths.get(inputPath).toAbsolutePath().normalize();
		Path inputDir = inputFile.getParent();
		Path targetDataDir = Paths.get(outputPath).resolve(projectName).resolve("data");
		
		// Ensure target data directory exists
		Files.createDirectories(targetDataDir);
		
		int copiedCount = 0;
		
		// Copy data files from the same directory as the notebook
		copiedCount += copyDataFilesFromDir(inputDir, targetDataDir);
		
		// Copy data files from a 'data' subdirectory if it exists
		Path inputDataDir = inputDir.resolve("data");
		if (Files.exists(inputDataDir) && Files.isDirectory(inputDataDir)) {
			copiedCount += copyDataFilesFromDir(inputDataDir, targetDataDir);
		}
		
		System.out.println("  Copied " + copiedCount + " data file(s) to " + targetDataDir);
	}
	
	/**
	 * Copy data files from a source directory to a target directory.
	 * 
	 * @param sourceDir Source directory to copy from
	 * @param targetDir Target directory to copy to
	 * @return Number of files copied
	 * @throws IOException if there is an error reading the directory or copying files
	 */
	private int copyDataFilesFromDir(Path sourceDir, Path targetDir) throws IOException {
		if (!Files.exists(sourceDir) || !Files.isDirectory(sourceDir)) {
			return 0;
		}
		
		int count = 0;
		
		try (DirectoryStream<Path> dirStream = Files.newDirectoryStream(sourceDir)) {
			for (Path file : dirStream) {
				if (Files.isRegularFile(file) && isDataFile(file)) {
					Path targetFile = targetDir.resolve(file.getFileName());
					Files.copy(file, targetFile, StandardCopyOption.REPLACE_EXISTING);
					System.out.println("    Copied: " + file.getFileName());
					count++;
				}
			}
		}
		
		return count;
	}
	
	/**
	 * Check if a file is a data file based on its extension.
	 * 
	 * @param file Path to the file
	 * @return true if the file has a supported data file extension
	 */
	private boolean isDataFile(Path file) {
		String fileName = file.getFileName().toString().toLowerCase(Locale.ROOT);
		int lastDot = fileName.lastIndexOf('.');
		// Handle files without extension or ending with a dot
		if (lastDot == -1 || lastDot == fileName.length() - 1) {
			return false;
		}
		String extension = fileName.substring(lastDot + 1);
		return DATA_FILE_EXTENSIONS.contains(extension);
	}

	/**
	 * Find all .ipynb files in a directory recursively
	 */
	private List<String> findIpynbFiles(String directory) throws IOException {
		List<String> results = new ArrayList<>();

		Files.walk(Paths.get(directory)).filter(Files::isRegularFile).filter(path -> path.toString().endsWith(".ipynb"))
				.forEach(path -> results.add(path.toAbsolutePath().toString()));

		return results;
	}

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
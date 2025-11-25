package main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

import notebookMM.Cell;
import notebookMM.CodeCell;
import notebookMM.MarkdownCell;
import notebookMM.NotebookModel;
import notebookMM.util.NotebookJSONParser;
import projectStructureMM.Directory;
import projectStructureMM.File;
import projectStructureMM.FileSystemElement;
import projectStructureMM.ProjectStructure;
import projectStructureMM.ProjectStructureMMFactory;

/**
 * Full Pipeline: T2M -> M2M -> M2T
 * 
 * This class connects the pipeline from Text-to-Model (T2M), Model-to-Model
 * (M2M), and Model-to-Text (M2T) into one seamless execution.
 * 
 * T2M: Parses .ipynb files to NotebookModel M2M: Transforms NotebookModel to
 * ProjectStructure M2T: Generates Python project files from ProjectStructure
 */
public class FullPipeline {

	private static final String[] DIR_NAMES = { "data", "src", "models", "outputs" };
	private static final String MAIN_FILE_NAME = "main.py";
	private static final String REQUIREMENTS_FILE_NAME = "requirements.txt";

	/**
	 * Static mapping from Python module names to pip package names. Uses word
	 * boundary patterns to avoid false positives (e.g., 'sklearn_extra' won't match
	 * 'sklearn').
	 */
	private static final Map<Pattern, String> IMPORT_TO_PACKAGE_MAP = new HashMap<>();
	static {
		IMPORT_TO_PACKAGE_MAP.put(Pattern.compile("\\bsklearn\\b"), "scikit-learn");
		IMPORT_TO_PACKAGE_MAP.put(Pattern.compile("\\bcv2\\b"), "opencv-python");
		IMPORT_TO_PACKAGE_MAP.put(Pattern.compile("\\bPIL\\b"), "Pillow");
		IMPORT_TO_PACKAGE_MAP.put(Pattern.compile("\\bpandas\\b"), "pandas");
		IMPORT_TO_PACKAGE_MAP.put(Pattern.compile("\\bnumpy\\b"), "numpy");
		IMPORT_TO_PACKAGE_MAP.put(Pattern.compile("\\bmatplotlib\\b"), "matplotlib");
		IMPORT_TO_PACKAGE_MAP.put(Pattern.compile("\\bscipy\\b"), "scipy");
		IMPORT_TO_PACKAGE_MAP.put(Pattern.compile("\\bseaborn\\b"), "seaborn");
		IMPORT_TO_PACKAGE_MAP.put(Pattern.compile("\\bjoblib\\b"), "joblib");
		IMPORT_TO_PACKAGE_MAP.put(Pattern.compile("\\btensorflow\\b"), "tensorflow");
		IMPORT_TO_PACKAGE_MAP.put(Pattern.compile("\\btorch\\b"), "torch");
		IMPORT_TO_PACKAGE_MAP.put(Pattern.compile("\\bkeras\\b"), "keras");
		IMPORT_TO_PACKAGE_MAP.put(Pattern.compile("\\bflask\\b"), "flask");
		IMPORT_TO_PACKAGE_MAP.put(Pattern.compile("\\bdjango\\b"), "django");
		IMPORT_TO_PACKAGE_MAP.put(Pattern.compile("\\brequests\\b"), "requests");
		IMPORT_TO_PACKAGE_MAP.put(Pattern.compile("\\bsqlalchemy\\b"), "sqlalchemy");
		IMPORT_TO_PACKAGE_MAP.put(Pattern.compile("\\bpytest\\b"), "pytest");
		IMPORT_TO_PACKAGE_MAP.put(Pattern.compile("\\byaml\\b"), "PyYAML");
		IMPORT_TO_PACKAGE_MAP.put(Pattern.compile("\\bbs4\\b"), "beautifulsoup4");
		IMPORT_TO_PACKAGE_MAP.put(Pattern.compile("\\bdateutil\\b"), "python-dateutil");
	}

	private final NotebookJSONParser parser;
	private final ProjectStructureMMFactory factory;

	public FullPipeline() {
		this.parser = new NotebookJSONParser();
		this.factory = ProjectStructureMMFactory.eINSTANCE;
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
	 * M2M: Transform NotebookModel to ProjectStructure This replicates the logic
	 * from NotebookToProject.qvto
	 */
	private ProjectStructure modelToModel(NotebookModel notebook) {
		ProjectStructure project = factory.createProjectStructure();
		project.setName(notebook.getName());

		// Create directory structure
		for (String dirName : DIR_NAMES) {
			Directory dir = createDirectory(dirName, notebook);
			project.getFilesystemelement().add(dir);
		}

		// Create requirements.txt
		File requirementsFile = createRequirementsFile(notebook);
		project.getFilesystemelement().add(requirementsFile);

		return project;
	}

	/**
	 * Create a directory with appropriate content
	 */
	private Directory createDirectory(String dirName, NotebookModel notebook) {
		Directory dir = factory.createDirectory();
		dir.setName(dirName);

		if ("src".equals(dirName)) {
			// Create main.py in src directory
			File mainFile = createMainFile(notebook);
			dir.getFilesystemelement().add(mainFile);
		} else {
			// Create .keep file in other directories
			File keepFile = factory.createFile();
			keepFile.setName(".keep");
			dir.getFilesystemelement().add(keepFile);
		}

		return dir;
	}

	/**
	 * Create the main.py file with content from notebook cells
	 */
	private File createMainFile(NotebookModel notebook) {
		File mainFile = factory.createFile();
		mainFile.setName(MAIN_FILE_NAME);

		// Generate content from cells
		for (Cell cell : notebook.getCells()) {
			if (cell instanceof MarkdownCell) {
				MarkdownCell mdCell = (MarkdownCell) cell;
				if (mdCell.getContent() != null && !mdCell.getContent().isEmpty()) {
					mainFile.getContent().add("\"\"\"");
					mainFile.getContent().add(mdCell.getContent());
					mainFile.getContent().add("\"\"\"");
					mainFile.getContent().add("");
				}
			} else if (cell instanceof CodeCell) {
				CodeCell codeCell = (CodeCell) cell;
				if (codeCell.getSource() != null && !codeCell.getSource().isEmpty()) {
					mainFile.getContent().add(codeCell.getSource());
					mainFile.getContent().add("");
				}
			}
		}

		return mainFile;
	}

	/**
	 * Create requirements.txt from notebook imports
	 */
	private File createRequirementsFile(NotebookModel notebook) {
		File reqFile = factory.createFile();
		reqFile.setName(REQUIREMENTS_FILE_NAME);

		// Extract unique packages from imports
		Set<String> packages = new HashSet<>();
		for (String importStmt : notebook.getAllImports()) {
			String pkg = mapImportToPackage(importStmt);
			if (pkg != null && !pkg.isEmpty()) {
				packages.add(pkg);
			}
		}

		// Add packages to file content
		for (String pkg : packages) {
			reqFile.getContent().add(pkg);
		}

		return reqFile;
	}

	/**
	 * Map Python import statements to pip package names
	 */
	private String mapImportToPackage(String importStmt) {
		for (Map.Entry<Pattern, String> entry : IMPORT_TO_PACKAGE_MAP.entrySet()) {
			if (entry.getKey().matcher(importStmt).find()) {
				return entry.getValue();
			}
		}

		return null;
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

package main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;

import notebookMM.CodeCell;
import notebookMM.MarkdownCell;
import notebookMM.NotebookModel;
import notebookMM.util.NotebookJSONParser;

public class NotebookAnalyzer {
	private static ResourceSet rs;
	private static final String inputDir = "../../input/";
	private static String[] fileName;

	public static void main(String[] args) {

		// Step 1: Find all .ipynb files
		try {
			fileName = findIpynbFiles(inputDir);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}

		if (fileName.length == 0) {
			System.err.println("No .ipynb files found in " + inputDir);
			return;
		}

		// Print all found files
		System.out.println("Found notebooks:");
		for (String f : fileName) {
			System.out.println(f);
		}

		NotebookJSONParser parser = new NotebookJSONParser();

		// Process each notebook
		for (String fullPath : fileName) {
			System.out.println("\nProcessing: " + fullPath);

			try {
				// Parse the notebook
				NotebookModel notebook = parser.parseNotebook(fullPath);

				// Validate notebook
				if (!notebook.validate()) {
					System.err.println("Invalid notebook structure: " + fullPath);
					continue;
				}

				// Only Python notebooks
				if (!notebook.getMetadata().isPythonKernel()) {
					System.err.println("Skipping non-Python notebook: " + fullPath);
					continue;
				}

				// Print notebook name
				System.out.println("=== Name ===");
				if (notebook.getName() != null)
					System.out.println(notebook.getName() + "\n");

				// Print all imports
				System.out.println("=== All Imports ===");
				for (String imp : notebook.getAllImports()) {
					System.out.println(imp);
				}

				// Analyze code cells
				System.out.println("\n=== Code Analysis ===");
				for (CodeCell cell : notebook.getCodeCells()) {
					System.out.println("Cell " + cell.getId() + ":");
					if (cell.isDataPreprocessing())
						System.out.println("  -> Data Preprocessing");
					if (cell.isTrainingCode())
						System.out.println("  -> Model Training");
					if (cell.isPredictionCode())
						System.out.println("  -> Prediction/Inference");
				}

				// Extract section headers
				System.out.println("\n=== Notebook Structure ===");
				for (MarkdownCell cell : notebook.getMarkdownCells()) {
					if (cell.isHeader()) {
						String indent = "  ".repeat(cell.getHeaderLevel() - 1);
						System.out.println(indent + cell.extractTitle());
					}
				}

				// Setup EMF resource
				setupResource();

				// Ensure output directory exists
				Files.createDirectories(Paths.get("output"));

				// Compute path relative to inputDir
				Path inputRoot = Paths.get(inputDir).toAbsolutePath().normalize();
				Path notebookPath = Paths.get(fullPath).toAbsolutePath().normalize();
				Path relativePath = inputRoot.relativize(notebookPath);

				// Replace .ipynb with .notebook and prepend output directory
				Path outputPath = Paths.get("output").resolve(relativePath);
				outputPath = Paths.get(outputPath.toString().replaceAll("\\.ipynb$", ".notebook"));

				// Ensure output directories exist
				Files.createDirectories(outputPath.getParent());

				// Save notebook using the correct path
				save(notebook, outputPath.toString());
				System.out.println("Saved notebook as: " + outputPath);
			} catch (Exception e) {
				System.err.println("Error processing notebook: " + fullPath);
				e.printStackTrace();
			}
		}
	}

	private static void setupResource() {
		rs = new ResourceSetImpl();

		String[] fileextensions = new String[] { "notebook" };

		for (String fileext : fileextensions) {
			rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put(fileext, new XMLResourceFactoryImpl());
		}

	}

	private static void save(NotebookModel notebook, String filename) {
		URI uri = URI.createFileURI(filename);
		Resource nbResource = rs.createResource(uri);
		((ResourceImpl) nbResource).setIntrinsicIDToEObjectMap(new HashMap<String, EObject>());

		nbResource.getContents().add(notebook);
		System.out.println("In the middle of saving...");
		Map<Object, Object> saveOptions = ((XMLResource) nbResource).getDefaultSaveOptions();
		saveOptions.put(XMLResource.OPTION_CONFIGURATION_CACHE, Boolean.TRUE);
		saveOptions.put(XMLResource.OPTION_USE_CACHED_LOOKUP_TABLE, new ArrayList<Object>());
		try {
			nbResource.save(saveOptions);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	private static String[] findIpynbFiles(String directory) throws IOException {
		List<String> results = new ArrayList<>();

		try {
			Files.walk(Paths.get(directory)).filter(Files::isRegularFile)
					.filter(path -> path.toString().endsWith(".ipynb"))
					.forEach(path -> results.add(path.toAbsolutePath().toString()));
		} catch (IOException e) {
			throw new IOException("Error reading directory: " + directory, e);
		}

		return results.toArray(new String[0]);
	}
}
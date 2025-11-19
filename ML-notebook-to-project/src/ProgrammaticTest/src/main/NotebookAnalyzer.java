package main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
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
	private static final String[] fileName = { "Customer-Churn-Prediction/simple_classification",
			"CNN-Image-Classifier/image_classification_cnn" };
	private static final int inputFile = 1;

	public static void main(String[] args) {
		NotebookJSONParser parser = new NotebookJSONParser();

		try {
			// Parse .ipynb file
			NotebookModel notebook = parser.parseNotebook(inputDir + fileName[inputFile] + ".ipynb");

			// Validate
			if (!notebook.validate()) {
				System.err.println("Invalid notebook structure!");
				return;
			}

			// Check if Python
			if (!notebook.getMetadata().isPythonKernel()) {
				System.err.println("Only Python notebooks supported!");
				return;
			}

			// Model Name / Project Name
			System.out.println("=== Name ===");
			if (notebook.getName() != null)
				System.out.println(notebook.getName() + "\n");

			// Analyze imports
			System.out.println("=== All Imports ===");
			for (String imp : notebook.getAllImports()) {
				System.out.println(imp);
			}

			// Analyze constants and commands for each code cell
			System.out.println("\n=== Constants ===");
			for (CodeCell cell : notebook.getCodeCells()) {
				// System.out.println("Cell " + cell.getId() + ":");

				// Extract and display constants
				if (cell.hasConstants()) {
					// System.out.println(" Constants:");
					for (String constant : cell.extractConstants()) {
						System.out.println(constant);
					}
				}

				// Extract and display commands
//				if (cell.hasCommands()) {
//					System.out.println("  Commands:");
//					for (String command : cell.extractCommands()) {
//						System.out.println("    " + command);
//					}
//				}
			}

			// Categorize code cells
			System.out.println("\n=== Code Analysis ===");
			for (CodeCell cell : notebook.getCodeCells()) {
				System.out.println("Cell " + cell.getId() + ":");
				if (cell.isDataPreprocessing()) {
					System.out.println("  -> Data Preprocessing");
				}
				if (cell.isTrainingCode()) {
					System.out.println("  -> Model Training");
				}
				if (cell.isPredictionCode()) {
					System.out.println("  -> Prediction/Inference");
				}
			}

			// Extract section headers
			System.out.println("\n=== Notebook Structure ===");
			for (MarkdownCell cell : notebook.getMarkdownCells()) {
				if (cell.isHeader()) {
					String indent = "  ".repeat(cell.getHeaderLevel() - 1);
					System.out.println(indent + cell.extractTitle());
				}
			}

			setupResource();

			save(notebook, "output/" + fileName[inputFile] + ".notebook");

		} catch (Exception e) {
			e.printStackTrace();
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
}
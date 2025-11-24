package main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import notebookMM.CodeCell;
import notebookMM.NotebookModel;
import notebookMM.util.NotebookJSONParser;

/**
 * Main transformation program that converts a Jupyter notebook to a project structure.
 * This implements the same logic as the QVTO transformation but in pure Java.
 */
public class NotebookToProjectTransformer {
	
	private static final String INPUT_DIR = "../../input/";
	private static final String[] FILE_NAMES = { 
		"Customer-Churn-Prediction/simple_classification",
		"CNN-Image-Classifier/image_classification_cnn" 
	};
	private static final int INPUT_FILE = 0; // Choose which file to transform
	
	public static void main(String[] args) {
		NotebookJSONParser parser = new NotebookJSONParser();
		
		try {
			// Parse .ipynb file
			String inputPath = INPUT_DIR + FILE_NAMES[INPUT_FILE] + ".ipynb";
			System.out.println("Parsing notebook: " + inputPath);
			NotebookModel notebook = parser.parseNotebook(inputPath);
			
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
			
			System.out.println("Notebook name: " + notebook.getName());
			System.out.println("Total cells: " + notebook.getCells().size());
			System.out.println("Code cells: " + notebook.getCodeCells().size());
			System.out.println();
			
			// Transform to project structure
			System.out.println("=== TRANSFORMATION OUTPUT ===");
			System.out.println();
			
			// Generate main.py content
			System.out.println("--- main.py ---");
			List<String> mainPyContent = generateMainPyContent(notebook);
			for (String line : mainPyContent) {
				System.out.println(line);
			}
			
			System.out.println();
			System.out.println("--- requirements.txt ---");
			List<String> requirementsContent = generateRequirementsContent(notebook);
			for (String line : requirementsContent) {
				System.out.println(line);
			}
			
			System.out.println();
			System.out.println("=== TRANSFORMATION COMPLETE ===");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Generate main.py content from notebook
	 */
	private static List<String> generateMainPyContent(NotebookModel notebook) {
		List<String> lines = new ArrayList<>();
		
		// Add header comment
		lines.add("#!/usr/bin/env python3");
		lines.add("# Generated from notebook: " + notebook.getName());
		lines.add("");
		
		// Add all imports
		lines.add("# Imports");
		for (String imp : notebook.getAllImports()) {
			lines.add(imp);
		}
		lines.add("");
		
		// Add constants from all code cells
		lines.add("# Constants");
		for (CodeCell cell : notebook.getCodeCells()) {
			for (String constant : cell.extractConstants()) {
				lines.add(constant);
			}
		}
		lines.add("");
		
		// Add main function header
		lines.add("def main():");
		lines.add("    \"\"\"Main execution function\"\"\"");
		
		// Add commands from all code cells with classification comments
		for (CodeCell cell : notebook.getCodeCells()) {
			for (String command : cell.extractCommands()) {
				// Add classification comment before command
				String classification = CommandClassifier.classifyCommandWithHeuristics(command);
				lines.add("    # " + classification);
				lines.add("    " + command);
			}
		}
		
		lines.add("");
		lines.add("if __name__ == '__main__':");
		lines.add("    main()");
		
		return lines;
	}
	
	/**
	 * Generate requirements.txt content from notebook
	 */
	private static List<String> generateRequirementsContent(NotebookModel notebook) {
		// Get all imports from notebook
		List<String> imports = new ArrayList<>();
		for (String imp : notebook.getAllImports()) {
			imports.add(imp);
		}
		
		// Extract unique package names
		List<String> packages = ImportHelper.extractPackageNames(imports);
		
		return packages;
	}
}

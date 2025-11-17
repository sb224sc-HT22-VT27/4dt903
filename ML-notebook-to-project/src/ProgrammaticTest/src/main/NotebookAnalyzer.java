package main;

import notebookMM.*;
import notebookMM.util.NotebookJSONParser;

public class NotebookAnalyzer {
	private static final String inputDir = "../../input/";
	
    public static void main(String[] args) {
        NotebookJSONParser parser = new NotebookJSONParser();
        

        try {
            // Parse .ipynb file
            NotebookModel notebook = parser.parseNotebook(inputDir + "Customer-Churn-Prediction/simple_classification.ipynb");
            
            //NotebookModel notebook = parser.parseNotebook(inputDir + "CNN-Image-Classifier/image_classification_cnn.ipynb");
            
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
            System.out.println("\n=== Constants and Commands ===");
            for (CodeCell cell : notebook.getCodeCells()) {
                System.out.println("Cell " + cell.getId() + ":");
                
                // Extract and display constants
                if (cell.hasConstants()) {
                    System.out.println("  Constants:");
                    for (String constant : cell.extractConstants()) {
                        System.out.println("    " + constant);
                    }
                }
                
                // Extract and display commands
                if (cell.hasCommands()) {
                    System.out.println("  Commands:");
                    for (String command : cell.extractCommands()) {
                        System.out.println("    " + command);
                    }
                }
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

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
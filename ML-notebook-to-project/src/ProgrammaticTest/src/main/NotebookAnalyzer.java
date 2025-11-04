package main;

import notebookMM.*;
import notebookMM.util.NotebookJSONParser;
import java.nio.file.Paths;

public class NotebookAnalyzer {
    public static void main(String[] args) {
        NotebookJSONParser parser = new NotebookJSONParser();
        
        //System.out.println(Paths.get("").toAbsolutePath());

        try {
            // Parse .ipynb file
            NotebookModel notebook = parser
                    .parseNotebook("./src/main/simple_classification.ipynb");

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

            // Analyze imports
            System.out.println("=== All Imports ===");
            for (String imp : notebook.getAllImports()) {
                System.out.println(imp);
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
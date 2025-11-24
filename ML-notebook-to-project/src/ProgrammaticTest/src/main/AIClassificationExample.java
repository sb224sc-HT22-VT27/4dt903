package main;

import notebookMM.CodeCell;
import notebookMM.NotebookModel;
import notebookMM.util.NotebookJSONParser;

/**
 * Example demonstrating AI-powered classification in NotebookAnalyzer
 * This can be run with or without an OpenAI API key.
 */
public class AIClassificationExample {
	private static final String inputDir = "../../input/";
	private static final String[] fileName = { "Customer-Churn-Prediction/simple_classification",
			"CNN-Image-Classifier/image_classification_cnn" };
	private static final int inputFile = 0; // Using first example

	public static void main(String[] args) {
		System.out.println("=== AI-Powered Notebook Analysis Example ===\n");
		
		// Check if API key is set
		String apiKey = System.getenv("OPENAI_API_KEY");
		if (apiKey != null && !apiKey.trim().isEmpty()) {
			System.out.println("✓ OpenAI API key detected - using AI classification");
		} else {
			System.out.println("ℹ No API key detected - using fallback heuristics");
		}
		System.out.println();

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

			// Analyze cells with AI classification
			System.out.println("=== Code Cell Analysis with AI ===");
			int preprocessingCount = 0;
			int trainingCount = 0;
			int predictionCount = 0;
			int totalCells = 0;

			for (CodeCell cell : notebook.getCodeCells()) {
				if (cell.getSource() != null && !cell.getSource().trim().isEmpty()) {
					totalCells++;
					System.out.println("\n--- Cell " + cell.getId() + " ---");
					System.out.println("First 100 chars: " + 
						cell.getSource().substring(0, Math.min(100, cell.getSource().length())) + "...");
					
					boolean isPreprocessing = cell.isDataPreprocessing();
					boolean isTraining = cell.isTrainingCode();
					boolean isPrediction = cell.isPredictionCode();
					
					if (isPreprocessing) {
						System.out.println("  ✓ Data Preprocessing");
						preprocessingCount++;
					}
					if (isTraining) {
						System.out.println("  ✓ Model Training");
						trainingCount++;
					}
					if (isPrediction) {
						System.out.println("  ✓ Prediction/Inference");
						predictionCount++;
					}
					if (!isPreprocessing && !isTraining && !isPrediction) {
						System.out.println("  ℹ Other code");
					}
				}
			}

			// Summary
			System.out.println("\n=== Summary ===");
			System.out.println("Total code cells analyzed: " + totalCells);
			System.out.println("Data Preprocessing cells: " + preprocessingCount);
			System.out.println("Model Training cells: " + trainingCount);
			System.out.println("Prediction/Inference cells: " + predictionCount);
			
			System.out.println("\n=== Example Complete ===");
			System.out.println("\nNote: To use AI classification, set OPENAI_API_KEY environment variable:");
			System.out.println("  export OPENAI_API_KEY=\"your-api-key-here\"");

		} catch (Exception e) {
			System.err.println("Error analyzing notebook: " + e.getMessage());
			e.printStackTrace();
		}
	}
}

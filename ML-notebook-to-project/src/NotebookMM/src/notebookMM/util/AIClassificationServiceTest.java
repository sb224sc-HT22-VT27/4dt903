package notebookMM.util;

/**
 * Simple test class for AIClassificationService
 */
public class AIClassificationServiceTest {
	
	public static void main(String[] args) {
		System.out.println("=== Testing AI Classification Service ===\n");
		
		// Test without API key (should use fallback)
		AIClassificationService service = new AIClassificationService("");
		
		// Test 1: Data Preprocessing Code
		String preprocessingCode = "import pandas as pd\n" +
		                           "data = pd.read_csv('data.csv')\n" +
		                           "data = data.dropna()\n" +
		                           "data = data.fillna(0)";
		
		System.out.println("Test 1: Data Preprocessing Code");
		System.out.println("Code:\n" + preprocessingCode);
		AIClassificationService.ClassificationResult result1 = service.classifyCode(preprocessingCode);
		System.out.println("Is Data Preprocessing: " + result1.isDataPreprocessing());
		System.out.println("Is Model Training: " + result1.isModelTraining());
		System.out.println("Is Prediction: " + result1.isPrediction());
		System.out.println();
		
		// Test 2: Model Training Code
		String trainingCode = "from sklearn.linear_model import LogisticRegression\n" +
		                     "model = LogisticRegression()\n" +
		                     "model.fit(X_train, y_train)";
		
		System.out.println("Test 2: Model Training Code");
		System.out.println("Code:\n" + trainingCode);
		AIClassificationService.ClassificationResult result2 = service.classifyCode(trainingCode);
		System.out.println("Is Data Preprocessing: " + result2.isDataPreprocessing());
		System.out.println("Is Model Training: " + result2.isModelTraining());
		System.out.println("Is Prediction: " + result2.isPrediction());
		System.out.println();
		
		// Test 3: Prediction Code
		String predictionCode = "predictions = model.predict(X_test)\n" +
		                       "probabilities = model.predict_proba(X_test)";
		
		System.out.println("Test 3: Prediction Code");
		System.out.println("Code:\n" + predictionCode);
		AIClassificationService.ClassificationResult result3 = service.classifyCode(predictionCode);
		System.out.println("Is Data Preprocessing: " + result3.isDataPreprocessing());
		System.out.println("Is Model Training: " + result3.isModelTraining());
		System.out.println("Is Prediction: " + result3.isPrediction());
		System.out.println();
		
		// Test 4: Empty Code
		String emptyCode = "";
		
		System.out.println("Test 4: Empty Code");
		System.out.println("Code: (empty)");
		AIClassificationService.ClassificationResult result4 = service.classifyCode(emptyCode);
		System.out.println("Is Data Preprocessing: " + result4.isDataPreprocessing());
		System.out.println("Is Model Training: " + result4.isModelTraining());
		System.out.println("Is Prediction: " + result4.isPrediction());
		System.out.println();
		
		System.out.println("=== All Tests Completed ===");
		System.out.println("\nNote: These tests use fallback heuristics.");
		System.out.println("To test with actual AI API, set OPENAI_API_KEY environment variable.");
	}
}

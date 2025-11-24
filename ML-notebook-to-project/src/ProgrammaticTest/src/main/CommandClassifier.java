package main;

import java.util.Random;

/**
 * Helper class to classify Python commands into categories:
 * PREPROCESS, TRAIN, or PREDICT
 */
public class CommandClassifier {
	
	private static final Random random = new Random();
	
	/**
	 * Classify a command into one of three categories.
	 * Initially returns random classification for testing.
	 * 
	 * @param command The Python command to classify
	 * @return One of "PREPROCESS", "TRAIN", or "PREDICT"
	 */
	public static String classifyCommand(String command) {
		// Random classification for initial testing
		int category = random.nextInt(3);
		switch (category) {
			case 0:
				return "PREPROCESS";
			case 1:
				return "TRAIN";
			case 2:
				return "PREDICT";
			default:
				return "PREPROCESS";
		}
	}
	
	/**
	 * Classify a command using heuristics (keyword-based approach).
	 * This is an improved version that uses actual analysis.
	 * 
	 * @param command The Python command to classify
	 * @return One of "PREPROCESS", "TRAIN", or "PREDICT"
	 */
	public static String classifyCommandWithHeuristics(String command) {
		if (command == null || command.trim().isEmpty()) {
			return "PREPROCESS";
		}
		
		String lowerCommand = command.toLowerCase();
		
		// Check for training keywords
		if (lowerCommand.contains("fit(") || 
		    lowerCommand.contains("fit_transform(") ||
		    lowerCommand.contains(".train") ||
		    lowerCommand.contains("model.compile") ||
		    lowerCommand.contains("cross_val_score") ||
		    lowerCommand.contains("gridsearchcv") ||
		    lowerCommand.contains("trainer.train")) {
			return "TRAIN";
		}
		
		// Check for prediction keywords
		if (lowerCommand.contains("predict") ||
		    lowerCommand.contains("inference") ||
		    lowerCommand.contains("model.eval") ||
		    lowerCommand.contains("evaluate(")) {
			return "PREDICT";
		}
		
		// Check for preprocessing keywords
		if (lowerCommand.contains("preprocess") ||
		    lowerCommand.contains("clean") ||
		    lowerCommand.contains("transform") ||
		    lowerCommand.contains("scaler") ||
		    lowerCommand.contains("encoder") ||
		    lowerCommand.contains("fillna") ||
		    lowerCommand.contains("dropna") ||
		    lowerCommand.contains("feature_engineer") ||
		    lowerCommand.contains("normalize") ||
		    lowerCommand.contains("standardscaler") ||
		    lowerCommand.contains("read_csv") ||
		    lowerCommand.contains("load_data")) {
			return "PREPROCESS";
		}
		
		// Default to PREPROCESS if no clear match
		return "PREPROCESS";
	}
	
	/**
	 * Main method for testing the classifier
	 */
	public static void main(String[] args) {
		String[] testCommands = {
			"data = pd.read_csv('data.csv')",
			"scaler = StandardScaler()",
			"model.fit(X_train, y_train)",
			"predictions = model.predict(X_test)",
			"X_train, X_test = train_test_split(X, y)",
			"print('Hello World')"
		};
		
		System.out.println("Testing Command Classification:");
		System.out.println("================================");
		
		for (String cmd : testCommands) {
			String randomClass = classifyCommand(cmd);
			String heuristicClass = classifyCommandWithHeuristics(cmd);
			System.out.println("\nCommand: " + cmd);
			System.out.println("Random Classification: " + randomClass);
			System.out.println("Heuristic Classification: " + heuristicClass);
		}
	}
}

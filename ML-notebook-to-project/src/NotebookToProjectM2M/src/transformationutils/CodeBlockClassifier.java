package transformationutils;

public class CodeBlockClassifier {
	// Thread-local storage for the last classified code and its result
	private static ThreadLocal<String> lastCode = new ThreadLocal<>();
	private static ThreadLocal<String> lastClassification = new ThreadLocal<>();

	/**
	 * Classifies a code block based on its content. Uses heuristics to determine
	 * whether code is for preprocessing, training, or prediction.
	 * 
	 * @param code The source code to classify
	 * @return One of: PREPROCESS, TRAIN, or PREDICT
	 */
	public static String classifyCodeBlockJava(String code) {
		if (code == null || code.isEmpty()) {
			return "PREPROCESS";
		}

		String lowerCode = code.toLowerCase();

		// Check for prediction patterns
		if (containsPredictionPatterns(lowerCode)) {
			return "PREDICT";
		}

		// Check for training patterns
		if (containsTrainingPatterns(lowerCode)) {
			return "TRAIN";
		}

		// Default to preprocessing
		return "PREPROCESS";
	}

	/**
	 * Checks if code contains prediction-related patterns.
	 */
	private static boolean containsPredictionPatterns(String code) {
		return code.contains("predict(") || code.contains("predict_proba(") || code.contains("def predict")
				|| code.contains("load(") && (code.contains("model") || code.contains("scaler"))
				|| code.contains("inference");
	}

	/**
	 * Checks if code contains training-related patterns.
	 */
	private static boolean containsTrainingPatterns(String code) {
		return code.contains(".fit(") || code.contains("train_test_split") || code.contains("model.fit")
				|| code.contains("classifier.fit") || code.contains("regressor.fit") || code.contains(".compile(")
				|| code.contains("epochs") || code.contains("batch_size") || code.contains("learning_rate")
				|| code.contains("optimizer") || code.contains("loss=")
				|| code.contains("accuracy_score") && code.contains("y_pred")
				|| code.contains("classification_report") || code.contains("confusion_matrix")
				|| code.contains("dump(") && (code.contains("model") || code.contains("scaler"));
	}

	/**
	 * Classifies a code block and stores result for subsequent comment call. This
	 * method should be called before getClassificationCommentJava().
	 * 
	 * @param code The source code to classify
	 * @return The classification result
	 */
	public static String classifyAndStore(String code) {
		String classification = classifyCodeBlockJava(code);
		lastCode.set(code);
		lastClassification.set(classification);
		return classification;
	}

	/**
	 * Returns a comment with the classification based on the provided code.
	 * 
	 * @param code The source code that was classified
	 * @return A comment string with the classification
	 */
	public static String getClassificationCommentJava(String code) {
		return "\n# Classification: " + classifyCodeBlockJava(code) + "\n";
	}

	/**
	 * Backward compatible method - returns classification comment. Note: This
	 * version uses empty string for classification since no code is provided.
	 * 
	 * @return A comment string with the classification
	 */
	public static String getClassificationCommentJava() {
		String classification = lastClassification.get();
		if (classification == null) {
			classification = "PREPROCESS";
		}
		return "\n# Classification: " + classification + "\n";
	}

	/**
	 * Backward compatible method - returns a classification. Note: This version
	 * uses the last stored classification or defaults to PREPROCESS.
	 * 
	 * @return One of: PREPROCESS, TRAIN, or PREDICT
	 */
	public static String classifyCodeBlockJava() {
		String classification = lastClassification.get();
		if (classification == null) {
			classification = "PREPROCESS";
		}
		return classification;
	}
}

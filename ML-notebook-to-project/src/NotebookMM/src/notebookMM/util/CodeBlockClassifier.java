package notebookMM.util;

import java.util.Random;

/**
 * Helper class to classify code blocks for ML notebooks.
 * Returns random classification to demonstrate Java-QVTO integration.
 */
public class CodeBlockClassifier {
	
	private static final String[] CLASSIFICATIONS = {"PREPROCESS", "TRAIN", "PREDICT"};
	private static final Random random = new Random();
	
	/**
	 * Returns a random classification for a code block.
	 * This is a simple implementation to verify the Java-QVTO call is working.
	 * 
	 * @return One of: PREPROCESS, TRAIN, or PREDICT
	 */
	public static String classifyCodeBlock() {
		int index = random.nextInt(CLASSIFICATIONS.length);
		return CLASSIFICATIONS[index];
	}
	
	/**
	 * Returns a comment with the classification.
	 * 
	 * @return A comment string with the classification
	 */
	public static String getClassificationComment() {
		return "# Classification: " + classifyCodeBlock();
	}
}

package transformationutils;

import java.util.Random;

public class CodeBlockClassifier {
	private static final String[] CLASSIFICATIONS = { "PREPROCESS", "TRAIN", "PREDICT" };
	private static final Random random = new Random();

	/**
	 * Returns a random classification for a code block. This is a simple
	 * implementation to verify the Java-QVTO call is working.
	 * 
	 * @return One of: PREPROCESS, TRAIN, or PREDICT
	 */
	public static String classifyCodeBlockJava() {
		int index = random.nextInt(CLASSIFICATIONS.length);
		return CLASSIFICATIONS[index];
	}

	/**
	 * Returns a comment with the classification.
	 * 
	 * @return A comment string with the classification
	 */
	public static String getClassificationCommentJava() {
		return "\n# Classification: " + classifyCodeBlockJava() + "\n";
	}
}

package transformationutils;

import java.util.Random;

import org.eclipse.m2m.qvt.oml.blackbox.java.Operation;
import org.eclipse.m2m.qvt.oml.blackbox.java.Module;

/**
 * QVT-O Blackbox module for code classification.
 * This class provides helper operations that can be called from QVT-O transformations.
 */
@Module(packageURIs = {})
public class CodeBlockClassifier {
	private static final String[] CLASSIFICATIONS = { "PREPROCESS", "TRAIN", "PREDICT" };
	private static final Random random = new Random();

	/**
	 * Returns a random classification for a code block. This is a simple
	 * implementation to verify the Java-QVTO call is working.
	 * 
	 * @return One of: PREPROCESS, TRAIN, or PREDICT
	 */
	@Operation(contextual = false)
	public static String classifyCodeBlock() {
		int index = random.nextInt(CLASSIFICATIONS.length);
		return CLASSIFICATIONS[index];
	}

	/**
	 * Returns a comment with the classification.
	 * 
	 * @return A comment string with the classification
	 */
	@Operation(contextual = false)
	public static String getClassificationComment() {
		return "\n# Classification: " + classifyCodeBlock() + "\n";
	}
}

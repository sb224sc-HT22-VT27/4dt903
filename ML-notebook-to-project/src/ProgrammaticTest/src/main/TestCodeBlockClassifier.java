package main;

import notebookMM.util.CodeBlockClassifier;

/**
 * Simple test to verify the CodeBlockClassifier works correctly.
 */
public class TestCodeBlockClassifier {

	public static void main(String[] args) {
		System.out.println("Testing CodeBlockClassifier...");
		System.out.println("=====================================");
		
		// Test classifyCodeBlock method
		System.out.println("\nTesting classifyCodeBlock():");
		for (int i = 0; i < 10; i++) {
			String classification = CodeBlockClassifier.classifyCodeBlock();
			System.out.println("  Classification " + (i + 1) + ": " + classification);
			
			// Verify it's one of the expected values
			if (!classification.equals("PREPROCESS") && 
			    !classification.equals("TRAIN") && 
			    !classification.equals("PREDICT")) {
				System.err.println("ERROR: Unexpected classification: " + classification);
				System.exit(1);
			}
		}
		
		// Test getClassificationComment method
		System.out.println("\nTesting getClassificationComment():");
		for (int i = 0; i < 5; i++) {
			String comment = CodeBlockClassifier.getClassificationComment();
			System.out.println("  Comment " + (i + 1) + ": " + comment);
			
			// Verify it starts with the expected prefix
			if (!comment.startsWith("# Classification: ")) {
				System.err.println("ERROR: Comment doesn't have expected format: " + comment);
				System.exit(1);
			}
		}
		
		System.out.println("\n=====================================");
		System.out.println("All tests passed successfully!");
	}
}

package transformationutils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Random;

public class CodeBlockClassifier {
	private static final String[] CLASSIFICATIONS = { "PREPROCESS", "TRAIN", "PREDICT" };
	private static final Random random = new Random();
	private static final String API_URL = "http://172.27.62.197:8000/classify";
	private static final int TIMEOUT_MS = 5000;

	/**
	 * Classifies a code block by invoking an AI API.
	 * Falls back to random classification if the API call fails.
	 * 
	 * @param code The code to classify
	 * @return One of: PREPROCESS, TRAIN, or PREDICT
	 */
	public static String classifyCodeBlockJava(String code) {
		if (code == null || code.trim().isEmpty()) {
			return classifyCodeBlockRandom();
		}

		try {
			URL url = URI.create(API_URL).toURL();
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("POST");
			connection.setRequestProperty("Content-Type", "application/json");
			connection.setDoOutput(true);
			connection.setConnectTimeout(TIMEOUT_MS);
			connection.setReadTimeout(TIMEOUT_MS);

			// Create JSON payload - escape special characters in code
			String jsonPayload = "{\"code\": " + escapeJsonString(code) + "}";

			try (OutputStream os = connection.getOutputStream()) {
				byte[] input = jsonPayload.getBytes(StandardCharsets.UTF_8);
				os.write(input, 0, input.length);
			}

			int responseCode = connection.getResponseCode();
			if (responseCode == HttpURLConnection.HTTP_OK) {
				try (BufferedReader br = new BufferedReader(
						new InputStreamReader(connection.getInputStream(), StandardCharsets.UTF_8))) {
					StringBuilder response = new StringBuilder();
					String line;
					while ((line = br.readLine()) != null) {
						response.append(line);
					}
					String classification = parseClassificationFromResponse(response.toString());
					if (isValidClassification(classification)) {
						return classification;
					}
				}
			}
		} catch (Exception e) {
			// Log the error and fall back to random classification
			System.err.println("AI API call failed: " + e.getMessage());
		}

		// Fall back to random classification
		return classifyCodeBlockRandom();
	}

	/**
	 * Returns a random classification for a code block.
	 * Used as fallback when AI API is unavailable.
	 * 
	 * @return One of: PREPROCESS, TRAIN, or PREDICT
	 */
	public static String classifyCodeBlockRandom() {
		int index = random.nextInt(CLASSIFICATIONS.length);
		return CLASSIFICATIONS[index];
	}

	/**
	 * Returns a comment with the classification.
	 * 
	 * @param code The code to classify
	 * @return A comment string with the classification
	 */
	public static String getClassificationCommentJava(String code) {
		return "\n# Classification: " + classifyCodeBlockJava(code) + "\n";
	}

	/**
	 * Escapes a string for use in JSON.
	 * 
	 * @param input The string to escape
	 * @return The escaped JSON string (including quotes)
	 */
	private static String escapeJsonString(String input) {
		if (input == null) {
			return "null";
		}
		StringBuilder sb = new StringBuilder();
		sb.append('"');
		for (char c : input.toCharArray()) {
			switch (c) {
				case '"':
					sb.append("\\\"");
					break;
				case '\\':
					sb.append("\\\\");
					break;
				case '\b':
					sb.append("\\b");
					break;
				case '\f':
					sb.append("\\f");
					break;
				case '\n':
					sb.append("\\n");
					break;
				case '\r':
					sb.append("\\r");
					break;
				case '\t':
					sb.append("\\t");
					break;
				default:
					if (c < ' ') {
						sb.append(String.format("\\u%04x", (int) c));
					} else {
						sb.append(c);
					}
			}
		}
		sb.append('"');
		return sb.toString();
	}

	/**
	 * Parses the classification from the API response.
	 * Expects a JSON response with a "classification" field.
	 * 
	 * @param response The JSON response string
	 * @return The classification value or null if parsing fails
	 */
	private static String parseClassificationFromResponse(String response) {
		if (response == null || response.isEmpty()) {
			return null;
		}
		// Simple JSON parsing for {"classification": "VALUE"} format
		// Look for "classification" key and extract its value
		int classIndex = response.indexOf("\"classification\"");
		if (classIndex == -1) {
			// Try alternative response format - just the value
			String trimmed = response.trim();
			if (trimmed.startsWith("\"") && trimmed.endsWith("\"")) {
				return trimmed.substring(1, trimmed.length() - 1).toUpperCase();
			}
			return trimmed.toUpperCase();
		}

		int colonIndex = response.indexOf(':', classIndex);
		if (colonIndex == -1) {
			return null;
		}

		int valueStart = response.indexOf('"', colonIndex);
		if (valueStart == -1) {
			return null;
		}

		int valueEnd = response.indexOf('"', valueStart + 1);
		if (valueEnd == -1) {
			return null;
		}

		return response.substring(valueStart + 1, valueEnd).toUpperCase();
	}

	/**
	 * Validates that the classification is one of the expected values.
	 * 
	 * @param classification The classification to validate
	 * @return true if valid, false otherwise
	 */
	private static boolean isValidClassification(String classification) {
		if (classification == null) {
			return false;
		}
		for (String valid : CLASSIFICATIONS) {
			if (valid.equals(classification)) {
				return true;
			}
		}
		return false;
	}
}

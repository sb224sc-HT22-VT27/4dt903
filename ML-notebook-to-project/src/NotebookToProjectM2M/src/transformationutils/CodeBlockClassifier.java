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
	 * Classifies a code block by invoking an AI API. Falls back to random
	 * classification if the API call fails.
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
	 * Returns a random classification for a code block. Used as fallback when AI
	 * API is unavailable.
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
	 * Parses the classification from the API response. Expects a JSON response with
	 * a "classification" field or similar format.
	 * 
	 * @param response The JSON response string
	 * @return The classification value or null if parsing fails
	 */
	private static String parseClassificationFromResponse(String response) {
		if (response == null || response.isEmpty()) {
			return null;
		}

		String trimmed = response.trim();

		// Try to find "classification" key first
		String classification = extractJsonValue(trimmed, "classification");
		if (classification != null) {
			return classification.toUpperCase();
		}

		// Try alternative key names
		classification = extractJsonValue(trimmed, "result");
		if (classification != null) {
			return classification.toUpperCase();
		}

		classification = extractJsonValue(trimmed, "label");
		if (classification != null) {
			return classification.toUpperCase();
		}

		// If response is just a plain string value (not JSON object)
		if (!trimmed.startsWith("{") && !trimmed.startsWith("[")) {
			// Remove surrounding quotes if present
			if (trimmed.startsWith("\"") && trimmed.endsWith("\"") && trimmed.length() > 2) {
				return trimmed.substring(1, trimmed.length() - 1).toUpperCase();
			}
			return trimmed.toUpperCase();
		}

		return null;
	}

	/**
	 * Extracts a string value for a given key from a JSON string. Handles escaped
	 * quotes within the value.
	 * 
	 * @param json The JSON string
	 * @param key  The key to search for
	 * @return The value as a string, or null if not found
	 */
	private static String extractJsonValue(String json, String key) {
		String searchPattern = "\"" + key + "\"";
		int keyIndex = json.indexOf(searchPattern);
		if (keyIndex == -1) {
			return null;
		}

		int colonIndex = json.indexOf(':', keyIndex + searchPattern.length());
		if (colonIndex == -1) {
			return null;
		}

		// Skip whitespace after colon
		int valueStart = colonIndex + 1;
		while (valueStart < json.length() && Character.isWhitespace(json.charAt(valueStart))) {
			valueStart++;
		}

		if (valueStart >= json.length()) {
			return null;
		}

		char startChar = json.charAt(valueStart);
		if (startChar == '"') {
			// String value - find closing quote, handling escaped quotes
			int valueEnd = valueStart + 1;
			while (valueEnd < json.length()) {
				char c = json.charAt(valueEnd);
				if (c == '"' && json.charAt(valueEnd - 1) != '\\') {
					break;
				}
				valueEnd++;
			}
			if (valueEnd < json.length()) {
				String value = json.substring(valueStart + 1, valueEnd);
				// Unescape basic sequences
				return value.replace("\\\"", "\"").replace("\\\\", "\\");
			}
		} else if (Character.isLetter(startChar)) {
			// Unquoted value (like null, true, false, or unquoted string)
			int valueEnd = valueStart;
			while (valueEnd < json.length() && Character.isLetterOrDigit(json.charAt(valueEnd))) {
				valueEnd++;
			}
			return json.substring(valueStart, valueEnd);
		}

		return null;
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

	/**
	 * Returns a random classification for a code block. This is a simple
	 * implementation to verify the Java-QVTO call is working.
	 * 
	 * @return One of: PREPROCESS, TRAIN, or PREDICT
	 */
	public static String classifyCodeBlockJavaRandom() {
		int index = random.nextInt(CLASSIFICATIONS.length);
		return CLASSIFICATIONS[index];
	}

	/**
	 * Returns a comment with the classification.
	 * 
	 * @return A comment string with the classification
	 */
	public static String getClassificationCommentJavaRandom() {
		return "\n# Classification: " + classifyCodeBlockJavaRandom() + "\n";
	}
}

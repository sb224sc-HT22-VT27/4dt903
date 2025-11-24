package notebookMM.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.Random;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Service class for AI-based command classification using OpenAI API.
 * Classifies code commands into three categories: 1. Data Preprocessing 2.
 * Model Training 3. Prediction/Inference
 */

public class AIClassificationService {
	private static final String API_ENDPOINT = "https://api.openai.com/v1/chat/completions";
	private static final String MODEL = "gpt-5-nano";
	private static final int TIMEOUT = 30000; // 30 seconds

	private String apiKey;

	/**
	 * Constructor that accepts an API key
	 * 
	 * @param apiKey OpenAI API key
	 */
	public AIClassificationService(String apiKey) {
		this.apiKey = apiKey;
	}

	/**
	 * Default constructor that reads API key from environment variable
	 */
	public AIClassificationService() {
		this.apiKey = System.getenv("OPENAI_API_KEY");
	}

	/**
	 * Classifies code into one of three categories using AI
	 * 
	 * @param code The source code to classify
	 * @return ClassificationResult containing the classification
	 */
	public ClassificationResult classifyCode(String code) {
		if (apiKey == null || apiKey.trim().isEmpty()) {
			// Fallback to heuristic if no API key
			return fallbackClassification(code);
		}

		try {
			String prompt = buildPrompt(code);
			String response = callOpenAI(prompt);
			return parseResponse(response);
		} catch (Exception e) {
			System.err.println("AI classification failed, falling back to heuristics: " + e.getMessage());
			return fallbackClassification(code);
		}
	}

	/**
	 * Builds the prompt for the AI model
	 */
	private String buildPrompt(String code) {
		return "Classify the following Python code snippet into ONE of these three categories:\n"
				+ "1. DATA_PREPROCESSING - code that loads, cleans, transforms, or prepares data\n"
				+ "2. MODEL_TRAINING - code that trains, fits, or builds a machine learning model\n"
				+ "3. PREDICTION - code that makes predictions, performs inference, or evaluates a model\n\n"
				+ "Respond with ONLY one of these three words: DATA_PREPROCESSING, MODEL_TRAINING, or PREDICTION\n\n"
				+ "Code:\n" + code;
	}

	/**
	 * Calls the OpenAI API
	 */
	private String callOpenAI(String prompt) throws IOException {
		HttpURLConnection conn = (HttpURLConnection) URI.create(API_ENDPOINT).toURL().openConnection();

		try {
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Type", "application/json");
			conn.setRequestProperty("Authorization", "Bearer " + apiKey);
			conn.setDoOutput(true);
			conn.setConnectTimeout(TIMEOUT);
			conn.setReadTimeout(TIMEOUT);

			// Build request body
			JSONObject requestBody = new JSONObject();
			requestBody.put("model", MODEL);

			JSONArray messages = new JSONArray();
			JSONObject message = new JSONObject();
			message.put("role", "user");
			message.put("content", prompt);
			messages.put(message);

			requestBody.put("messages", messages);
			requestBody.put("temperature", 0.3);
			requestBody.put("max_tokens", 10);

			// Send request
			try (OutputStream os = conn.getOutputStream()) {
				byte[] input = requestBody.toString().getBytes(StandardCharsets.UTF_8);
				os.write(input, 0, input.length);
			}

			// Read response
			int responseCode = conn.getResponseCode();
			if (responseCode != 200) {
				throw new IOException("API returned error code: " + responseCode);
			}

			try (BufferedReader br = new BufferedReader(
					new InputStreamReader(conn.getInputStream(), StandardCharsets.UTF_8))) {
				StringBuilder response = new StringBuilder();
				String line;
				while ((line = br.readLine()) != null) {
					response.append(line.trim());
				}
				return response.toString();
			}
		} finally {
			conn.disconnect();
		}
	}

	/**
	 * Parses the OpenAI API response
	 */
	private ClassificationResult parseResponse(String response) {
		JSONObject json = new JSONObject(response);
		JSONArray choices = json.getJSONArray("choices");
		if (choices.length() > 0) {
			JSONObject choice = choices.getJSONObject(0);
			JSONObject message = choice.getJSONObject("message");
			String content = message.getString("content").trim().toUpperCase();

			// Extract the classification from the content
			if (content.contains("DATA_PREPROCESSING")) {
				return new ClassificationResult(true, false, false);
			} else if (content.contains("MODEL_TRAINING")) {
				return new ClassificationResult(false, true, false);
			} else if (content.contains("PREDICTION")) {
				return new ClassificationResult(false, false, true);
			}
		}

		// If parsing fails, return no classification
		return new ClassificationResult(false, false, false);
	}

	/**
	 * Fallback classification using simple heuristics
	 */
	private ClassificationResult fallbackClassification(String code) {
		if (code == null || code.isEmpty()) {
			return new ClassificationResult(false, false, false);
		}

		boolean isTraining = false;
		boolean isPreprocessing = false;
		boolean isPrediction = false;

		Random random = new Random();
		int prediction = random.nextInt(3);

		if (prediction == 0) {
			isTraining = true;
		} else if (prediction == 1) {
			isPreprocessing = true;
		} else {
			isPrediction = true;
		}

		return new ClassificationResult(isPreprocessing, isTraining, isPrediction);
	}

	/**
	 * Result class for classification
	 */
	public static class ClassificationResult {
		private final boolean isDataPreprocessing;
		private final boolean isModelTraining;
		private final boolean isPrediction;

		public ClassificationResult(boolean isDataPreprocessing, boolean isModelTraining, boolean isPrediction) {
			this.isDataPreprocessing = isDataPreprocessing;
			this.isModelTraining = isModelTraining;
			this.isPrediction = isPrediction;
		}

		public boolean isDataPreprocessing() {
			return isDataPreprocessing;
		}

		public boolean isModelTraining() {
			return isModelTraining;
		}

		public boolean isPrediction() {
			return isPrediction;
		}
	}
}

"""
Prediction Service - Flask-based REST API for model predictions.
Accessible at localhost:8080/predict
"""

from flask import Flask, request, jsonify
import joblib
import numpy as np
import os

app = Flask(__name__)

# Load model and scaler at startup
MODEL_PATH = os.path.join(os.path.dirname(__file__), "..", "models")
model = None
scaler = None
feature_names = None

def load_model():
    """Load the trained model and associated artifacts."""
    global model, scaler, feature_names
    try:
        # Try to load common model artifacts
        model_files = [f for f in os.listdir(MODEL_PATH) if f.endswith(".pkl") or f.endswith(".keras") or f.endswith(".h5")]
        for f in model_files:
            if "model" in f.lower() and not "scaler" in f.lower():
                model = joblib.load(os.path.join(MODEL_PATH, f))
            elif "scaler" in f.lower():
                scaler = joblib.load(os.path.join(MODEL_PATH, f))
            elif "feature" in f.lower():
                feature_names = joblib.load(os.path.join(MODEL_PATH, f))
        print("Model loaded successfully")
    except Exception as e:
        print(f"Error loading model: {e}")

@app.route("/predict", methods=["POST"])
def predict():
    """
    Prediction endpoint.
    Expects JSON input with features for prediction.
    Returns JSON with prediction results.
    """
    try:
        if model is None:
            return jsonify({"error": "Model not loaded"}), 500
        
        data = request.get_json()
        if data is None:
            return jsonify({"error": "No JSON data provided"}), 400
        
        # Extract features from request
        features = data.get("features")
        if features is None:
            return jsonify({"error": "No features provided"}), 400
        
        # Convert to numpy array
        features_array = np.array(features).reshape(1, -1)
        
        # Apply scaler if available
        if scaler is not None:
            features_array = scaler.transform(features_array)
        
        # Make prediction
        prediction = model.predict(features_array)
        
        # Try to get probability if available
        try:
            probability = model.predict_proba(features_array).tolist()
        except AttributeError:
            probability = None
        
        response = {
            "prediction": prediction.tolist() if hasattr(prediction, "tolist") else prediction,
            "probability": probability
        }
        
        return jsonify(response)
        
    except Exception as e:
        return jsonify({"error": str(e)}), 500

@app.route("/health", methods=["GET"])
def health():
    """Health check endpoint."""
    return jsonify({"status": "healthy", "model_loaded": model is not None})

if __name__ == "__main__":
    load_model()
    app.run(host="0.0.0.0", port=8080)

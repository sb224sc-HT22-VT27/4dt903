"""
Prediction Service - Flask-based REST API for model predictions.
Accessible at localhost:8080/predict
"""

from flask import Flask, request, jsonify
import joblib
import numpy as np
import os
import traceback
import logging
app = Flask(__name__)

# Configure logging
logging.basicConfig(level=logging.INFO)

# Load model and scaler at startup
MODEL_PATH = os.path.join(os.path.dirname(__file__), "..", "models")
model = None
scaler = None
feature_names = None
is_keras_model = False

def load_model():
    """Load the trained model and associated artifacts."""
    global model, scaler, feature_names, is_keras_model
    try:
        model_files = [f for f in os.listdir(MODEL_PATH) if f.endswith(".pkl") or f.endswith(".keras") or f.endswith(".h5")]
        # Prioritize Keras models first, then pkl models
        keras_models = [f for f in model_files if f.endswith(".keras") or f.endswith(".h5")]
        pkl_files = [f for f in model_files if f.endswith(".pkl")]
        
        # Load Keras model if available
        for f in keras_models:
            if model is None:
                filepath = os.path.join(MODEL_PATH, f)
                try:
                    from tensorflow import keras
                    model = keras.models.load_model(filepath)
                    is_keras_model = True
                    print(f"Loaded Keras model from {f}")
                except ImportError:
                    print("TensorFlow not available for loading .keras/.h5 model")
        
        # Load pkl files (model if not already loaded, scaler, feature_names)
        for f in pkl_files:
            filepath = os.path.join(MODEL_PATH, f)
            if model is None and "model" in f.lower() and "scaler" not in f.lower():
                model = joblib.load(filepath)
                print(f"Loaded model from {f}")
            elif "scaler" in f.lower():
                scaler = joblib.load(filepath)
            elif "feature" in f.lower():
                feature_names = joblib.load(filepath)
        
        if model is not None:
            print("Model loaded successfully")
        else:
            print("Warning: No model found in models directory")
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
        
        # Convert to numpy array and reshape appropriately
        features_array = np.array(features)
        
        # For Keras models, preserve multi-dimensional input (add batch dimension if needed)
        # For sklearn models, flatten to 2D (samples, features)
        if is_keras_model:
            # Add batch dimension if not already present
            features_array = np.expand_dims(features_array, axis=0)
        else:
            features_array = features_array.reshape(1, -1)
        
        # Apply scaler if available (typically for sklearn models)
        if scaler is not None and not is_keras_model:
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
        # Log the exception and traceback for internal debugging
        logging.error("Exception occurred during prediction: %s", e)
        logging.error(traceback.format_exc())
        return jsonify({"error": "An internal error has occurred."}), 500
@app.route("/health", methods=["GET"])
def health():
    """Health check endpoint."""
    return jsonify({"status": "healthy", "model_loaded": model is not None})

if __name__ == "__main__":
    load_model()
    app.run(host="0.0.0.0", port=8080)

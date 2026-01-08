'''
service - flask based api for model prediction
Accessable at localhost:8080/predict

'''

from flask import Flask, request, jsonify
import joblib
import numpy as np
import os

app = Flask(__name__)

#Load models and scalers at start
MODEL_PATH = os.path.join(os.path.dirname(__file__), '..', 'models')
model = None
scaler = None
feature_names = None
is_keras_model = False

def load_models():
	'''Load the trained model and associated artifacts.'''
	global model, scaler, feature_names, is_keras_model
	try:
		model_files = [f for f in os.listdir(MODEL_PATH) if f.endswith('.pkl') or f.endswith('.keras') or f.endswith('.h5')]
		# Prioretize Keras and h5 models over pkl
		keras_models = [f for f in model_files if f.endswith('.keras') or f.endswith('.h5')]
		pkl_files = [f for f in model_files if f.endswith('.pkl')]

		for f in keras_models:
			if model is None:
				filepath = os.path.join(MODEL_PATH, f)
				try:
					from tensorflow import keras
					model = keras.models.load_model(filepath)
					is_keras_model = True
					print(f'Loaded Keras model from {f}')
				except ImportError:
					print('TensorFlow not available for loading .keras/.h5 model')
		for f in pkl_files:
			filepath = os.path.join(MODEL_PATH, f)
			if model is None and 'model' in f.lower() and 'scaler' not in f.lower():
				model = joblib.load(filepath)
				print(f'Loaded model from {f}')
			elif 'scaler' in f.lower():
				scaler = joblib.load(filepath)
				print(f'Loaded scaler from {f}')
			elif 'feature_names' in f.lower():
				feature_names = joblib.load(filepath)
		if model is not None:
			print('Model loaded successfully')
		else:
			print('Warning: No model found in models directory')

	except Exception as e:
		print(f'Error loading model: {e}')

@app.route('/predict', methods=['POST'])
def predict():
	'''
	Prediction endpoint
	Expects JSON input with features for prediction.
	Returns JSON with prediction results
	'''
	try:
		if model is None:
			return jsonify({'error': 'Model not loaded'}), 500
		data = request.get_json()
		if data is None:
			return jsonify({'error': 'No JSON data provided'}), 400
		features = data.get('features')
		if features is None:
			return jsonify({'error': 'No features provided'}), 400
		import pandas as pd
		features_df = pd.DataFrame([features])

		# One-hot encode
		features_df = pd.get_dummies(features_df)
		# Align columns
		for col in feature_names:
			if col not in features_df.columns:
				features_df[col] = 0
		features_df = features_df[feature_names]

		# Scale
		features_scaled = scaler.transform(features_df)

		# Predict
		prediction = model.predict(features_scaled)[0]
		probability = model.predict_proba(features_scaled)[0][1]
		return jsonify({
    		'churn_prediction': int(prediction),
    		'churn_probability': float(probability)
		})
	except Exception as e:

		return jsonify({'error': str(e)}), 500
if __name__ == '__main__':
	load_models()
	app.run(host='0.0.0.0', port=8080)


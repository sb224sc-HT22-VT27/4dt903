
"""
# Customer Churn Prediction
This notebook trains a model to predict customer churn based on usage patterns.
"""



import pandas as pd
import numpy as np
from sklearn.model_selection import train_test_split
from sklearn.preprocessing import StandardScaler
from sklearn.ensemble import RandomForestClassifier
from sklearn.metrics import accuracy_score, classification_report
import joblib
# Classification: PREPROCESS




"""
## Load and Explore Data
"""



# Load data
df = pd.read_csv('data/customers.csv')
print(f"Dataset shape: {df.shape}")
print(df.head())
# Classification: TRAIN




"""
## Data Preprocessing
"""



# Handle missing values
df = df.dropna()

# Feature engineering
df['usage_per_month'] = df['total_usage'] / df['months_active']
df['support_ratio'] = df['support_calls'] / df['months_active']

# Select features
features = ['age', 'monthly_charges', 'total_usage', 'usage_per_month',
            'support_ratio', 'contract_type']
X = df[features]
y = df['churned']

# Encode categorical variables
X = pd.get_dummies(X, columns=['contract_type'])
# Classification: PREPROCESS




"""
## Split and Scale Data
"""



# Split data
X_train, X_test, y_train, y_test = train_test_split(
    X, y, test_size=0.2, random_state=42
)

feature_names = X_train.columns.tolist()

# Scale features
scaler = StandardScaler()
X_train_scaled = scaler.fit_transform(X_train)
X_test_scaled = scaler.transform(X_test)
# Classification: PREDICT




"""
## Train Model
"""



# Train Random Forest model
model = RandomForestClassifier(
    n_estimators=100,
    max_depth=10,
    random_state=42
)
model.fit(X_train_scaled, y_train)
print("Model trained successfully!")
# Classification: PREDICT




"""
## Evaluate Model
"""



# Make predictions
y_pred = model.predict(X_test_scaled)

# Evaluate
accuracy = accuracy_score(y_test, y_pred)
print(f"Accuracy: {accuracy:.3f}")
print("\nClassification Report:")
print(classification_report(y_test, y_pred))
# Classification: PREPROCESS




"""
## Save Model and Scaler
"""



# Save trained model
joblib.dump(model, 'models/churn_model.pkl')
joblib.dump(scaler, 'models/scaler.pkl')
joblib.dump(feature_names, 'models/feature_names.pkl')
print("Model and scaler saved!")
# Classification: PREPROCESS




"""
## Make Predictions on New Data
"""



# Example prediction function
def predict_churn(customer_data):
    # Load model and scaler
    model = joblib.load('models/churn_model.pkl')
    scaler = joblib.load('models/scaler.pkl')
    feature_names = joblib.load('models/feature_names.pkl')

    # Prepare features
    features_df = pd.DataFrame([customer_data])
    features_df = pd.get_dummies(features_df)

    for col in feature_names:
        if col not in features_df.columns:
            features_df[col] = 0

    features_df = features_df[feature_names]

    features_scaled = scaler.transform(features_df)

    # Predict
    prediction = model.predict(features_scaled)
    probability = model.predict_proba(features_scaled)

    return prediction[0], probability[0]

# Test prediction
new_customer = {
    'age': 35,
    'monthly_charges': 75.5,
    'total_usage': 450,
    'usage_per_month': 37.5,
    'support_ratio': 0.5,
    'contract_type': 'monthly'
}

pred, prob = predict_churn(new_customer)
print(f"Churn prediction: {pred}")
print(f"Churn probability: {prob[1]:.3f}")
# Classification: TRAIN




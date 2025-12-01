
"""
# Image Classification with CNN
Training a convolutional neural network for product category classification
"""



import os
import numpy as np
import pandas as pd
import matplotlib.pyplot as plt
import tensorflow as tf
from tensorflow import keras
from tensorflow.keras import layers
from tensorflow.keras.preprocessing.image import ImageDataGenerator
from sklearn.metrics import confusion_matrix, classification_report
import seaborn as sns
import json
# Classification: PREPROCESS




"""
## Configuration
"""



# Hyperparameters
IMG_SIZE = 224
BATCH_SIZE = 32
EPOCHS = 50
LEARNING_RATE = 0.001
NUM_CLASSES = 10

# Paths
TRAIN_DIR = 'data/train'
VAL_DIR = 'data/validation'
TEST_DIR = 'data/test'
MODEL_PATH = 'models/product_classifier.keras'
HISTORY_PATH = 'output/training_history.json'

print(f"Using TensorFlow version: {tf.__version__}")
print(f"GPU Available: {tf.config.list_physical_devices('GPU')}")
# Classification: PREPROCESS




"""
## Data Loading and Augmentation
"""



# Data augmentation for training
train_datagen = ImageDataGenerator(
    rescale=1./255,
    rotation_range=20,
    width_shift_range=0.2,
    height_shift_range=0.2,
    horizontal_flip=True,
    zoom_range=0.2,
    shear_range=0.2,
    fill_mode='nearest'
)

# Only rescaling for validation and test
val_datagen = ImageDataGenerator(rescale=1./255)
test_datagen = ImageDataGenerator(rescale=1./255)

# Load datasets
train_generator = train_datagen.flow_from_directory(
    TRAIN_DIR,
    target_size=(IMG_SIZE, IMG_SIZE),
    batch_size=BATCH_SIZE,
    class_mode='categorical'
)

val_generator = val_datagen.flow_from_directory(
    VAL_DIR,
    target_size=(IMG_SIZE, IMG_SIZE),
    batch_size=BATCH_SIZE,
    class_mode='categorical'
)

test_generator = test_datagen.flow_from_directory(
    TEST_DIR,
    target_size=(IMG_SIZE, IMG_SIZE),
    batch_size=BATCH_SIZE,
    class_mode='categorical',
    shuffle=False
)

print(f"Training samples: {train_generator.samples}")
print(f"Validation samples: {val_generator.samples}")
print(f"Test samples: {test_generator.samples}")
print(f"Class labels: {train_generator.class_indices}")
# Classification: TRAIN




"""
## Model Architecture
"""



def build_cnn_model(input_shape, num_classes):
    """
    Build a CNN model for image classification
    """
    model = keras.Sequential([
        # Block 1
        layers.Conv2D(32, (3, 3), activation='relu', input_shape=input_shape),
        layers.BatchNormalization(),
        layers.MaxPooling2D((2, 2)),
        layers.Dropout(0.25),

        # Block 2
        layers.Conv2D(64, (3, 3), activation='relu'),
        layers.BatchNormalization(),
        layers.MaxPooling2D((2, 2)),
        layers.Dropout(0.25),

        # Block 3
        layers.Conv2D(128, (3, 3), activation='relu'),
        layers.BatchNormalization(),
        layers.MaxPooling2D((2, 2)),
        layers.Dropout(0.25),

        # Block 4
        layers.Conv2D(256, (3, 3), activation='relu'),
        layers.BatchNormalization(),
        layers.MaxPooling2D((2, 2)),
        layers.Dropout(0.25),

        # Dense layers
        layers.Flatten(),
        layers.Dense(512, activation='relu'),
        layers.BatchNormalization(),
        layers.Dropout(0.5),
        layers.Dense(256, activation='relu'),
        layers.Dropout(0.3),
        layers.Dense(num_classes, activation='softmax')
    ])

    return model

# Build model
model = build_cnn_model(
    input_shape=(IMG_SIZE, IMG_SIZE, 3),
    num_classes=NUM_CLASSES
)

model.summary()
# Classification: TRAIN




"""
## Compile Model
"""



# Compile model
optimizer = keras.optimizers.Adam(learning_rate=LEARNING_RATE)

model.compile(
    optimizer=optimizer,
    loss='categorical_crossentropy',
    metrics=['accuracy', keras.metrics.TopKCategoricalAccuracy(k=3)]
)

print("Model compiled successfully!")
# Classification: PREPROCESS




"""
## Callbacks
"""



# Early stopping
early_stopping = keras.callbacks.EarlyStopping(
    monitor='val_loss',
    patience=10,
    restore_best_weights=True
)

# Learning rate reduction
reduce_lr = keras.callbacks.ReduceLROnPlateau(
    monitor='val_loss',
    factor=0.5,
    patience=5,
    min_lr=1e-7
)

# Model checkpoint
checkpoint = keras.callbacks.ModelCheckpoint(
    'models/best_model.keras',
    monitor='val_accuracy',
    save_best_only=True
)

callbacks = [early_stopping, reduce_lr, checkpoint]
# Classification: TRAIN




"""
## Train Model
"""



# Train the model
history = model.fit(
    train_generator,
    validation_data=val_generator,
    epochs=EPOCHS,
    callbacks=callbacks,
    verbose=1
)

print("Training completed!")
# Classification: TRAIN




"""
## Plot Training History
"""



# Plot training & validation accuracy
plt.figure(figsize=(12, 4))

plt.subplot(1, 2, 1)
plt.plot(history.history['accuracy'], label='Train Accuracy')
plt.plot(history.history['val_accuracy'], label='Val Accuracy')
plt.title('Model Accuracy')
plt.xlabel('Epoch')
plt.ylabel('Accuracy')
plt.legend()
plt.grid(True)

plt.subplot(1, 2, 2)
plt.plot(history.history['loss'], label='Train Loss')
plt.plot(history.history['val_loss'], label='Val Loss')
plt.title('Model Loss')
plt.xlabel('Epoch')
plt.ylabel('Loss')
plt.legend()
plt.grid(True)

plt.tight_layout()
plt.savefig('output/training_history.png')
plt.show()
# Classification: TRAIN




"""
## Evaluate on Test Set
"""



# Evaluate on test set
test_loss, test_acc, test_top3_acc = model.evaluate(test_generator)
print(f"\nTest Accuracy: {test_acc:.4f}")
print(f"Test Top-3 Accuracy: {test_top3_acc:.4f}")
print(f"Test Loss: {test_loss:.4f}")

# Get predictions
predictions = model.predict(test_generator)
y_pred = np.argmax(predictions, axis=1)
y_true = test_generator.classes

# Classification report
class_names = list(test_generator.class_indices.keys())
print("\nClassification Report:")
print(classification_report(y_true, y_pred, target_names=class_names))
# Classification: PREPROCESS




"""
## Confusion Matrix
"""



# Plot confusion matrix
cm = confusion_matrix(y_true, y_pred)

plt.figure(figsize=(12, 10))
sns.heatmap(cm, annot=True, fmt='d', cmap='Blues',
            xticklabels=class_names,
            yticklabels=class_names)
plt.title('Confusion Matrix')
plt.ylabel('True Label')
plt.xlabel('Predicted Label')
plt.tight_layout()
plt.savefig('output/confusion_matrix.png')
plt.show()
# Classification: PREPROCESS




"""
## Save Model and Metadata
"""



# Save final model
model.save(MODEL_PATH)
print(f"Model saved to {MODEL_PATH}")

# Save training history
with open(HISTORY_PATH, 'w') as f:
    json.dump(history.history, f)

# Save class indices
with open('models/class_indices.json', 'w') as f:
    json.dump(train_generator.class_indices, f)

# Save model metadata
metadata = {
    'img_size': IMG_SIZE,
    'num_classes': NUM_CLASSES,
    'test_accuracy': float(test_acc),
    'test_loss': float(test_loss),
    'class_names': class_names
}

with open('models/model_metadata.json', 'w') as f:
    json.dump(metadata, f, indent=2)

print("Metadata saved!")
# Classification: PREPROCESS




"""
## Inference Function
"""



def predict_image(image_path, model_path='models/product_classifier.keras'):
    """
    Predict class for a single image
    """
    # Load model
    model = keras.models.load_model(model_path)

    # Load and preprocess image
    img = keras.preprocessing.image.load_img(
        image_path,
        target_size=(IMG_SIZE, IMG_SIZE)
    )
    img_array = keras.preprocessing.image.img_to_array(img)
    img_array = img_array / 255.0
    img_array = np.expand_dims(img_array, axis=0)

    # Predict
    predictions = model.predict(img_array)
    predicted_class = np.argmax(predictions[0])
    confidence = predictions[0][predicted_class]

    # Load class names
    with open('models/class_indices.json', 'r') as f:
        class_indices = json.load(f)

    # Reverse mapping
    idx_to_class = {v: k for k, v in class_indices.items()}
    predicted_label = idx_to_class[predicted_class]

    return predicted_label, confidence, predictions[0]

# Test the function
test_image = 'data/test/sample_product.jpg'
label, conf, probs = predict_image(test_image)
print(f"\nPredicted class: {label}")
print(f"Confidence: {conf:.4f}")
# print(f"Probs: {probs}")
# Classification: PREPROCESS




# Framework-Specific Adaptations

This document describes how the standard Python ML project structure adapts for different ML frameworks and use cases.

## Overview

The base structure defined in [PYTHON_ML_PROJECT_STRUCTURE.md](./PYTHON_ML_PROJECT_STRUCTURE.md) is framework-agnostic. This document shows specific adaptations for popular ML frameworks.

## Supported Frameworks

- [scikit-learn](#scikit-learn)
- [TensorFlow / Keras](#tensorflow--keras)
- [PyTorch](#pytorch)
- [XGBoost / LightGBM](#xgboost--lightgbm)
- [Hugging Face Transformers](#hugging-face-transformers)

---

## scikit-learn

### Additional Dependencies

```txt
# requirements.txt
scikit-learn>=1.3.0
numpy>=1.24.0
pandas>=2.0.0
joblib>=1.3.0
```

### Model Structure

```python
# src/project_name/models/model.py
from sklearn.ensemble import RandomForestClassifier
from sklearn.pipeline import Pipeline
from sklearn.preprocessing import StandardScaler
import joblib

class Model:
    def __init__(self, config):
        self.config = config
        self.pipeline = self._build_pipeline()
    
    def _build_pipeline(self):
        return Pipeline([
            ('scaler', StandardScaler()),
            ('classifier', RandomForestClassifier(
                n_estimators=self.config['n_estimators'],
                max_depth=self.config['max_depth'],
                random_state=42
            ))
        ])
    
    def fit(self, X, y):
        self.pipeline.fit(X, y)
    
    def predict(self, X):
        return self.pipeline.predict(X)
    
    def save(self, path):
        joblib.dump(self.pipeline, path)
    
    @classmethod
    def load(cls, path):
        return joblib.load(path)
```

### Configuration

```yaml
# configs/config.yaml
model:
  type: "classification"
  algorithm: "random_forest"
  hyperparameters:
    n_estimators: 100
    max_depth: 10
    min_samples_split: 2
    min_samples_leaf: 1
    random_state: 42
```

---

## TensorFlow / Keras

### Additional Dependencies

```txt
# requirements.txt
tensorflow>=2.13.0
keras>=2.13.0
tensorboard>=2.13.0
```

### Model Structure

```python
# src/project_name/models/model.py
import tensorflow as tf
from tensorflow import keras
from tensorflow.keras import layers

class Model:
    def __init__(self, config):
        self.config = config
        self.model = self._build_model()
    
    def _build_model(self):
        inputs = keras.Input(shape=(self.config['input_dim'],))
        x = inputs
        
        for units in self.config['hidden_layers']:
            x = layers.Dense(units, activation='relu')(x)
            x = layers.Dropout(self.config['dropout'])(x)
        
        outputs = layers.Dense(
            self.config['num_classes'], 
            activation='softmax'
        )(x)
        
        model = keras.Model(inputs=inputs, outputs=outputs)
        
        model.compile(
            optimizer=keras.optimizers.Adam(
                learning_rate=self.config['learning_rate']
            ),
            loss='categorical_crossentropy',
            metrics=['accuracy']
        )
        
        return model
    
    def fit(self, X_train, y_train, X_val, y_val):
        callbacks = [
            keras.callbacks.ModelCheckpoint(
                'models/checkpoints/model_{epoch:02d}.h5',
                save_best_only=True,
                monitor='val_loss'
            ),
            keras.callbacks.EarlyStopping(
                monitor='val_loss',
                patience=10,
                restore_best_weights=True
            ),
            keras.callbacks.TensorBoard(
                log_dir='outputs/logs/tensorboard'
            )
        ]
        
        return self.model.fit(
            X_train, y_train,
            validation_data=(X_val, y_val),
            epochs=self.config['epochs'],
            batch_size=self.config['batch_size'],
            callbacks=callbacks
        )
    
    def predict(self, X):
        return self.model.predict(X)
    
    def save(self, path):
        self.model.save(path)
    
    @classmethod
    def load(cls, path):
        return keras.models.load_model(path)
```

### Configuration

```yaml
# configs/config.yaml
model:
  type: "neural_network"
  framework: "tensorflow"
  input_dim: 784
  hidden_layers: [256, 128, 64]
  num_classes: 10
  dropout: 0.3

training:
  batch_size: 32
  epochs: 100
  learning_rate: 0.001
```

### Additional Files

```
outputs/
└── logs/
    └── tensorboard/    # TensorBoard logs
        ├── train/
        └── validation/
```

---

## PyTorch

### Additional Dependencies

```txt
# requirements.txt
torch>=2.0.0
torchvision>=0.15.0  # if needed
tensorboard>=2.13.0
```

### Model Structure

```python
# src/project_name/models/model.py
import torch
import torch.nn as nn
import torch.optim as optim

class Model(nn.Module):
    def __init__(self, config):
        super().__init__()
        self.config = config
        
        layers = []
        input_dim = config['input_dim']
        
        for hidden_dim in config['hidden_layers']:
            layers.append(nn.Linear(input_dim, hidden_dim))
            layers.append(nn.ReLU())
            layers.append(nn.Dropout(config['dropout']))
            input_dim = hidden_dim
        
        layers.append(nn.Linear(input_dim, config['num_classes']))
        
        self.network = nn.Sequential(*layers)
    
    def forward(self, x):
        return self.network(x)
    
    def save(self, path):
        torch.save({
            'model_state_dict': self.state_dict(),
            'config': self.config
        }, path)
    
    @classmethod
    def load(cls, path, device='cpu'):
        checkpoint = torch.load(path, map_location=device)
        model = cls(checkpoint['config'])
        model.load_state_dict(checkpoint['model_state_dict'])
        return model

# src/project_name/models/train.py
def train_model(model, train_loader, val_loader, config, device):
    criterion = nn.CrossEntropyLoss()
    optimizer = optim.Adam(
        model.parameters(), 
        lr=config['learning_rate']
    )
    
    best_val_loss = float('inf')
    
    for epoch in range(config['epochs']):
        # Training
        model.train()
        train_loss = 0.0
        
        for batch_X, batch_y in train_loader:
            batch_X = batch_X.to(device)
            batch_y = batch_y.to(device)
            
            optimizer.zero_grad()
            outputs = model(batch_X)
            loss = criterion(outputs, batch_y)
            loss.backward()
            optimizer.step()
            
            train_loss += loss.item()
        
        # Validation
        model.eval()
        val_loss = 0.0
        
        with torch.no_grad():
            for batch_X, batch_y in val_loader:
                batch_X = batch_X.to(device)
                batch_y = batch_y.to(device)
                
                outputs = model(batch_X)
                loss = criterion(outputs, batch_y)
                val_loss += loss.item()
        
        # Checkpointing
        if val_loss < best_val_loss:
            best_val_loss = val_loss
            model.save(f'models/checkpoints/best_model.pth')
        
        print(f'Epoch {epoch+1}: Train Loss={train_loss:.4f}, Val Loss={val_loss:.4f}')
    
    return model
```

### Configuration

```yaml
# configs/config.yaml
model:
  type: "neural_network"
  framework: "pytorch"
  input_dim: 784
  hidden_layers: [256, 128, 64]
  num_classes: 10
  dropout: 0.3

training:
  batch_size: 32
  epochs: 100
  learning_rate: 0.001
  device: "cuda"  # or "cpu", "mps"
```

---

## XGBoost / LightGBM

### Additional Dependencies

```txt
# requirements.txt
xgboost>=2.0.0
# OR
lightgbm>=4.0.0

optuna>=3.0.0  # for hyperparameter tuning
```

### Model Structure

```python
# src/project_name/models/model.py
import xgboost as xgb
# import lightgbm as lgb

class Model:
    def __init__(self, config):
        self.config = config
        self.model = xgb.XGBClassifier(
            n_estimators=config['n_estimators'],
            max_depth=config['max_depth'],
            learning_rate=config['learning_rate'],
            subsample=config['subsample'],
            colsample_bytree=config['colsample_bytree'],
            random_state=42
        )
    
    def fit(self, X_train, y_train, X_val=None, y_val=None):
        if X_val is not None:
            eval_set = [(X_train, y_train), (X_val, y_val)]
            self.model.fit(
                X_train, y_train,
                eval_set=eval_set,
                eval_metric='mlogloss',
                early_stopping_rounds=10,
                verbose=True
            )
        else:
            self.model.fit(X_train, y_train)
    
    def predict(self, X):
        return self.model.predict(X)
    
    def predict_proba(self, X):
        return self.model.predict_proba(X)
    
    def save(self, path):
        self.model.save_model(path)
    
    @classmethod
    def load(cls, path):
        model = xgb.XGBClassifier()
        model.load_model(path)
        return model
```

### Configuration

```yaml
# configs/config.yaml
model:
  type: "gradient_boosting"
  algorithm: "xgboost"
  hyperparameters:
    n_estimators: 1000
    max_depth: 6
    learning_rate: 0.01
    subsample: 0.8
    colsample_bytree: 0.8
    objective: "multi:softmax"
    num_class: 10
```

---

## Hugging Face Transformers

### Additional Dependencies

```txt
# requirements.txt
transformers>=4.30.0
datasets>=2.14.0
accelerate>=0.20.0
tokenizers>=0.13.0
```

### Project Modifications

Additional directory for model artifacts:

```
models/
├── checkpoints/
├── production/
└── pretrained/        # Downloaded pretrained models
    └── bert-base-uncased/
```

### Model Structure

```python
# src/project_name/models/model.py
from transformers import (
    AutoModelForSequenceClassification,
    AutoTokenizer,
    Trainer,
    TrainingArguments
)

class Model:
    def __init__(self, config):
        self.config = config
        self.tokenizer = AutoTokenizer.from_pretrained(
            config['model_name']
        )
        self.model = AutoModelForSequenceClassification.from_pretrained(
            config['model_name'],
            num_labels=config['num_classes']
        )
    
    def tokenize_function(self, examples):
        return self.tokenizer(
            examples['text'],
            padding='max_length',
            truncation=True,
            max_length=self.config['max_length']
        )
    
    def train(self, train_dataset, val_dataset):
        training_args = TrainingArguments(
            output_dir='models/checkpoints',
            evaluation_strategy='epoch',
            save_strategy='epoch',
            learning_rate=self.config['learning_rate'],
            per_device_train_batch_size=self.config['batch_size'],
            per_device_eval_batch_size=self.config['batch_size'],
            num_train_epochs=self.config['epochs'],
            weight_decay=self.config['weight_decay'],
            load_best_model_at_end=True,
        )
        
        trainer = Trainer(
            model=self.model,
            args=training_args,
            train_dataset=train_dataset,
            eval_dataset=val_dataset,
        )
        
        trainer.train()
        return trainer
    
    def predict(self, texts):
        inputs = self.tokenizer(
            texts,
            padding=True,
            truncation=True,
            return_tensors='pt'
        )
        outputs = self.model(**inputs)
        return outputs.logits.argmax(dim=-1)
    
    def save(self, path):
        self.model.save_pretrained(path)
        self.tokenizer.save_pretrained(path)
    
    @classmethod
    def load(cls, path):
        model = AutoModelForSequenceClassification.from_pretrained(path)
        tokenizer = AutoTokenizer.from_pretrained(path)
        return model, tokenizer
```

### Configuration

```yaml
# configs/config.yaml
model:
  type: "transformer"
  framework: "huggingface"
  model_name: "bert-base-uncased"
  num_classes: 2
  max_length: 512

training:
  batch_size: 16
  epochs: 3
  learning_rate: 2e-5
  weight_decay: 0.01
```

---

## Computer Vision Projects

### Additional Structure

```
data/
├── raw/
│   ├── train/
│   │   ├── class1/
│   │   └── class2/
│   ├── val/
│   └── test/
└── processed/
    └── augmented/

notebooks/
└── visualizations/     # Image visualization notebooks
```

### Additional Dependencies

```txt
# For TensorFlow
tensorflow>=2.13.0
pillow>=10.0.0
opencv-python>=4.8.0
albumentations>=1.3.0

# For PyTorch
torch>=2.0.0
torchvision>=0.15.0
pillow>=10.0.0
opencv-python>=4.8.0
albumentations>=1.3.0
```

---

## NLP Projects

### Additional Structure

```
data/
├── raw/
│   ├── train.csv
│   ├── val.csv
│   └── test.csv
└── processed/
    ├── tokenized/
    └── embeddings/

models/
└── pretrained/
    └── word_embeddings/
```

### Additional Dependencies

```txt
# Core NLP
transformers>=4.30.0
tokenizers>=0.13.0
nltk>=3.8.0
spacy>=3.6.0

# Optional
gensim>=4.3.0
sentencepiece>=0.1.99
```

---

## Time Series Projects

### Additional Structure

```
src/project_name/
├── data/
│   ├── loader.py
│   ├── preprocessing.py
│   └── windowing.py      # Time series windowing
├── features/
│   ├── lag_features.py   # Lag features
│   └── rolling_stats.py  # Rolling statistics
└── models/
    ├── forecasting.py    # Forecasting models
    └── anomaly.py        # Anomaly detection
```

### Additional Dependencies

```txt
statsmodels>=0.14.0
prophet>=1.1.0
pmdarima>=2.0.0
sktime>=0.22.0
```

---

## Recommendation Systems

### Additional Structure

```
src/project_name/
├── data/
│   ├── user_item_matrix.py
│   └── interactions.py
├── models/
│   ├── collaborative_filtering.py
│   ├── content_based.py
│   └── hybrid.py
└── evaluation/
    ├── ranking_metrics.py
    └── diversity_metrics.py
```

### Additional Dependencies

```txt
surprise>=0.1
implicit>=0.7.0
lightfm>=1.17
```

---

## Summary Table

| Framework | Model File Extension | Save Method | Load Method |
|-----------|---------------------|-------------|-------------|
| scikit-learn | `.pkl` or `.joblib` | `joblib.dump()` | `joblib.load()` |
| TensorFlow/Keras | `.h5` or `.keras` | `model.save()` | `keras.models.load_model()` |
| PyTorch | `.pth` or `.pt` | `torch.save()` | `torch.load()` |
| XGBoost | `.json` or `.ubj` | `model.save_model()` | `model.load_model()` |
| Transformers | `pytorch_model.bin` | `model.save_pretrained()` | `AutoModel.from_pretrained()` |

## Best Practices Across Frameworks

1. **Always use checkpointing** during training
2. **Save configuration** along with the model
3. **Version your models** (v1.0.0, v1.1.0, etc.)
4. **Use callbacks/hooks** for monitoring
5. **Separate training and inference** code
6. **Implement early stopping** to prevent overfitting
7. **Use GPU when available** and configure accordingly

## References

- [scikit-learn Documentation](https://scikit-learn.org/)
- [TensorFlow Documentation](https://www.tensorflow.org/)
- [PyTorch Documentation](https://pytorch.org/)
- [Hugging Face Documentation](https://huggingface.co/docs)
- [XGBoost Documentation](https://xgboost.readthedocs.io/)

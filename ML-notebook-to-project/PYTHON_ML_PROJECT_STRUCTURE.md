# Python ML Project Structure Specification

## Overview

This document defines the fixed project structure for Machine Learning projects generated from Jupyter notebooks. The structure follows Python best practices (PEP 8, PEP 517/518) and modern ML engineering conventions to create production-ready, maintainable, and deployable ML applications.

## Design Principles

1. **Separation of Concerns**: Clear separation between data, source code, models, tests, and documentation
2. **Reproducibility**: Version control friendly, with clear dependency management and configuration
3. **Scalability**: Structure supports growth from prototype to production
4. **Industry Standard**: Follows conventions used by major ML frameworks and organizations
5. **CI/CD Ready**: Structure supports automated testing, linting, and deployment
6. **Modularity**: Code organized into logical modules (data processing, model, training, inference)

## Standard Project Structure

```
project-name/
│
├── README.md                      # Project overview, setup instructions, usage
├── LICENSE                        # Open source license (if applicable)
├── .gitignore                     # Git ignore patterns for Python/ML projects
├── requirements.txt               # Production dependencies
├── requirements-dev.txt           # Development dependencies (pytest, black, etc.)
├── setup.py                       # Package installation configuration
├── pyproject.toml                 # Modern Python project metadata (PEP 518)
├── Makefile                       # Common commands (install, test, lint, train)
│
├── data/                          # Data directory (git-ignored, DVC tracked)
│   ├── raw/                       # Original, immutable data
│   ├── processed/                 # Cleaned, preprocessed data
│   ├── interim/                   # Intermediate transformation data
│   └── external/                  # External data sources
│
├── models/                        # Trained models (git-ignored, DVC tracked)
│   ├── checkpoints/               # Training checkpoints
│   └── production/                # Production-ready models
│
├── notebooks/                     # Jupyter notebooks for exploration
│   ├── exploratory/               # Initial data exploration
│   ├── experiments/               # Model experiments and iterations
│   └── reports/                   # Analysis and reporting notebooks
│
├── src/                           # Source code package
│   ├── __init__.py                # Package initialization
│   ├── config.py                  # Configuration management
│   ├── data/                      # Data processing modules
│   │   ├── __init__.py
│   │   ├── loader.py              # Data loading functions
│   │   ├── preprocessing.py       # Data preprocessing pipeline
│   │   └── validation.py          # Data validation
│   ├── features/                  # Feature engineering
│   │   ├── __init__.py
│   │   └── engineering.py         # Feature transformation functions
│   ├── models/                    # Model definitions and training
│   │   ├── __init__.py
│   │   ├── model.py               # Model architecture/definition
│   │   ├── train.py               # Training pipeline
│   │   └── evaluate.py            # Model evaluation
│   ├── inference/                 # Inference/prediction
│   │   ├── __init__.py
│   │   └── predict.py             # Prediction functions
│   └── utils/                     # Utility functions
│       ├── __init__.py
│       ├── logging.py             # Logging configuration
│       └── helpers.py             # Helper functions
│
├── tests/                         # Test directory (mirrors src structure)
│   ├── __init__.py
│   ├── test_data/                 # Test data processing modules
│   │   └── test_preprocessing.py
│   ├── test_features/
│   │   └── test_engineering.py
│   ├── test_models/
│   │   └── test_model.py
│   └── conftest.py                # Pytest configuration and fixtures
│
├── configs/                       # Configuration files
│   ├── config.yaml                # Main configuration
│   ├── model_config.yaml          # Model hyperparameters
│   └── data_config.yaml           # Data pipeline configuration
│
├── scripts/                       # Standalone scripts
│   ├── train.py                   # Training script
│   ├── evaluate.py                # Evaluation script
│   ├── predict.py                 # Prediction script
│   └── download_data.py           # Data download/preparation
│
├── docs/                          # Documentation
│   ├── api.md                     # API documentation
│   ├── model.md                   # Model documentation
│   └── deployment.md              # Deployment guide
│
├── deployment/                    # Deployment configurations
│   ├── Dockerfile                 # Docker containerization
│   ├── docker-compose.yml         # Multi-container orchestration
│   ├── kubernetes/                # Kubernetes manifests
│   └── api/                       # API service code (FastAPI/Flask)
│       ├── main.py
│       └── requirements.txt
│
└── outputs/                       # Generated outputs (git-ignored)
    ├── logs/                      # Training logs, TensorBoard logs
    ├── figures/                   # Generated plots and visualizations
    └── reports/                   # Generated reports
```

## File-Level Details

### Root Level Files

#### README.md
Must contain:
- Project title and description
- Installation instructions
- Quick start guide
- Usage examples
- Project structure overview
- Contributing guidelines
- License information

#### requirements.txt
Production dependencies with pinned versions:
```txt
numpy==1.24.0
pandas==2.0.0
scikit-learn==1.3.0
tensorflow==2.13.0  # or pytorch
pyyaml==6.0
python-dotenv==1.0.0
```

#### requirements-dev.txt
Development dependencies:
```txt
pytest>=7.0.0
pytest-cov>=4.0.0
black>=23.0.0
flake8>=6.0.0
mypy>=1.0.0
jupyter>=1.0.0
notebook>=7.0.0
```

#### setup.py
Package configuration for pip install:
```python
from setuptools import setup, find_packages

setup(
    name="project-name",
    version="0.1.0",
    packages=find_packages(where="src"),
    package_dir={"": "src"},
    install_requires=[
        # Production dependencies
    ],
    extras_require={
        "dev": [
            # Development dependencies
        ]
    },
    python_requires=">=3.8",
)
```

#### pyproject.toml
Modern Python project metadata:
```toml
[build-system]
requires = ["setuptools>=45", "wheel"]
build-backend = "setuptools.build_meta"

[project]
name = "project-name"
version = "0.1.0"
description = "ML project description"
requires-python = ">=3.8"
authors = [{name = "Author Name", email = "author@example.com"}]

[tool.black]
line-length = 88
target-version = ['py38']

[tool.pytest.ini_options]
testpaths = ["tests"]
python_files = "test_*.py"
```

#### .gitignore
Essential ignores for ML projects:
```gitignore
# Python
__pycache__/
*.py[cod]
*$py.class
*.so
.Python
env/
venv/
.venv/

# Jupyter
.ipynb_checkpoints
*.ipynb_checkpoints

# Data and Models
data/
models/
*.h5
*.pkl
*.pth
*.onnx
*.pb

# Outputs
outputs/
logs/

# IDE
.vscode/
.idea/
*.swp

# OS
.DS_Store
Thumbs.db

# Environment
.env
```

#### Makefile
Common commands:
```makefile
.PHONY: install test lint format train clean

install:
	pip install -e .
	pip install -r requirements-dev.txt

test:
	pytest tests/ -v --cov=src

lint:
	flake8 src/ tests/
	mypy src/

format:
	black src/ tests/

train:
	python scripts/train.py

clean:
	find . -type d -name __pycache__ -exec rm -rf {} +
	find . -type f -name "*.pyc" -delete
```

### Source Code Organization

#### src/__init__.py
Package initialization:
```python
"""Project Name - ML Project Description."""

__version__ = "0.1.0"
__author__ = "Author Name"

from .config import Config
from .models.model import Model
from .inference.predict import predict
```

#### src/config.py
Configuration management:
```python
"""Configuration management for the project."""

import os
import yaml
from dataclasses import dataclass
from pathlib import Path

@dataclass
class Config:
    """Project configuration."""
    
    # Paths
    project_root: Path
    data_dir: Path
    models_dir: Path
    
    # Model parameters
    model_type: str
    hyperparameters: dict
    
    # Training parameters
    batch_size: int
    epochs: int
    learning_rate: float
    
    @classmethod
    def from_yaml(cls, config_path: str) -> "Config":
        """Load configuration from YAML file."""
        with open(config_path) as f:
            config_dict = yaml.safe_load(f)
        return cls(**config_dict)
```

#### scripts/train.py
Training script entry point:
```python
"""Training script for the ML model."""

import argparse
import logging
from pathlib import Path

from src.config import Config
from src.data.loader import load_data
from src.data.preprocessing import preprocess_data
from src.models.train import train_model
from src.models.evaluate import evaluate_model

def main(config_path: str) -> None:
    """Run the training pipeline."""
    # Load configuration
    config = Config.from_yaml(config_path)
    
    # Setup logging
    logging.basicConfig(level=logging.INFO)
    logger = logging.getLogger(__name__)
    
    logger.info("Loading data...")
    data = load_data(config.data_dir)
    
    logger.info("Preprocessing data...")
    processed_data = preprocess_data(data, config)
    
    logger.info("Training model...")
    model = train_model(processed_data, config)
    
    logger.info("Evaluating model...")
    metrics = evaluate_model(model, processed_data['test'])
    
    logger.info(f"Training complete. Metrics: {metrics}")

if __name__ == "__main__":
    parser = argparse.ArgumentParser()
    parser.add_argument("--config", default="configs/config.yaml")
    args = parser.parse_args()
    
    main(args.config)
```

## Module Responsibilities

### data/
- **loader.py**: Load data from various sources (CSV, databases, APIs)
- **preprocessing.py**: Data cleaning, normalization, feature scaling
- **validation.py**: Data quality checks and validation

### features/
- **engineering.py**: Feature creation, transformation, selection

### models/
- **model.py**: Model architecture definition (neural network, sklearn pipeline)
- **train.py**: Training loop, optimization, checkpointing
- **evaluate.py**: Model evaluation metrics and validation

### inference/
- **predict.py**: Inference functions for production use

### utils/
- **logging.py**: Logging setup and utilities
- **helpers.py**: General utility functions

## Configuration Management

Use YAML files for configuration with the following structure:

**configs/config.yaml**:
```yaml
# Project paths
paths:
  data: "data"
  models: "models"
  outputs: "outputs"

# Data configuration
data:
  train_split: 0.8
  val_split: 0.1
  test_split: 0.1
  random_seed: 42

# Model configuration
model:
  type: "neural_network"  # or "random_forest", etc.
  architecture: "sequential"
  
# Training configuration
training:
  batch_size: 32
  epochs: 100
  learning_rate: 0.001
  optimizer: "adam"
  early_stopping_patience: 10
  
# Logging
logging:
  level: "INFO"
  log_dir: "outputs/logs"
```

## Testing Strategy

- **Unit tests**: Test individual functions in isolation
- **Integration tests**: Test module interactions
- **Data tests**: Validate data quality and schemas
- **Model tests**: Test model behavior and performance thresholds
- **Fixture-based**: Use pytest fixtures for common test setups

Example test structure:
```python
# tests/test_data/test_preprocessing.py
import pytest
import pandas as pd
from src.data.preprocessing import preprocess_data

@pytest.fixture
def sample_data():
    """Sample data for testing."""
    return pd.DataFrame({
        'feature1': [1, 2, 3],
        'feature2': ['a', 'b', 'c'],
        'target': [0, 1, 0]
    })

def test_preprocess_data(sample_data):
    """Test data preprocessing."""
    result = preprocess_data(sample_data)
    assert result is not None
    assert 'feature1' in result.columns
```

## Documentation Requirements

Each module and function should have:
- **Docstrings**: Google or NumPy style docstrings
- **Type hints**: For function parameters and returns
- **Examples**: Usage examples in docstrings

Example:
```python
def preprocess_data(data: pd.DataFrame, config: Config) -> pd.DataFrame:
    """
    Preprocess input data for model training.
    
    Args:
        data: Raw input DataFrame
        config: Configuration object with preprocessing parameters
        
    Returns:
        Preprocessed DataFrame ready for model training
        
    Example:
        >>> config = Config.from_yaml("configs/config.yaml")
        >>> df = pd.read_csv("data/raw/data.csv")
        >>> processed = preprocess_data(df, config)
    """
    # Implementation
    pass
```

## Version Control and Data Management

1. **Code**: Use Git for version control
2. **Data**: Use DVC (Data Version Control) or MLflow for data and model versioning
3. **Experiments**: Track experiments with MLflow, Weights & Biases, or similar
4. **Models**: Version models with semantic versioning (v1.0.0)

## Deployment Considerations

The structure supports multiple deployment scenarios:

1. **Batch Prediction**: Use `scripts/predict.py` for batch processing
2. **API Service**: Use `deployment/api/` for REST API deployment
3. **Container Deployment**: Use `Dockerfile` for containerization
4. **Cloud Deployment**: Structure supports AWS SageMaker, Azure ML, GCP Vertex AI

## Migration from Notebooks

When transforming notebooks to this structure:

1. **Imports**: Extract to `requirements.txt`
2. **Data Loading**: Move to `src/<project>/data/loader.py`
3. **Preprocessing**: Move to `src/<project>/data/preprocessing.py`
4. **Feature Engineering**: Move to `src/<project>/features/engineering.py`
5. **Model Definition**: Move to `src/<project>/models/model.py`
6. **Training Loop**: Move to `src/<project>/models/train.py`
7. **Evaluation**: Move to `src/<project>/models/evaluate.py`
8. **Visualizations**: Keep exploratory notebooks in `notebooks/`, move production plots to scripts
9. **Configuration**: Extract hardcoded values to `configs/config.yaml`

## References

This structure is based on:
- [Cookiecutter Data Science](https://drivendata.github.io/cookiecutter-data-science/)
- [Python Packaging User Guide](https://packaging.python.org/)
- [PEP 8 - Style Guide for Python Code](https://peps.python.org/pep-0008/)
- [PEP 517/518 - Build System Requirements](https://peps.python.org/pep-0517/)
- Industry best practices from Google, Microsoft, and major ML frameworks

## Validation Checklist

A valid generated project should have:
- [ ] All required files at root level (README.md, requirements.txt, setup.py, etc.)
- [ ] Proper src-layout with package structure
- [ ] Test directory mirroring src structure
- [ ] Configuration files in configs/
- [ ] Runnable training script
- [ ] Documentation in docs/
- [ ] .gitignore with ML-specific patterns
- [ ] Valid Python package (can be installed with pip install -e .)

## Future Enhancements

Potential additions to the structure:
- CI/CD pipelines (.github/workflows/, .gitlab-ci.yml)
- Pre-commit hooks (.pre-commit-config.yaml)
- Data validation with Great Expectations
- Model monitoring and drift detection
- A/B testing framework
- Feature store integration
- Model registry integration

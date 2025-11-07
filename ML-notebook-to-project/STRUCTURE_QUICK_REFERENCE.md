# Python ML Project Structure - Quick Reference

This is a condensed reference for the standard Python ML project structure. See [PYTHON_ML_PROJECT_STRUCTURE.md](./PYTHON_ML_PROJECT_STRUCTURE.md) for detailed documentation.

## Minimal Project Structure

```
project-name/
├── README.md
├── requirements.txt
├── setup.py
├── .gitignore
├── data/
│   ├── raw/
│   └── processed/
├── models/
├── notebooks/
├── src/
│   ├── __init__.py
│   ├── config.py
│   ├── data/
│   │   ├── __init__.py
│   │   └── preprocessing.py
│   ├── models/
│   │   ├── __init__.py
│   │   ├── model.py
│   │   └── train.py
│   └── inference/
│       ├── __init__.py
│       └── predict.py
├── tests/
│   └── __init__.py
├── configs/
│   └── config.yaml
└── scripts/
    ├── train.py
    └── predict.py
```

## Directory Purposes

| Directory | Purpose | Git Tracked |
|-----------|---------|-------------|
| `data/` | Data storage | No (use DVC) |
| `models/` | Trained models | No (use DVC/MLflow) |
| `notebooks/` | Jupyter notebooks for exploration | Yes |
| `src/` | Main source code package | Yes |
| `tests/` | Unit and integration tests | Yes |
| `configs/` | Configuration files (YAML) | Yes |
| `scripts/` | Executable scripts | Yes |
| `docs/` | Project documentation | Yes |
| `deployment/` | Deployment configs (Docker, K8s) | Yes |
| `outputs/` | Generated outputs (logs, figures) | No |

## Key Files

| File | Purpose |
|------|---------|
| `README.md` | Project overview and instructions |
| `requirements.txt` | Production dependencies |
| `requirements-dev.txt` | Development dependencies |
| `setup.py` | Package installation config |
| `pyproject.toml` | Modern Python project metadata |
| `.gitignore` | Git ignore patterns |
| `Makefile` | Common command shortcuts |

## Module Organization

### src/data/
- `loader.py` - Data loading from various sources
- `preprocessing.py` - Data cleaning and transformation
- `validation.py` - Data quality checks

### src/features/
- `engineering.py` - Feature creation and transformation

### src/models/
- `model.py` - Model architecture/definition
- `train.py` - Training pipeline and logic
- `evaluate.py` - Model evaluation metrics

### src/inference/
- `predict.py` - Production inference functions

### src/utils/
- `logging.py` - Logging configuration
- `helpers.py` - Utility functions

## Code Templates

### Basic setup.py
```python
from setuptools import setup, find_packages

setup(
    name="project-name",
    version="0.1.0",
    packages=find_packages(where="src"),
    package_dir={"": "src"},
    install_requires=[],
    python_requires=">=3.8",
)
```

### Basic train.py script
```python
import argparse
from src.config import Config
from src.data.loader import load_data
from src.models.train import train_model

def main(config_path: str):
    config = Config.from_yaml(config_path)
    data = load_data(config.data_dir)
    model = train_model(data, config)
    
if __name__ == "__main__":
    parser = argparse.ArgumentParser()
    parser.add_argument("--config", default="configs/config.yaml")
    args = parser.parse_args()
    main(args.config)
```

### Basic config.yaml
```yaml
paths:
  data: "data"
  models: "models"

data:
  train_split: 0.8
  random_seed: 42

training:
  batch_size: 32
  epochs: 100
  learning_rate: 0.001
```

### Basic .gitignore
```gitignore
# Python
__pycache__/
*.py[cod]
venv/

# Data and Models
data/
models/
*.pkl

# Outputs
outputs/

# Jupyter
.ipynb_checkpoints
```

## Command Line Interface

Standard commands via Makefile:

```bash
make install     # Install package and dependencies
make test        # Run tests with coverage
make lint        # Check code quality
make format      # Format code with black
make train       # Run training script
make clean       # Clean temporary files
```

## Notebook to Production Mapping

| Notebook Element | Target Location |
|------------------|-----------------|
| Imports | `requirements.txt` |
| Data loading | `src/data/loader.py` |
| Data cleaning | `src/data/preprocessing.py` |
| Feature engineering | `src/features/engineering.py` |
| Model definition | `src/models/model.py` |
| Training loop | `src/models/train.py` |
| Evaluation | `src/models/evaluate.py` |
| Prediction | `src/inference/predict.py` |
| Constants/Config | `configs/config.yaml` |
| Exploratory code | Keep in `notebooks/exploratory/` |

## Testing Structure

```
tests/
├── __init__.py
├── conftest.py                    # Pytest fixtures
├── test_data/
│   ├── test_loader.py
│   └── test_preprocessing.py
├── test_features/
│   └── test_engineering.py
└── test_models/
    ├── test_model.py
    └── test_train.py
```

## Import Conventions

```python
# Standard library
import os
import logging
from pathlib import Path

# Third-party
import numpy as np
import pandas as pd
from sklearn.model_selection import train_test_split

# Local application
from src.config import Config
from src.data.loader import load_data
```

## Documentation Standards

Use Google-style docstrings:

```python
def function_name(param1: str, param2: int) -> bool:
    """
    Short description of function.
    
    Longer description if needed. Explain the purpose,
    behavior, and any important details.
    
    Args:
        param1: Description of param1
        param2: Description of param2
        
    Returns:
        Description of return value
        
    Raises:
        ValueError: When param2 is negative
        
    Example:
        >>> result = function_name("test", 42)
        >>> print(result)
        True
    """
    pass
```

## Package Installation

After generating the project:

```bash
# Install in editable mode
pip install -e .

# Install with dev dependencies
pip install -e ".[dev]"

# Or using requirements files
pip install -r requirements.txt
pip install -r requirements-dev.txt
```

## Validation Checklist

✓ Can install with `pip install -e .`  
✓ Can import package: `import src`  
✓ Tests run with `pytest`  
✓ Scripts execute: `python scripts/train.py`  
✓ Configuration loads from YAML  
✓ README has installation instructions  
✓ All Python files have proper imports  

## Additional Resources

- Full specification: [PYTHON_ML_PROJECT_STRUCTURE.md](./PYTHON_ML_PROJECT_STRUCTURE.md)
- Cookiecutter Data Science: https://drivendata.github.io/cookiecutter-data-science/
- Python Packaging Guide: https://packaging.python.org/

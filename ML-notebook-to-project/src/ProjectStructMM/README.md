# ProjectStructMM - Project Structure Metamodel

This EMF project defines the metamodel for representing the final structure of a Python ML project. It serves as the **target metamodel** in the model transformation pipeline from Jupyter notebooks to production Python projects.

## Overview

The ProjectStructMM metamodel captures the essential elements of a well-structured Python ML project, including:

- **Project Organization**: Packages, modules, and directory structures
- **Code Elements**: Classes, functions, methods, parameters, and attributes
- **Dependencies**: External library dependencies with version and scope information
- **Configuration**: Build system configuration (setuptools, poetry, etc.)
- **Documentation**: README files and other documentation in various formats

## Key Classes

### Project (Root)
The root element representing a complete Python project with:
- Project metadata (name, version, description, author)
- Source package structure
- Test package structure
- Configuration settings
- Dependencies
- Data directories
- Documentation files

### Package
Represents a Python package (directory with `__init__.py`):
- Contains modules and subpackages
- Hierarchical structure for organizing code

### PythonModule
Represents a `.py` file with:
- Import statements
- Class definitions
- Function definitions
- Module-level docstrings
- Module type classification (MAIN, DATA_PROCESSING, MODEL_TRAINING, etc.)

### ClassDefinition & FunctionDefinition
Detailed representations of Python classes and functions with:
- Parameters and return types
- Docstrings
- Method bodies
- Decorators
- Attributes

### Dependency
Represents external dependencies with:
- Package name and version
- Dependency scope (RUNTIME, DEVELOPMENT, TEST, BUILD)
- Optional flag

### ProjectConfiguration
Configuration for the build system and project setup:
- Python version
- Build system (setuptools, poetry, hatch, pip)
- Configuration files (pyproject.toml, setup.py, requirements.txt)

## Usage in Transformation Pipeline

This metamodel is used as the target in Model-to-Model (M2M) transformations from:
1. **NotebookMM** (Notebook Metamodel) → **ProjectStructMM** 
   - Transforms Jupyter notebook structures into organized Python project structures

And as the source for Model-to-Text (M2T) transformations to:
2. **ProjectStructMM** → Python source files
   - Generates actual `.py` files, configuration files, and documentation

## Module Types

The metamodel defines several module types to categorize Python files:
- `MAIN`: Entry point modules
- `DATA_PROCESSING`: Data loading and preprocessing
- `MODEL_TRAINING`: Model training and fitting
- `MODEL_PREDICTION`: Inference and prediction
- `UTILITIES`: Helper functions and utilities
- `CONFIGURATION`: Configuration and settings
- `TEST`: Test modules
- `INIT`: Package initialization (`__init__.py`)

## File Format Support

The metamodel supports various file formats commonly used in Python projects:
- **Config Formats**: TOML, YAML, JSON, INI, PY
- **Documentation Formats**: Markdown, reStructuredText, Plain Text

# ProjectStructMM - Project Structure Metamodel

## Overview

ProjectStructMM is an Ecore metamodel that defines the structure of a Python project. It is designed to represent the target structure when transforming Jupyter notebooks into production-ready Python applications.

## Purpose

This metamodel serves as the foundation for model-driven transformations from ML notebooks (represented by NotebookMM) to structured Python projects. It captures all essential elements of a Python project including:

- Project configuration
- Package structure
- Python modules and files
- Classes and their methods
- Functions and parameters
- Dependencies
- Import statements

## Metamodel Structure

### Core Classes

#### Project (Root)
- **Attributes**: name, version, description
- **References**: packages, dependencies, configuration
- **Operations**: validate(), getAllPythonFiles()

#### ProjectConfiguration
Configuration settings for the project:
- pythonVersion
- requirementsFile
- dockerSupport
- testFramework

#### Dependency
Represents external Python package dependencies:
- name, version
- type: RUNTIME, DEVELOPMENT, or TEST

#### Package
Represents a Python package (directory with modules):
- name, path
- files (PythonFile instances)
- subPackages (nested packages)

#### PythonFile (Abstract)
Base class for Python files:
- name, path
- imports

#### ModuleFile
Concrete Python module (.py file):
- classes, functions
- docstring
- moduleType: TRAINING, INFERENCE, PREPROCESSING, UTILITY, MAIN, or TEST

#### Class
Python class definition:
- name, docstring, baseClasses
- methods, attributes

#### Method
Class method:
- name, docstring, visibility
- parameters, returnType

#### Function
Module-level function:
- name, docstring
- parameters, returnType

#### Import
Import statement:
- module, alias
- importedNames (for "from X import Y" statements)

### Enumerations

- **DependencyType**: RUNTIME, DEVELOPMENT, TEST
- **ModuleType**: TRAINING, INFERENCE, PREPROCESSING, UTILITY, MAIN, TEST
- **Visibility**: PUBLIC, PROTECTED, PRIVATE

## Model Instance

An example model instance is provided in `instances/ml_classifier_example.xmi`, which demonstrates a complete ML classifier project structure with:

- Data preprocessing module
- Model training module
- Inference module
- Main entry point
- Utility functions
- Test modules
- Project dependencies (pandas, numpy, scikit-learn, etc.)

This instance shows how a Jupyter notebook for ML classification could be transformed into a well-structured Python project.

## Usage

This metamodel can be used for:

1. **M2M Transformations**: Transform NotebookMM instances to ProjectStructMM instances
2. **M2T Transformations**: Generate actual Python code from ProjectStructMM instances
3. **Validation**: Ensure generated projects follow best practices
4. **Visualization**: Generate project structure diagrams

## Integration with NotebookMM

ProjectStructMM is designed to work in conjunction with NotebookMM:

```
NotebookMM (Source) --[M2M Transformation]--> ProjectStructMM (Target) --[M2T Transformation]--> Python Code
```

The transformation extracts:
- Imports from code cells → Dependencies
- Code blocks → Functions/Classes
- Notebook sections → Modules
- Training code → training.py
- Preprocessing code → preprocessing.py
- Prediction code → inference.py

## Files

- `model/projectStructMM.ecore` - The Ecore metamodel definition
- `model/projectStructMM.genmodel` - EMF generator model for code generation
- `instances/ml_classifier_example.xmi` - Example project structure instance

## Next Steps

To use this metamodel:

1. Generate Java code from the metamodel using Eclipse EMF
2. Implement M2M transformation from NotebookMM to ProjectStructMM
3. Implement M2T transformation from ProjectStructMM to Python code
4. Create validation rules for project structure

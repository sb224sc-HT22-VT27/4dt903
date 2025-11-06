# ML Notebook to Project

Transform Jupyter notebooks into production-ready Python ML projects with standardized structure.

## Overview

This project provides a Model-Driven Development (MDD) approach to convert exploratory Jupyter notebooks into well-structured, maintainable, and deployable Python ML applications.

### Key Features

- **EMF Metamodel**: Notebook representation as an Ecore model (`notebookMM.ecore`)
- **Notebook Parser**: Parse `.ipynb` files into the metamodel
- **Analysis Tools**: Analyze notebook structure, imports, and ML workflow patterns
- **Code Generation**: M2T transformation to generate production-ready Python projects

## Project Structure Documentation

The target output structure for generated Python ML projects is fully documented:

- **[PYTHON_ML_PROJECT_STRUCTURE.md](./PYTHON_ML_PROJECT_STRUCTURE.md)** - Complete specification with rationale, examples, and best practices
- **[STRUCTURE_QUICK_REFERENCE.md](./STRUCTURE_QUICK_REFERENCE.md)** - Quick reference guide for the standard structure

### Why a Fixed Structure?

A standardized project structure provides:
- **Consistency**: All generated projects follow the same organization
- **Best Practices**: Incorporates Python and ML engineering standards
- **Maintainability**: Clear separation of concerns and modular design
- **Production-Ready**: Supports testing, deployment, and CI/CD from day one
- **Reproducibility**: Version control friendly with proper dependency management

## Directory Structure

```
ML-notebook-to-project/
├── README.md                          # This file
├── PYTHON_ML_PROJECT_STRUCTURE.md     # Output project structure specification
├── STRUCTURE_QUICK_REFERENCE.md       # Quick reference guide
├── 12-fromNotebookToProduction.pdf    # Reference documentation
├── img/                               # Diagrams and images
├── input/                             # Sample notebooks for transformation
│   ├── CNN-Image-Classifier/
│   ├── Customer-Churn-Prediction/
│   ├── DeepLearning/
│   └── MachineLearning/
└── src/                               # Source code
    ├── NotebookMM/                    # EMF metamodel implementation
    ├── NotebookMM.edit/               # EMF edit support
    ├── NotebookMM.editor/             # EMF editor
    └── ProgrammaticTest/              # Test analyzer application
```

## Getting Started

### Prerequisites

- Eclipse Modeling Tools
- Java Development Kit (JDK) 11+
- EMF (Eclipse Modeling Framework)

### Running the Notebook Analyzer

The `NotebookAnalyzer` demonstrates parsing and analyzing notebooks:

```bash
cd src/ProgrammaticTest
# Edit NotebookAnalyzer.java to select input notebook
# Run the main class
```

Example output:
- Project name
- All imports extracted
- Code categorization (data preprocessing, training, inference)
- Notebook structure (markdown headers)

## Development Guidelines

**NOTE:** [Commit messages should follow specification](https://www.conventionalcommits.org/en/v1.0.0/#specification)

### Metamodel

The notebook metamodel (`notebookMM.ecore`) defines:
- `NotebookModel` - Root element
- `Cell` - Abstract base for cells
- `CodeCell` - Python code cells with analysis operations
- `MarkdownCell` - Documentation cells
- `NotebookMetadata` - Notebook metadata

### Future Work

- [ ] Implement Acceleo M2T transformation
- [ ] Generate complete Python project from notebooks
- [ ] Support for multiple ML frameworks (scikit-learn, TensorFlow, PyTorch)
- [ ] Configuration-based customization of output structure
- [ ] Integration with MLOps tools (MLflow, DVC)

## References

- [Planning Diagram](./img/simple-diagram.png)
- [Structure ideas and implementation](https://claude.ai/share/4a0e1a41-79a5-4cbc-9ee2-3b9e08002e14)
- [Cookiecutter Data Science](https://drivendata.github.io/cookiecutter-data-science/)
- [Python Packaging Guide](https://packaging.python.org/)

## License

See [LICENSE](../LICENSE) file in the repository root.

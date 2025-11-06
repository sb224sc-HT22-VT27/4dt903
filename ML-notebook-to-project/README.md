# ML Notebook to Project

A model-driven approach to transform Jupyter notebooks into production-ready Python projects.

**NOTE:** [Commit messages should follow specification](https://www.conventionalcommits.org/en/v1.0.0/#specification)

![Planning Diagram](./img/simple-diagram.png)

[Prompt with structure ideas and implementation](https://claude.ai/share/4a0e1a41-79a5-4cbc-9ee2-3b9e08002e14)

## Metamodels

This project uses two main metamodels:

### 1. NotebookMM
Located in `src/NotebookMM/`, this metamodel represents the structure of Jupyter notebooks.
- Models cells (code cells, markdown cells)
- Captures imports, outputs, and metadata
- Provides operations for analyzing notebook content

### 2. ProjectStructMM
Located in `src/ProjectStructMM/`, this metamodel represents the structure of a Python project.
- Models project configuration and dependencies
- Captures packages, modules, classes, and functions
- Designed for ML project generation

**Status**: ✅ Both metamodels are implemented with example instances

## Transformation Pipeline

```
Jupyter Notebook (.ipynb)
    ↓ [Parse]
NotebookMM Instance
    ↓ [M2M Transform]
ProjectStructMM Instance
    ↓ [M2T Transform]
Python Project (code files)
```

## Getting Started

See the individual metamodel READMEs for details:
- [NotebookMM README](src/NotebookMM/README.md) - (if exists)
- [ProjectStructMM README](src/ProjectStructMM/README.md)
- [ProjectStructMM Implementation Summary](src/ProjectStructMM/IMPLEMENTATION_SUMMARY.md)

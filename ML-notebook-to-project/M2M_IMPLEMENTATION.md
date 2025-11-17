# M2M Transformation Implementation

## Overview
This document describes the implementation of the Model-to-Model (M2M) transformation that converts a Jupyter Notebook model into a Project Structure model.

## Architecture

### Source Model: NotebookModel
- **Package**: `notebookMM`
- **Main Classes**: 
  - `NotebookModel`: Root container for the notebook
  - `CodeCell`: Contains Python code
  - `MarkdownCell`: Contains markdown documentation
  - `NotebookMetadata`: Contains metadata about the notebook

### Target Model: ProjectStructure
- **Package**: `projectStructureMM`
- **Main Classes**:
  - `ProjectStructure`: Root container for the project
  - `Directory`: Represents a directory in the file system
  - `File`: Represents a file with name and content attributes
  - `FileSystemElement`: Abstract base class for files and directories

## Transformation Class: `NotebookToProjectStructureM2M`

### Location
`ML-notebook-to-project/src/ProgrammaticTest/src/main/NotebookToProjectStructureM2M.java`

### Key Methods

#### `transform(NotebookModel notebook) -> ProjectStructure`
Main transformation method that:
1. Creates a new ProjectStructure with the notebook name
2. Creates a `src/` directory containing `main.py`
3. Creates a `data/` directory (empty)
4. Creates a `README.md` file at the root

#### `buildMainPyContent(NotebookModel notebook) -> String`
Builds the complete content for main.py:
- Extracts all imports from code cells
- Wraps code in a `main()` function
- Excludes import statements from the function body
- Returns the complete Python file content as a single string

#### `buildReadmeContent(NotebookModel notebook) -> String`
Builds the complete content for README.md:
- Creates a header with the project name
- Extracts section headers from markdown cells
- Adds usage instructions
- Returns the complete markdown content as a single string

#### `saveModel(ProjectStructure, String) -> void`
Saves the ProjectStructure model to an XMI file.

## Critical Design Decision: Content Setting

**The most important aspect of this implementation is how file content is set.**

### ❌ WRONG Approach (Not Implemented)
```java
File file = factory.createFile();
file.setName("main.py");
// WRONG: Appending to content multiple times
file.setContent(file.getContent() + "import pandas\n");
file.setContent(file.getContent() + "import numpy\n");
file.setContent(file.getContent() + "def main():\n");
// etc...
```

### ✅ CORRECT Approach (Implemented)
```java
File file = factory.createFile();
file.setName("main.py");
// Build complete content using StringBuilder
String completeContent = buildMainPyContent(notebook);
// Set content ONCE with the complete string
file.setContent(completeContent);
```

### Why This Matters
1. **Performance**: Setting content once is more efficient than multiple updates
2. **Atomicity**: The file content is complete in one operation
3. **Maintainability**: Clear separation between building content and setting it
4. **Correctness**: Avoids potential issues with incremental updates

## Generated Project Structure

```
ProjectStructure (name: from notebook)
├── src/
│   └── main.py (contains all imports and code)
├── data/ (empty directory)
└── README.md (project documentation)
```

## Usage Example

```java
// Parse notebook
NotebookJSONParser parser = new NotebookJSONParser();
NotebookModel notebook = parser.parseNotebook("path/to/notebook.ipynb");

// Perform M2M transformation
NotebookToProjectStructureM2M transformer = new NotebookToProjectStructureM2M();
ProjectStructure projectStructure = transformer.transform(notebook);

// Save the model
transformer.saveModel(projectStructure, "output/ProjectStructureModel.xmi");
```

## Dependencies

The following dependency was added to `MANIFEST.MF`:
```
Require-Bundle: ..., ProjectStructureMM
```

This allows the ProgrammaticTest project to use the ProjectStructure metamodel.

## Testing

To test this transformation:
1. Open the project in Eclipse with EMF installed
2. Run `NotebookToProjectStructureM2M.main()`
3. Check the generated XMI file in the output directory
4. Optionally, run the M2T transformation on the generated XMI to create actual files

## Future Enhancements

Potential improvements for future versions:
- Support for multiple Python files (split by categories: data loading, preprocessing, training, evaluation)
- Configuration file generation (requirements.txt, setup.py)
- More sophisticated code categorization
- Support for extracting data file references
- Unit test generation from notebook outputs

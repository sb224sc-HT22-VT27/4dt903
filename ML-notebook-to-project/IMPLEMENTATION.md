# Notebook to Project Transformation - Implementation Summary

## Overview

This implementation extends the M2M transformation to convert Jupyter notebooks into structured Python projects with proper code organization and dependency management.

## Implemented Features

### 1. Content Transformation (QVTO)

**File**: `src/NotebookToProjectM2M/transforms/NotebookToProject.qvto`

The QVTO transformation has been extended to:

- **Extract imports**: All import statements from code cells are collected and deduplicated
- **Extract constants**: Uppercase variable assignments (Python convention) are extracted
- **Extract commands**: All executable code lines (excluding imports and constants) are extracted
- **Generate main.py**: Creates a well-structured Python file with:
  - Header comment with notebook name
  - All imports section
  - All constants section
  - Main function containing all commands
  - Proper if __name__ == '__main__' guard
- **Classify commands**: Each command is tagged with a comment indicating its purpose:
  - `# PREPROCESS` - Data loading, cleaning, transformation
  - `# TRAIN` - Model training operations
  - `# PREDICT` - Inference and evaluation operations

### 2. Requirements Generation

The transformation automatically generates `requirements.txt` by:

- Extracting package names from import statements
- Filtering out Python standard library modules (os, sys, json, etc.)
- Mapping import names to pip package names:
  - `sklearn` → `scikit-learn`
  - `cv2` → `opencv-python`
  - `PIL` → `Pillow`
- Producing a sorted, deduplicated list of required packages

### 3. Command Classification

**File**: `src/ProgrammaticTest/src/main/CommandClassifier.java`

Two classification methods are provided:

1. **Random Classification** (deprecated): Returns random labels for initial testing
2. **Heuristic Classification** (recommended): Uses keyword matching to classify commands:
   - **TRAIN**: Keywords like `fit`, `fit_transform`, `train`, `compile`
   - **PREDICT**: Keywords like `predict`, `inference`, `evaluate`
   - **PREPROCESS**: Keywords like `preprocess`, `scaler`, `transform`, `read_csv`, `load`, `fillna`
   - Default: `PREPROCESS` if no keywords match

### 4. Import Processing

**File**: `src/ProgrammaticTest/src/main/ImportHelper.java`

Provides utilities to:

- Parse Python import statements (both `import` and `from ... import` forms)
- Extract root package names
- Filter standard library modules
- Apply package name mapping for pip compatibility

## Testing and Demonstration

### Quick Test

Run the demonstration to see the transformation in action:

```bash
cd src/ProgrammaticTest
javac -d bin -sourcepath src src/main/TransformationDemo.java
java -cp bin main.TransformationDemo
```

This will show:
- Generated main.py content with classified commands
- Generated requirements.txt content
- Classification statistics

### Test Individual Components

**Test Command Classifier:**
```bash
javac -d bin -sourcepath src src/main/CommandClassifier.java
java -cp bin main.CommandClassifier
```

**Test Import Helper:**
```bash
javac -d bin -sourcepath src src/main/ImportHelper.java
java -cp bin main.ImportHelper
```

## Example Output

### Input: Jupyter Notebook
A notebook with cells containing:
- Import statements
- Data loading code
- Model training code
- Prediction code

### Output: main.py
```python
#!/usr/bin/env python3
# Generated from notebook: example_notebook

# Imports
import pandas as pd
import numpy as np
from sklearn.model_selection import train_test_split
from sklearn.ensemble import RandomForestClassifier

# Constants
BATCH_SIZE = 32
LEARNING_RATE = 0.001

def main():
    """Main execution function"""
    # PREPROCESS
    data = pd.read_csv('data.csv')
    # PREPROCESS
    X_train, X_test, y_train, y_test = train_test_split(X, y)
    # TRAIN
    model.fit(X_train, y_train)
    # PREDICT
    predictions = model.predict(X_test)

if __name__ == '__main__':
    main()
```

### Output: requirements.txt
```
joblib
numpy
pandas
scikit-learn
```

## Architecture

The transformation follows this flow:

1. **Input**: Jupyter notebook (.ipynb) → Parse to NotebookModel (EMF)
2. **Analysis**: NotebookModel methods extract imports, constants, commands
3. **Classification**: Java helpers classify each command by purpose
4. **Transformation**: QVTO generates ProjectStructure (EMF)
5. **Output**: ProjectStructure → Generate files (main.py, requirements.txt)

## Design Decisions

### Why Heuristic Classification?

The heuristic approach was chosen for several reasons:
- **No external dependencies**: Works without AI API calls
- **Fast and deterministic**: Instant classification with consistent results
- **Good accuracy**: Keyword matching catches most common patterns
- **Easy to extend**: New keywords can be added easily

The random classification method is kept (but deprecated) for backward compatibility and testing purposes.

### Why QVTO?

QVTO (Query/View/Transformation Operational) provides:
- **Model-to-Model transformation**: Clean separation of concerns
- **Type safety**: Strong typing with metamodel validation
- **Declarative syntax**: Easier to understand and maintain
- **EMF integration**: Seamless integration with Eclipse Modeling Framework

## Future Enhancements

### Optional AI Integration

The issue mentions optional AI API integration for classification. This could be added by:

1. Creating a new class `AICommandClassifier.java`
2. Implementing API calls to services like OpenAI, Claude, or local ML models
3. Using AI classification as fallback when heuristics are uncertain
4. Caching AI results to minimize API calls

Example structure:
```java
public class AICommandClassifier {
    public static String classifyWithAI(String command) {
        // Call AI API
        // Parse response
        // Return "PREPROCESS", "TRAIN", or "PREDICT"
    }
}
```

### Additional Improvements

- **Confidence scores**: Return classification confidence for validation
- **Multi-label classification**: Some commands may fit multiple categories
- **Context-aware classification**: Consider surrounding code for better accuracy
- **Custom rules**: Allow users to define their own classification rules
- **Version pinning**: Add version numbers to requirements.txt

## Files Modified

- `src/NotebookToProjectM2M/transforms/NotebookToProject.qvto` - Extended transformation
- `src/ProgrammaticTest/src/main/CommandClassifier.java` - New file
- `src/ProgrammaticTest/src/main/ImportHelper.java` - New file
- `src/ProgrammaticTest/src/main/TransformationDemo.java` - New file
- `src/ProgrammaticTest/src/main/NotebookToProjectTransformer.java` - New file
- `TESTING.md` - New file with testing instructions

## References

- QVTO Specification: https://www.omg.org/spec/QVT/
- Eclipse Modeling Framework: https://www.eclipse.org/modeling/emf/
- Python Package Index: https://pypi.org/

# Testing Instructions for Notebook to Project Transformation

## Overview
This document describes how to test the Notebook to Project M2M transformation.

## Components Implemented

### 1. QVTO Transformation (`NotebookToProject.qvto`)
Located at: `src/NotebookToProjectM2M/transforms/NotebookToProject.qvto`

The transformation now includes:
- Extraction of imports from notebook into main.py
- Extraction of constants from notebook into main.py  
- Extraction of commands from notebook into main.py
- Classification of commands as PREPROCESS/TRAIN/PREDICT
- Generation of requirements.txt from notebook imports
- Filtering of Python standard library from requirements

### 2. Java Helper Classes

#### CommandClassifier.java
Located at: `src/ProgrammaticTest/src/main/CommandClassifier.java`

Provides two methods:
- `classifyCommand(String)`: Returns random classification (for initial testing)
- `classifyCommandWithHeuristics(String)`: Returns heuristic-based classification

Test with:
```bash
cd src/ProgrammaticTest
javac -d bin -sourcepath src src/main/CommandClassifier.java
java -cp bin main.CommandClassifier
```

#### ImportHelper.java
Located at: `src/ProgrammaticTest/src/main/ImportHelper.java`

Provides methods to:
- Extract package names from Python import statements
- Filter out Python standard library modules
- Map import names to pip package names (e.g., sklearn -> scikit-learn)

Test with:
```bash
cd src/ProgrammaticTest
javac -d bin -sourcepath src src/main/ImportHelper.java
java -cp bin main.ImportHelper
```

### 3. NotebookToProjectTransformer.java
Located at: `src/ProgrammaticTest/src/main/NotebookToProjectTransformer.java`

A pure Java implementation of the transformation logic that:
- Reads a Jupyter notebook
- Generates main.py content with classified commands
- Generates requirements.txt content

## Testing in Eclipse

To test the full transformation:

1. Import the project into Eclipse with EMF and QVTO plugins installed
2. Right-click on `NotebookToProject.qvto`
3. Select "Run As" -> "QVTO Transformation"
4. Configure input model: Select a `.notebook` file from `ProgrammaticTest/output/`
5. Configure output model: Specify output location
6. Run the transformation

## Expected Output

### main.py
Should contain:
```python
#!/usr/bin/env python3
# Generated from notebook: <notebook_name>

# Imports
import pandas as pd
import numpy as np
...

# Constants
BATCH_SIZE = 32
...

def main():
    """Main execution function"""
    # PREPROCESS
    data = pd.read_csv('data.csv')
    # TRAIN
    model.fit(X_train, y_train)
    # PREDICT
    predictions = model.predict(X_test)
    ...

if __name__ == '__main__':
    main()
```

### requirements.txt
Should contain:
```
joblib
numpy
pandas
scikit-learn
tensorflow
```

## Notes

- The QVTO transformation uses context-based helpers (self.method) to access notebook data
- Classification is done using simple heuristics (keyword matching)
- Standard library modules (os, sys, json, etc.) are filtered from requirements
- Package name mapping handles common cases (sklearn -> scikit-learn, cv2 -> opencv-python)

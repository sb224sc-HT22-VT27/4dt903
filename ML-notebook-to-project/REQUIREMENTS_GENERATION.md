# Requirements.txt Generation Feature

## Overview

This document describes the automatic requirements.txt generation feature added to the Notebook-to-Project transformation.

## How It Works

### 1. Import Extraction
The transformation uses the NotebookMM model's `getAllImports()` method to extract all import statements from code cells in the notebook. This method uses regex patterns to identify Python import statements like:
- `import pandas as pd`
- `from sklearn.model_selection import train_test_split`
- `import numpy as np`

### 2. Package Name Mapping
The `mapImportToPackage()` helper function maps Python module names to their corresponding pip package names. Some common mappings include:

| Module Name | Package Name |
|------------|--------------|
| sklearn | scikit-learn |
| cv2 | opencv-python |
| PIL | Pillow |
| yaml | PyYAML |
| bs4 | beautifulsoup4 |
| dateutil | python-dateutil |

For many packages (like pandas, numpy, matplotlib), the module name matches the package name.

### 3. Deduplication
The transformation uses an `OrderedSet` to ensure that each package appears only once in the requirements.txt, even if it's imported multiple times across different cells.

### 4. Standard Library Filtering
Standard library modules (like os, sys, json) are automatically excluded by returning an empty string for unknown/unmapped modules.

### 5. File Generation
The requirements.txt file is added to the project structure at the root level, alongside the data, src, models, and outputs directories.

## Architecture

```
NotebookModel (NotebookMM)
    └─> getAllImports()
         └─> ["import pandas as pd", "from sklearn import...", ...]
              └─> extractPackageNames()
                   └─> mapImportToPackage() for each import
                        └─> OrderedSet of unique package names
                             └─> requirements.txt File element
```

## QVTo Implementation Details

The implementation consists of three helper functions in `NotebookToProject.qvto`:

1. **createRequirementsFile(notebook)**: Creates a File element for requirements.txt
2. **extractPackageNames(notebook)**: Extracts unique package names from notebook imports
3. **mapImportToPackage(importStmt)**: Maps a single import statement to a package name

The main mapping function uses `indexOf()` to check for the presence of module names in import statements, which works reliably with well-formed Python import statements.

## Supported Packages

The current implementation recognizes 21 common Python packages used in data science and machine learning:

- Data processing: pandas, numpy
- Machine learning: scikit-learn, tensorflow, torch, keras
- Visualization: matplotlib, seaborn
- Scientific computing: scipy
- Web frameworks: flask, django
- Utilities: requests, joblib, sqlalchemy, pytest
- Image processing: opencv-python, Pillow
- Data formats: PyYAML, beautifulsoup4
- Date/time: python-dateutil

## Limitations

1. **Known packages only**: Only explicitly mapped packages are included. Custom or less common packages may not be detected.
2. **No version pinning**: The generated requirements.txt includes package names without version numbers.
3. **Substring matching**: The implementation uses simple substring matching which assumes well-formed import statements.

## Future Enhancements

Possible improvements for future versions:

1. Add version detection from notebook metadata or comments
2. Expand the list of recognized packages
3. Add support for conditional requirements (e.g., platform-specific packages)
4. Include pip installation instructions in generated README
5. Support for requirements with extras (e.g., `pandas[excel]`)

## Testing

The transformation has been validated with Python test scripts to ensure correct package mapping. To test with actual notebooks:

1. Open the project in Eclipse with QVTo installed
2. Run the NotebookToProject transformation on a .notebook model
3. Check the generated ProjectStructure model for a requirements.txt File element
4. Execute the M2T transformation to generate actual files

## Example Output

For a notebook with these imports:
```python
import pandas as pd
import numpy as np
from sklearn.model_selection import train_test_split
import joblib
```

The generated requirements.txt will contain:
```
joblib
numpy
pandas
scikit-learn
```

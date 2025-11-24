# README

**NOTE:** [Commit messages should follow specification](https://www.conventionalcommits.org/en/v1.0.0/#specification)
**NOTE 1:** When merging use `--squash`

![Planning Diagram](./img/simple-diagram.png)

![Week2 imgae](./img/week2-diagram.jpg)

[Prompt with structure ideas and implementation](https://claude.ai/share/4a0e1a41-79a5-4cbc-9ee2-3b9e08002e14)

## Features

### Requirements.txt Generation

The transformation now automatically generates a `requirements.txt` file in the project root based on the imports found in the notebook. This feature:

- Extracts all import statements from code cells in the notebook
- Maps Python module names to their corresponding pip package names (e.g., `sklearn` → `scikit-learn`)
- Generates a unique list of required packages
- Filters out standard library modules

#### Supported Package Mappings

| Import Module | Package Name |
|--------------|--------------|
| sklearn | scikit-learn |
| cv2 | opencv-python |
| PIL | Pillow |
| yaml | PyYAML |
| bs4 | beautifulsoup4 |
| dateutil | python-dateutil |
| pandas | pandas |
| numpy | numpy |
| matplotlib | matplotlib |
| scipy | scipy |
| seaborn | seaborn |
| joblib | joblib |
| tensorflow | tensorflow |
| torch | torch |
| keras | keras |
| flask | flask |
| django | django |
| requests | requests |
| sqlalchemy | sqlalchemy |
| pytest | pytest |

Standard library modules (e.g., `os`, `sys`, `json`) are automatically excluded from the requirements file.

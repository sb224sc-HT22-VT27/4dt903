# Templates Directory

This directory contains template files for generating Python ML projects from Jupyter notebooks.

## Available Templates

### Configuration Files

- **config_example.yaml** - Example configuration file showing all available options
  - Used as the basis for `configs/config.yaml` in generated projects
  - Contains comprehensive examples of all configuration options

### Project Setup Files

- **setup.py.template** - Python package configuration
  - Enables `pip install -e .` installation
  - Defines package metadata and dependencies
  - Placeholders: `{{project_name}}`, `{{project_description}}`, `{{author_name}}`, etc.

- **pyproject.toml.template** - Modern Python project metadata (PEP 517/518)
  - Build system requirements
  - Tool configurations (black, isort, pytest, mypy)
  - Project metadata and dependencies

- **Makefile.template** - Common project commands
  - Shortcuts for install, test, lint, format, train, predict
  - Docker commands
  - Documentation generation

- **gitignore.template** - Git ignore patterns
  - Python-specific ignores
  - ML/Data Science specific (data/, models/, outputs/)
  - IDE and OS specific

- **README.md.template** - Project README
  - Project overview and features
  - Installation instructions
  - Quick start guide
  - Development guidelines

## Template Variables

Templates use `{{variable_name}}` placeholders that should be replaced during code generation:

### Project Information
- `{{project_name}}` - Project name in snake_case (e.g., `customer_churn_prediction`)
- `{{project_description}}` - Short description of the project
- `{{author_name}}` - Author's full name
- `{{author_email}}` - Author's email address
- `{{project_url}}` - Project repository URL
- `{{license}}` - License type (e.g., MIT, Apache 2.0)

### Python Configuration
- `{{python_version}}` - Minimum Python version (e.g., 3.8)

### Model Information
- `{{model_type}}` - Type of ML model (e.g., classification, regression)
- `{{framework}}` - ML framework used (scikit-learn, tensorflow, pytorch)
- `{{domain}}` - Problem domain (e.g., computer-vision, nlp, tabular)
- `{{domain_keywords}}` - Domain-specific keywords for PyPI

### Metrics (for README)
- `{{accuracy}}`, `{{precision}}`, `{{recall}}`, `{{f1_score}}` - Model metrics
- `{{dataset_name}}` - Name of the training dataset
- `{{training_time}}` - Training duration

### Deployment
- `{{repo_url}}` - Repository URL
- `{{docs_url}}` - Documentation URL
- `{{support_email}}` - Support contact email
- `{{project_status}}` - Development status
- `{{last_updated}}` - Last update date

## Usage in Code Generation

When implementing the Acceleo M2T transformation, these templates should be:

1. **Loaded** from this directory
2. **Processed** to replace placeholders with actual values derived from:
   - Notebook metadata
   - Extracted imports and dependencies
   - Analyzed code patterns
   - User configuration
3. **Generated** into the target project structure

### Example Transformation Logic

```java
// Pseudocode for template processing
String template = loadTemplate("setup.py.template");
template = template.replace("{{project_name}}", notebook.getName());
template = template.replace("{{project_description}}", extractDescription(notebook));
template = template.replace("{{author_name}}", getAuthor(notebook.getMetadata()));
generateFile(targetDir + "/setup.py", template);
```

### Extracting Values from Notebooks

Values for template variables can be extracted from:

1. **Notebook metadata**: Author, kernel, language
2. **Markdown cells**: Project description, documentation from headers
3. **Code cells**: 
   - Imports → requirements.txt
   - Model definitions → model type and framework
   - Training code → hyperparameters and config
4. **Execution output**: Performance metrics if available
5. **User input**: Configuration file or wizard

## Template Maintenance

When updating templates:

1. Maintain consistency with [PYTHON_ML_PROJECT_STRUCTURE.md](../PYTHON_ML_PROJECT_STRUCTURE.md)
2. Follow Python best practices and PEP standards
3. Keep placeholders clearly marked with `{{}}` syntax
4. Document any new template variables in this file
5. Test generated code with actual values

## Creating New Templates

To add a new template:

1. Create the file with `.template` extension
2. Use `{{placeholder}}` syntax for variables
3. Add comprehensive comments explaining purpose
4. Document the template in this README
5. List required placeholder variables
6. Provide example usage

## Validation

Generated projects from these templates should:

- [ ] Install successfully with `pip install -e .`
- [ ] Pass all linting checks
- [ ] Have valid Python package structure
- [ ] Include all required files (README, setup.py, etc.)
- [ ] Be ready for version control (proper .gitignore)
- [ ] Support testing out of the box
- [ ] Be deployable (Dockerfile, etc.)

## Related Documentation

- [PYTHON_ML_PROJECT_STRUCTURE.md](../PYTHON_ML_PROJECT_STRUCTURE.md) - Full structure specification
- [STRUCTURE_QUICK_REFERENCE.md](../STRUCTURE_QUICK_REFERENCE.md) - Quick reference
- [project_structure_tree.txt](../project_structure_tree.txt) - Directory tree visualization

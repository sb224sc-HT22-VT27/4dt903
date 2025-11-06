# ProjectStructTest - Test Application

This is a standalone Java application that demonstrates programmatic loading and traversal of ProjectStructMM models.

## Purpose

This test application shows:
1. How to load a ProjectStructMM model (XMI file) programmatically
2. How to traverse the model hierarchy (Project → Folders → Files)
3. How to extract and display information from the model
4. That the model is properly structured and can be used for M2T transformations

## What it does

The `ProjectStructureAnalyzer` class:
- Loads the sample project model (`sample-project.xmi`)
- Displays project metadata (name, description)
- Shows the folder structure hierarchically
- Lists all files and their properties
- Calculates statistics (total folders, total files, content lines)

## Expected Output

When run, it should display:

```
=== Project Structure Analysis ===
Project Name: SampleMLProject
Description: A sample machine learning project structure generated from ProjectStructMM

=== Structure Overview ===
Root Folders: 5
Root Files: 3

=== Folder Structure ===
📁 src/
  📄 main.py
  📄 model.py
  📄 utils.py
📁 data/
  📄 README.md
📁 notebooks/
  📄 exploration.ipynb
📁 tests/
  📄 test_model.py
📁 docs/
  📄 architecture.md

=== Root Files ===
- requirements.txt (txt)
  Content: 6 lines
- .gitignore ()
  Content: 14 lines
- setup.py (py)
  Content: 13 lines

=== Statistics ===
Total Folders: 5
Total Files: 11

✓ Model loaded and traversed successfully!
```

## How to Run

### In Eclipse
1. Import all projects (ProjectStructMM, ProjectStructM2T, ProjectStructTest) into Eclipse
2. Make sure ProjectStructMM is generated (generate model code from the genmodel)
3. Right-click on `ProjectStructureAnalyzer.java` → Run As → Java Application

### Prerequisites
- Eclipse Modeling Tools
- EMF (Eclipse Modeling Framework)
- Java 21 or compatible JRE

## What This Proves

This test demonstrates that:
1. ✅ The ProjectStructMM metamodel is correctly defined
2. ✅ The model can be loaded from XMI files
3. ✅ The model structure is traversable (recursive folder/file hierarchy)
4. ✅ All model elements (Project, Folder, File) are accessible
5. ✅ The model is ready for M2T transformation with Acceleo

## Next Steps

After verifying the model loads correctly:
1. Use the Acceleo template (`ProjectStructM2T/src/projectStructM2T/main/generate.mtl`)
2. Run the transformation on `sample-project.xmi`
3. The transformation will generate the actual folder structure and files
4. You can then create your own models and generate different project structures

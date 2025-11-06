# ProjectStructMM - Project Structure Metamodel for M2T

This directory contains a metamodel (ProjectStructMM) and an Acceleo M2T transformation project (ProjectStructM2T) that can generate project structures (folders and files with content) from a model.

## Components

### 1. ProjectStructMM (Metamodel)
The `ProjectStructMM` folder contains the Ecore metamodel that defines the structure for representing software projects:

- **Project**: Root container with a name, description, and contains folders and files
- **Folder**: Represents a directory that can contain subfolders and files
- **File**: Represents a file with name, content, and file type

#### Files:
- `model/projectStructMM.ecore` - The Ecore metamodel definition
- `model/projectStructMM.genmodel` - Generator model for EMF code generation
- `META-INF/MANIFEST.MF` - Eclipse plugin manifest
- `plugin.xml` - Eclipse plugin configuration
- `build.properties` - Build configuration

### 2. ProjectStructM2T (Acceleo M2T Transformation)
The `ProjectStructM2T` folder contains the Acceleo templates for Model-to-Text transformation:

- **generate.mtl**: Main Acceleo template that generates:
  - Project README with structure overview
  - Folders with marker files
  - Files with their specified content
  
#### Files:
- `src/projectStructM2T/main/generate.mtl` - Acceleo template for M2T transformation
- `models/sample-project.xmi` - Sample model instance for testing
- `META-INF/MANIFEST.MF` - Eclipse plugin manifest
- `build.properties` - Build configuration

### 3. ProjectStructTest (Test Application)
The `ProjectStructTest` folder contains a standalone Java application that demonstrates:

- Loading ProjectStructMM models programmatically
- Traversing the model hierarchy (Project → Folders → Files)
- Extracting and displaying model information
- Validating that the model is properly structured

See `ProjectStructTest/README.md` for details on running the test application.

## Sample Model

A sample model instance is provided in `ProjectStructM2T/models/sample-project.xmi` that demonstrates:
- A machine learning project structure
- Multiple folders (src, data, notebooks, tests, docs)
- Python source files with actual code content
- Configuration files (requirements.txt, .gitignore, setup.py)

## How to Use

### Prerequisites
- Eclipse Modeling Tools (with EMF and Acceleo)
- Java 21 or compatible JRE

### Steps

1. **Verify Model Structure (Optional but Recommended)**
   - Import all three projects (ProjectStructMM, ProjectStructM2T, ProjectStructTest) into Eclipse
   - Generate model code: Open `ProjectStructMM/model/projectStructMM.genmodel`
     → Right-click on the root element → Generate Model Code
   - Run the test: Right-click on `ProjectStructTest/src/main/ProjectStructureAnalyzer.java`
     → Run As → Java Application
   - This verifies the model loads correctly and can be traversed

2. **Import Projects into Eclipse**
   - Import both `ProjectStructMM` and `ProjectStructM2T` as existing Eclipse projects (if not already done in step 1)

3. **Generate Model Code (if needed)**
   - Open `ProjectStructMM/model/projectStructMM.genmodel`
   - Right-click on the root element → Generate Model Code
   - This generates the Java classes in `src-gen/` (if not already generated in step 1)

4. **Run the Transformation**
   - Open `ProjectStructM2T/models/sample-project.xmi`
   - Right-click on the file → Run As → Acceleo Application
   - Or configure a launch configuration to run the generate.mtl template
   - The generated project structure will be created in the specified output directory

5. **Create Your Own Models**
   - Create a new XMI file using the ProjectStructMM metamodel
   - Define your desired project structure (folders, files, content)
   - Run the Acceleo transformation on your model

## Example Output

When you run the transformation on `sample-project.xmi`, it generates:

```
SampleMLProject/
├── README.md (with project overview)
├── requirements.txt
├── .gitignore
├── setup.py
├── src/
│   ├── .folder
│   ├── main.py
│   ├── model.py
│   └── utils.py
├── data/
│   ├── .folder
│   └── README.md
├── notebooks/
│   ├── .folder
│   └── exploration.ipynb
├── tests/
│   ├── .folder
│   └── test_model.py
└── docs/
    ├── .folder
    └── architecture.md
```

All files contain the content specified in the model.

## Purpose

This demonstrates:
1. **Metamodel design** - Defining a domain-specific language for project structures
2. **Model-to-Text transformation** - Using Acceleo to generate code/files from models
3. **Model traversal** - Recursively processing nested folder structures
4. **Code generation** - Generating real project artifacts with actual content

## Extension Ideas

- Add support for file permissions/attributes
- Include templates for different project types (Python, Java, Node.js, etc.)
- Add validation rules to the metamodel
- Generate build scripts and CI/CD configurations
- Support for symbolic links and file references

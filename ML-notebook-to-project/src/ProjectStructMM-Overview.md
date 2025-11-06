# ProjectStructMM Metamodel Overview

## Metamodel Structure

```
┌─────────────────────────────────────────┐
│           Project                        │
├─────────────────────────────────────────┤
│ + name: String                           │
│ + description: String                    │
│ + folders: Folder[0..*]                  │
│ + files: File[0..*]                      │
└─────────────────────────────────────────┘
           │
           │ contains
           ├──────────────────┬────────────────────┐
           │                  │                    │
           ▼                  ▼                    ▼
┌──────────────────┐  ┌──────────────────┐  ┌──────────────────┐
│     Folder       │  │     Folder       │  │      File        │
├──────────────────┤  ├──────────────────┤  ├──────────────────┤
│ + name: String   │  │ + name: String   │  │ + name: String   │
│ + subfolders[*]  │  │ + subfolders[*]  │  │ + content: String│
│ + files[*]       │  │ + files[*]       │  │ + fileType:String│
└──────────────────┘  └──────────────────┘  └──────────────────┘
           │                  │
           │ contains         │ contains
           ▼                  ▼
    ┌─────────────┐    ┌─────────────┐
    │   Folder    │    │    File     │
    │  (nested)   │    │             │
    └─────────────┘    └─────────────┘
```

## Model-to-Text Transformation Flow

```
┌──────────────────────────────────────────────────────────────┐
│                    Input Model (XMI)                          │
│              sample-project.xmi                               │
│                                                               │
│  <Project name="SampleMLProject">                            │
│    <folders name="src">                                      │
│      <files name="main.py">                                  │
│        <content>...Python code...</content>                  │
│      </files>                                                │
│    </folders>                                                │
│  </Project>                                                  │
└──────────────────────────────────────────────────────────────┘
                            │
                            │ (loaded by EMF)
                            ▼
┌──────────────────────────────────────────────────────────────┐
│                  Model Instance (Java)                        │
│                                                               │
│  Project project = new Project();                            │
│    project.setName("SampleMLProject");                       │
│    Folder src = new Folder();                                │
│      src.setName("src");                                     │
│      File mainPy = new File();                               │
│        mainPy.setName("main.py");                            │
│        mainPy.setContent("...Python code...");               │
│      src.getFiles().add(mainPy);                             │
│    project.getFolders().add(src);                            │
└──────────────────────────────────────────────────────────────┘
                            │
                            │ (processed by Acceleo)
                            ▼
┌──────────────────────────────────────────────────────────────┐
│              Acceleo Template (generate.mtl)                  │
│                                                               │
│  [template public generateProject(aProject : Project)]       │
│    [file (aProject.name + '/README.md')]                     │
│      # [aProject.name/]                                      │
│      ...                                                     │
│    [/file]                                                   │
│    [for (folder : Folder | aProject.folders)]               │
│      [generateFolder(folder, ...)/]                          │
│    [/for]                                                    │
│  [/template]                                                 │
└──────────────────────────────────────────────────────────────┘
                            │
                            │ (generates)
                            ▼
┌──────────────────────────────────────────────────────────────┐
│                     Output (Files & Folders)                  │
│                                                               │
│  SampleMLProject/                                            │
│  ├── README.md                                               │
│  ├── src/                                                    │
│  │   ├── .folder                                             │
│  │   ├── main.py                                             │
│  │   ├── model.py                                            │
│  │   └── utils.py                                            │
│  ├── data/                                                   │
│  │   ├── .folder                                             │
│  │   └── README.md                                           │
│  ├── requirements.txt                                        │
│  └── ...                                                     │
└──────────────────────────────────────────────────────────────┘
```

## Key Concepts

### 1. **Metamodel (ProjectStructMM)**
- Defines the abstract syntax (structure) for representing projects
- Written in Ecore (EMF's metamodeling language)
- Three main classes: Project, Folder, File
- Hierarchical containment: Project contains Folders and Files, Folders contain Subfolders and Files

### 2. **Model Instance (sample-project.xmi)**
- A concrete instance of the metamodel
- Written in XMI (XML Metadata Interchange)
- Represents a specific project structure
- Can be created manually or programmatically

### 3. **M2T Transformation (generate.mtl)**
- Acceleo template that transforms models into text
- Traverses the model structure recursively
- Generates actual files and folders
- Uses Acceleo's template language with OCL expressions

### 4. **Generated Output**
- Real folder structure on the filesystem
- Files with actual content
- Can be opened and used as a regular project

## Example Usage Scenarios

### Scenario 1: Generate Python ML Project
```xml
<Project name="MyMLProject">
  <folders name="src">
    <files name="train.py" fileType="py">
      <content>import tensorflow as tf...</content>
    </files>
  </folders>
</Project>
```
→ Generates: MyMLProject/src/train.py with TensorFlow code

### Scenario 2: Generate Full Stack Web App
```xml
<Project name="WebApp">
  <folders name="frontend">
    <folders name="src">
      <files name="App.js" fileType="js">
        <content>import React from 'react'...</content>
      </files>
    </folders>
  </folders>
  <folders name="backend">
    <files name="server.py" fileType="py">
      <content>from flask import Flask...</content>
    </files>
  </folders>
</Project>
```
→ Generates: WebApp/frontend/src/App.js and WebApp/backend/server.py

## Benefits

1. **Consistency**: All projects follow the same structure definition
2. **Automation**: Generate entire project scaffolds from models
3. **Maintenance**: Update the template once, regenerate all projects
4. **Documentation**: The model itself documents the project structure
5. **Tooling**: Can create editors, validators, analyzers for the metamodel

# Usage Example: Content as a List

## Overview
The `File` class in ProjectStructureMM now has `content` as a list of strings (`EList<String>`) instead of a single string. This allows M2M transformations to build file content incrementally by adding elements to the list.

## Before (Old Implementation)
```java
// Old way: content was a single String
file.setContent("line1\n");
file.setContent(file.getContent() + "line2\n"); // Had to append to existing string
```

## After (New Implementation)
```java
// New way: content is a list of Strings
file.getContent().add("line1");
file.getContent().add("line2");
file.getContent().add("line3");
```

## M2M Transformation Example
When transforming from NotebookMM to ProjectStructureMM, you can now add content line by line:

```java
// Create a file
File pythonFile = factory.createFile();
pythonFile.setName("script.py");

// Add content elements
pythonFile.getContent().add("import pandas as pd");
pythonFile.getContent().add("import numpy as np");
pythonFile.getContent().add("");
pythonFile.getContent().add("# Load data");
pythonFile.getContent().add("data = pd.read_csv('data.csv')");
```

## XMI Representation
In the XMI file, multiple content values can be specified:

```xml
<filesystemelement xsi:type="File" name="main.py" 
    content="print('Hello World')" 
    content="print('Welcome to the demo')"/>
```

## M2T Transformation
The Acceleo M2T transformation now iterates over the content list:

```
[for (line : String | e.oclAsType(File).content)]
[line/]
[/for]
```

This will output each line of content to the generated file.

## Benefits
1. **Cleaner M2M code**: No need to concatenate strings with newlines
2. **Better modularity**: Each command/statement can be added independently
3. **Easier manipulation**: Content can be inspected, modified, or reordered as a list
4. **Memory efficiency**: Avoids creating intermediate string concatenations

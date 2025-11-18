package main;

import projectStructureMM.Directory;
import projectStructureMM.File;
import projectStructureMM.ProjectStructure;
import projectStructureMM.ProjectStructureMMFactory;

public class ContentListExample {

	public static void main(String[] args) {
		// Create factory
		ProjectStructureMMFactory factory = ProjectStructureMMFactory.eINSTANCE;

		// Create a project structure
		ProjectStructure project = factory.createProjectStructure();
		project.setName("MyMLProject");

		// Create a directory
		Directory srcDir = factory.createDirectory();
		srcDir.setName("src");
		project.getFilesystemelement().add(srcDir);

		// Create a Python file
		File trainScript = factory.createFile();
		trainScript.setName("train.py");

		// Add content line by line (this is the new way!)
		trainScript.getContent().add("#!/usr/bin/env python3");
		trainScript.getContent().add("");
		trainScript.getContent().add("import pandas as pd");
		trainScript.getContent().add("import numpy as np");
		trainScript.getContent().add("from sklearn.model_selection import train_test_split");
		trainScript.getContent().add("");
		trainScript.getContent().add("# Load data");
		trainScript.getContent().add("data = pd.read_csv('data.csv')");
		trainScript.getContent().add("");
		trainScript.getContent().add("# Train model");
		trainScript.getContent().add("X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.2)");

		// Add file to directory
		srcDir.getFilesystemelement().add(trainScript);

		// Print out the content
		System.out.println("File: " + trainScript.getName());
		System.out.println("Content lines: " + trainScript.getContent().size());
		System.out.println("\nGenerated content:");
		System.out.println("==================");
		for (String line : trainScript.getContent()) {
			System.out.println(line);
		}

		// Demonstrate that content is mutable
		trainScript.getContent().add("print('Training complete!')");
		System.out.println("\nAfter adding another line:");
		System.out.println("Content lines: " + trainScript.getContent().size());
	}
}
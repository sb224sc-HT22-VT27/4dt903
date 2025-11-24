package main;

import java.util.ArrayList;
import java.util.List;

/**
 * Demonstration of the transformation logic without requiring full EMF setup.
 * This shows how the classification and import processing works.
 */
public class TransformationDemo {
	
	public static void main(String[] args) {
		System.out.println("=== NOTEBOOK TO PROJECT TRANSFORMATION DEMO ===");
		System.out.println();
		
		// Simulate notebook imports
		List<String> notebookImports = List.of(
			"import pandas as pd",
			"import numpy as np",
			"from sklearn.model_selection import train_test_split",
			"from sklearn.preprocessing import StandardScaler",
			"from sklearn.ensemble import RandomForestClassifier",
			"from sklearn.metrics import accuracy_score, classification_report",
			"import joblib",
			"import os",
			"import json"
		);
		
		// Simulate notebook commands
		List<String> notebookCommands = List.of(
			"data = pd.read_csv('data.csv')",
			"print(data.head())",
			"X = data.drop('target', axis=1)",
			"y = data['target']",
			"X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.2)",
			"scaler = StandardScaler()",
			"X_train_scaled = scaler.fit_transform(X_train)",
			"X_test_scaled = scaler.transform(X_test)",
			"model = RandomForestClassifier(n_estimators=100)",
			"model.fit(X_train_scaled, y_train)",
			"predictions = model.predict(X_test_scaled)",
			"accuracy = accuracy_score(y_test, predictions)",
			"print(f'Accuracy: {accuracy}')",
			"joblib.dump(model, 'model.pkl')"
		);
		
		// Generate main.py content
		System.out.println("=== GENERATED main.py ===");
		System.out.println("#!/usr/bin/env python3");
		System.out.println("# Generated from notebook: example_notebook");
		System.out.println();
		
		System.out.println("# Imports");
		for (String imp : notebookImports) {
			System.out.println(imp);
		}
		System.out.println();
		
		System.out.println("def main():");
		System.out.println("    \"\"\"Main execution function\"\"\"");
		for (String command : notebookCommands) {
			String classification = CommandClassifier.classifyCommandWithHeuristics(command);
			System.out.println("    # " + classification);
			System.out.println("    " + command);
		}
		System.out.println();
		System.out.println("if __name__ == '__main__':");
		System.out.println("    main()");
		
		System.out.println();
		System.out.println("=== GENERATED requirements.txt ===");
		List<String> packages = ImportHelper.extractPackageNames(notebookImports);
		for (String pkg : packages) {
			System.out.println(pkg);
		}
		
		System.out.println();
		System.out.println("=== TRANSFORMATION COMPLETE ===");
		System.out.println();
		
		// Show classification statistics
		System.out.println("=== CLASSIFICATION STATISTICS ===");
		int preprocessCount = 0;
		int trainCount = 0;
		int predictCount = 0;
		
		for (String command : notebookCommands) {
			String classification = CommandClassifier.classifyCommandWithHeuristics(command);
			switch (classification) {
				case "PREPROCESS":
					preprocessCount++;
					break;
				case "TRAIN":
					trainCount++;
					break;
				case "PREDICT":
					predictCount++;
					break;
			}
		}
		
		System.out.println("Total commands: " + notebookCommands.size());
		System.out.println("PREPROCESS: " + preprocessCount);
		System.out.println("TRAIN: " + trainCount);
		System.out.println("PREDICT: " + predictCount);
	}
}

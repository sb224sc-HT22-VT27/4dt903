package main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Helper class for QVTO transformations to process Python imports and generate requirements
 */
public class ImportHelper {
	
	// Common Python standard library modules that shouldn't be in requirements.txt
	private static final Set<String> STANDARD_LIBRARY = new HashSet<>();
	
	static {
		STANDARD_LIBRARY.add("os");
		STANDARD_LIBRARY.add("sys");
		STANDARD_LIBRARY.add("io");
		STANDARD_LIBRARY.add("json");
		STANDARD_LIBRARY.add("re");
		STANDARD_LIBRARY.add("math");
		STANDARD_LIBRARY.add("random");
		STANDARD_LIBRARY.add("datetime");
		STANDARD_LIBRARY.add("time");
		STANDARD_LIBRARY.add("pathlib");
		STANDARD_LIBRARY.add("collections");
		STANDARD_LIBRARY.add("itertools");
		STANDARD_LIBRARY.add("functools");
		STANDARD_LIBRARY.add("pickle");
		STANDARD_LIBRARY.add("copy");
		STANDARD_LIBRARY.add("typing");
	}
	
	// Mapping of import names to their pip package names
	private static final java.util.Map<String, String> PACKAGE_MAPPING = new java.util.HashMap<>();
	
	static {
		PACKAGE_MAPPING.put("sklearn", "scikit-learn");
		PACKAGE_MAPPING.put("cv2", "opencv-python");
		PACKAGE_MAPPING.put("PIL", "Pillow");
	}
	
	/**
	 * Extract package name from an import statement
	 * 
	 * @param importStmt Import statement like "import pandas" or "from sklearn import ..."
	 * @return The root package name
	 */
	public static String extractPackageName(String importStmt) {
		if (importStmt == null || importStmt.trim().isEmpty()) {
			return "";
		}
		
		String trimmed = importStmt.trim();
		String packageName = "";
		
		// Pattern: "import package" or "import package as alias"
		if (trimmed.startsWith("import ")) {
			String afterImport = trimmed.substring(7).trim();
			// Remove " as alias" part
			int asIndex = afterImport.indexOf(" as ");
			if (asIndex > 0) {
				packageName = afterImport.substring(0, asIndex).trim();
			} else {
				packageName = afterImport.split("\\s+")[0];
			}
			// Get root package (before first dot)
			int dotIndex = packageName.indexOf('.');
			if (dotIndex > 0) {
				packageName = packageName.substring(0, dotIndex);
			}
		}
		// Pattern: "from package import ..."
		else if (trimmed.startsWith("from ")) {
			String afterFrom = trimmed.substring(5).trim();
			int importIndex = afterFrom.indexOf(" import ");
			if (importIndex > 0) {
				packageName = afterFrom.substring(0, importIndex).trim();
				// Get root package (before first dot)
				int dotIndex = packageName.indexOf('.');
				if (dotIndex > 0) {
					packageName = packageName.substring(0, dotIndex);
				}
			}
		}
		
		// Skip standard library packages
		if (STANDARD_LIBRARY.contains(packageName)) {
			return "";
		}
		
		// Map to pip package name if needed
		if (PACKAGE_MAPPING.containsKey(packageName)) {
			packageName = PACKAGE_MAPPING.get(packageName);
		}
		
		return packageName;
	}
	
	/**
	 * Extract unique package names from a list of import statements
	 * 
	 * @param imports List of import statements
	 * @return List of unique package names
	 */
	public static List<String> extractPackageNames(List<String> imports) {
		Set<String> packages = new HashSet<>();
		
		for (String importStmt : imports) {
			String pkg = extractPackageName(importStmt);
			if (!pkg.isEmpty()) {
				packages.add(pkg);
			}
		}
		
		List<String> result = new ArrayList<>(packages);
		result.sort(String::compareTo);
		return result;
	}
	
	/**
	 * Main method for testing
	 */
	public static void main(String[] args) {
		String[] testImports = {
			"import pandas as pd",
			"import numpy as np",
			"from sklearn.model_selection import train_test_split",
			"from sklearn.preprocessing import StandardScaler",
			"import os",
			"import json",
			"import joblib",
			"from tensorflow import keras"
		};
		
		System.out.println("Testing Import Processing:");
		System.out.println("==========================");
		
		for (String imp : testImports) {
			String pkg = extractPackageName(imp);
			System.out.println("\nImport: " + imp);
			System.out.println("Package: " + (pkg.isEmpty() ? "(standard library - skip)" : pkg));
		}
	}
}

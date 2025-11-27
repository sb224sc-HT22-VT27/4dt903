package transformationutils;

import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Transforms file paths in Python code to work with the new project structure.
 * 
 * When code is moved from a notebook (in the root directory) to src/main.py,
 * file paths need to be updated to reference the correct locations:
 * - Simple filenames like 'file.csv' become '../data/file.csv'
 * - Paths like 'data/file.csv' become '../data/file.csv'
 * - Paths like 'models/model.pkl' become '../models/model.pkl'
 */
public class FilePathTransformer {

	/**
	 * Data file extensions that should have their paths updated. These are files
	 * that get copied to the data/ directory in the generated project.
	 */
	private static final Set<String> DATA_FILE_EXTENSIONS = Set.of("csv", "json", "yaml", "yml", "jpg", "jpeg", "png",
			"txt", "pkl", "h5", "npy", "npz", "parquet", "rda", "xml");

	/**
	 * Directory names that are mapped to the generated project structure. Files
	 * from these directories get their paths updated to use ../ prefix.
	 */
	private static final Set<String> MAPPED_DIRS = Set.of("data", "models", "output", "outputs");

	/**
	 * Pattern for matching file extensions in paths. Built from DATA_FILE_EXTENSIONS.
	 * Example: "csv|json|yaml|yml|..."
	 */
	private static final String EXTENSIONS_PATTERN = String.join("|", DATA_FILE_EXTENSIONS);

	/**
	 * Regex pattern to match file paths in Python strings. Matches single-quoted
	 * and double-quoted strings containing file paths with common data file
	 * extensions.
	 * 
	 * The pattern uses a backreference (\\1) to ensure opening and closing quotes match.
	 * The character class [^'\"\\n\\r] excludes quotes and newlines to prevent matching
	 * malformed paths or paths containing the opposite quote type.
	 * 
	 * Groups: 1. Opening quote (' or ") 2. Full path (may include directory
	 * components) 3. File extension (without dot)
	 */
	private static final Pattern PATH_PATTERN = Pattern.compile(
			"(['\"])([^'\"\\n\\r]*\\.(" + EXTENSIONS_PATTERN + "))\\1",
			Pattern.CASE_INSENSITIVE);

	/**
	 * Pattern to strip leading './' prefixes from paths.
	 * Matches one or more consecutive './' at the start of the string.
	 */
	private static final Pattern LEADING_DOT_SLASH_PATTERN = Pattern.compile("^(\\./)+");

	/**
	 * Transforms file paths in Python code to work with the new project structure.
	 * Since main.py is in src/, paths need to be prefixed with '../' to reach
	 * sibling directories like data/, models/, outputs/.
	 * 
	 * @param source The original source code
	 * @return The source code with updated file paths
	 */
	public static String transformFilePaths(String source) {
		if (source == null || source.isEmpty()) {
			return source;
		}

		Matcher matcher = PATH_PATTERN.matcher(source);
		StringBuilder result = new StringBuilder();

		while (matcher.find()) {
			String quote = matcher.group(1);
			String fullPath = matcher.group(2);
			String transformedPath = transformSinglePath(fullPath);
			// Escape backslashes and dollar signs for replacement
			String replacement = quote + Matcher.quoteReplacement(transformedPath) + quote;
			matcher.appendReplacement(result, replacement);
		}
		matcher.appendTail(result);

		return result.toString();
	}

	/**
	 * Transforms a single file path to use the new project structure.
	 * 
	 * Rules: 1. If path already starts with '../', leave it unchanged 2. If path
	 * starts with a mapped directory (data/, models/, etc.), prefix with '../' 3.
	 * If path is a simple filename (no directory), prefix with '../data/' 4. If
	 * path starts with './', remove the prefix and apply rules again 5. For other
	 * directory structures, prefix with '../'
	 * 
	 * @param path The original file path
	 * @return The transformed file path
	 */
	private static String transformSinglePath(String path) {
		// Already has relative parent reference, leave unchanged
		if (path.startsWith("../")) {
			return path;
		}

		// Strip all leading './' prefixes using regex for efficiency
		// This handles cases like './file.csv', '././file.csv', etc.
		path = LEADING_DOT_SLASH_PATTERN.matcher(path).replaceFirst("");

		// Check if path starts with a mapped directory
		for (String dir : MAPPED_DIRS) {
			String dirPrefix = dir + "/";
			if (path.startsWith(dirPrefix)) {
				// Prefix with '../' since code is in src/
				return "../" + path;
			}
		}

		// Check if it's a simple filename (no directory separator)
		if (!path.contains("/")) {
			// Simple filename - prefix with '../data/'
			return "../data/" + path;
		}

		// Path has some other directory structure - prefix with '../'
		return "../" + path;
	}
}

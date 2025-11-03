package notebookMM.impl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

public class CustomCodeCellImpl extends CodeCellImpl {
	@Override
	public EList<String> extractImports() {
		EList<String> imports = new BasicEList<>();
		if (getSource() == null || getSource().isEmpty()) {
			return imports;
		}

		// Regex patterns for Python imports
		Pattern importPattern = Pattern.compile(
				"^\\s*(import\\s+[\\w.]+(?:\\s+as\\s+\\w+)?|from\\s+[\\w.]+\\s+import\\s+.+)\\s*$", Pattern.MULTILINE);

		Matcher matcher = importPattern.matcher(getSource());
		while (matcher.find()) {
			imports.add(matcher.group(0).trim());
		}

		// Update the imports attribute
		getImports().clear();
		getImports().addAll(imports);

		return imports;
	}

	@Override
	public boolean hasImports() {
		return !extractImports().isEmpty();
	}

	@Override
	public boolean isTrainingCode() {
		if (getSource() == null)
			return false;
		String source = getSource().toLowerCase();

		// Heuristics for training code
		return source.contains("model.fit") || source.contains("model.train") || source.contains("trainer.train")
				|| source.contains("fit_transform") || source.contains("cross_val_score")
				|| source.matches(".*\\bfit\\s*\\(.*");
	}

	@Override
	public boolean isDataPreprocessing() {
		if (getSource() == null)
			return false;
		String source = getSource().toLowerCase();

		return source.contains("preprocess") || source.contains("clean") || source.contains("transform")
				|| source.contains("scaler") || source.contains("encoder") || source.contains("fillna")
				|| source.contains("dropna") || source.contains("feature_engineer");
	}

	@Override
	public boolean isPredictionCode() {
		if (getSource() == null)
			return false;
		String source = getSource().toLowerCase();

		return source.contains("predict") || source.contains("inference") || source.contains("model.eval")
				|| source.contains("predict_proba");
	}

	@Override
	public EList<String> getSourceLines() {
		EList<String> lines = new BasicEList<>();
		if (getSource() != null && !getSource().isEmpty()) {
			String[] lineArray = getSource().split("\\r?\\n");
			for (String line : lineArray) {
				lines.add(line);
			}
		}
		return lines;
	}

	@Override
	public boolean containsKeyword(String keyword) {
		if (getSource() == null || keyword == null)
			return false;
		return getSource().toLowerCase().contains(keyword.toLowerCase());
	}

	@Override
	public boolean isEmpty() {
		return getSource() == null || getSource().trim().isEmpty();
	}

	@Override
	public int getContentLength() {
		return getSource() != null ? getSource().length() : 0;
	}
}

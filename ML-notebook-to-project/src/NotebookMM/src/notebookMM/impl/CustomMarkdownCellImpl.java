package notebookMM.impl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomMarkdownCellImpl extends MarkdownCellImpl {
	@Override
	public boolean isHeader() {
		if (getContent() == null)
			return false;
		return getContent().trim().startsWith("#");
	}

	@Override
	public int getHeaderLevel() {
		if (!isHeader())
			return 0;

		Pattern pattern = Pattern.compile("^(#{1,6})\\s+");
		Matcher matcher = pattern.matcher(getContent().trim());
		if (matcher.find()) {
			return matcher.group(1).length();
		}
		return 0;
	}

	@Override
	public String extractTitle() {
		if (!isHeader())
			return "";

		Pattern pattern = Pattern.compile("^#{1,6}\\s+(.+)$", Pattern.MULTILINE);
		Matcher matcher = pattern.matcher(getContent().trim());
		if (matcher.find()) {
			return matcher.group(1).trim();
		}
		return "";
	}

	@Override
	public boolean isEmpty() {
		return getContent() == null || getContent().trim().isEmpty();
	}

	@Override
	public int getContentLength() {
		return getContent() != null ? getContent().length() : 0;
	}
}

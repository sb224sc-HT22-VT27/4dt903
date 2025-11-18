package notebookMM.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.JSONArray;
import org.json.JSONObject;

import notebookMM.Cell;
import notebookMM.CellType;
import notebookMM.CodeCell;
import notebookMM.MarkdownCell;
import notebookMM.NotebookMMFactory;
import notebookMM.NotebookMetadata;
import notebookMM.NotebookModel;

public class NotebookJSONParser {
	private NotebookMMFactory factory = NotebookMMFactory.eINSTANCE;
	private String name;

	/**
	 * Parse a .ipynb file and create a NotebookModel instance
	 */
	public NotebookModel parseNotebook(String filePath) throws IOException {
		String content = new String(Files.readAllBytes(Paths.get(filePath)));
		name = filePath.substring(filePath.lastIndexOf("/") + 1, filePath.lastIndexOf("."));
		return parseNotebookFromString(content);
	}

	/**
	 * Parse JSON string content and create a NotebookModel instance
	 */
	public NotebookModel parseNotebookFromString(String jsonContent) {
		JSONObject json = new JSONObject(jsonContent);

		NotebookModel notebook = factory.createNotebookModel();

		// Extract notebook name from file or use default
		notebook.setName(name);

		// Parse metadata
		if (json.has("metadata")) {
			NotebookMetadata metadata = parseMetadata(json.getJSONObject("metadata"));
			notebook.setMetadata(metadata);
		}

		// Parse cells
		if (json.has("cells")) {
			JSONArray cells = json.getJSONArray("cells");
			for (int i = 0; i < cells.length(); i++) {
				JSONObject cellJson = cells.getJSONObject(i);
				Cell cell = parseCell(cellJson, i);
				if (cell != null) {
					notebook.getCells().add(cell);
				}
			}
		}

		return notebook;
	}

	private NotebookMetadata parseMetadata(JSONObject metadataJson) {
		NotebookMetadata metadata = factory.createNotebookMetadata();

		if (metadataJson.has("kernelspec")) {
			JSONObject kernelspec = metadataJson.getJSONObject("kernelspec");
			metadata.setKernelspec(kernelspec.optString("name", ""));
			metadata.setLanguage(kernelspec.optString("language", ""));
		}

		if (metadataJson.has("language_info")) {
			JSONObject langInfo = metadataJson.getJSONObject("language_info");
			if (metadata.getLanguage() == null || metadata.getLanguage().isEmpty()) {
				metadata.setLanguage(langInfo.optString("name", ""));
			}
		}

		metadata.setNbformat(metadataJson.optInt("nbformat", 4));
		metadata.setNbformatMinor(metadataJson.optInt("nbformat_minor", 0));

		return metadata;
	}

	private Cell parseCell(JSONObject cellJson, int index) {
		String cellType = cellJson.getString("cell_type");

		Cell cell = null;

		if ("code".equals(cellType)) {
			CodeCell codeCell = factory.createCodeCell();
			codeCell.setCellType(CellType.CODE);

			// Parse source code
			String source = parseSource(cellJson.getJSONArray("source"));
			codeCell.setSource(source);

			// Extract execution order
			if (cellJson.has("execution_count") && !cellJson.isNull("execution_count")) {
				codeCell.setExecutionOrder(cellJson.getInt("execution_count"));
			}

			// Parse outputs (optional)
			if (cellJson.has("outputs")) {
				JSONArray outputs = cellJson.getJSONArray("outputs");
				for (int i = 0; i < outputs.length(); i++) {
					codeCell.getOutputs().add(outputs.getJSONObject(i).toString());
				}
			}

			// Extract imports automatically
			codeCell.extractImports();

			// Extract constants automatically
			// codeCell.extractConstants(); // TODO

			cell = codeCell;

		} else if ("markdown".equals(cellType)) {
			MarkdownCell markdownCell = factory.createMarkdownCell();
			markdownCell.setCellType(CellType.MARKDOWN);

			String content = parseSource(cellJson.getJSONArray("source"));
			markdownCell.setContent(content);

			cell = markdownCell;
		}

		if (cell != null) {
			// Set cell ID if available
			if (cellJson.has("id")) {
				cell.setId(cellJson.getString("id"));
			} else {
				cell.setId("cell_" + index);
			}
		}

		return cell;
	}

	/**
	 * Parse source array (can be array of strings or single string)
	 */
	private String parseSource(JSONArray sourceArray) {
		StringBuilder source = new StringBuilder();
		for (int i = 0; i < sourceArray.length(); i++) {
			source.append(sourceArray.getString(i));
		}
		return source.toString();
	}
}

package notebookMM.impl;

import java.util.LinkedHashSet;
import java.util.Set;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import notebookMM.Cell;
import notebookMM.CellType;
import notebookMM.CodeCell;
import notebookMM.MarkdownCell;

public class CustomNotebookModelImpl extends NotebookModelImpl {
	@Override
	public EList<CodeCell> getCodeCells() {
		EList<CodeCell> codeCells = new BasicEList<>();
		for (Cell cell : getCells()) {
			if (cell instanceof CodeCell) {
				codeCells.add((CodeCell) cell);
			}
		}
		return codeCells;
	}

	@Override
	public EList<MarkdownCell> getMarkdownCells() {
		EList<MarkdownCell> markdownCells = new BasicEList<>();
		for (Cell cell : getCells()) {
			if (cell instanceof MarkdownCell) {
				markdownCells.add((MarkdownCell) cell);
			}
		}
		return markdownCells;
	}

	@Override
	public EList<String> getAllImports() {
		Set<String> allImports = new LinkedHashSet<>();
		for (CodeCell codeCell : getCodeCells()) {
			allImports.addAll(codeCell.extractImports());
		}
		return new BasicEList<>(allImports);
	}

	@Override
	public EList<Cell> getCellsByType(CellType type) {
		EList<Cell> result = new BasicEList<>();
		for (Cell cell : getCells()) {
			if (cell.getCellType() == type) {
				result.add(cell);
			}
		}
		return result;
	}

	@Override
	public boolean validate() {
		// Basic validation logic
		if (getName() == null || getName().isEmpty()) {
			return false;
		}
		if (getCells() == null || getCells().isEmpty()) {
			return false;
		}
		if (getMetadata() == null) {
			return false;
		}
		return true;
	}
}

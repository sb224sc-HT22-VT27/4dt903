package notebookMM.impl;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import notebookMM.CodeCell;
import notebookMM.CustomNotebookMMFactory;
import notebookMM.MarkdownCell;
import notebookMM.NotebookMMFactory;
import notebookMM.NotebookMMPackage;
import notebookMM.NotebookMetadata;
import notebookMM.NotebookModel;

public class CustomNotebookMMFactoryImpl extends NotebookMMFactoryImpl implements CustomNotebookMMFactory {

	public CustomNotebookMMFactoryImpl() {
		super();
	}

	public static NotebookMMFactory init() {
		try {
			NotebookMMFactory theNotebookMMFactory = (NotebookMMFactory) EPackage.Registry.INSTANCE
					.getEFactory(NotebookMMPackage.eNS_URI);
			if (theNotebookMMFactory != null)
				return theNotebookMMFactory;
		} catch (Exception e) {
			EcorePlugin.INSTANCE.log(e);
		}

		return new CustomNotebookMMFactoryImpl();
	}

	@Override
	public NotebookModel createNotebookModel() {
		return new CustomNotebookModelImpl();
	}

	@Override
	public NotebookMetadata createNotebookMetadata() {
		return new CustomNotebookMetadataImpl();
	}

	@Override
	public CodeCell createCodeCell() {
		return new CustomCodeCellImpl();
	}

	@Override
	public MarkdownCell createMarkdownCell() {
		return new CustomMarkdownCellImpl();
	}
}

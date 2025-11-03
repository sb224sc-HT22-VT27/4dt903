package notebookMM.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import notebookMM.CodeCell;
import notebookMM.MarkdownCell;
import notebookMM.NotebookMMFactory;
import notebookMM.NotebookMMPackage;
import notebookMM.NotebookMetadata;
import notebookMM.NotebookModel;

public class CustomNotebookMMFactoryImpl extends NotebookMMFactoryImpl implements NotebookMMFactory {

	public CustomNotebookMMFactoryImpl() {
		super();
	}

	public static NotebookMMFactory init() {
		try {
			NotebookMMFactory theNotebookFactory = (NotebookMMFactory) EPackage.Registry.INSTANCE
					.getEFactory(NotebookMMPackage.eNS_URI);
			if (theNotebookFactory != null) {
				return theNotebookFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new NotebookMMFactoryImpl();
	}

	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case NotebookMMPackage.NOTEBOOK_MODEL:
			return createNotebookModel(); // Will use custom implementation
		case NotebookMMPackage.CODE_CELL:
			return createCodeCell(); // Will use custom implementation
		case NotebookMMPackage.MARKDOWN_CELL:
			return createMarkdownCell(); // Will use custom implementation
		case NotebookMMPackage.NOTEBOOK_METADATA:
			return createNotebookMetadata(); // Will use custom implementation
		default:
			throw new IllegalArgumentException("Unknown class: " + eClass);
		}
	}

	// Override create methods to return custom implementations
	@Override
	public NotebookModel createNotebookModel() {
		CustomNotebookModelImpl notebookModel = new CustomNotebookModelImpl();
		return notebookModel;
	}

	@Override
	public CodeCell createCodeCell() {
		CustomCodeCellImpl codeCell = new CustomCodeCellImpl();
		return codeCell;
	}

	@Override
	public MarkdownCell createMarkdownCell() {
		CustomMarkdownCellImpl markdownCell = new CustomMarkdownCellImpl();
		return markdownCell;
	}

	@Override
	public NotebookMetadata createNotebookMetadata() {
		CustomNotebookMetadataImpl metadata = new CustomNotebookMetadataImpl();
		return metadata;
	}

	@Override
	public NotebookMMPackage getNotebookMMPackage() {
		return (NotebookMMPackage) getEPackage();
	}
}

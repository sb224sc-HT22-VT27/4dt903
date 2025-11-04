package notebookMM;

public interface CustomNotebookMMFactory extends NotebookMMFactory {
	NotebookMMFactory eINSTANCE = notebookMM.impl.CustomNotebookMMFactoryImpl.init();
	
	@Override
	NotebookModel createNotebookModel();
	
	@Override
	NotebookMetadata createNotebookMetadata();
	
	@Override
	CodeCell createCodeCell();
	
	@Override
	MarkdownCell createMarkdownCell();
}

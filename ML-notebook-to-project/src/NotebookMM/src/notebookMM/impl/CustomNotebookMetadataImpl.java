package notebookMM.impl;

public class CustomNotebookMetadataImpl extends NotebookMetadataImpl {
	@Override
	public boolean isPythonKernel() {
		String kernel = getKernelspec();
		String lang = getLanguage();

		if (kernel != null && kernel.toLowerCase().contains("python")) {
			return true;
		}
		if (lang != null && lang.toLowerCase().contains("python")) {
			return true;
		}
		return false;
	}
}

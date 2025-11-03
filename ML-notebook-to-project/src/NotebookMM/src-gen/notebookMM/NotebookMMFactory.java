/**
 */
package notebookMM;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see notebookMM.NotebookMMPackage
 * @generated
 */
public interface NotebookMMFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NotebookMMFactory eINSTANCE = notebookMM.impl.NotebookMMFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Notebook Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Notebook Model</em>'.
	 * @generated
	 */
	NotebookModel createNotebookModel();

	/**
	 * Returns a new object of class '<em>Notebook Metadata</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Notebook Metadata</em>'.
	 * @generated
	 */
	NotebookMetadata createNotebookMetadata();

	/**
	 * Returns a new object of class '<em>Code Cell</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Code Cell</em>'.
	 * @generated
	 */
	CodeCell createCodeCell();

	/**
	 * Returns a new object of class '<em>Markdown Cell</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Markdown Cell</em>'.
	 * @generated
	 */
	MarkdownCell createMarkdownCell();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	NotebookMMPackage getNotebookMMPackage();

} //NotebookMMFactory

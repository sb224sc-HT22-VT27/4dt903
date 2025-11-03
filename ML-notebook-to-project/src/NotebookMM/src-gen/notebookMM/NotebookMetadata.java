/**
 */
package notebookMM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Notebook Metadata</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link notebookMM.NotebookMetadata#getKernelspec <em>Kernelspec</em>}</li>
 *   <li>{@link notebookMM.NotebookMetadata#getLanguage <em>Language</em>}</li>
 *   <li>{@link notebookMM.NotebookMetadata#getNbformat <em>Nbformat</em>}</li>
 *   <li>{@link notebookMM.NotebookMetadata#getNbformatMinor <em>Nbformat Minor</em>}</li>
 * </ul>
 *
 * @see notebookMM.NotebookMMPackage#getNotebookMetadata()
 * @model
 * @generated
 */
public interface NotebookMetadata extends EObject {
	/**
	 * Returns the value of the '<em><b>Kernelspec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kernelspec</em>' attribute.
	 * @see #setKernelspec(String)
	 * @see notebookMM.NotebookMMPackage#getNotebookMetadata_Kernelspec()
	 * @model
	 * @generated
	 */
	String getKernelspec();

	/**
	 * Sets the value of the '{@link notebookMM.NotebookMetadata#getKernelspec <em>Kernelspec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kernelspec</em>' attribute.
	 * @see #getKernelspec()
	 * @generated
	 */
	void setKernelspec(String value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see #setLanguage(String)
	 * @see notebookMM.NotebookMMPackage#getNotebookMetadata_Language()
	 * @model
	 * @generated
	 */
	String getLanguage();

	/**
	 * Sets the value of the '{@link notebookMM.NotebookMetadata#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(String value);

	/**
	 * Returns the value of the '<em><b>Nbformat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nbformat</em>' attribute.
	 * @see #setNbformat(int)
	 * @see notebookMM.NotebookMMPackage#getNotebookMetadata_Nbformat()
	 * @model
	 * @generated
	 */
	int getNbformat();

	/**
	 * Sets the value of the '{@link notebookMM.NotebookMetadata#getNbformat <em>Nbformat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nbformat</em>' attribute.
	 * @see #getNbformat()
	 * @generated
	 */
	void setNbformat(int value);

	/**
	 * Returns the value of the '<em><b>Nbformat Minor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nbformat Minor</em>' attribute.
	 * @see #setNbformatMinor(int)
	 * @see notebookMM.NotebookMMPackage#getNotebookMetadata_NbformatMinor()
	 * @model
	 * @generated
	 */
	int getNbformatMinor();

	/**
	 * Sets the value of the '{@link notebookMM.NotebookMetadata#getNbformatMinor <em>Nbformat Minor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nbformat Minor</em>' attribute.
	 * @see #getNbformatMinor()
	 * @generated
	 */
	void setNbformatMinor(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isPythonKernel();

} // NotebookMetadata

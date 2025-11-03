/**
 */
package notebookMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Notebook Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link notebookMM.NotebookModel#getName <em>Name</em>}</li>
 *   <li>{@link notebookMM.NotebookModel#getCells <em>Cells</em>}</li>
 *   <li>{@link notebookMM.NotebookModel#getMetadata <em>Metadata</em>}</li>
 * </ul>
 *
 * @see notebookMM.NotebookMMPackage#getNotebookModel()
 * @model
 * @generated
 */
public interface NotebookModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see notebookMM.NotebookMMPackage#getNotebookModel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link notebookMM.NotebookModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Cells</b></em>' containment reference list.
	 * The list contents are of type {@link notebookMM.Cell}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cells</em>' containment reference list.
	 * @see notebookMM.NotebookMMPackage#getNotebookModel_Cells()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Cell> getCells();

	/**
	 * Returns the value of the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metadata</em>' containment reference.
	 * @see #setMetadata(NotebookMetadata)
	 * @see notebookMM.NotebookMMPackage#getNotebookModel_Metadata()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NotebookMetadata getMetadata();

	/**
	 * Sets the value of the '{@link notebookMM.NotebookModel#getMetadata <em>Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metadata</em>' containment reference.
	 * @see #getMetadata()
	 * @generated
	 */
	void setMetadata(NotebookMetadata value);

} // NotebookModel

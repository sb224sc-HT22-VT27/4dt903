/**
 */
package notebookMM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cell</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link notebookMM.Cell#getCellType <em>Cell Type</em>}</li>
 *   <li>{@link notebookMM.Cell#getExecutionOrder <em>Execution Order</em>}</li>
 *   <li>{@link notebookMM.Cell#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see notebookMM.NotebookMMPackage#getCell()
 * @model abstract="true"
 * @generated
 */
public interface Cell extends EObject {
	/**
	 * Returns the value of the '<em><b>Cell Type</b></em>' attribute.
	 * The literals are from the enumeration {@link notebookMM.CellType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cell Type</em>' attribute.
	 * @see notebookMM.CellType
	 * @see #setCellType(CellType)
	 * @see notebookMM.NotebookMMPackage#getCell_CellType()
	 * @model
	 * @generated
	 */
	CellType getCellType();

	/**
	 * Sets the value of the '{@link notebookMM.Cell#getCellType <em>Cell Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cell Type</em>' attribute.
	 * @see notebookMM.CellType
	 * @see #getCellType()
	 * @generated
	 */
	void setCellType(CellType value);

	/**
	 * Returns the value of the '<em><b>Execution Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution Order</em>' attribute.
	 * @see #setExecutionOrder(int)
	 * @see notebookMM.NotebookMMPackage#getCell_ExecutionOrder()
	 * @model
	 * @generated
	 */
	int getExecutionOrder();

	/**
	 * Sets the value of the '{@link notebookMM.Cell#getExecutionOrder <em>Execution Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution Order</em>' attribute.
	 * @see #getExecutionOrder()
	 * @generated
	 */
	void setExecutionOrder(int value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see notebookMM.NotebookMMPackage#getCell_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link notebookMM.Cell#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isEmpty();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	int getContentLength();

} // Cell

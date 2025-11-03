/**
 */
package notebookMM;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Code Cell</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link notebookMM.CodeCell#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see notebookMM.NotebookMMPackage#getCodeCell()
 * @model
 * @generated
 */
public interface CodeCell extends Cell {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see #setSource(String)
	 * @see notebookMM.NotebookMMPackage#getCodeCell_Source()
	 * @model
	 * @generated
	 */
	String getSource();

	/**
	 * Sets the value of the '{@link notebookMM.CodeCell#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(String value);

} // CodeCell

/**
 */
package notebookMM;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Markdown Cell</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link notebookMM.MarkdownCell#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @see notebookMM.NotebookMMPackage#getMarkdownCell()
 * @model
 * @generated
 */
public interface MarkdownCell extends Cell {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(String)
	 * @see notebookMM.NotebookMMPackage#getMarkdownCell_Content()
	 * @model
	 * @generated
	 */
	String getContent();

	/**
	 * Sets the value of the '{@link notebookMM.MarkdownCell#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(String value);

} // MarkdownCell

/**
 */
package notebookMM;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link notebookMM.CodeCell#getImports <em>Imports</em>}</li>
 *   <li>{@link notebookMM.CodeCell#getConstants <em>Constants</em>}</li>
 *   <li>{@link notebookMM.CodeCell#getCommands <em>Commands</em>}</li>
 *   <li>{@link notebookMM.CodeCell#getOutputs <em>Outputs</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>Imports</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' attribute list.
	 * @see notebookMM.NotebookMMPackage#getCodeCell_Imports()
	 * @model
	 * @generated
	 */
	EList<String> getImports();

	/**
	 * Returns the value of the '<em><b>Constants</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constants</em>' attribute list.
	 * @see notebookMM.NotebookMMPackage#getCodeCell_Constants()
	 * @model
	 * @generated
	 */
	EList<String> getConstants();

	/**
	 * Returns the value of the '<em><b>Commands</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commands</em>' attribute list.
	 * @see notebookMM.NotebookMMPackage#getCodeCell_Commands()
	 * @model
	 * @generated
	 */
	EList<String> getCommands();

	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputs</em>' attribute list.
	 * @see notebookMM.NotebookMMPackage#getCodeCell_Outputs()
	 * @model
	 * @generated
	 */
	EList<String> getOutputs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Extracts import statements from source code
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	EList<String> extractImports();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean hasImports();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Extracts constant definitions from source code
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	EList<String> extractConstants();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean hasConstants();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Extracts executable commands from source code
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	EList<String> extractCommands();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean hasCommands();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Heuristic to detect if this cell contains model training code
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isTrainingCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isDataPreprocessing();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isPredictionCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns source code split into lines
	 * <!-- end-model-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<String> getSourceLines();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean containsKeyword(String keyword);

} // CodeCell

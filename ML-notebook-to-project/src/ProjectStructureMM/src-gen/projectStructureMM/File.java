/**
 */
package projectStructureMM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projectStructureMM.File#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @see projectStructureMM.ProjectStructureMMPackage#getFile()
 * @model
 * @generated
 */
public interface File extends FileSystemElement {
	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute list.
	 * @see projectStructureMM.ProjectStructureMMPackage#getFile_Content()
	 * @model
	 * @generated
	 */
	EList<String> getContent();

} // File

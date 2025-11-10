/**
 */
package projectStructureMM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Directory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projectStructureMM.Directory#getFilesystemelement <em>Filesystemelement</em>}</li>
 * </ul>
 *
 * @see projectStructureMM.ProjectStructureMMPackage#getDirectory()
 * @model
 * @generated
 */
public interface Directory extends FileSystemElement {
	/**
	 * Returns the value of the '<em><b>Filesystemelement</b></em>' containment reference list.
	 * The list contents are of type {@link projectStructureMM.FileSystemElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filesystemelement</em>' containment reference list.
	 * @see projectStructureMM.ProjectStructureMMPackage#getDirectory_Filesystemelement()
	 * @model containment="true"
	 * @generated
	 */
	EList<FileSystemElement> getFilesystemelement();

} // Directory

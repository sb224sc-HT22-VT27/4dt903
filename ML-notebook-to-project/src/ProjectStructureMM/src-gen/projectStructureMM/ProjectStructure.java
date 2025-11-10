/**
 */
package projectStructureMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projectStructureMM.ProjectStructure#getName <em>Name</em>}</li>
 *   <li>{@link projectStructureMM.ProjectStructure#getFilesystemelement <em>Filesystemelement</em>}</li>
 * </ul>
 *
 * @see projectStructureMM.ProjectStructureMMPackage#getProjectStructure()
 * @model
 * @generated
 */
public interface ProjectStructure extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see projectStructureMM.ProjectStructureMMPackage#getProjectStructure_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link projectStructureMM.ProjectStructure#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Filesystemelement</b></em>' reference list.
	 * The list contents are of type {@link projectStructureMM.FileSystemElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filesystemelement</em>' reference list.
	 * @see projectStructureMM.ProjectStructureMMPackage#getProjectStructure_Filesystemelement()
	 * @model
	 * @generated
	 */
	EList<FileSystemElement> getFilesystemelement();

} // ProjectStructure

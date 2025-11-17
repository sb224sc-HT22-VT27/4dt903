/**
 */
package projectStructureMM;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see projectStructureMM.ProjectStructureMMFactory
 * @model kind="package"
 * @generated
 */
public interface ProjectStructureMMPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "projectStructureMM";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.g7.org/projectStructureMM";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "projectStructureMM";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProjectStructureMMPackage eINSTANCE = projectStructureMM.impl.ProjectStructureMMPackageImpl.init();

	/**
	 * The meta object id for the '{@link projectStructureMM.impl.FileSystemElementImpl <em>File System Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projectStructureMM.impl.FileSystemElementImpl
	 * @see projectStructureMM.impl.ProjectStructureMMPackageImpl#getFileSystemElement()
	 * @generated
	 */
	int FILE_SYSTEM_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SYSTEM_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>File System Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SYSTEM_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>File System Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_SYSTEM_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projectStructureMM.impl.DirectoryImpl <em>Directory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projectStructureMM.impl.DirectoryImpl
	 * @see projectStructureMM.impl.ProjectStructureMMPackageImpl#getDirectory()
	 * @generated
	 */
	int DIRECTORY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY__NAME = FILE_SYSTEM_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Filesystemelement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY__FILESYSTEMELEMENT = FILE_SYSTEM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Directory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY_FEATURE_COUNT = FILE_SYSTEM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Directory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIRECTORY_OPERATION_COUNT = FILE_SYSTEM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link projectStructureMM.impl.FileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projectStructureMM.impl.FileImpl
	 * @see projectStructureMM.impl.ProjectStructureMMPackageImpl#getFile()
	 * @generated
	 */
	int FILE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__NAME = FILE_SYSTEM_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__CONTENT = FILE_SYSTEM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FEATURE_COUNT = FILE_SYSTEM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_OPERATION_COUNT = FILE_SYSTEM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link projectStructureMM.impl.ProjectStructureImpl <em>Project Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projectStructureMM.impl.ProjectStructureImpl
	 * @see projectStructureMM.impl.ProjectStructureMMPackageImpl#getProjectStructure()
	 * @generated
	 */
	int PROJECT_STRUCTURE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_STRUCTURE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Filesystemelement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_STRUCTURE__FILESYSTEMELEMENT = 1;

	/**
	 * The number of structural features of the '<em>Project Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_STRUCTURE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Project Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_STRUCTURE_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link projectStructureMM.FileSystemElement <em>File System Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File System Element</em>'.
	 * @see projectStructureMM.FileSystemElement
	 * @generated
	 */
	EClass getFileSystemElement();

	/**
	 * Returns the meta object for the attribute '{@link projectStructureMM.FileSystemElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see projectStructureMM.FileSystemElement#getName()
	 * @see #getFileSystemElement()
	 * @generated
	 */
	EAttribute getFileSystemElement_Name();

	/**
	 * Returns the meta object for class '{@link projectStructureMM.Directory <em>Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Directory</em>'.
	 * @see projectStructureMM.Directory
	 * @generated
	 */
	EClass getDirectory();

	/**
	 * Returns the meta object for the containment reference list '{@link projectStructureMM.Directory#getFilesystemelement <em>Filesystemelement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Filesystemelement</em>'.
	 * @see projectStructureMM.Directory#getFilesystemelement()
	 * @see #getDirectory()
	 * @generated
	 */
	EReference getDirectory_Filesystemelement();

	/**
	 * Returns the meta object for class '{@link projectStructureMM.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see projectStructureMM.File
	 * @generated
	 */
	EClass getFile();

	/**
	 * Returns the meta object for the attribute list '{@link projectStructureMM.File#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Content</em>'.
	 * @see projectStructureMM.File#getContent()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Content();

	/**
	 * Returns the meta object for class '{@link projectStructureMM.ProjectStructure <em>Project Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project Structure</em>'.
	 * @see projectStructureMM.ProjectStructure
	 * @generated
	 */
	EClass getProjectStructure();

	/**
	 * Returns the meta object for the attribute '{@link projectStructureMM.ProjectStructure#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see projectStructureMM.ProjectStructure#getName()
	 * @see #getProjectStructure()
	 * @generated
	 */
	EAttribute getProjectStructure_Name();

	/**
	 * Returns the meta object for the reference list '{@link projectStructureMM.ProjectStructure#getFilesystemelement <em>Filesystemelement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Filesystemelement</em>'.
	 * @see projectStructureMM.ProjectStructure#getFilesystemelement()
	 * @see #getProjectStructure()
	 * @generated
	 */
	EReference getProjectStructure_Filesystemelement();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ProjectStructureMMFactory getProjectStructureMMFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link projectStructureMM.impl.FileSystemElementImpl <em>File System Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projectStructureMM.impl.FileSystemElementImpl
		 * @see projectStructureMM.impl.ProjectStructureMMPackageImpl#getFileSystemElement()
		 * @generated
		 */
		EClass FILE_SYSTEM_ELEMENT = eINSTANCE.getFileSystemElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_SYSTEM_ELEMENT__NAME = eINSTANCE.getFileSystemElement_Name();

		/**
		 * The meta object literal for the '{@link projectStructureMM.impl.DirectoryImpl <em>Directory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projectStructureMM.impl.DirectoryImpl
		 * @see projectStructureMM.impl.ProjectStructureMMPackageImpl#getDirectory()
		 * @generated
		 */
		EClass DIRECTORY = eINSTANCE.getDirectory();

		/**
		 * The meta object literal for the '<em><b>Filesystemelement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIRECTORY__FILESYSTEMELEMENT = eINSTANCE.getDirectory_Filesystemelement();

		/**
		 * The meta object literal for the '{@link projectStructureMM.impl.FileImpl <em>File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projectStructureMM.impl.FileImpl
		 * @see projectStructureMM.impl.ProjectStructureMMPackageImpl#getFile()
		 * @generated
		 */
		EClass FILE = eINSTANCE.getFile();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__CONTENT = eINSTANCE.getFile_Content();

		/**
		 * The meta object literal for the '{@link projectStructureMM.impl.ProjectStructureImpl <em>Project Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projectStructureMM.impl.ProjectStructureImpl
		 * @see projectStructureMM.impl.ProjectStructureMMPackageImpl#getProjectStructure()
		 * @generated
		 */
		EClass PROJECT_STRUCTURE = eINSTANCE.getProjectStructure();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_STRUCTURE__NAME = eINSTANCE.getProjectStructure_Name();

		/**
		 * The meta object literal for the '<em><b>Filesystemelement</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT_STRUCTURE__FILESYSTEMELEMENT = eINSTANCE.getProjectStructure_Filesystemelement();

	}

} //ProjectStructureMMPackage

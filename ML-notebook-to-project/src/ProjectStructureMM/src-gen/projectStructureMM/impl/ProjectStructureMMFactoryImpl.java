/**
 */
package projectStructureMM.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import projectStructureMM.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProjectStructureMMFactoryImpl extends EFactoryImpl implements ProjectStructureMMFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProjectStructureMMFactory init() {
		try {
			ProjectStructureMMFactory theProjectStructureMMFactory = (ProjectStructureMMFactory) EPackage.Registry.INSTANCE
					.getEFactory(ProjectStructureMMPackage.eNS_URI);
			if (theProjectStructureMMFactory != null) {
				return theProjectStructureMMFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ProjectStructureMMFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectStructureMMFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case ProjectStructureMMPackage.DIRECTORY:
			return createDirectory();
		case ProjectStructureMMPackage.FILE:
			return createFile();
		case ProjectStructureMMPackage.PROJECT_STRUCTURE:
			return createProjectStructure();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Directory createDirectory() {
		DirectoryImpl directory = new DirectoryImpl();
		return directory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public File createFile() {
		FileImpl file = new FileImpl();
		return file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProjectStructure createProjectStructure() {
		ProjectStructureImpl projectStructure = new ProjectStructureImpl();
		return projectStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProjectStructureMMPackage getProjectStructureMMPackage() {
		return (ProjectStructureMMPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ProjectStructureMMPackage getPackage() {
		return ProjectStructureMMPackage.eINSTANCE;
	}

} //ProjectStructureMMFactoryImpl

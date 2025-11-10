/**
 */
package projectStructureMM.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import projectStructureMM.FileSystemElement;
import projectStructureMM.ProjectStructure;
import projectStructureMM.ProjectStructureMMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Project Structure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projectStructureMM.impl.ProjectStructureImpl#getName <em>Name</em>}</li>
 *   <li>{@link projectStructureMM.impl.ProjectStructureImpl#getFilesystemelement <em>Filesystemelement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProjectStructureImpl extends MinimalEObjectImpl.Container implements ProjectStructure {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFilesystemelement() <em>Filesystemelement</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilesystemelement()
	 * @generated
	 * @ordered
	 */
	protected EList<FileSystemElement> filesystemelement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjectStructureMMPackage.Literals.PROJECT_STRUCTURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjectStructureMMPackage.PROJECT_STRUCTURE__NAME,
					oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FileSystemElement> getFilesystemelement() {
		if (filesystemelement == null) {
			filesystemelement = new EObjectResolvingEList<FileSystemElement>(FileSystemElement.class, this,
					ProjectStructureMMPackage.PROJECT_STRUCTURE__FILESYSTEMELEMENT);
		}
		return filesystemelement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ProjectStructureMMPackage.PROJECT_STRUCTURE__NAME:
			return getName();
		case ProjectStructureMMPackage.PROJECT_STRUCTURE__FILESYSTEMELEMENT:
			return getFilesystemelement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ProjectStructureMMPackage.PROJECT_STRUCTURE__NAME:
			setName((String) newValue);
			return;
		case ProjectStructureMMPackage.PROJECT_STRUCTURE__FILESYSTEMELEMENT:
			getFilesystemelement().clear();
			getFilesystemelement().addAll((Collection<? extends FileSystemElement>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ProjectStructureMMPackage.PROJECT_STRUCTURE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ProjectStructureMMPackage.PROJECT_STRUCTURE__FILESYSTEMELEMENT:
			getFilesystemelement().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ProjectStructureMMPackage.PROJECT_STRUCTURE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ProjectStructureMMPackage.PROJECT_STRUCTURE__FILESYSTEMELEMENT:
			return filesystemelement != null && !filesystemelement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ProjectStructureImpl

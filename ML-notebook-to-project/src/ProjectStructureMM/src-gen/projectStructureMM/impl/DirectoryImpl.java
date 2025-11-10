/**
 */
package projectStructureMM.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import projectStructureMM.Directory;
import projectStructureMM.FileSystemElement;
import projectStructureMM.ProjectStructureMMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Directory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projectStructureMM.impl.DirectoryImpl#getFilesystemelement <em>Filesystemelement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DirectoryImpl extends FileSystemElementImpl implements Directory {
	/**
	 * The cached value of the '{@link #getFilesystemelement() <em>Filesystemelement</em>}' containment reference list.
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
	protected DirectoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjectStructureMMPackage.Literals.DIRECTORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FileSystemElement> getFilesystemelement() {
		if (filesystemelement == null) {
			filesystemelement = new EObjectContainmentEList<FileSystemElement>(FileSystemElement.class, this,
					ProjectStructureMMPackage.DIRECTORY__FILESYSTEMELEMENT);
		}
		return filesystemelement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ProjectStructureMMPackage.DIRECTORY__FILESYSTEMELEMENT:
			return ((InternalEList<?>) getFilesystemelement()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ProjectStructureMMPackage.DIRECTORY__FILESYSTEMELEMENT:
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
		case ProjectStructureMMPackage.DIRECTORY__FILESYSTEMELEMENT:
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
		case ProjectStructureMMPackage.DIRECTORY__FILESYSTEMELEMENT:
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
		case ProjectStructureMMPackage.DIRECTORY__FILESYSTEMELEMENT:
			return filesystemelement != null && !filesystemelement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DirectoryImpl

/**
 */
package og.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import og.Discipline;
import og.InvitedCommittee;
import og.Og;
import og.OgPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Og</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link og.impl.OgImpl#getName <em>Name</em>}</li>
 *   <li>{@link og.impl.OgImpl#getDisciplines <em>Disciplines</em>}</li>
 *   <li>{@link og.impl.OgImpl#getInvitedCommittees <em>Invited Committees</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OgImpl extends MinimalEObjectImpl.Container implements Og {
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
	 * The cached value of the '{@link #getDisciplines() <em>Disciplines</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisciplines()
	 * @generated
	 * @ordered
	 */
	protected EList<Discipline> disciplines;

	/**
	 * The cached value of the '{@link #getInvitedCommittees() <em>Invited Committees</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvitedCommittees()
	 * @generated
	 * @ordered
	 */
	protected EList<InvitedCommittee> invitedCommittees;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OgImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OgPackage.Literals.OG;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OgPackage.OG__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Discipline> getDisciplines() {
		if (disciplines == null) {
			disciplines = new EObjectContainmentEList<Discipline>(Discipline.class, this, OgPackage.OG__DISCIPLINES);
		}
		return disciplines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InvitedCommittee> getInvitedCommittees() {
		if (invitedCommittees == null) {
			invitedCommittees = new EObjectContainmentEList<InvitedCommittee>(InvitedCommittee.class, this,
					OgPackage.OG__INVITED_COMMITTEES);
		}
		return invitedCommittees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addCommittee(InvitedCommittee theCommittee) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addDiscipline(Discipline theDiscipline) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case OgPackage.OG__DISCIPLINES:
			return ((InternalEList<?>) getDisciplines()).basicRemove(otherEnd, msgs);
		case OgPackage.OG__INVITED_COMMITTEES:
			return ((InternalEList<?>) getInvitedCommittees()).basicRemove(otherEnd, msgs);
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
		case OgPackage.OG__NAME:
			return getName();
		case OgPackage.OG__DISCIPLINES:
			return getDisciplines();
		case OgPackage.OG__INVITED_COMMITTEES:
			return getInvitedCommittees();
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
		case OgPackage.OG__NAME:
			setName((String) newValue);
			return;
		case OgPackage.OG__DISCIPLINES:
			getDisciplines().clear();
			getDisciplines().addAll((Collection<? extends Discipline>) newValue);
			return;
		case OgPackage.OG__INVITED_COMMITTEES:
			getInvitedCommittees().clear();
			getInvitedCommittees().addAll((Collection<? extends InvitedCommittee>) newValue);
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
		case OgPackage.OG__NAME:
			setName(NAME_EDEFAULT);
			return;
		case OgPackage.OG__DISCIPLINES:
			getDisciplines().clear();
			return;
		case OgPackage.OG__INVITED_COMMITTEES:
			getInvitedCommittees().clear();
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
		case OgPackage.OG__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case OgPackage.OG__DISCIPLINES:
			return disciplines != null && !disciplines.isEmpty();
		case OgPackage.OG__INVITED_COMMITTEES:
			return invitedCommittees != null && !invitedCommittees.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case OgPackage.OG___ADD_COMMITTEE__INVITEDCOMMITTEE:
			addCommittee((InvitedCommittee) arguments.get(0));
			return null;
		case OgPackage.OG___ADD_DISCIPLINE__DISCIPLINE:
			addDiscipline((Discipline) arguments.get(0));
			return null;
		}
		return super.eInvoke(operationID, arguments);
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

} //OgImpl

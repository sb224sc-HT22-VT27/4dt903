/**
 */
package olympics.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import olympics.Discipline;
import olympics.InvitedCommittee;
import olympics.OlympicGames;
import olympics.OlympicsPackage;

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
 * An implementation of the model object '<em><b>Olympic Games</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link olympics.impl.OlympicGamesImpl#getName <em>Name</em>}</li>
 *   <li>{@link olympics.impl.OlympicGamesImpl#getInvitedcommittees <em>Invitedcommittees</em>}</li>
 *   <li>{@link olympics.impl.OlympicGamesImpl#getDisciplines <em>Disciplines</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OlympicGamesImpl extends MinimalEObjectImpl.Container implements OlympicGames {
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
	 * The cached value of the '{@link #getInvitedcommittees() <em>Invitedcommittees</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvitedcommittees()
	 * @generated
	 * @ordered
	 */
	protected EList<InvitedCommittee> invitedcommittees;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OlympicGamesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OlympicsPackage.Literals.OLYMPIC_GAMES;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OlympicsPackage.OLYMPIC_GAMES__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InvitedCommittee> getInvitedcommittees() {
		if (invitedcommittees == null) {
			invitedcommittees = new EObjectContainmentEList<InvitedCommittee>(InvitedCommittee.class, this, OlympicsPackage.OLYMPIC_GAMES__INVITEDCOMMITTEES);
		}
		return invitedcommittees;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Discipline> getDisciplines() {
		if (disciplines == null) {
			disciplines = new EObjectContainmentEList<Discipline>(Discipline.class, this, OlympicsPackage.OLYMPIC_GAMES__DISCIPLINES);
		}
		return disciplines;
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
			case OlympicsPackage.OLYMPIC_GAMES__INVITEDCOMMITTEES:
				return ((InternalEList<?>)getInvitedcommittees()).basicRemove(otherEnd, msgs);
			case OlympicsPackage.OLYMPIC_GAMES__DISCIPLINES:
				return ((InternalEList<?>)getDisciplines()).basicRemove(otherEnd, msgs);
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
			case OlympicsPackage.OLYMPIC_GAMES__NAME:
				return getName();
			case OlympicsPackage.OLYMPIC_GAMES__INVITEDCOMMITTEES:
				return getInvitedcommittees();
			case OlympicsPackage.OLYMPIC_GAMES__DISCIPLINES:
				return getDisciplines();
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
			case OlympicsPackage.OLYMPIC_GAMES__NAME:
				setName((String)newValue);
				return;
			case OlympicsPackage.OLYMPIC_GAMES__INVITEDCOMMITTEES:
				getInvitedcommittees().clear();
				getInvitedcommittees().addAll((Collection<? extends InvitedCommittee>)newValue);
				return;
			case OlympicsPackage.OLYMPIC_GAMES__DISCIPLINES:
				getDisciplines().clear();
				getDisciplines().addAll((Collection<? extends Discipline>)newValue);
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
			case OlympicsPackage.OLYMPIC_GAMES__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OlympicsPackage.OLYMPIC_GAMES__INVITEDCOMMITTEES:
				getInvitedcommittees().clear();
				return;
			case OlympicsPackage.OLYMPIC_GAMES__DISCIPLINES:
				getDisciplines().clear();
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
			case OlympicsPackage.OLYMPIC_GAMES__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OlympicsPackage.OLYMPIC_GAMES__INVITEDCOMMITTEES:
				return invitedcommittees != null && !invitedcommittees.isEmpty();
			case OlympicsPackage.OLYMPIC_GAMES__DISCIPLINES:
				return disciplines != null && !disciplines.isEmpty();
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
			case OlympicsPackage.OLYMPIC_GAMES___ADD_COMMITTEE__INVITEDCOMMITTEE:
				addCommittee((InvitedCommittee)arguments.get(0));
				return null;
			case OlympicsPackage.OLYMPIC_GAMES___ADD_DISCIPLINE__DISCIPLINE:
				addDiscipline((Discipline)arguments.get(0));
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
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //OlympicGamesImpl

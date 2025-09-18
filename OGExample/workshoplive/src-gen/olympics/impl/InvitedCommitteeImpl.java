/**
 */
package olympics.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import olympics.Athlete;
import olympics.InvitedCommittee;
import olympics.OlympicsPackage;
import olympics.Team;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Invited Committee</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link olympics.impl.InvitedCommitteeImpl#getName <em>Name</em>}</li>
 *   <li>{@link olympics.impl.InvitedCommitteeImpl#getPathToFlag <em>Path To Flag</em>}</li>
 *   <li>{@link olympics.impl.InvitedCommitteeImpl#getNumberOfGoldMedals <em>Number Of Gold Medals</em>}</li>
 *   <li>{@link olympics.impl.InvitedCommitteeImpl#getAthletes <em>Athletes</em>}</li>
 *   <li>{@link olympics.impl.InvitedCommitteeImpl#getTeams <em>Teams</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InvitedCommitteeImpl extends MinimalEObjectImpl.Container implements InvitedCommittee {
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
	 * The default value of the '{@link #getPathToFlag() <em>Path To Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathToFlag()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_TO_FLAG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPathToFlag() <em>Path To Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathToFlag()
	 * @generated
	 * @ordered
	 */
	protected String pathToFlag = PATH_TO_FLAG_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfGoldMedals() <em>Number Of Gold Medals</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfGoldMedals()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_GOLD_MEDALS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfGoldMedals() <em>Number Of Gold Medals</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfGoldMedals()
	 * @generated
	 * @ordered
	 */
	protected int numberOfGoldMedals = NUMBER_OF_GOLD_MEDALS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAthletes() <em>Athletes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAthletes()
	 * @generated
	 * @ordered
	 */
	protected EList<Athlete> athletes;

	/**
	 * The cached value of the '{@link #getTeams() <em>Teams</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeams()
	 * @generated
	 * @ordered
	 */
	protected EList<Team> teams;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InvitedCommitteeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OlympicsPackage.Literals.INVITED_COMMITTEE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OlympicsPackage.INVITED_COMMITTEE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPathToFlag() {
		return pathToFlag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPathToFlag(String newPathToFlag) {
		String oldPathToFlag = pathToFlag;
		pathToFlag = newPathToFlag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OlympicsPackage.INVITED_COMMITTEE__PATH_TO_FLAG, oldPathToFlag, pathToFlag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNumberOfGoldMedals() {
		return numberOfGoldMedals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumberOfGoldMedals(int newNumberOfGoldMedals) {
		int oldNumberOfGoldMedals = numberOfGoldMedals;
		numberOfGoldMedals = newNumberOfGoldMedals;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OlympicsPackage.INVITED_COMMITTEE__NUMBER_OF_GOLD_MEDALS, oldNumberOfGoldMedals, numberOfGoldMedals));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Athlete> getAthletes() {
		if (athletes == null) {
			athletes = new EObjectContainmentWithInverseEList<Athlete>(Athlete.class, this, OlympicsPackage.INVITED_COMMITTEE__ATHLETES, OlympicsPackage.ATHLETE__INVITEDCOMMITTEE);
		}
		return athletes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Team> getTeams() {
		if (teams == null) {
			teams = new EObjectContainmentEList<Team>(Team.class, this, OlympicsPackage.INVITED_COMMITTEE__TEAMS);
		}
		return teams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addTeam(Team theTeam) {
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
	public void addAthlete(Athlete theAthlete) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OlympicsPackage.INVITED_COMMITTEE__ATHLETES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAthletes()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OlympicsPackage.INVITED_COMMITTEE__ATHLETES:
				return ((InternalEList<?>)getAthletes()).basicRemove(otherEnd, msgs);
			case OlympicsPackage.INVITED_COMMITTEE__TEAMS:
				return ((InternalEList<?>)getTeams()).basicRemove(otherEnd, msgs);
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
			case OlympicsPackage.INVITED_COMMITTEE__NAME:
				return getName();
			case OlympicsPackage.INVITED_COMMITTEE__PATH_TO_FLAG:
				return getPathToFlag();
			case OlympicsPackage.INVITED_COMMITTEE__NUMBER_OF_GOLD_MEDALS:
				return getNumberOfGoldMedals();
			case OlympicsPackage.INVITED_COMMITTEE__ATHLETES:
				return getAthletes();
			case OlympicsPackage.INVITED_COMMITTEE__TEAMS:
				return getTeams();
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
			case OlympicsPackage.INVITED_COMMITTEE__NAME:
				setName((String)newValue);
				return;
			case OlympicsPackage.INVITED_COMMITTEE__PATH_TO_FLAG:
				setPathToFlag((String)newValue);
				return;
			case OlympicsPackage.INVITED_COMMITTEE__NUMBER_OF_GOLD_MEDALS:
				setNumberOfGoldMedals((Integer)newValue);
				return;
			case OlympicsPackage.INVITED_COMMITTEE__ATHLETES:
				getAthletes().clear();
				getAthletes().addAll((Collection<? extends Athlete>)newValue);
				return;
			case OlympicsPackage.INVITED_COMMITTEE__TEAMS:
				getTeams().clear();
				getTeams().addAll((Collection<? extends Team>)newValue);
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
			case OlympicsPackage.INVITED_COMMITTEE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OlympicsPackage.INVITED_COMMITTEE__PATH_TO_FLAG:
				setPathToFlag(PATH_TO_FLAG_EDEFAULT);
				return;
			case OlympicsPackage.INVITED_COMMITTEE__NUMBER_OF_GOLD_MEDALS:
				setNumberOfGoldMedals(NUMBER_OF_GOLD_MEDALS_EDEFAULT);
				return;
			case OlympicsPackage.INVITED_COMMITTEE__ATHLETES:
				getAthletes().clear();
				return;
			case OlympicsPackage.INVITED_COMMITTEE__TEAMS:
				getTeams().clear();
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
			case OlympicsPackage.INVITED_COMMITTEE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OlympicsPackage.INVITED_COMMITTEE__PATH_TO_FLAG:
				return PATH_TO_FLAG_EDEFAULT == null ? pathToFlag != null : !PATH_TO_FLAG_EDEFAULT.equals(pathToFlag);
			case OlympicsPackage.INVITED_COMMITTEE__NUMBER_OF_GOLD_MEDALS:
				return numberOfGoldMedals != NUMBER_OF_GOLD_MEDALS_EDEFAULT;
			case OlympicsPackage.INVITED_COMMITTEE__ATHLETES:
				return athletes != null && !athletes.isEmpty();
			case OlympicsPackage.INVITED_COMMITTEE__TEAMS:
				return teams != null && !teams.isEmpty();
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
			case OlympicsPackage.INVITED_COMMITTEE___ADD_TEAM__TEAM:
				addTeam((Team)arguments.get(0));
				return null;
			case OlympicsPackage.INVITED_COMMITTEE___ADD_ATHLETE__ATHLETE:
				addAthlete((Athlete)arguments.get(0));
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
		result.append(", pathToFlag: ");
		result.append(pathToFlag);
		result.append(", numberOfGoldMedals: ");
		result.append(numberOfGoldMedals);
		result.append(')');
		return result.toString();
	}

} //InvitedCommitteeImpl

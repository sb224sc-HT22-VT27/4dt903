/**
 */
package og.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import og.Athlete;
import og.InvitedCommittee;
import og.OgPackage;
import og.Team;

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
 *   <li>{@link og.impl.InvitedCommitteeImpl#getName <em>Name</em>}</li>
 *   <li>{@link og.impl.InvitedCommitteeImpl#getPathToFlagImage <em>Path To Flag Image</em>}</li>
 *   <li>{@link og.impl.InvitedCommitteeImpl#getNumberOfGoldMedals <em>Number Of Gold Medals</em>}</li>
 *   <li>{@link og.impl.InvitedCommitteeImpl#getTeam <em>Team</em>}</li>
 *   <li>{@link og.impl.InvitedCommitteeImpl#getAthletes <em>Athletes</em>}</li>
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
	 * The default value of the '{@link #getPathToFlagImage() <em>Path To Flag Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathToFlagImage()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_TO_FLAG_IMAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPathToFlagImage() <em>Path To Flag Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathToFlagImage()
	 * @generated
	 * @ordered
	 */
	protected String pathToFlagImage = PATH_TO_FLAG_IMAGE_EDEFAULT;

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
	 * The cached value of the '{@link #getTeam() <em>Team</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeam()
	 * @generated
	 * @ordered
	 */
	protected EList<Team> team;

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
		return OgPackage.Literals.INVITED_COMMITTEE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OgPackage.INVITED_COMMITTEE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPathToFlagImage() {
		return pathToFlagImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPathToFlagImage(String newPathToFlagImage) {
		String oldPathToFlagImage = pathToFlagImage;
		pathToFlagImage = newPathToFlagImage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OgPackage.INVITED_COMMITTEE__PATH_TO_FLAG_IMAGE,
					oldPathToFlagImage, pathToFlagImage));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OgPackage.INVITED_COMMITTEE__NUMBER_OF_GOLD_MEDALS,
					oldNumberOfGoldMedals, numberOfGoldMedals));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Team> getTeam() {
		if (team == null) {
			team = new EObjectContainmentEList<Team>(Team.class, this, OgPackage.INVITED_COMMITTEE__TEAM);
		}
		return team;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Athlete> getAthletes() {
		if (athletes == null) {
			athletes = new EObjectContainmentWithInverseEList<Athlete>(Athlete.class, this,
					OgPackage.INVITED_COMMITTEE__ATHLETES, OgPackage.ATHLETE__INVITED_COMMITTEE);
		}
		return athletes;
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
		case OgPackage.INVITED_COMMITTEE__ATHLETES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getAthletes()).basicAdd(otherEnd, msgs);
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
		case OgPackage.INVITED_COMMITTEE__TEAM:
			return ((InternalEList<?>) getTeam()).basicRemove(otherEnd, msgs);
		case OgPackage.INVITED_COMMITTEE__ATHLETES:
			return ((InternalEList<?>) getAthletes()).basicRemove(otherEnd, msgs);
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
		case OgPackage.INVITED_COMMITTEE__NAME:
			return getName();
		case OgPackage.INVITED_COMMITTEE__PATH_TO_FLAG_IMAGE:
			return getPathToFlagImage();
		case OgPackage.INVITED_COMMITTEE__NUMBER_OF_GOLD_MEDALS:
			return getNumberOfGoldMedals();
		case OgPackage.INVITED_COMMITTEE__TEAM:
			return getTeam();
		case OgPackage.INVITED_COMMITTEE__ATHLETES:
			return getAthletes();
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
		case OgPackage.INVITED_COMMITTEE__NAME:
			setName((String) newValue);
			return;
		case OgPackage.INVITED_COMMITTEE__PATH_TO_FLAG_IMAGE:
			setPathToFlagImage((String) newValue);
			return;
		case OgPackage.INVITED_COMMITTEE__NUMBER_OF_GOLD_MEDALS:
			setNumberOfGoldMedals((Integer) newValue);
			return;
		case OgPackage.INVITED_COMMITTEE__TEAM:
			getTeam().clear();
			getTeam().addAll((Collection<? extends Team>) newValue);
			return;
		case OgPackage.INVITED_COMMITTEE__ATHLETES:
			getAthletes().clear();
			getAthletes().addAll((Collection<? extends Athlete>) newValue);
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
		case OgPackage.INVITED_COMMITTEE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case OgPackage.INVITED_COMMITTEE__PATH_TO_FLAG_IMAGE:
			setPathToFlagImage(PATH_TO_FLAG_IMAGE_EDEFAULT);
			return;
		case OgPackage.INVITED_COMMITTEE__NUMBER_OF_GOLD_MEDALS:
			setNumberOfGoldMedals(NUMBER_OF_GOLD_MEDALS_EDEFAULT);
			return;
		case OgPackage.INVITED_COMMITTEE__TEAM:
			getTeam().clear();
			return;
		case OgPackage.INVITED_COMMITTEE__ATHLETES:
			getAthletes().clear();
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
		case OgPackage.INVITED_COMMITTEE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case OgPackage.INVITED_COMMITTEE__PATH_TO_FLAG_IMAGE:
			return PATH_TO_FLAG_IMAGE_EDEFAULT == null ? pathToFlagImage != null
					: !PATH_TO_FLAG_IMAGE_EDEFAULT.equals(pathToFlagImage);
		case OgPackage.INVITED_COMMITTEE__NUMBER_OF_GOLD_MEDALS:
			return numberOfGoldMedals != NUMBER_OF_GOLD_MEDALS_EDEFAULT;
		case OgPackage.INVITED_COMMITTEE__TEAM:
			return team != null && !team.isEmpty();
		case OgPackage.INVITED_COMMITTEE__ATHLETES:
			return athletes != null && !athletes.isEmpty();
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
		case OgPackage.INVITED_COMMITTEE___ADD_TEAM__TEAM:
			addTeam((Team) arguments.get(0));
			return null;
		case OgPackage.INVITED_COMMITTEE___ADD_ATHLETE__ATHLETE:
			addAthlete((Athlete) arguments.get(0));
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
		result.append(", pathToFlagImage: ");
		result.append(pathToFlagImage);
		result.append(", numberOfGoldMedals: ");
		result.append(numberOfGoldMedals);
		result.append(')');
		return result.toString();
	}

} //InvitedCommitteeImpl

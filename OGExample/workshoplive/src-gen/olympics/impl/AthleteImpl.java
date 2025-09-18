/**
 */
package olympics.impl;

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

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Athlete</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link olympics.impl.AthleteImpl#getAge <em>Age</em>}</li>
 *   <li>{@link olympics.impl.AthleteImpl#getWeight <em>Weight</em>}</li>
 *   <li>{@link olympics.impl.AthleteImpl#getTeamMembership <em>Team Membership</em>}</li>
 *   <li>{@link olympics.impl.AthleteImpl#getInvitedcommittee <em>Invitedcommittee</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AthleteImpl extends MedalableImpl implements Athlete {
	/**
	 * The default value of the '{@link #getAge() <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAge()
	 * @generated
	 * @ordered
	 */
	protected static final int AGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAge() <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAge()
	 * @generated
	 * @ordered
	 */
	protected int age = AGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected static final double WEIGHT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected double weight = WEIGHT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTeamMembership() <em>Team Membership</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeamMembership()
	 * @generated
	 * @ordered
	 */
	protected EList<Team> teamMembership;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AthleteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OlympicsPackage.Literals.ATHLETE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getAge() {
		return age;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAge(int newAge) {
		int oldAge = age;
		age = newAge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OlympicsPackage.ATHLETE__AGE, oldAge, age));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getWeight() {
		return weight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWeight(double newWeight) {
		double oldWeight = weight;
		weight = newWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OlympicsPackage.ATHLETE__WEIGHT, oldWeight, weight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Team> getTeamMembership() {
		if (teamMembership == null) {
			teamMembership = new EObjectWithInverseResolvingEList.ManyInverse<Team>(Team.class, this, OlympicsPackage.ATHLETE__TEAM_MEMBERSHIP, OlympicsPackage.TEAM__TEAM_MEMBERS);
		}
		return teamMembership;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InvitedCommittee getInvitedcommittee() {
		if (eContainerFeatureID() != OlympicsPackage.ATHLETE__INVITEDCOMMITTEE) return null;
		return (InvitedCommittee)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInvitedcommittee(InvitedCommittee newInvitedcommittee, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newInvitedcommittee, OlympicsPackage.ATHLETE__INVITEDCOMMITTEE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInvitedcommittee(InvitedCommittee newInvitedcommittee) {
		if (newInvitedcommittee != eInternalContainer() || (eContainerFeatureID() != OlympicsPackage.ATHLETE__INVITEDCOMMITTEE && newInvitedcommittee != null)) {
			if (EcoreUtil.isAncestor(this, newInvitedcommittee))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInvitedcommittee != null)
				msgs = ((InternalEObject)newInvitedcommittee).eInverseAdd(this, OlympicsPackage.INVITED_COMMITTEE__ATHLETES, InvitedCommittee.class, msgs);
			msgs = basicSetInvitedcommittee(newInvitedcommittee, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OlympicsPackage.ATHLETE__INVITEDCOMMITTEE, newInvitedcommittee, newInvitedcommittee));
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
			case OlympicsPackage.ATHLETE__TEAM_MEMBERSHIP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTeamMembership()).basicAdd(otherEnd, msgs);
			case OlympicsPackage.ATHLETE__INVITEDCOMMITTEE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetInvitedcommittee((InvitedCommittee)otherEnd, msgs);
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
			case OlympicsPackage.ATHLETE__TEAM_MEMBERSHIP:
				return ((InternalEList<?>)getTeamMembership()).basicRemove(otherEnd, msgs);
			case OlympicsPackage.ATHLETE__INVITEDCOMMITTEE:
				return basicSetInvitedcommittee(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case OlympicsPackage.ATHLETE__INVITEDCOMMITTEE:
				return eInternalContainer().eInverseRemove(this, OlympicsPackage.INVITED_COMMITTEE__ATHLETES, InvitedCommittee.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OlympicsPackage.ATHLETE__AGE:
				return getAge();
			case OlympicsPackage.ATHLETE__WEIGHT:
				return getWeight();
			case OlympicsPackage.ATHLETE__TEAM_MEMBERSHIP:
				return getTeamMembership();
			case OlympicsPackage.ATHLETE__INVITEDCOMMITTEE:
				return getInvitedcommittee();
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
			case OlympicsPackage.ATHLETE__AGE:
				setAge((Integer)newValue);
				return;
			case OlympicsPackage.ATHLETE__WEIGHT:
				setWeight((Double)newValue);
				return;
			case OlympicsPackage.ATHLETE__TEAM_MEMBERSHIP:
				getTeamMembership().clear();
				getTeamMembership().addAll((Collection<? extends Team>)newValue);
				return;
			case OlympicsPackage.ATHLETE__INVITEDCOMMITTEE:
				setInvitedcommittee((InvitedCommittee)newValue);
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
			case OlympicsPackage.ATHLETE__AGE:
				setAge(AGE_EDEFAULT);
				return;
			case OlympicsPackage.ATHLETE__WEIGHT:
				setWeight(WEIGHT_EDEFAULT);
				return;
			case OlympicsPackage.ATHLETE__TEAM_MEMBERSHIP:
				getTeamMembership().clear();
				return;
			case OlympicsPackage.ATHLETE__INVITEDCOMMITTEE:
				setInvitedcommittee((InvitedCommittee)null);
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
			case OlympicsPackage.ATHLETE__AGE:
				return age != AGE_EDEFAULT;
			case OlympicsPackage.ATHLETE__WEIGHT:
				return weight != WEIGHT_EDEFAULT;
			case OlympicsPackage.ATHLETE__TEAM_MEMBERSHIP:
				return teamMembership != null && !teamMembership.isEmpty();
			case OlympicsPackage.ATHLETE__INVITEDCOMMITTEE:
				return getInvitedcommittee() != null;
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
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (age: ");
		result.append(age);
		result.append(", weight: ");
		result.append(weight);
		result.append(')');
		return result.toString();
	}

} //AthleteImpl

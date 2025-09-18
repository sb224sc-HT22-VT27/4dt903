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
 *   <li>{@link og.impl.AthleteImpl#getInvitedCommittee <em>Invited Committee</em>}</li>
 *   <li>{@link og.impl.AthleteImpl#getAge <em>Age</em>}</li>
 *   <li>{@link og.impl.AthleteImpl#getWeight <em>Weight</em>}</li>
 *   <li>{@link og.impl.AthleteImpl#getTeamMembership <em>Team Membership</em>}</li>
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
		return OgPackage.Literals.ATHLETE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InvitedCommittee getInvitedCommittee() {
		if (eContainerFeatureID() != OgPackage.ATHLETE__INVITED_COMMITTEE)
			return null;
		return (InvitedCommittee) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInvitedCommittee(InvitedCommittee newInvitedCommittee, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newInvitedCommittee, OgPackage.ATHLETE__INVITED_COMMITTEE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInvitedCommittee(InvitedCommittee newInvitedCommittee) {
		if (newInvitedCommittee != eInternalContainer()
				|| (eContainerFeatureID() != OgPackage.ATHLETE__INVITED_COMMITTEE && newInvitedCommittee != null)) {
			if (EcoreUtil.isAncestor(this, newInvitedCommittee))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInvitedCommittee != null)
				msgs = ((InternalEObject) newInvitedCommittee).eInverseAdd(this, OgPackage.INVITED_COMMITTEE__ATHLETES,
						InvitedCommittee.class, msgs);
			msgs = basicSetInvitedCommittee(newInvitedCommittee, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OgPackage.ATHLETE__INVITED_COMMITTEE,
					newInvitedCommittee, newInvitedCommittee));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OgPackage.ATHLETE__AGE, oldAge, age));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OgPackage.ATHLETE__WEIGHT, oldWeight, weight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Team> getTeamMembership() {
		if (teamMembership == null) {
			teamMembership = new EObjectWithInverseResolvingEList.ManyInverse<Team>(Team.class, this,
					OgPackage.ATHLETE__TEAM_MEMBERSHIP, OgPackage.TEAM__TEAM_MEMBERS);
		}
		return teamMembership;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void getInvitedCommitte() {
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
		case OgPackage.ATHLETE__INVITED_COMMITTEE:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetInvitedCommittee((InvitedCommittee) otherEnd, msgs);
		case OgPackage.ATHLETE__TEAM_MEMBERSHIP:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getTeamMembership()).basicAdd(otherEnd, msgs);
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
		case OgPackage.ATHLETE__INVITED_COMMITTEE:
			return basicSetInvitedCommittee(null, msgs);
		case OgPackage.ATHLETE__TEAM_MEMBERSHIP:
			return ((InternalEList<?>) getTeamMembership()).basicRemove(otherEnd, msgs);
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
		case OgPackage.ATHLETE__INVITED_COMMITTEE:
			return eInternalContainer().eInverseRemove(this, OgPackage.INVITED_COMMITTEE__ATHLETES,
					InvitedCommittee.class, msgs);
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
		case OgPackage.ATHLETE__INVITED_COMMITTEE:
			return getInvitedCommittee();
		case OgPackage.ATHLETE__AGE:
			return getAge();
		case OgPackage.ATHLETE__WEIGHT:
			return getWeight();
		case OgPackage.ATHLETE__TEAM_MEMBERSHIP:
			return getTeamMembership();
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
		case OgPackage.ATHLETE__INVITED_COMMITTEE:
			setInvitedCommittee((InvitedCommittee) newValue);
			return;
		case OgPackage.ATHLETE__AGE:
			setAge((Integer) newValue);
			return;
		case OgPackage.ATHLETE__WEIGHT:
			setWeight((Double) newValue);
			return;
		case OgPackage.ATHLETE__TEAM_MEMBERSHIP:
			getTeamMembership().clear();
			getTeamMembership().addAll((Collection<? extends Team>) newValue);
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
		case OgPackage.ATHLETE__INVITED_COMMITTEE:
			setInvitedCommittee((InvitedCommittee) null);
			return;
		case OgPackage.ATHLETE__AGE:
			setAge(AGE_EDEFAULT);
			return;
		case OgPackage.ATHLETE__WEIGHT:
			setWeight(WEIGHT_EDEFAULT);
			return;
		case OgPackage.ATHLETE__TEAM_MEMBERSHIP:
			getTeamMembership().clear();
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
		case OgPackage.ATHLETE__INVITED_COMMITTEE:
			return getInvitedCommittee() != null;
		case OgPackage.ATHLETE__AGE:
			return age != AGE_EDEFAULT;
		case OgPackage.ATHLETE__WEIGHT:
			return weight != WEIGHT_EDEFAULT;
		case OgPackage.ATHLETE__TEAM_MEMBERSHIP:
			return teamMembership != null && !teamMembership.isEmpty();
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
		case OgPackage.ATHLETE___GET_INVITED_COMMITTE:
			getInvitedCommitte();
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
		result.append(" (age: ");
		result.append(age);
		result.append(", weight: ");
		result.append(weight);
		result.append(')');
		return result.toString();
	}

} //AthleteImpl

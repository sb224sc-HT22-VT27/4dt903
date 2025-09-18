/**
 */
package og.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import og.OgPackage;
import og.Team;
import og.TeamEvent;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Team Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link og.impl.TeamEventImpl#getGoldMedal <em>Gold Medal</em>}</li>
 *   <li>{@link og.impl.TeamEventImpl#getSilverMedal <em>Silver Medal</em>}</li>
 *   <li>{@link og.impl.TeamEventImpl#getBronzeMedal <em>Bronze Medal</em>}</li>
 *   <li>{@link og.impl.TeamEventImpl#getParticipants <em>Participants</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TeamEventImpl extends EventImpl implements TeamEvent {
	/**
	 * The cached value of the '{@link #getGoldMedal() <em>Gold Medal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoldMedal()
	 * @generated
	 * @ordered
	 */
	protected Team goldMedal;

	/**
	 * The cached value of the '{@link #getSilverMedal() <em>Silver Medal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSilverMedal()
	 * @generated
	 * @ordered
	 */
	protected Team silverMedal;

	/**
	 * The cached value of the '{@link #getBronzeMedal() <em>Bronze Medal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBronzeMedal()
	 * @generated
	 * @ordered
	 */
	protected Team bronzeMedal;

	/**
	 * The cached value of the '{@link #getParticipants() <em>Participants</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipants()
	 * @generated
	 * @ordered
	 */
	protected EList<Team> participants;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TeamEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OgPackage.Literals.TEAM_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Team getGoldMedal() {
		if (goldMedal != null && goldMedal.eIsProxy()) {
			InternalEObject oldGoldMedal = (InternalEObject) goldMedal;
			goldMedal = (Team) eResolveProxy(oldGoldMedal);
			if (goldMedal != oldGoldMedal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OgPackage.TEAM_EVENT__GOLD_MEDAL,
							oldGoldMedal, goldMedal));
			}
		}
		return goldMedal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Team basicGetGoldMedal() {
		return goldMedal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGoldMedal(Team newGoldMedal) {
		Team oldGoldMedal = goldMedal;
		goldMedal = newGoldMedal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OgPackage.TEAM_EVENT__GOLD_MEDAL, oldGoldMedal,
					goldMedal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Team getSilverMedal() {
		if (silverMedal != null && silverMedal.eIsProxy()) {
			InternalEObject oldSilverMedal = (InternalEObject) silverMedal;
			silverMedal = (Team) eResolveProxy(oldSilverMedal);
			if (silverMedal != oldSilverMedal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OgPackage.TEAM_EVENT__SILVER_MEDAL,
							oldSilverMedal, silverMedal));
			}
		}
		return silverMedal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Team basicGetSilverMedal() {
		return silverMedal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSilverMedal(Team newSilverMedal) {
		Team oldSilverMedal = silverMedal;
		silverMedal = newSilverMedal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OgPackage.TEAM_EVENT__SILVER_MEDAL, oldSilverMedal,
					silverMedal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Team getBronzeMedal() {
		if (bronzeMedal != null && bronzeMedal.eIsProxy()) {
			InternalEObject oldBronzeMedal = (InternalEObject) bronzeMedal;
			bronzeMedal = (Team) eResolveProxy(oldBronzeMedal);
			if (bronzeMedal != oldBronzeMedal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OgPackage.TEAM_EVENT__BRONZE_MEDAL,
							oldBronzeMedal, bronzeMedal));
			}
		}
		return bronzeMedal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Team basicGetBronzeMedal() {
		return bronzeMedal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBronzeMedal(Team newBronzeMedal) {
		Team oldBronzeMedal = bronzeMedal;
		bronzeMedal = newBronzeMedal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OgPackage.TEAM_EVENT__BRONZE_MEDAL, oldBronzeMedal,
					bronzeMedal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Team> getParticipants() {
		if (participants == null) {
			participants = new EObjectResolvingEList<Team>(Team.class, this, OgPackage.TEAM_EVENT__PARTICIPANTS);
		}
		return participants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGold(Team theGold) {
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
	public void setSilver(Team theSilver) {
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
	public void setBronze(Team theBronze) {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case OgPackage.TEAM_EVENT__GOLD_MEDAL:
			if (resolve)
				return getGoldMedal();
			return basicGetGoldMedal();
		case OgPackage.TEAM_EVENT__SILVER_MEDAL:
			if (resolve)
				return getSilverMedal();
			return basicGetSilverMedal();
		case OgPackage.TEAM_EVENT__BRONZE_MEDAL:
			if (resolve)
				return getBronzeMedal();
			return basicGetBronzeMedal();
		case OgPackage.TEAM_EVENT__PARTICIPANTS:
			return getParticipants();
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
		case OgPackage.TEAM_EVENT__GOLD_MEDAL:
			setGoldMedal((Team) newValue);
			return;
		case OgPackage.TEAM_EVENT__SILVER_MEDAL:
			setSilverMedal((Team) newValue);
			return;
		case OgPackage.TEAM_EVENT__BRONZE_MEDAL:
			setBronzeMedal((Team) newValue);
			return;
		case OgPackage.TEAM_EVENT__PARTICIPANTS:
			getParticipants().clear();
			getParticipants().addAll((Collection<? extends Team>) newValue);
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
		case OgPackage.TEAM_EVENT__GOLD_MEDAL:
			setGoldMedal((Team) null);
			return;
		case OgPackage.TEAM_EVENT__SILVER_MEDAL:
			setSilverMedal((Team) null);
			return;
		case OgPackage.TEAM_EVENT__BRONZE_MEDAL:
			setBronzeMedal((Team) null);
			return;
		case OgPackage.TEAM_EVENT__PARTICIPANTS:
			getParticipants().clear();
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
		case OgPackage.TEAM_EVENT__GOLD_MEDAL:
			return goldMedal != null;
		case OgPackage.TEAM_EVENT__SILVER_MEDAL:
			return silverMedal != null;
		case OgPackage.TEAM_EVENT__BRONZE_MEDAL:
			return bronzeMedal != null;
		case OgPackage.TEAM_EVENT__PARTICIPANTS:
			return participants != null && !participants.isEmpty();
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
		case OgPackage.TEAM_EVENT___SET_GOLD__TEAM:
			setGold((Team) arguments.get(0));
			return null;
		case OgPackage.TEAM_EVENT___SET_SILVER__TEAM:
			setSilver((Team) arguments.get(0));
			return null;
		case OgPackage.TEAM_EVENT___SET_BRONZE__TEAM:
			setBronze((Team) arguments.get(0));
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //TeamEventImpl

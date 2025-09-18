/**
 */
package olympics.impl;

import java.util.Collection;

import olympics.Athlete;
import olympics.IndividualEvent;
import olympics.OlympicsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Individual Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link olympics.impl.IndividualEventImpl#getGoldMedal <em>Gold Medal</em>}</li>
 *   <li>{@link olympics.impl.IndividualEventImpl#getBronzeMedal <em>Bronze Medal</em>}</li>
 *   <li>{@link olympics.impl.IndividualEventImpl#getSilverMedal <em>Silver Medal</em>}</li>
 *   <li>{@link olympics.impl.IndividualEventImpl#getParticipants <em>Participants</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IndividualEventImpl extends EventImpl implements IndividualEvent {
	/**
	 * The cached value of the '{@link #getGoldMedal() <em>Gold Medal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoldMedal()
	 * @generated
	 * @ordered
	 */
	protected Athlete goldMedal;

	/**
	 * The cached value of the '{@link #getBronzeMedal() <em>Bronze Medal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBronzeMedal()
	 * @generated
	 * @ordered
	 */
	protected Athlete bronzeMedal;

	/**
	 * The cached value of the '{@link #getSilverMedal() <em>Silver Medal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSilverMedal()
	 * @generated
	 * @ordered
	 */
	protected Athlete silverMedal;

	/**
	 * The cached value of the '{@link #getParticipants() <em>Participants</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipants()
	 * @generated
	 * @ordered
	 */
	protected EList<Athlete> participants;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IndividualEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OlympicsPackage.Literals.INDIVIDUAL_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Athlete getGoldMedal() {
		if (goldMedal != null && goldMedal.eIsProxy()) {
			InternalEObject oldGoldMedal = (InternalEObject)goldMedal;
			goldMedal = (Athlete)eResolveProxy(oldGoldMedal);
			if (goldMedal != oldGoldMedal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OlympicsPackage.INDIVIDUAL_EVENT__GOLD_MEDAL, oldGoldMedal, goldMedal));
			}
		}
		return goldMedal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Athlete basicGetGoldMedal() {
		return goldMedal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGoldMedal(Athlete newGoldMedal) {
		Athlete oldGoldMedal = goldMedal;
		goldMedal = newGoldMedal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OlympicsPackage.INDIVIDUAL_EVENT__GOLD_MEDAL, oldGoldMedal, goldMedal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Athlete getBronzeMedal() {
		if (bronzeMedal != null && bronzeMedal.eIsProxy()) {
			InternalEObject oldBronzeMedal = (InternalEObject)bronzeMedal;
			bronzeMedal = (Athlete)eResolveProxy(oldBronzeMedal);
			if (bronzeMedal != oldBronzeMedal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OlympicsPackage.INDIVIDUAL_EVENT__BRONZE_MEDAL, oldBronzeMedal, bronzeMedal));
			}
		}
		return bronzeMedal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Athlete basicGetBronzeMedal() {
		return bronzeMedal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBronzeMedal(Athlete newBronzeMedal) {
		Athlete oldBronzeMedal = bronzeMedal;
		bronzeMedal = newBronzeMedal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OlympicsPackage.INDIVIDUAL_EVENT__BRONZE_MEDAL, oldBronzeMedal, bronzeMedal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Athlete getSilverMedal() {
		if (silverMedal != null && silverMedal.eIsProxy()) {
			InternalEObject oldSilverMedal = (InternalEObject)silverMedal;
			silverMedal = (Athlete)eResolveProxy(oldSilverMedal);
			if (silverMedal != oldSilverMedal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OlympicsPackage.INDIVIDUAL_EVENT__SILVER_MEDAL, oldSilverMedal, silverMedal));
			}
		}
		return silverMedal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Athlete basicGetSilverMedal() {
		return silverMedal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSilverMedal(Athlete newSilverMedal) {
		Athlete oldSilverMedal = silverMedal;
		silverMedal = newSilverMedal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OlympicsPackage.INDIVIDUAL_EVENT__SILVER_MEDAL, oldSilverMedal, silverMedal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Athlete> getParticipants() {
		if (participants == null) {
			participants = new EObjectResolvingEList<Athlete>(Athlete.class, this, OlympicsPackage.INDIVIDUAL_EVENT__PARTICIPANTS);
		}
		return participants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OlympicsPackage.INDIVIDUAL_EVENT__GOLD_MEDAL:
				if (resolve) return getGoldMedal();
				return basicGetGoldMedal();
			case OlympicsPackage.INDIVIDUAL_EVENT__BRONZE_MEDAL:
				if (resolve) return getBronzeMedal();
				return basicGetBronzeMedal();
			case OlympicsPackage.INDIVIDUAL_EVENT__SILVER_MEDAL:
				if (resolve) return getSilverMedal();
				return basicGetSilverMedal();
			case OlympicsPackage.INDIVIDUAL_EVENT__PARTICIPANTS:
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
			case OlympicsPackage.INDIVIDUAL_EVENT__GOLD_MEDAL:
				setGoldMedal((Athlete)newValue);
				return;
			case OlympicsPackage.INDIVIDUAL_EVENT__BRONZE_MEDAL:
				setBronzeMedal((Athlete)newValue);
				return;
			case OlympicsPackage.INDIVIDUAL_EVENT__SILVER_MEDAL:
				setSilverMedal((Athlete)newValue);
				return;
			case OlympicsPackage.INDIVIDUAL_EVENT__PARTICIPANTS:
				getParticipants().clear();
				getParticipants().addAll((Collection<? extends Athlete>)newValue);
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
			case OlympicsPackage.INDIVIDUAL_EVENT__GOLD_MEDAL:
				setGoldMedal((Athlete)null);
				return;
			case OlympicsPackage.INDIVIDUAL_EVENT__BRONZE_MEDAL:
				setBronzeMedal((Athlete)null);
				return;
			case OlympicsPackage.INDIVIDUAL_EVENT__SILVER_MEDAL:
				setSilverMedal((Athlete)null);
				return;
			case OlympicsPackage.INDIVIDUAL_EVENT__PARTICIPANTS:
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
			case OlympicsPackage.INDIVIDUAL_EVENT__GOLD_MEDAL:
				return goldMedal != null;
			case OlympicsPackage.INDIVIDUAL_EVENT__BRONZE_MEDAL:
				return bronzeMedal != null;
			case OlympicsPackage.INDIVIDUAL_EVENT__SILVER_MEDAL:
				return silverMedal != null;
			case OlympicsPackage.INDIVIDUAL_EVENT__PARTICIPANTS:
				return participants != null && !participants.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IndividualEventImpl

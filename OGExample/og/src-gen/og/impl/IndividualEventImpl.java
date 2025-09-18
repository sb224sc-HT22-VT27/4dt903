/**
 */
package og.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import og.Athlete;
import og.IndividualEvent;
import og.OgPackage;

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
 *   <li>{@link og.impl.IndividualEventImpl#getParticipants <em>Participants</em>}</li>
 *   <li>{@link og.impl.IndividualEventImpl#getGoldMedal <em>Gold Medal</em>}</li>
 *   <li>{@link og.impl.IndividualEventImpl#getSilverMedal <em>Silver Medal</em>}</li>
 *   <li>{@link og.impl.IndividualEventImpl#getBronzeMedal <em>Bronze Medal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IndividualEventImpl extends EventImpl implements IndividualEvent {
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
	 * The cached value of the '{@link #getGoldMedal() <em>Gold Medal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoldMedal()
	 * @generated
	 * @ordered
	 */
	protected Athlete goldMedal;

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
	 * The cached value of the '{@link #getBronzeMedal() <em>Bronze Medal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBronzeMedal()
	 * @generated
	 * @ordered
	 */
	protected Athlete bronzeMedal;

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
		return OgPackage.Literals.INDIVIDUAL_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Athlete> getParticipants() {
		if (participants == null) {
			participants = new EObjectResolvingEList<Athlete>(Athlete.class, this,
					OgPackage.INDIVIDUAL_EVENT__PARTICIPANTS);
		}
		return participants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Athlete getGoldMedal() {
		if (goldMedal != null && goldMedal.eIsProxy()) {
			InternalEObject oldGoldMedal = (InternalEObject) goldMedal;
			goldMedal = (Athlete) eResolveProxy(oldGoldMedal);
			if (goldMedal != oldGoldMedal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OgPackage.INDIVIDUAL_EVENT__GOLD_MEDAL,
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
			eNotify(new ENotificationImpl(this, Notification.SET, OgPackage.INDIVIDUAL_EVENT__GOLD_MEDAL, oldGoldMedal,
					goldMedal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Athlete getSilverMedal() {
		if (silverMedal != null && silverMedal.eIsProxy()) {
			InternalEObject oldSilverMedal = (InternalEObject) silverMedal;
			silverMedal = (Athlete) eResolveProxy(oldSilverMedal);
			if (silverMedal != oldSilverMedal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OgPackage.INDIVIDUAL_EVENT__SILVER_MEDAL,
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
			eNotify(new ENotificationImpl(this, Notification.SET, OgPackage.INDIVIDUAL_EVENT__SILVER_MEDAL,
					oldSilverMedal, silverMedal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Athlete getBronzeMedal() {
		if (bronzeMedal != null && bronzeMedal.eIsProxy()) {
			InternalEObject oldBronzeMedal = (InternalEObject) bronzeMedal;
			bronzeMedal = (Athlete) eResolveProxy(oldBronzeMedal);
			if (bronzeMedal != oldBronzeMedal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OgPackage.INDIVIDUAL_EVENT__BRONZE_MEDAL,
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
			eNotify(new ENotificationImpl(this, Notification.SET, OgPackage.INDIVIDUAL_EVENT__BRONZE_MEDAL,
					oldBronzeMedal, bronzeMedal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBronze(Athlete theBronze) {
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
	public void setSilver(Athlete theSilver) {
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
	public void setGold(Athlete theGold) {
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
		case OgPackage.INDIVIDUAL_EVENT__PARTICIPANTS:
			return getParticipants();
		case OgPackage.INDIVIDUAL_EVENT__GOLD_MEDAL:
			if (resolve)
				return getGoldMedal();
			return basicGetGoldMedal();
		case OgPackage.INDIVIDUAL_EVENT__SILVER_MEDAL:
			if (resolve)
				return getSilverMedal();
			return basicGetSilverMedal();
		case OgPackage.INDIVIDUAL_EVENT__BRONZE_MEDAL:
			if (resolve)
				return getBronzeMedal();
			return basicGetBronzeMedal();
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
		case OgPackage.INDIVIDUAL_EVENT__PARTICIPANTS:
			getParticipants().clear();
			getParticipants().addAll((Collection<? extends Athlete>) newValue);
			return;
		case OgPackage.INDIVIDUAL_EVENT__GOLD_MEDAL:
			setGoldMedal((Athlete) newValue);
			return;
		case OgPackage.INDIVIDUAL_EVENT__SILVER_MEDAL:
			setSilverMedal((Athlete) newValue);
			return;
		case OgPackage.INDIVIDUAL_EVENT__BRONZE_MEDAL:
			setBronzeMedal((Athlete) newValue);
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
		case OgPackage.INDIVIDUAL_EVENT__PARTICIPANTS:
			getParticipants().clear();
			return;
		case OgPackage.INDIVIDUAL_EVENT__GOLD_MEDAL:
			setGoldMedal((Athlete) null);
			return;
		case OgPackage.INDIVIDUAL_EVENT__SILVER_MEDAL:
			setSilverMedal((Athlete) null);
			return;
		case OgPackage.INDIVIDUAL_EVENT__BRONZE_MEDAL:
			setBronzeMedal((Athlete) null);
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
		case OgPackage.INDIVIDUAL_EVENT__PARTICIPANTS:
			return participants != null && !participants.isEmpty();
		case OgPackage.INDIVIDUAL_EVENT__GOLD_MEDAL:
			return goldMedal != null;
		case OgPackage.INDIVIDUAL_EVENT__SILVER_MEDAL:
			return silverMedal != null;
		case OgPackage.INDIVIDUAL_EVENT__BRONZE_MEDAL:
			return bronzeMedal != null;
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
		case OgPackage.INDIVIDUAL_EVENT___SET_BRONZE__ATHLETE:
			setBronze((Athlete) arguments.get(0));
			return null;
		case OgPackage.INDIVIDUAL_EVENT___SET_SILVER__ATHLETE:
			setSilver((Athlete) arguments.get(0));
			return null;
		case OgPackage.INDIVIDUAL_EVENT___SET_GOLD__ATHLETE:
			setGold((Athlete) arguments.get(0));
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //IndividualEventImpl

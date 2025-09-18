/**
 */
package og;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Individual Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link og.IndividualEvent#getParticipants <em>Participants</em>}</li>
 *   <li>{@link og.IndividualEvent#getGoldMedal <em>Gold Medal</em>}</li>
 *   <li>{@link og.IndividualEvent#getSilverMedal <em>Silver Medal</em>}</li>
 *   <li>{@link og.IndividualEvent#getBronzeMedal <em>Bronze Medal</em>}</li>
 * </ul>
 *
 * @see og.OgPackage#getIndividualEvent()
 * @model
 * @generated
 */
public interface IndividualEvent extends Event {
	/**
	 * Returns the value of the '<em><b>Participants</b></em>' reference list.
	 * The list contents are of type {@link og.Athlete}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participants</em>' reference list.
	 * @see og.OgPackage#getIndividualEvent_Participants()
	 * @model
	 * @generated
	 */
	EList<Athlete> getParticipants();

	/**
	 * Returns the value of the '<em><b>Gold Medal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gold Medal</em>' reference.
	 * @see #setGoldMedal(Athlete)
	 * @see og.OgPackage#getIndividualEvent_GoldMedal()
	 * @model
	 * @generated
	 */
	Athlete getGoldMedal();

	/**
	 * Sets the value of the '{@link og.IndividualEvent#getGoldMedal <em>Gold Medal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gold Medal</em>' reference.
	 * @see #getGoldMedal()
	 * @generated
	 */
	void setGoldMedal(Athlete value);

	/**
	 * Returns the value of the '<em><b>Silver Medal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Silver Medal</em>' reference.
	 * @see #setSilverMedal(Athlete)
	 * @see og.OgPackage#getIndividualEvent_SilverMedal()
	 * @model
	 * @generated
	 */
	Athlete getSilverMedal();

	/**
	 * Sets the value of the '{@link og.IndividualEvent#getSilverMedal <em>Silver Medal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Silver Medal</em>' reference.
	 * @see #getSilverMedal()
	 * @generated
	 */
	void setSilverMedal(Athlete value);

	/**
	 * Returns the value of the '<em><b>Bronze Medal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bronze Medal</em>' reference.
	 * @see #setBronzeMedal(Athlete)
	 * @see og.OgPackage#getIndividualEvent_BronzeMedal()
	 * @model
	 * @generated
	 */
	Athlete getBronzeMedal();

	/**
	 * Sets the value of the '{@link og.IndividualEvent#getBronzeMedal <em>Bronze Medal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bronze Medal</em>' reference.
	 * @see #getBronzeMedal()
	 * @generated
	 */
	void setBronzeMedal(Athlete value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setBronze(Athlete theBronze);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setSilver(Athlete theSilver);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setGold(Athlete theGold);

} // IndividualEvent

/**
 */
package olympics;

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
 *   <li>{@link olympics.IndividualEvent#getGoldMedal <em>Gold Medal</em>}</li>
 *   <li>{@link olympics.IndividualEvent#getBronzeMedal <em>Bronze Medal</em>}</li>
 *   <li>{@link olympics.IndividualEvent#getSilverMedal <em>Silver Medal</em>}</li>
 *   <li>{@link olympics.IndividualEvent#getParticipants <em>Participants</em>}</li>
 * </ul>
 *
 * @see olympics.OlympicsPackage#getIndividualEvent()
 * @model
 * @generated
 */
public interface IndividualEvent extends Event {
	/**
	 * Returns the value of the '<em><b>Gold Medal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gold Medal</em>' reference.
	 * @see #setGoldMedal(Athlete)
	 * @see olympics.OlympicsPackage#getIndividualEvent_GoldMedal()
	 * @model
	 * @generated
	 */
	Athlete getGoldMedal();

	/**
	 * Sets the value of the '{@link olympics.IndividualEvent#getGoldMedal <em>Gold Medal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gold Medal</em>' reference.
	 * @see #getGoldMedal()
	 * @generated
	 */
	void setGoldMedal(Athlete value);

	/**
	 * Returns the value of the '<em><b>Bronze Medal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bronze Medal</em>' reference.
	 * @see #setBronzeMedal(Athlete)
	 * @see olympics.OlympicsPackage#getIndividualEvent_BronzeMedal()
	 * @model
	 * @generated
	 */
	Athlete getBronzeMedal();

	/**
	 * Sets the value of the '{@link olympics.IndividualEvent#getBronzeMedal <em>Bronze Medal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bronze Medal</em>' reference.
	 * @see #getBronzeMedal()
	 * @generated
	 */
	void setBronzeMedal(Athlete value);

	/**
	 * Returns the value of the '<em><b>Silver Medal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Silver Medal</em>' reference.
	 * @see #setSilverMedal(Athlete)
	 * @see olympics.OlympicsPackage#getIndividualEvent_SilverMedal()
	 * @model
	 * @generated
	 */
	Athlete getSilverMedal();

	/**
	 * Sets the value of the '{@link olympics.IndividualEvent#getSilverMedal <em>Silver Medal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Silver Medal</em>' reference.
	 * @see #getSilverMedal()
	 * @generated
	 */
	void setSilverMedal(Athlete value);

	/**
	 * Returns the value of the '<em><b>Participants</b></em>' reference list.
	 * The list contents are of type {@link olympics.Athlete}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participants</em>' reference list.
	 * @see olympics.OlympicsPackage#getIndividualEvent_Participants()
	 * @model
	 * @generated
	 */
	EList<Athlete> getParticipants();

} // IndividualEvent

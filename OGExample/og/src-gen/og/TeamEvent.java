/**
 */
package og;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Team Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link og.TeamEvent#getGoldMedal <em>Gold Medal</em>}</li>
 *   <li>{@link og.TeamEvent#getSilverMedal <em>Silver Medal</em>}</li>
 *   <li>{@link og.TeamEvent#getBronzeMedal <em>Bronze Medal</em>}</li>
 *   <li>{@link og.TeamEvent#getParticipants <em>Participants</em>}</li>
 * </ul>
 *
 * @see og.OgPackage#getTeamEvent()
 * @model
 * @generated
 */
public interface TeamEvent extends Event {
	/**
	 * Returns the value of the '<em><b>Gold Medal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gold Medal</em>' reference.
	 * @see #setGoldMedal(Team)
	 * @see og.OgPackage#getTeamEvent_GoldMedal()
	 * @model
	 * @generated
	 */
	Team getGoldMedal();

	/**
	 * Sets the value of the '{@link og.TeamEvent#getGoldMedal <em>Gold Medal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gold Medal</em>' reference.
	 * @see #getGoldMedal()
	 * @generated
	 */
	void setGoldMedal(Team value);

	/**
	 * Returns the value of the '<em><b>Silver Medal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Silver Medal</em>' reference.
	 * @see #setSilverMedal(Team)
	 * @see og.OgPackage#getTeamEvent_SilverMedal()
	 * @model
	 * @generated
	 */
	Team getSilverMedal();

	/**
	 * Sets the value of the '{@link og.TeamEvent#getSilverMedal <em>Silver Medal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Silver Medal</em>' reference.
	 * @see #getSilverMedal()
	 * @generated
	 */
	void setSilverMedal(Team value);

	/**
	 * Returns the value of the '<em><b>Bronze Medal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bronze Medal</em>' reference.
	 * @see #setBronzeMedal(Team)
	 * @see og.OgPackage#getTeamEvent_BronzeMedal()
	 * @model
	 * @generated
	 */
	Team getBronzeMedal();

	/**
	 * Sets the value of the '{@link og.TeamEvent#getBronzeMedal <em>Bronze Medal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bronze Medal</em>' reference.
	 * @see #getBronzeMedal()
	 * @generated
	 */
	void setBronzeMedal(Team value);

	/**
	 * Returns the value of the '<em><b>Participants</b></em>' reference list.
	 * The list contents are of type {@link og.Team}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participants</em>' reference list.
	 * @see og.OgPackage#getTeamEvent_Participants()
	 * @model
	 * @generated
	 */
	EList<Team> getParticipants();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setGold(Team theGold);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setSilver(Team theSilver);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setBronze(Team theBronze);

} // TeamEvent

/**
 */
package olympics;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Invited Committee</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link olympics.InvitedCommittee#getName <em>Name</em>}</li>
 *   <li>{@link olympics.InvitedCommittee#getPathToFlag <em>Path To Flag</em>}</li>
 *   <li>{@link olympics.InvitedCommittee#getNumberOfGoldMedals <em>Number Of Gold Medals</em>}</li>
 *   <li>{@link olympics.InvitedCommittee#getAthletes <em>Athletes</em>}</li>
 *   <li>{@link olympics.InvitedCommittee#getTeams <em>Teams</em>}</li>
 * </ul>
 *
 * @see olympics.OlympicsPackage#getInvitedCommittee()
 * @model
 * @generated
 */
public interface InvitedCommittee extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see olympics.OlympicsPackage#getInvitedCommittee_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link olympics.InvitedCommittee#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Path To Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path To Flag</em>' attribute.
	 * @see #setPathToFlag(String)
	 * @see olympics.OlympicsPackage#getInvitedCommittee_PathToFlag()
	 * @model
	 * @generated
	 */
	String getPathToFlag();

	/**
	 * Sets the value of the '{@link olympics.InvitedCommittee#getPathToFlag <em>Path To Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path To Flag</em>' attribute.
	 * @see #getPathToFlag()
	 * @generated
	 */
	void setPathToFlag(String value);

	/**
	 * Returns the value of the '<em><b>Number Of Gold Medals</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Gold Medals</em>' attribute.
	 * @see #setNumberOfGoldMedals(int)
	 * @see olympics.OlympicsPackage#getInvitedCommittee_NumberOfGoldMedals()
	 * @model derived="true"
	 * @generated
	 */
	int getNumberOfGoldMedals();

	/**
	 * Sets the value of the '{@link olympics.InvitedCommittee#getNumberOfGoldMedals <em>Number Of Gold Medals</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Gold Medals</em>' attribute.
	 * @see #getNumberOfGoldMedals()
	 * @generated
	 */
	void setNumberOfGoldMedals(int value);

	/**
	 * Returns the value of the '<em><b>Athletes</b></em>' containment reference list.
	 * The list contents are of type {@link olympics.Athlete}.
	 * It is bidirectional and its opposite is '{@link olympics.Athlete#getInvitedcommittee <em>Invitedcommittee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Athletes</em>' containment reference list.
	 * @see olympics.OlympicsPackage#getInvitedCommittee_Athletes()
	 * @see olympics.Athlete#getInvitedcommittee
	 * @model opposite="invitedcommittee" containment="true"
	 * @generated
	 */
	EList<Athlete> getAthletes();

	/**
	 * Returns the value of the '<em><b>Teams</b></em>' containment reference list.
	 * The list contents are of type {@link olympics.Team}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Teams</em>' containment reference list.
	 * @see olympics.OlympicsPackage#getInvitedCommittee_Teams()
	 * @model containment="true"
	 * @generated
	 */
	EList<Team> getTeams();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addTeam(Team theTeam);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addAthlete(Athlete theAthlete);

} // InvitedCommittee

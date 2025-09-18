/**
 */
package olympics;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Athlete</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link olympics.Athlete#getAge <em>Age</em>}</li>
 *   <li>{@link olympics.Athlete#getWeight <em>Weight</em>}</li>
 *   <li>{@link olympics.Athlete#getTeamMembership <em>Team Membership</em>}</li>
 *   <li>{@link olympics.Athlete#getInvitedcommittee <em>Invitedcommittee</em>}</li>
 * </ul>
 *
 * @see olympics.OlympicsPackage#getAthlete()
 * @model
 * @generated
 */
public interface Athlete extends Medalable {
	/**
	 * Returns the value of the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Age</em>' attribute.
	 * @see #setAge(int)
	 * @see olympics.OlympicsPackage#getAthlete_Age()
	 * @model
	 * @generated
	 */
	int getAge();

	/**
	 * Sets the value of the '{@link olympics.Athlete#getAge <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Age</em>' attribute.
	 * @see #getAge()
	 * @generated
	 */
	void setAge(int value);

	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(double)
	 * @see olympics.OlympicsPackage#getAthlete_Weight()
	 * @model
	 * @generated
	 */
	double getWeight();

	/**
	 * Sets the value of the '{@link olympics.Athlete#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(double value);

	/**
	 * Returns the value of the '<em><b>Team Membership</b></em>' reference list.
	 * The list contents are of type {@link olympics.Team}.
	 * It is bidirectional and its opposite is '{@link olympics.Team#getTeamMembers <em>Team Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Team Membership</em>' reference list.
	 * @see olympics.OlympicsPackage#getAthlete_TeamMembership()
	 * @see olympics.Team#getTeamMembers
	 * @model opposite="teamMembers"
	 * @generated
	 */
	EList<Team> getTeamMembership();

	/**
	 * Returns the value of the '<em><b>Invitedcommittee</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link olympics.InvitedCommittee#getAthletes <em>Athletes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invitedcommittee</em>' container reference.
	 * @see #setInvitedcommittee(InvitedCommittee)
	 * @see olympics.OlympicsPackage#getAthlete_Invitedcommittee()
	 * @see olympics.InvitedCommittee#getAthletes
	 * @model opposite="athletes" transient="false"
	 * @generated
	 */
	InvitedCommittee getInvitedcommittee();

	/**
	 * Sets the value of the '{@link olympics.Athlete#getInvitedcommittee <em>Invitedcommittee</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invitedcommittee</em>' container reference.
	 * @see #getInvitedcommittee()
	 * @generated
	 */
	void setInvitedcommittee(InvitedCommittee value);

} // Athlete

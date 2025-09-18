/**
 */
package og;

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
 *   <li>{@link og.Athlete#getInvitedCommittee <em>Invited Committee</em>}</li>
 *   <li>{@link og.Athlete#getAge <em>Age</em>}</li>
 *   <li>{@link og.Athlete#getWeight <em>Weight</em>}</li>
 *   <li>{@link og.Athlete#getTeamMembership <em>Team Membership</em>}</li>
 * </ul>
 *
 * @see og.OgPackage#getAthlete()
 * @model
 * @generated
 */
public interface Athlete extends Medalable {
	/**
	 * Returns the value of the '<em><b>Invited Committee</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link og.InvitedCommittee#getAthletes <em>Athletes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invited Committee</em>' container reference.
	 * @see #setInvitedCommittee(InvitedCommittee)
	 * @see og.OgPackage#getAthlete_InvitedCommittee()
	 * @see og.InvitedCommittee#getAthletes
	 * @model opposite="athletes" transient="false"
	 * @generated
	 */
	InvitedCommittee getInvitedCommittee();

	/**
	 * Sets the value of the '{@link og.Athlete#getInvitedCommittee <em>Invited Committee</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invited Committee</em>' container reference.
	 * @see #getInvitedCommittee()
	 * @generated
	 */
	void setInvitedCommittee(InvitedCommittee value);

	/**
	 * Returns the value of the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Age</em>' attribute.
	 * @see #setAge(int)
	 * @see og.OgPackage#getAthlete_Age()
	 * @model
	 * @generated
	 */
	int getAge();

	/**
	 * Sets the value of the '{@link og.Athlete#getAge <em>Age</em>}' attribute.
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
	 * @see og.OgPackage#getAthlete_Weight()
	 * @model
	 * @generated
	 */
	double getWeight();

	/**
	 * Sets the value of the '{@link og.Athlete#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(double value);

	/**
	 * Returns the value of the '<em><b>Team Membership</b></em>' reference list.
	 * The list contents are of type {@link og.Team}.
	 * It is bidirectional and its opposite is '{@link og.Team#getTeamMembers <em>Team Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Team Membership</em>' reference list.
	 * @see og.OgPackage#getAthlete_TeamMembership()
	 * @see og.Team#getTeamMembers
	 * @model opposite="teamMembers"
	 * @generated
	 */
	EList<Team> getTeamMembership();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	void getInvitedCommitte();

} // Athlete

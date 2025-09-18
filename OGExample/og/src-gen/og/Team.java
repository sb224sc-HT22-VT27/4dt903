/**
 */
package og;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Team</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link og.Team#getTeamMembers <em>Team Members</em>}</li>
 * </ul>
 *
 * @see og.OgPackage#getTeam()
 * @model
 * @generated
 */
public interface Team extends Medalable {
	/**
	 * Returns the value of the '<em><b>Team Members</b></em>' reference list.
	 * The list contents are of type {@link og.Athlete}.
	 * It is bidirectional and its opposite is '{@link og.Athlete#getTeamMembership <em>Team Membership</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Team Members</em>' reference list.
	 * @see og.OgPackage#getTeam_TeamMembers()
	 * @see og.Athlete#getTeamMembership
	 * @model opposite="teamMembership"
	 * @generated
	 */
	EList<Athlete> getTeamMembers();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addMember(Athlete theAthlete);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	void getInvitedCommitte();

} // Team

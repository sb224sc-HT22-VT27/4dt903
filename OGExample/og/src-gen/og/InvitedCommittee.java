/**
 */
package og;

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
 *   <li>{@link og.InvitedCommittee#getName <em>Name</em>}</li>
 *   <li>{@link og.InvitedCommittee#getPathToFlagImage <em>Path To Flag Image</em>}</li>
 *   <li>{@link og.InvitedCommittee#getNumberOfGoldMedals <em>Number Of Gold Medals</em>}</li>
 *   <li>{@link og.InvitedCommittee#getTeam <em>Team</em>}</li>
 *   <li>{@link og.InvitedCommittee#getAthletes <em>Athletes</em>}</li>
 * </ul>
 *
 * @see og.OgPackage#getInvitedCommittee()
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
	 * @see og.OgPackage#getInvitedCommittee_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link og.InvitedCommittee#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Path To Flag Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path To Flag Image</em>' attribute.
	 * @see #setPathToFlagImage(String)
	 * @see og.OgPackage#getInvitedCommittee_PathToFlagImage()
	 * @model
	 * @generated
	 */
	String getPathToFlagImage();

	/**
	 * Sets the value of the '{@link og.InvitedCommittee#getPathToFlagImage <em>Path To Flag Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path To Flag Image</em>' attribute.
	 * @see #getPathToFlagImage()
	 * @generated
	 */
	void setPathToFlagImage(String value);

	/**
	 * Returns the value of the '<em><b>Number Of Gold Medals</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Gold Medals</em>' attribute.
	 * @see #setNumberOfGoldMedals(int)
	 * @see og.OgPackage#getInvitedCommittee_NumberOfGoldMedals()
	 * @model derived="true"
	 * @generated
	 */
	int getNumberOfGoldMedals();

	/**
	 * Sets the value of the '{@link og.InvitedCommittee#getNumberOfGoldMedals <em>Number Of Gold Medals</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Gold Medals</em>' attribute.
	 * @see #getNumberOfGoldMedals()
	 * @generated
	 */
	void setNumberOfGoldMedals(int value);

	/**
	 * Returns the value of the '<em><b>Team</b></em>' containment reference list.
	 * The list contents are of type {@link og.Team}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Team</em>' containment reference list.
	 * @see og.OgPackage#getInvitedCommittee_Team()
	 * @model containment="true"
	 * @generated
	 */
	EList<Team> getTeam();

	/**
	 * Returns the value of the '<em><b>Athletes</b></em>' containment reference list.
	 * The list contents are of type {@link og.Athlete}.
	 * It is bidirectional and its opposite is '{@link og.Athlete#getInvitedCommittee <em>Invited Committee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Athletes</em>' containment reference list.
	 * @see og.OgPackage#getInvitedCommittee_Athletes()
	 * @see og.Athlete#getInvitedCommittee
	 * @model opposite="invitedCommittee" containment="true"
	 * @generated
	 */
	EList<Athlete> getAthletes();

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

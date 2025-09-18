/**
 */
package olympics;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see olympics.OlympicsPackage
 * @generated
 */
public interface OlympicsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OlympicsFactory eINSTANCE = olympics.impl.OlympicsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Olympic Games</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Olympic Games</em>'.
	 * @generated
	 */
	OlympicGames createOlympicGames();

	/**
	 * Returns a new object of class '<em>Invited Committee</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Invited Committee</em>'.
	 * @generated
	 */
	InvitedCommittee createInvitedCommittee();

	/**
	 * Returns a new object of class '<em>Discipline</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Discipline</em>'.
	 * @generated
	 */
	Discipline createDiscipline();

	/**
	 * Returns a new object of class '<em>Team</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Team</em>'.
	 * @generated
	 */
	Team createTeam();

	/**
	 * Returns a new object of class '<em>Athlete</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Athlete</em>'.
	 * @generated
	 */
	Athlete createAthlete();

	/**
	 * Returns a new object of class '<em>Team Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Team Event</em>'.
	 * @generated
	 */
	TeamEvent createTeamEvent();

	/**
	 * Returns a new object of class '<em>Individual Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Individual Event</em>'.
	 * @generated
	 */
	IndividualEvent createIndividualEvent();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	OlympicsPackage getOlympicsPackage();

} //OlympicsFactory

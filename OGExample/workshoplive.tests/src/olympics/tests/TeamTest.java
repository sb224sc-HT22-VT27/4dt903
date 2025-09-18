/**
 */
package olympics.tests;

import junit.textui.TestRunner;

import olympics.OlympicsFactory;
import olympics.Team;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Team</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link olympics.Team#addMember(olympics.Athlete) <em>Add Member</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class TeamTest extends MedalableTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TeamTest.class);
	}

	/**
	 * Constructs a new Team test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TeamTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Team test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Team getFixture() {
		return (Team)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OlympicsFactory.eINSTANCE.createTeam());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	/**
	 * Tests the '{@link olympics.Team#addMember(olympics.Athlete) <em>Add Member</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see olympics.Team#addMember(olympics.Athlete)
	 * @generated
	 */
	public void testAddMember__Athlete() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //TeamTest

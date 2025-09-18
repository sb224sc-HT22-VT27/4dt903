/**
 */
package olympics.tests;

import junit.textui.TestRunner;

import olympics.OlympicsFactory;
import olympics.TeamEvent;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Team Event</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TeamEventTest extends EventTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TeamEventTest.class);
	}

	/**
	 * Constructs a new Team Event test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TeamEventTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Team Event test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TeamEvent getFixture() {
		return (TeamEvent)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OlympicsFactory.eINSTANCE.createTeamEvent());
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

} //TeamEventTest

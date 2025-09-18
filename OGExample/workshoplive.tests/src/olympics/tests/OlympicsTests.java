/**
 */
package olympics.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>olympics</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class OlympicsTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new OlympicsTests("olympics Tests");
		suite.addTestSuite(OlympicGamesTest.class);
		suite.addTestSuite(InvitedCommitteeTest.class);
		suite.addTestSuite(DisciplineTest.class);
		suite.addTestSuite(TeamTest.class);
		suite.addTestSuite(TeamEventTest.class);
		suite.addTestSuite(IndividualEventTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OlympicsTests(String name) {
		super(name);
	}

} //OlympicsTests

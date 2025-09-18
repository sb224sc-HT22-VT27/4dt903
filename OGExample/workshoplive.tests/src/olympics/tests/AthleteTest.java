/**
 */
package olympics.tests;

import junit.textui.TestRunner;

import olympics.Athlete;
import olympics.OlympicsFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Athlete</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AthleteTest extends MedalableTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AthleteTest.class);
	}

	/**
	 * Constructs a new Athlete test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AthleteTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Athlete test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Athlete getFixture() {
		return (Athlete)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OlympicsFactory.eINSTANCE.createAthlete());
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

} //AthleteTest

/**
 */
package olympics.tests;

import junit.textui.TestRunner;

import olympics.IndividualEvent;
import olympics.OlympicsFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Individual Event</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IndividualEventTest extends EventTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IndividualEventTest.class);
	}

	/**
	 * Constructs a new Individual Event test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndividualEventTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Individual Event test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected IndividualEvent getFixture() {
		return (IndividualEvent)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OlympicsFactory.eINSTANCE.createIndividualEvent());
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

} //IndividualEventTest

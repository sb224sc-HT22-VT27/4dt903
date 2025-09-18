/**
 */
package olympics.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import olympics.Discipline;
import olympics.OlympicsFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Discipline</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link olympics.Discipline#addEvent(olympics.Event) <em>Add Event</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class DisciplineTest extends TestCase {

	/**
	 * The fixture for this Discipline test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Discipline fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DisciplineTest.class);
	}

	/**
	 * Constructs a new Discipline test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisciplineTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Discipline test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Discipline fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Discipline test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Discipline getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(OlympicsFactory.eINSTANCE.createDiscipline());
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
	 * Tests the '{@link olympics.Discipline#addEvent(olympics.Event) <em>Add Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see olympics.Discipline#addEvent(olympics.Event)
	 * @generated
	 */
	public void testAddEvent__Event() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //DisciplineTest

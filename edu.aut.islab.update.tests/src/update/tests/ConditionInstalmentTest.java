/**
 */
package update.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import update.ConditionInstalment;
import update.UpdateFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Condition Instalment</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConditionInstalmentTest extends TestCase {

	/**
	 * The fixture for this Condition Instalment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionInstalment fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ConditionInstalmentTest.class);
	}

	/**
	 * Constructs a new Condition Instalment test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionInstalmentTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Condition Instalment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ConditionInstalment fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Condition Instalment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionInstalment getFixture() {
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
		setFixture(UpdateFactory.eINSTANCE.createConditionInstalment());
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

} //ConditionInstalmentTest

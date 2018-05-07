/**
 */
package query.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import query.OutputInstalment;
import query.QueryFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Output Instalment</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OutputInstalmentTest extends TestCase {

	/**
	 * The fixture for this Output Instalment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputInstalment fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OutputInstalmentTest.class);
	}

	/**
	 * Constructs a new Output Instalment test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputInstalmentTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Output Instalment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(OutputInstalment fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Output Instalment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputInstalment getFixture() {
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
		setFixture(QueryFactory.eINSTANCE.createOutputInstalment());
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

} //OutputInstalmentTest

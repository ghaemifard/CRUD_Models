/**
 */
package query.tests;

import junit.textui.TestRunner;

import query.QueryFactory;
import query.WhereInstalment;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Where Instalment</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WhereInstalmentTest extends ConditionInstalmentTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(WhereInstalmentTest.class);
	}

	/**
	 * Constructs a new Where Instalment test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhereInstalmentTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Where Instalment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected WhereInstalment getFixture() {
		return (WhereInstalment)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QueryFactory.eINSTANCE.createWhereInstalment());
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

} //WhereInstalmentTest

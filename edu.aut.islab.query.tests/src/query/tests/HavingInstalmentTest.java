/**
 */
package query.tests;

import junit.textui.TestRunner;

import query.HavingInstalment;
import query.QueryFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Having Instalment</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class HavingInstalmentTest extends ConditionInstalmentTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(HavingInstalmentTest.class);
	}

	/**
	 * Constructs a new Having Instalment test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HavingInstalmentTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Having Instalment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected HavingInstalment getFixture() {
		return (HavingInstalment)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QueryFactory.eINSTANCE.createHavingInstalment());
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

} //HavingInstalmentTest

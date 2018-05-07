/**
 */
package query.tests;

import junit.textui.TestRunner;

import query.Junction;
import query.QueryFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Junction</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class JunctionTest extends AbstractConditionElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(JunctionTest.class);
	}

	/**
	 * Constructs a new Junction test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JunctionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Junction test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Junction getFixture() {
		return (Junction)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QueryFactory.eINSTANCE.createJunction());
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

} //JunctionTest

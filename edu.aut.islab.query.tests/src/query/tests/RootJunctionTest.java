/**
 */
package query.tests;

import junit.textui.TestRunner;

import query.QueryFactory;
import query.RootJunction;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Root Junction</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RootJunctionTest extends JunctionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RootJunctionTest.class);
	}

	/**
	 * Constructs a new Root Junction test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RootJunctionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Root Junction test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RootJunction getFixture() {
		return (RootJunction)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QueryFactory.eINSTANCE.createRootJunction());
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

} //RootJunctionTest

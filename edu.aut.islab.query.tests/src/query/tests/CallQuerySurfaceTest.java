/**
 */
package query.tests;

import junit.textui.TestRunner;

import query.CallQuerySurface;
import query.QueryFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Call Query Surface</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CallQuerySurfaceTest extends FunctionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CallQuerySurfaceTest.class);
	}

	/**
	 * Constructs a new Call Query Surface test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallQuerySurfaceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Call Query Surface test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CallQuerySurface getFixture() {
		return (CallQuerySurface)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QueryFactory.eINSTANCE.createCallQuerySurface());
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

} //CallQuerySurfaceTest

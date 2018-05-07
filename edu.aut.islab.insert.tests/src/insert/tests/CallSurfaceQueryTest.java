/**
 */
package insert.tests;

import insert.CallSurfaceQuery;
import insert.InsertFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Call Surface Query</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CallSurfaceQueryTest extends FunctionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CallSurfaceQueryTest.class);
	}

	/**
	 * Constructs a new Call Surface Query test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallSurfaceQueryTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Call Surface Query test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CallSurfaceQuery getFixture() {
		return (CallSurfaceQuery)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(InsertFactory.eINSTANCE.createCallSurfaceQuery());
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

} //CallSurfaceQueryTest

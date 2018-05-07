/**
 */
package update.tests;

import junit.textui.TestRunner;

import update.NullLiteral;
import update.UpdateFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Null Literal</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NullLiteralTest extends NodeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NullLiteralTest.class);
	}

	/**
	 * Constructs a new Null Literal test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NullLiteralTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Null Literal test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected NullLiteral getFixture() {
		return (NullLiteral)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UpdateFactory.eINSTANCE.createNullLiteral());
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

} //NullLiteralTest

/**
 */
package insert.tests;

import insert.InputBitsDef;
import insert.InsertFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Input Bits Def</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InputBitsDefTest extends InputDefTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InputBitsDefTest.class);
	}

	/**
	 * Constructs a new Input Bits Def test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputBitsDefTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Input Bits Def test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected InputBitsDef getFixture() {
		return (InputBitsDef)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(InsertFactory.eINSTANCE.createInputBitsDef());
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

} //InputBitsDefTest

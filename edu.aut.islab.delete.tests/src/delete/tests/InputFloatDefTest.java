/**
 */
package delete.tests;

import delete.DeleteFactory;
import delete.InputFloatDef;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Input Float Def</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InputFloatDefTest extends InputDefTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InputFloatDefTest.class);
	}

	/**
	 * Constructs a new Input Float Def test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputFloatDefTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Input Float Def test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected InputFloatDef getFixture() {
		return (InputFloatDef)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DeleteFactory.eINSTANCE.createInputFloatDef());
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

} //InputFloatDefTest

/**
 */
package query.tests;

import junit.textui.TestRunner;

import query.InputStringDef;
import query.QueryFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Input String Def</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InputStringDefTest extends InputDefTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InputStringDefTest.class);
	}

	/**
	 * Constructs a new Input String Def test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputStringDefTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Input String Def test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected InputStringDef getFixture() {
		return (InputStringDef)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QueryFactory.eINSTANCE.createInputStringDef());
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

} //InputStringDefTest

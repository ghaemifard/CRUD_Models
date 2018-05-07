/**
 */
package delete.tests;

import delete.DeleteFactory;
import delete.GreaterThanLink;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Greater Than Link</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GreaterThanLinkTest extends ConditionLinkTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GreaterThanLinkTest.class);
	}

	/**
	 * Constructs a new Greater Than Link test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GreaterThanLinkTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Greater Than Link test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected GreaterThanLink getFixture() {
		return (GreaterThanLink)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DeleteFactory.eINSTANCE.createGreaterThanLink());
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

} //GreaterThanLinkTest

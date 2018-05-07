/**
 */
package update.tests;

import junit.textui.TestRunner;

import update.GreaterEqualThanLink;
import update.UpdateFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Greater Equal Than Link</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GreaterEqualThanLinkTest extends ConditionLinkTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GreaterEqualThanLinkTest.class);
	}

	/**
	 * Constructs a new Greater Equal Than Link test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GreaterEqualThanLinkTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Greater Equal Than Link test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected GreaterEqualThanLink getFixture() {
		return (GreaterEqualThanLink)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UpdateFactory.eINSTANCE.createGreaterEqualThanLink());
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

} //GreaterEqualThanLinkTest

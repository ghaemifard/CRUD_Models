/**
 */
package query.tests;

import junit.textui.TestRunner;

import query.LowerEqualThanLink;
import query.QueryFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Lower Equal Than Link</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LowerEqualThanLinkTest extends ConditionLinkTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LowerEqualThanLinkTest.class);
	}

	/**
	 * Constructs a new Lower Equal Than Link test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LowerEqualThanLinkTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Lower Equal Than Link test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected LowerEqualThanLink getFixture() {
		return (LowerEqualThanLink)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QueryFactory.eINSTANCE.createLowerEqualThanLink());
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

} //LowerEqualThanLinkTest

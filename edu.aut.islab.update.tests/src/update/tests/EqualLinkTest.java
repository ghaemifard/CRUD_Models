/**
 */
package update.tests;

import junit.textui.TestRunner;

import update.EqualLink;
import update.UpdateFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Equal Link</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EqualLinkTest extends ConditionLinkTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EqualLinkTest.class);
	}

	/**
	 * Constructs a new Equal Link test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EqualLinkTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Equal Link test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EqualLink getFixture() {
		return (EqualLink)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UpdateFactory.eINSTANCE.createEqualLink());
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

} //EqualLinkTest

/**
 */
package update.tests;

import junit.textui.TestRunner;

import update.LikeLink;
import update.UpdateFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Like Link</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LikeLinkTest extends ConditionLinkTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LikeLinkTest.class);
	}

	/**
	 * Constructs a new Like Link test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LikeLinkTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Like Link test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected LikeLink getFixture() {
		return (LikeLink)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UpdateFactory.eINSTANCE.createLikeLink());
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

} //LikeLinkTest

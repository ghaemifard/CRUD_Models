/**
 */
package update.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import update.JuncRelationship;
import update.UpdateFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Junc Relationship</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class JuncRelationshipTest extends TestCase {

	/**
	 * The fixture for this Junc Relationship test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JuncRelationship fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(JuncRelationshipTest.class);
	}

	/**
	 * Constructs a new Junc Relationship test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JuncRelationshipTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Junc Relationship test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(JuncRelationship fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Junc Relationship test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JuncRelationship getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(UpdateFactory.eINSTANCE.createJuncRelationship());
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

} //JuncRelationshipTest

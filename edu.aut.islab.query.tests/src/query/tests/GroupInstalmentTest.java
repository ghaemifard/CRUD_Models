/**
 */
package query.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import query.GroupInstalment;
import query.QueryFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Group Instalment</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GroupInstalmentTest extends TestCase {

	/**
	 * The fixture for this Group Instalment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroupInstalment fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GroupInstalmentTest.class);
	}

	/**
	 * Constructs a new Group Instalment test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupInstalmentTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Group Instalment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(GroupInstalment fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Group Instalment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroupInstalment getFixture() {
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
		setFixture(QueryFactory.eINSTANCE.createGroupInstalment());
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

} //GroupInstalmentTest

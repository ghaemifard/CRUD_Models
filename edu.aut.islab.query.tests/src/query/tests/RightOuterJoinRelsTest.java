/**
 */
package query.tests;

import junit.textui.TestRunner;

import query.QueryFactory;
import query.RightOuterJoinRels;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Right Outer Join Rels</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RightOuterJoinRelsTest extends RelationSelectTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RightOuterJoinRelsTest.class);
	}

	/**
	 * Constructs a new Right Outer Join Rels test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RightOuterJoinRelsTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Right Outer Join Rels test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RightOuterJoinRels getFixture() {
		return (RightOuterJoinRels)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QueryFactory.eINSTANCE.createRightOuterJoinRels());
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

} //RightOuterJoinRelsTest

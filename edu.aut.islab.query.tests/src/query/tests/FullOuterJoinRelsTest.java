/**
 */
package query.tests;

import junit.textui.TestRunner;

import query.FullOuterJoinRels;
import query.QueryFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Full Outer Join Rels</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FullOuterJoinRelsTest extends RelationSelectTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FullOuterJoinRelsTest.class);
	}

	/**
	 * Constructs a new Full Outer Join Rels test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FullOuterJoinRelsTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Full Outer Join Rels test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected FullOuterJoinRels getFixture() {
		return (FullOuterJoinRels)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QueryFactory.eINSTANCE.createFullOuterJoinRels());
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

} //FullOuterJoinRelsTest

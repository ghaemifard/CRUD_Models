/**
 */
package delete.tests;

import delete.DeleteFactory;
import delete.LeftOuterJoinRels;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Left Outer Join Rels</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LeftOuterJoinRelsTest extends RelationSelectTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LeftOuterJoinRelsTest.class);
	}

	/**
	 * Constructs a new Left Outer Join Rels test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeftOuterJoinRelsTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Left Outer Join Rels test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected LeftOuterJoinRels getFixture() {
		return (LeftOuterJoinRels)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DeleteFactory.eINSTANCE.createLeftOuterJoinRels());
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

} //LeftOuterJoinRelsTest

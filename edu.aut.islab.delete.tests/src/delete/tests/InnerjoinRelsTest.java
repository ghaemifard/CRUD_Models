/**
 */
package delete.tests;

import delete.DeleteFactory;
import delete.InnerjoinRels;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Innerjoin Rels</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InnerjoinRelsTest extends RelationSelectTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InnerjoinRelsTest.class);
	}

	/**
	 * Constructs a new Innerjoin Rels test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InnerjoinRelsTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Innerjoin Rels test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected InnerjoinRels getFixture() {
		return (InnerjoinRels)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DeleteFactory.eINSTANCE.createInnerjoinRels());
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

} //InnerjoinRelsTest

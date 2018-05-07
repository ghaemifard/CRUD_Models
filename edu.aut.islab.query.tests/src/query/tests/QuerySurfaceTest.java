/**
 */
package query.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import query.QueryFactory;
import query.QuerySurface;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Surface</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class QuerySurfaceTest extends TestCase {

	/**
	 * The fixture for this Surface test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuerySurface fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(QuerySurfaceTest.class);
	}

	/**
	 * Constructs a new Surface test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuerySurfaceTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Surface test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(QuerySurface fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Surface test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuerySurface getFixture() {
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
		setFixture(QueryFactory.eINSTANCE.createQuerySurface());
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

} //QuerySurfaceTest

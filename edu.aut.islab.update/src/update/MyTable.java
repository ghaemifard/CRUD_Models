/**
 */
package update;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>My Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link update.MyTable#getName <em>Name</em>}</li>
 *   <li>{@link update.MyTable#getAlias <em>Alias</em>}</li>
 *   <li>{@link update.MyTable#getFakes <em>Fakes</em>}</li>
 * </ul>
 *
 * @see update.UpdatePackage#getMyTable()
 * @model annotation="gmf.node label='name,alias' label.pattern='{0}/{1}'"
 * @generated
 */
public interface MyTable extends AbstractNode {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see update.UpdatePackage#getMyTable_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link update.MyTable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alias</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alias</em>' attribute.
	 * @see #setAlias(String)
	 * @see update.UpdatePackage#getMyTable_Alias()
	 * @model
	 * @generated
	 */
	String getAlias();

	/**
	 * Sets the value of the '{@link update.MyTable#getAlias <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alias</em>' attribute.
	 * @see #getAlias()
	 * @generated
	 */
	void setAlias(String value);

	/**
	 * Returns the value of the '<em><b>Fakes</b></em>' containment reference list.
	 * The list contents are of type {@link update.RealField}.
	 * It is bidirectional and its opposite is '{@link update.RealField#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fakes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fakes</em>' containment reference list.
	 * @see update.UpdatePackage#getMyTable_Fakes()
	 * @see update.RealField#getTable
	 * @model opposite="table" containment="true"
	 *        annotation="gmf.compartment layout='list'"
	 * @generated
	 */
	EList<RealField> getFakes();

} // MyTable

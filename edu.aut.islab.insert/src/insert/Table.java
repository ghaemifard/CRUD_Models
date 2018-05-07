/**
 */
package insert;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link insert.Table#getName <em>Name</em>}</li>
 *   <li>{@link insert.Table#getFields <em>Fields</em>}</li>
 * </ul>
 *
 * @see insert.InsertPackage#getTable()
 * @model annotation="gmf.node label='name' size='100,500'"
 * @generated
 */
public interface Table extends AbstractNode {
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
	 * @see insert.InsertPackage#getTable_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link insert.Table#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
	 * The list contents are of type {@link insert.Field}.
	 * It is bidirectional and its opposite is '{@link insert.Field#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' containment reference list.
	 * @see insert.InsertPackage#getTable_Fields()
	 * @see insert.Field#getTable
	 * @model opposite="table" containment="true"
	 *        annotation="gmf.compartment layout='list'"
	 * @generated
	 */
	EList<Field> getFields();

} // Table

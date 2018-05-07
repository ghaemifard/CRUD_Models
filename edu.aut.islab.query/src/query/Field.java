/**
 */
package query;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link query.Field#getName <em>Name</em>}</li>
 *   <li>{@link query.Field#getTable <em>Table</em>}</li>
 *   <li>{@link query.Field#getTableName <em>Table Name</em>}</li>
 *   <li>{@link query.Field#getTable_ref <em>Table ref</em>}</li>
 *   <li>{@link query.Field#isDistict <em>Distict</em>}</li>
 * </ul>
 *
 * @see query.QueryPackage#getField()
 * @model annotation="gmf.node label='name' padding='10'"
 * @generated
 */
public interface Field extends Node {
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
	 * @see query.QueryPackage#getField_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link query.Field#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Table</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link query.MyTable#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' container reference.
	 * @see #setTable(MyTable)
	 * @see query.QueryPackage#getField_Table()
	 * @see query.MyTable#getFields
	 * @model opposite="fields" transient="false"
	 * @generated
	 */
	MyTable getTable();

	/**
	 * Sets the value of the '{@link query.Field#getTable <em>Table</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table</em>' container reference.
	 * @see #getTable()
	 * @generated
	 */
	void setTable(MyTable value);

	/**
	 * Returns the value of the '<em><b>Table Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Name</em>' attribute.
	 * @see #setTableName(String)
	 * @see query.QueryPackage#getField_TableName()
	 * @model
	 * @generated
	 */
	String getTableName();

	/**
	 * Sets the value of the '{@link query.Field#getTableName <em>Table Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Name</em>' attribute.
	 * @see #getTableName()
	 * @generated
	 */
	void setTableName(String value);

	/**
	 * Returns the value of the '<em><b>Table ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table ref</em>' reference.
	 * @see #setTable_ref(MyTable)
	 * @see query.QueryPackage#getField_Table_ref()
	 * @model
	 * @generated
	 */
	MyTable getTable_ref();

	/**
	 * Sets the value of the '{@link query.Field#getTable_ref <em>Table ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table ref</em>' reference.
	 * @see #getTable_ref()
	 * @generated
	 */
	void setTable_ref(MyTable value);

	/**
	 * Returns the value of the '<em><b>Distict</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distict</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distict</em>' attribute.
	 * @see #setDistict(boolean)
	 * @see query.QueryPackage#getField_Distict()
	 * @model
	 * @generated
	 */
	boolean isDistict();

	/**
	 * Sets the value of the '{@link query.Field#isDistict <em>Distict</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distict</em>' attribute.
	 * @see #isDistict()
	 * @generated
	 */
	void setDistict(boolean value);

} // Field

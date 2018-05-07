/**
 */
package delete;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link delete.Field#getName <em>Name</em>}</li>
 *   <li>{@link delete.Field#getTable <em>Table</em>}</li>
 *   <li>{@link delete.Field#getTableName <em>Table Name</em>}</li>
 *   <li>{@link delete.Field#getTable_ref <em>Table ref</em>}</li>
 *   <li>{@link delete.Field#isDistict <em>Distict</em>}</li>
 * </ul>
 *
 * @see delete.DeletePackage#getField()
 * @model annotation="gmf.node label='column_name' padding='10' label.pattern='{0}'"
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
	 * @see delete.DeletePackage#getField_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link delete.Field#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Table</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link delete.MyTable#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' container reference.
	 * @see #setTable(MyTable)
	 * @see delete.DeletePackage#getField_Table()
	 * @see delete.MyTable#getFields
	 * @model opposite="fields" transient="false"
	 * @generated
	 */
	MyTable getTable();

	/**
	 * Sets the value of the '{@link delete.Field#getTable <em>Table</em>}' container reference.
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
	 * @see delete.DeletePackage#getField_TableName()
	 * @model
	 * @generated
	 */
	String getTableName();

	/**
	 * Sets the value of the '{@link delete.Field#getTableName <em>Table Name</em>}' attribute.
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
	 * @see delete.DeletePackage#getField_Table_ref()
	 * @model
	 * @generated
	 */
	MyTable getTable_ref();

	/**
	 * Sets the value of the '{@link delete.Field#getTable_ref <em>Table ref</em>}' reference.
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
	 * @see delete.DeletePackage#getField_Distict()
	 * @model
	 * @generated
	 */
	boolean isDistict();

	/**
	 * Sets the value of the '{@link delete.Field#isDistict <em>Distict</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distict</em>' attribute.
	 * @see #isDistict()
	 * @generated
	 */
	void setDistict(boolean value);

} // Field

/**
 */
package insert;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link insert.Node#getType <em>Type</em>}</li>
 *   <li>{@link insert.Node#getSubtype <em>Subtype</em>}</li>
 *   <li>{@link insert.Node#isListable <em>Listable</em>}</li>
 *   <li>{@link insert.Node#getColumn_name <em>Column name</em>}</li>
 * </ul>
 *
 * @see insert.InsertPackage#getNode()
 * @model abstract="true"
 * @generated
 */
public interface Node extends AbstractNode {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Type)
	 * @see insert.InsertPackage#getNode_Type()
	 * @model
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link insert.Node#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

	/**
	 * Returns the value of the '<em><b>Subtype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subtype</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subtype</em>' reference.
	 * @see #setSubtype(Subtype)
	 * @see insert.InsertPackage#getNode_Subtype()
	 * @model
	 * @generated
	 */
	Subtype getSubtype();

	/**
	 * Sets the value of the '{@link insert.Node#getSubtype <em>Subtype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subtype</em>' reference.
	 * @see #getSubtype()
	 * @generated
	 */
	void setSubtype(Subtype value);

	/**
	 * Returns the value of the '<em><b>Listable</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Listable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Listable</em>' attribute.
	 * @see #setListable(boolean)
	 * @see insert.InsertPackage#getNode_Listable()
	 * @model default="false"
	 * @generated
	 */
	boolean isListable();

	/**
	 * Sets the value of the '{@link insert.Node#isListable <em>Listable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Listable</em>' attribute.
	 * @see #isListable()
	 * @generated
	 */
	void setListable(boolean value);

	/**
	 * Returns the value of the '<em><b>Column name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column name</em>' attribute.
	 * @see #setColumn_name(String)
	 * @see insert.InsertPackage#getNode_Column_name()
	 * @model
	 * @generated
	 */
	String getColumn_name();

	/**
	 * Sets the value of the '{@link insert.Node#getColumn_name <em>Column name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column name</em>' attribute.
	 * @see #getColumn_name()
	 * @generated
	 */
	void setColumn_name(String value);

} // Node

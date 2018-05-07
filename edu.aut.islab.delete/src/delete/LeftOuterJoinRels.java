/**
 */
package delete;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Left Outer Join Rels</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link delete.LeftOuterJoinRels#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see delete.DeletePackage#getLeftOuterJoinRels()
 * @model
 * @generated
 */
public interface LeftOuterJoinRels extends RelationSelect {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"LeftOuterJoin"</code>.
	 * The literals are from the enumeration {@link delete.RelationSelectType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see delete.RelationSelectType
	 * @see delete.DeletePackage#getLeftOuterJoinRels_Type()
	 * @model default="LeftOuterJoin" required="true" changeable="false"
	 * @generated
	 */
	RelationSelectType getType();

} // LeftOuterJoinRels

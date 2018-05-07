/**
 */
package delete;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Full Outer Join Rels</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link delete.FullOuterJoinRels#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see delete.DeletePackage#getFullOuterJoinRels()
 * @model
 * @generated
 */
public interface FullOuterJoinRels extends RelationSelect {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"FullOuterJoin"</code>.
	 * The literals are from the enumeration {@link delete.RelationSelectType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see delete.RelationSelectType
	 * @see delete.DeletePackage#getFullOuterJoinRels_Type()
	 * @model default="FullOuterJoin" required="true" changeable="false"
	 * @generated
	 */
	RelationSelectType getType();

} // FullOuterJoinRels

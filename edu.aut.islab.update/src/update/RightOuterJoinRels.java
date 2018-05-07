/**
 */
package update;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Right Outer Join Rels</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link update.RightOuterJoinRels#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see update.UpdatePackage#getRightOuterJoinRels()
 * @model
 * @generated
 */
public interface RightOuterJoinRels extends RelationSelect {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"RightOuterJoin"</code>.
	 * The literals are from the enumeration {@link update.RelationSelectType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see update.RelationSelectType
	 * @see update.UpdatePackage#getRightOuterJoinRels_Type()
	 * @model default="RightOuterJoin" required="true" changeable="false"
	 * @generated
	 */
	RelationSelectType getType();

} // RightOuterJoinRels

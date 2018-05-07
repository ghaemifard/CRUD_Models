/**
 */
package delete;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation Select</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link delete.RelationSelect#getSource <em>Source</em>}</li>
 *   <li>{@link delete.RelationSelect#getTarget <em>Target</em>}</li>
 *   <li>{@link delete.RelationSelect#getOpType <em>Op Type</em>}</li>
 * </ul>
 *
 * @see delete.DeletePackage#getRelationSelect()
 * @model abstract="true"
 *        annotation="gmf.link source='source' target='target' target.decoration='arrow' color='100,22,222' style='dot' width='3' label='type'"
 * @generated
 */
public interface RelationSelect extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Field)
	 * @see delete.DeletePackage#getRelationSelect_Source()
	 * @model required="true"
	 * @generated
	 */
	Field getSource();

	/**
	 * Sets the value of the '{@link delete.RelationSelect#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Field value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Field)
	 * @see delete.DeletePackage#getRelationSelect_Target()
	 * @model required="true"
	 * @generated
	 */
	Field getTarget();

	/**
	 * Sets the value of the '{@link delete.RelationSelect#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Field value);

	/**
	 * Returns the value of the '<em><b>Op Type</b></em>' attribute.
	 * The literals are from the enumeration {@link delete.RelationSelectOperationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op Type</em>' attribute.
	 * @see delete.RelationSelectOperationType
	 * @see #setOpType(RelationSelectOperationType)
	 * @see delete.DeletePackage#getRelationSelect_OpType()
	 * @model
	 * @generated
	 */
	RelationSelectOperationType getOpType();

	/**
	 * Sets the value of the '{@link delete.RelationSelect#getOpType <em>Op Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op Type</em>' attribute.
	 * @see delete.RelationSelectOperationType
	 * @see #getOpType()
	 * @generated
	 */
	void setOpType(RelationSelectOperationType value);

} // RelationSelect

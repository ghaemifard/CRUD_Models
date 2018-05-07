/**
 */
package update;

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
 *   <li>{@link update.RelationSelect#getSource <em>Source</em>}</li>
 *   <li>{@link update.RelationSelect#getTarget <em>Target</em>}</li>
 *   <li>{@link update.RelationSelect#getOpType <em>Op Type</em>}</li>
 * </ul>
 *
 * @see update.UpdatePackage#getRelationSelect()
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
	 * @see #setSource(RealField)
	 * @see update.UpdatePackage#getRelationSelect_Source()
	 * @model required="true"
	 * @generated
	 */
	RealField getSource();

	/**
	 * Sets the value of the '{@link update.RelationSelect#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(RealField value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(RealField)
	 * @see update.UpdatePackage#getRelationSelect_Target()
	 * @model required="true"
	 * @generated
	 */
	RealField getTarget();

	/**
	 * Sets the value of the '{@link update.RelationSelect#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(RealField value);

	/**
	 * Returns the value of the '<em><b>Op Type</b></em>' attribute.
	 * The literals are from the enumeration {@link update.RelationSelectOperationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op Type</em>' attribute.
	 * @see update.RelationSelectOperationType
	 * @see #setOpType(RelationSelectOperationType)
	 * @see update.UpdatePackage#getRelationSelect_OpType()
	 * @model
	 * @generated
	 */
	RelationSelectOperationType getOpType();

	/**
	 * Sets the value of the '{@link update.RelationSelect#getOpType <em>Op Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op Type</em>' attribute.
	 * @see update.RelationSelectOperationType
	 * @see #getOpType()
	 * @generated
	 */
	void setOpType(RelationSelectOperationType value);

} // RelationSelect

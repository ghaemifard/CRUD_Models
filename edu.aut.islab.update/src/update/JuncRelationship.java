/**
 */
package update;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Junc Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link update.JuncRelationship#getSource <em>Source</em>}</li>
 *   <li>{@link update.JuncRelationship#getTarget <em>Target</em>}</li>
 *   <li>{@link update.JuncRelationship#getIndex <em>Index</em>}</li>
 *   <li>{@link update.JuncRelationship#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see update.UpdatePackage#getJuncRelationship()
 * @model annotation="gmf.link source='source' target='target' style='dash' width='1' label='index' target.decoration='arrow' color='230,22,89'"
 * @generated
 */
public interface JuncRelationship extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link update.Junction#getRels <em>Rels</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Junction)
	 * @see update.UpdatePackage#getJuncRelationship_Source()
	 * @see update.Junction#getRels
	 * @model opposite="rels" required="true"
	 * @generated
	 */
	Junction getSource();

	/**
	 * Sets the value of the '{@link update.JuncRelationship#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Junction value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(AbstractConditionElement)
	 * @see update.UpdatePackage#getJuncRelationship_Target()
	 * @model required="true"
	 * @generated
	 */
	AbstractConditionElement getTarget();

	/**
	 * Sets the value of the '{@link update.JuncRelationship#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(AbstractConditionElement value);

	/**
	 * Returns the value of the '<em><b>Index</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' attribute.
	 * @see #setIndex(int)
	 * @see update.UpdatePackage#getJuncRelationship_Index()
	 * @model default="0"
	 * @generated
	 */
	int getIndex();

	/**
	 * Sets the value of the '{@link update.JuncRelationship#getIndex <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' attribute.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(int value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"relates"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see update.UpdatePackage#getJuncRelationship_Type()
	 * @model default="relates" changeable="false"
	 * @generated
	 */
	String getType();

} // JuncRelationship

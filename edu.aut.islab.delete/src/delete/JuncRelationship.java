/**
 */
package delete;

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
 *   <li>{@link delete.JuncRelationship#getSource <em>Source</em>}</li>
 *   <li>{@link delete.JuncRelationship#getTarget <em>Target</em>}</li>
 *   <li>{@link delete.JuncRelationship#getIndex <em>Index</em>}</li>
 *   <li>{@link delete.JuncRelationship#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see delete.DeletePackage#getJuncRelationship()
 * @model annotation="gmf.link source='source' target='target' style='dash' width='1' label='index' target.decoration='arrow' color='230,22,89'"
 * @generated
 */
public interface JuncRelationship extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link delete.Junction#getRels <em>Rels</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Junction)
	 * @see delete.DeletePackage#getJuncRelationship_Source()
	 * @see delete.Junction#getRels
	 * @model opposite="rels" required="true"
	 * @generated
	 */
	Junction getSource();

	/**
	 * Sets the value of the '{@link delete.JuncRelationship#getSource <em>Source</em>}' reference.
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
	 * @see delete.DeletePackage#getJuncRelationship_Target()
	 * @model required="true"
	 * @generated
	 */
	AbstractConditionElement getTarget();

	/**
	 * Sets the value of the '{@link delete.JuncRelationship#getTarget <em>Target</em>}' reference.
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
	 * @see delete.DeletePackage#getJuncRelationship_Index()
	 * @model default="0"
	 * @generated
	 */
	int getIndex();

	/**
	 * Sets the value of the '{@link delete.JuncRelationship#getIndex <em>Index</em>}' attribute.
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
	 * @see delete.DeletePackage#getJuncRelationship_Type()
	 * @model default="relates" changeable="false"
	 * @generated
	 */
	String getType();

} // JuncRelationship

/**
 */
package delete;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link delete.ConditionLink#getSrc <em>Src</em>}</li>
 *   <li>{@link delete.ConditionLink#getDst <em>Dst</em>}</li>
 *   <li>{@link delete.ConditionLink#isNegative <em>Negative</em>}</li>
 * </ul>
 *
 * @see delete.DeletePackage#getConditionLink()
 * @model abstract="true"
 *        annotation="gmf.link source='src' target='dst' style='dash' width='1' label='desc' target.decoration='arrow' color='20,182,19'"
 * @generated
 */
public interface ConditionLink extends EObject {
	/**
	 * Returns the value of the '<em><b>Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Src</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Src</em>' reference.
	 * @see #setSrc(Node)
	 * @see delete.DeletePackage#getConditionLink_Src()
	 * @model
	 * @generated
	 */
	Node getSrc();

	/**
	 * Sets the value of the '{@link delete.ConditionLink#getSrc <em>Src</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Src</em>' reference.
	 * @see #getSrc()
	 * @generated
	 */
	void setSrc(Node value);

	/**
	 * Returns the value of the '<em><b>Dst</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dst</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dst</em>' reference.
	 * @see #setDst(Node)
	 * @see delete.DeletePackage#getConditionLink_Dst()
	 * @model
	 * @generated
	 */
	Node getDst();

	/**
	 * Sets the value of the '{@link delete.ConditionLink#getDst <em>Dst</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dst</em>' reference.
	 * @see #getDst()
	 * @generated
	 */
	void setDst(Node value);

	/**
	 * Returns the value of the '<em><b>Negative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Negative</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Negative</em>' attribute.
	 * @see #setNegative(boolean)
	 * @see delete.DeletePackage#getConditionLink_Negative()
	 * @model
	 * @generated
	 */
	boolean isNegative();

	/**
	 * Sets the value of the '{@link delete.ConditionLink#isNegative <em>Negative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Negative</em>' attribute.
	 * @see #isNegative()
	 * @generated
	 */
	void setNegative(boolean value);

} // ConditionLink

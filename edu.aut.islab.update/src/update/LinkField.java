/**
 */
package update;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link update.LinkField#getSrc <em>Src</em>}</li>
 *   <li>{@link update.LinkField#getDst <em>Dst</em>}</li>
 *   <li>{@link update.LinkField#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see update.UpdatePackage#getLinkField()
 * @model annotation="gmf.link source='src' target='dst' target.decoration='arrow' color='10,220,22' style='dot' width='3' label='name'"
 * @generated
 */
public interface LinkField extends EObject {
	/**
	 * Returns the value of the '<em><b>Src</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link update.RealField#getLinkf <em>Linkf</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Src</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Src</em>' reference.
	 * @see #setSrc(RealField)
	 * @see update.UpdatePackage#getLinkField_Src()
	 * @see update.RealField#getLinkf
	 * @model opposite="linkf" required="true"
	 * @generated
	 */
	RealField getSrc();

	/**
	 * Sets the value of the '{@link update.LinkField#getSrc <em>Src</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Src</em>' reference.
	 * @see #getSrc()
	 * @generated
	 */
	void setSrc(RealField value);

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
	 * @see update.UpdatePackage#getLinkField_Dst()
	 * @model required="true"
	 * @generated
	 */
	Node getDst();

	/**
	 * Sets the value of the '{@link update.LinkField#getDst <em>Dst</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dst</em>' reference.
	 * @see #getDst()
	 * @generated
	 */
	void setDst(Node value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"ASSIGN"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see update.UpdatePackage#getLinkField_Name()
	 * @model default="ASSIGN" changeable="false"
	 * @generated
	 */
	String getName();

} // LinkField

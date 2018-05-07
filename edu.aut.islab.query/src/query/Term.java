/**
 */
package query;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link query.Term#getParams <em>Params</em>}</li>
 *   <li>{@link query.Term#getTitle <em>Title</em>}</li>
 *   <li>{@link query.Term#getLink <em>Link</em>}</li>
 * </ul>
 *
 * @see query.QueryPackage#getTerm()
 * @model annotation="gmf.node figure='rectangle' label='title' label.icon='true'"
 * @generated
 */
public interface Term extends AbstractConditionElement {
	/**
	 * Returns the value of the '<em><b>Params</b></em>' containment reference list.
	 * The list contents are of type {@link query.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Params</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Params</em>' containment reference list.
	 * @see query.QueryPackage#getTerm_Params()
	 * @model containment="true" required="true" upper="2"
	 * @generated
	 */
	EList<Node> getParams();

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * The default value is <code>"Term"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see query.QueryPackage#getTerm_Title()
	 * @model default="Term" changeable="false"
	 * @generated
	 */
	String getTitle();

	/**
	 * Returns the value of the '<em><b>Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link</em>' containment reference.
	 * @see #setLink(ConditionLink)
	 * @see query.QueryPackage#getTerm_Link()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ConditionLink getLink();

	/**
	 * Sets the value of the '{@link query.Term#getLink <em>Link</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link</em>' containment reference.
	 * @see #getLink()
	 * @generated
	 */
	void setLink(ConditionLink value);

} // Term

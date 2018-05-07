/**
 */
package delete;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dummy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link delete.Dummy#getName <em>Name</em>}</li>
 *   <li>{@link delete.Dummy#getParts <em>Parts</em>}</li>
 * </ul>
 *
 * @see delete.DeletePackage#getDummy()
 * @model annotation="gmf.node label='name' size='250,500'"
 * @generated
 */
public interface Dummy extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see delete.DeletePackage#getDummy_Name()
	 * @model default="" changeable="false"
	 * @generated
	 */
	String getName();

	/**
	 * Returns the value of the '<em><b>Parts</b></em>' containment reference list.
	 * The list contents are of type {@link delete.AbstractNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parts</em>' containment reference list.
	 * @see delete.DeletePackage#getDummy_Parts()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractNode> getParts();

} // Dummy

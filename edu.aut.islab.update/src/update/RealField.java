/**
 */
package update;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Real Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link update.RealField#getName <em>Name</em>}</li>
 *   <li>{@link update.RealField#getTable <em>Table</em>}</li>
 *   <li>{@link update.RealField#getType <em>Type</em>}</li>
 *   <li>{@link update.RealField#getSubtype <em>Subtype</em>}</li>
 *   <li>{@link update.RealField#isListable <em>Listable</em>}</li>
 *   <li>{@link update.RealField#getLinkf <em>Linkf</em>}</li>
 *   <li>{@link update.RealField#isDistict <em>Distict</em>}</li>
 * </ul>
 *
 * @see update.UpdatePackage#getRealField()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface RealField extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see update.UpdatePackage#getRealField_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link update.RealField#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Table</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link update.MyTable#getFakes <em>Fakes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' container reference.
	 * @see #setTable(MyTable)
	 * @see update.UpdatePackage#getRealField_Table()
	 * @see update.MyTable#getFakes
	 * @model opposite="fakes" transient="false"
	 * @generated
	 */
	MyTable getTable();

	/**
	 * Sets the value of the '{@link update.RealField#getTable <em>Table</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table</em>' container reference.
	 * @see #getTable()
	 * @generated
	 */
	void setTable(MyTable value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Type)
	 * @see update.UpdatePackage#getRealField_Type()
	 * @model
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link update.RealField#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

	/**
	 * Returns the value of the '<em><b>Subtype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subtype</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subtype</em>' reference.
	 * @see #setSubtype(Subtype)
	 * @see update.UpdatePackage#getRealField_Subtype()
	 * @model
	 * @generated
	 */
	Subtype getSubtype();

	/**
	 * Sets the value of the '{@link update.RealField#getSubtype <em>Subtype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subtype</em>' reference.
	 * @see #getSubtype()
	 * @generated
	 */
	void setSubtype(Subtype value);

	/**
	 * Returns the value of the '<em><b>Listable</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Listable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Listable</em>' attribute.
	 * @see #setListable(boolean)
	 * @see update.UpdatePackage#getRealField_Listable()
	 * @model default="false"
	 * @generated
	 */
	boolean isListable();

	/**
	 * Sets the value of the '{@link update.RealField#isListable <em>Listable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Listable</em>' attribute.
	 * @see #isListable()
	 * @generated
	 */
	void setListable(boolean value);

	/**
	 * Returns the value of the '<em><b>Linkf</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link update.LinkField#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linkf</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linkf</em>' reference.
	 * @see #setLinkf(LinkField)
	 * @see update.UpdatePackage#getRealField_Linkf()
	 * @see update.LinkField#getSrc
	 * @model opposite="src" required="true"
	 * @generated
	 */
	LinkField getLinkf();

	/**
	 * Sets the value of the '{@link update.RealField#getLinkf <em>Linkf</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linkf</em>' reference.
	 * @see #getLinkf()
	 * @generated
	 */
	void setLinkf(LinkField value);

	/**
	 * Returns the value of the '<em><b>Distict</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distict</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distict</em>' attribute.
	 * @see #setDistict(boolean)
	 * @see update.UpdatePackage#getRealField_Distict()
	 * @model
	 * @generated
	 */
	boolean isDistict();

	/**
	 * Sets the value of the '{@link update.RealField#isDistict <em>Distict</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distict</em>' attribute.
	 * @see #isDistict()
	 * @generated
	 */
	void setDistict(boolean value);

} // RealField

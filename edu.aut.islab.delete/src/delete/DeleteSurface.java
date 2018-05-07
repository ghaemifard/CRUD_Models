/**
 */
package delete;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Surface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link delete.DeleteSurface#getInputInsta <em>Input Insta</em>}</li>
 *   <li>{@link delete.DeleteSurface#getTableInsta <em>Table Insta</em>}</li>
 *   <li>{@link delete.DeleteSurface#getWhereInsta <em>Where Insta</em>}</li>
 *   <li>{@link delete.DeleteSurface#getSortInstalment <em>Sort Instalment</em>}</li>
 *   <li>{@link delete.DeleteSurface#getDummy <em>Dummy</em>}</li>
 *   <li>{@link delete.DeleteSurface#getTypes <em>Types</em>}</li>
 *   <li>{@link delete.DeleteSurface#getFuncs <em>Funcs</em>}</li>
 *   <li>{@link delete.DeleteSurface#getName <em>Name</em>}</li>
 *   <li>{@link delete.DeleteSurface#getDescription <em>Description</em>}</li>
 *   <li>{@link delete.DeleteSurface#getAssociatedClass <em>Associated Class</em>}</li>
 *   <li>{@link delete.DeleteSurface#getUserName <em>User Name</em>}</li>
 *   <li>{@link delete.DeleteSurface#getPassword <em>Password</em>}</li>
 *   <li>{@link delete.DeleteSurface#getUri <em>Uri</em>}</li>
 * </ul>
 *
 * @see delete.DeletePackage#getDeleteSurface()
 * @model annotation="gmf.diagram diagram.extension='ddext' model.extension='dmext'"
 * @generated
 */
public interface DeleteSurface extends EObject {
	/**
	 * Returns the value of the '<em><b>Input Insta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Insta</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Insta</em>' containment reference.
	 * @see #setInputInsta(InputInstalment)
	 * @see delete.DeletePackage#getDeleteSurface_InputInsta()
	 * @model containment="true"
	 * @generated
	 */
	InputInstalment getInputInsta();

	/**
	 * Sets the value of the '{@link delete.DeleteSurface#getInputInsta <em>Input Insta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Insta</em>' containment reference.
	 * @see #getInputInsta()
	 * @generated
	 */
	void setInputInsta(InputInstalment value);

	/**
	 * Returns the value of the '<em><b>Table Insta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Insta</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Insta</em>' containment reference.
	 * @see #setTableInsta(TableListInstalment)
	 * @see delete.DeletePackage#getDeleteSurface_TableInsta()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TableListInstalment getTableInsta();

	/**
	 * Sets the value of the '{@link delete.DeleteSurface#getTableInsta <em>Table Insta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Insta</em>' containment reference.
	 * @see #getTableInsta()
	 * @generated
	 */
	void setTableInsta(TableListInstalment value);

	/**
	 * Returns the value of the '<em><b>Where Insta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Where Insta</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Where Insta</em>' containment reference.
	 * @see #setWhereInsta(ConditionInstalment)
	 * @see delete.DeletePackage#getDeleteSurface_WhereInsta()
	 * @model containment="true"
	 * @generated
	 */
	ConditionInstalment getWhereInsta();

	/**
	 * Sets the value of the '{@link delete.DeleteSurface#getWhereInsta <em>Where Insta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Where Insta</em>' containment reference.
	 * @see #getWhereInsta()
	 * @generated
	 */
	void setWhereInsta(ConditionInstalment value);

	/**
	 * Returns the value of the '<em><b>Sort Instalment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sort Instalment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sort Instalment</em>' containment reference.
	 * @see #setSortInstalment(SortInstalment)
	 * @see delete.DeletePackage#getDeleteSurface_SortInstalment()
	 * @model containment="true"
	 * @generated
	 */
	SortInstalment getSortInstalment();

	/**
	 * Sets the value of the '{@link delete.DeleteSurface#getSortInstalment <em>Sort Instalment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sort Instalment</em>' containment reference.
	 * @see #getSortInstalment()
	 * @generated
	 */
	void setSortInstalment(SortInstalment value);

	/**
	 * Returns the value of the '<em><b>Dummy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dummy</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dummy</em>' containment reference.
	 * @see #setDummy(Dummy)
	 * @see delete.DeletePackage#getDeleteSurface_Dummy()
	 * @model containment="true"
	 * @generated
	 */
	Dummy getDummy();

	/**
	 * Sets the value of the '{@link delete.DeleteSurface#getDummy <em>Dummy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dummy</em>' containment reference.
	 * @see #getDummy()
	 * @generated
	 */
	void setDummy(Dummy value);

	/**
	 * Returns the value of the '<em><b>Types</b></em>' reference list.
	 * The list contents are of type {@link delete.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' reference list.
	 * @see delete.DeletePackage#getDeleteSurface_Types()
	 * @model
	 * @generated
	 */
	EList<Type> getTypes();

	/**
	 * Returns the value of the '<em><b>Funcs</b></em>' reference list.
	 * The list contents are of type {@link delete.FunctionDef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Funcs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Funcs</em>' reference list.
	 * @see delete.DeletePackage#getDeleteSurface_Funcs()
	 * @model
	 * @generated
	 */
	EList<FunctionDef> getFuncs();

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
	 * @see delete.DeletePackage#getDeleteSurface_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link delete.DeleteSurface#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see delete.DeletePackage#getDeleteSurface_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link delete.DeleteSurface#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Associated Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associated Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associated Class</em>' attribute.
	 * @see #setAssociatedClass(String)
	 * @see delete.DeletePackage#getDeleteSurface_AssociatedClass()
	 * @model
	 * @generated
	 */
	String getAssociatedClass();

	/**
	 * Sets the value of the '{@link delete.DeleteSurface#getAssociatedClass <em>Associated Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associated Class</em>' attribute.
	 * @see #getAssociatedClass()
	 * @generated
	 */
	void setAssociatedClass(String value);

	/**
	 * Returns the value of the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Name</em>' attribute.
	 * @see #setUserName(String)
	 * @see delete.DeletePackage#getDeleteSurface_UserName()
	 * @model
	 * @generated
	 */
	String getUserName();

	/**
	 * Sets the value of the '{@link delete.DeleteSurface#getUserName <em>User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Name</em>' attribute.
	 * @see #getUserName()
	 * @generated
	 */
	void setUserName(String value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see delete.DeletePackage#getDeleteSurface_Password()
	 * @model
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link delete.DeleteSurface#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uri</em>' attribute.
	 * @see #setUri(String)
	 * @see delete.DeletePackage#getDeleteSurface_Uri()
	 * @model
	 * @generated
	 */
	String getUri();

	/**
	 * Sets the value of the '{@link delete.DeleteSurface#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(String value);

} // DeleteSurface

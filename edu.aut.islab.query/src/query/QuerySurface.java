/**
 */
package query;

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
 *   <li>{@link query.QuerySurface#getOutputInstalment <em>Output Instalment</em>}</li>
 *   <li>{@link query.QuerySurface#getInputInstalment <em>Input Instalment</em>}</li>
 *   <li>{@link query.QuerySurface#getWhereInstalment <em>Where Instalment</em>}</li>
 *   <li>{@link query.QuerySurface#getHavingInstalment <em>Having Instalment</em>}</li>
 *   <li>{@link query.QuerySurface#getGroupInstalment <em>Group Instalment</em>}</li>
 *   <li>{@link query.QuerySurface#getSortInstalment <em>Sort Instalment</em>}</li>
 *   <li>{@link query.QuerySurface#getTypes <em>Types</em>}</li>
 *   <li>{@link query.QuerySurface#getFuncs <em>Funcs</em>}</li>
 *   <li>{@link query.QuerySurface#getName <em>Name</em>}</li>
 *   <li>{@link query.QuerySurface#getUserName <em>User Name</em>}</li>
 *   <li>{@link query.QuerySurface#getPassword <em>Password</em>}</li>
 *   <li>{@link query.QuerySurface#getUri <em>Uri</em>}</li>
 *   <li>{@link query.QuerySurface#getDescription <em>Description</em>}</li>
 *   <li>{@link query.QuerySurface#getNumberOfRow <em>Number Of Row</em>}</li>
 *   <li>{@link query.QuerySurface#getIndexOfRoes <em>Index Of Roes</em>}</li>
 *   <li>{@link query.QuerySurface#isCreateClass <em>Create Class</em>}</li>
 *   <li>{@link query.QuerySurface#getAssociatedClass <em>Associated Class</em>}</li>
 *   <li>{@link query.QuerySurface#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see query.QueryPackage#getQuerySurface()
 * @model annotation="gmf.diagram diagram.extension='dext' model.extension='mext'"
 * @generated
 */
public interface QuerySurface extends EObject {
	/**
	 * Returns the value of the '<em><b>Output Instalment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Instalment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Instalment</em>' containment reference.
	 * @see #setOutputInstalment(OutputInstalment)
	 * @see query.QueryPackage#getQuerySurface_OutputInstalment()
	 * @model containment="true" required="true"
	 * @generated
	 */
	OutputInstalment getOutputInstalment();

	/**
	 * Sets the value of the '{@link query.QuerySurface#getOutputInstalment <em>Output Instalment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Instalment</em>' containment reference.
	 * @see #getOutputInstalment()
	 * @generated
	 */
	void setOutputInstalment(OutputInstalment value);

	/**
	 * Returns the value of the '<em><b>Input Instalment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Instalment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Instalment</em>' containment reference.
	 * @see #setInputInstalment(InputInstalment)
	 * @see query.QueryPackage#getQuerySurface_InputInstalment()
	 * @model containment="true" required="true"
	 * @generated
	 */
	InputInstalment getInputInstalment();

	/**
	 * Sets the value of the '{@link query.QuerySurface#getInputInstalment <em>Input Instalment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Instalment</em>' containment reference.
	 * @see #getInputInstalment()
	 * @generated
	 */
	void setInputInstalment(InputInstalment value);

	/**
	 * Returns the value of the '<em><b>Where Instalment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Where Instalment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Where Instalment</em>' containment reference.
	 * @see #setWhereInstalment(WhereInstalment)
	 * @see query.QueryPackage#getQuerySurface_WhereInstalment()
	 * @model containment="true" required="true"
	 * @generated
	 */
	WhereInstalment getWhereInstalment();

	/**
	 * Sets the value of the '{@link query.QuerySurface#getWhereInstalment <em>Where Instalment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Where Instalment</em>' containment reference.
	 * @see #getWhereInstalment()
	 * @generated
	 */
	void setWhereInstalment(WhereInstalment value);

	/**
	 * Returns the value of the '<em><b>Having Instalment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Having Instalment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Having Instalment</em>' containment reference.
	 * @see #setHavingInstalment(HavingInstalment)
	 * @see query.QueryPackage#getQuerySurface_HavingInstalment()
	 * @model containment="true" required="true"
	 * @generated
	 */
	HavingInstalment getHavingInstalment();

	/**
	 * Sets the value of the '{@link query.QuerySurface#getHavingInstalment <em>Having Instalment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Having Instalment</em>' containment reference.
	 * @see #getHavingInstalment()
	 * @generated
	 */
	void setHavingInstalment(HavingInstalment value);

	/**
	 * Returns the value of the '<em><b>Group Instalment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group Instalment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Instalment</em>' containment reference.
	 * @see #setGroupInstalment(GroupInstalment)
	 * @see query.QueryPackage#getQuerySurface_GroupInstalment()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GroupInstalment getGroupInstalment();

	/**
	 * Sets the value of the '{@link query.QuerySurface#getGroupInstalment <em>Group Instalment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Instalment</em>' containment reference.
	 * @see #getGroupInstalment()
	 * @generated
	 */
	void setGroupInstalment(GroupInstalment value);

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
	 * @see query.QueryPackage#getQuerySurface_SortInstalment()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SortInstalment getSortInstalment();

	/**
	 * Sets the value of the '{@link query.QuerySurface#getSortInstalment <em>Sort Instalment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sort Instalment</em>' containment reference.
	 * @see #getSortInstalment()
	 * @generated
	 */
	void setSortInstalment(SortInstalment value);

	/**
	 * Returns the value of the '<em><b>Types</b></em>' reference list.
	 * The list contents are of type {@link query.Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' reference list.
	 * @see query.QueryPackage#getQuerySurface_Types()
	 * @model
	 * @generated
	 */
	EList<Type> getTypes();

	/**
	 * Returns the value of the '<em><b>Funcs</b></em>' reference list.
	 * The list contents are of type {@link query.FunctionDef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Funcs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Funcs</em>' reference list.
	 * @see query.QueryPackage#getQuerySurface_Funcs()
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
	 * @see query.QueryPackage#getQuerySurface_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link query.QuerySurface#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see query.QueryPackage#getQuerySurface_UserName()
	 * @model
	 * @generated
	 */
	String getUserName();

	/**
	 * Sets the value of the '{@link query.QuerySurface#getUserName <em>User Name</em>}' attribute.
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
	 * @see query.QueryPackage#getQuerySurface_Password()
	 * @model
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link query.QuerySurface#getPassword <em>Password</em>}' attribute.
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
	 * @see query.QueryPackage#getQuerySurface_Uri()
	 * @model
	 * @generated
	 */
	String getUri();

	/**
	 * Sets the value of the '{@link query.QuerySurface#getUri <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri</em>' attribute.
	 * @see #getUri()
	 * @generated
	 */
	void setUri(String value);

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
	 * @see query.QueryPackage#getQuerySurface_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link query.QuerySurface#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Number Of Row</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Row</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Row</em>' attribute.
	 * @see #setNumberOfRow(int)
	 * @see query.QueryPackage#getQuerySurface_NumberOfRow()
	 * @model default="0"
	 * @generated
	 */
	int getNumberOfRow();

	/**
	 * Sets the value of the '{@link query.QuerySurface#getNumberOfRow <em>Number Of Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Row</em>' attribute.
	 * @see #getNumberOfRow()
	 * @generated
	 */
	void setNumberOfRow(int value);

	/**
	 * Returns the value of the '<em><b>Index Of Roes</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index Of Roes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index Of Roes</em>' attribute.
	 * @see #setIndexOfRoes(int)
	 * @see query.QueryPackage#getQuerySurface_IndexOfRoes()
	 * @model default="0"
	 * @generated
	 */
	int getIndexOfRoes();

	/**
	 * Sets the value of the '{@link query.QuerySurface#getIndexOfRoes <em>Index Of Roes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index Of Roes</em>' attribute.
	 * @see #getIndexOfRoes()
	 * @generated
	 */
	void setIndexOfRoes(int value);

	/**
	 * Returns the value of the '<em><b>Create Class</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Create Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Create Class</em>' attribute.
	 * @see #setCreateClass(boolean)
	 * @see query.QueryPackage#getQuerySurface_CreateClass()
	 * @model default="false"
	 * @generated
	 */
	boolean isCreateClass();

	/**
	 * Sets the value of the '{@link query.QuerySurface#isCreateClass <em>Create Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Create Class</em>' attribute.
	 * @see #isCreateClass()
	 * @generated
	 */
	void setCreateClass(boolean value);

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
	 * @see query.QueryPackage#getQuerySurface_AssociatedClass()
	 * @model
	 * @generated
	 */
	String getAssociatedClass();

	/**
	 * Sets the value of the '{@link query.QuerySurface#getAssociatedClass <em>Associated Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associated Class</em>' attribute.
	 * @see #getAssociatedClass()
	 * @generated
	 */
	void setAssociatedClass(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link query.QueryType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see query.QueryType
	 * @see #setType(QueryType)
	 * @see query.QueryPackage#getQuerySurface_Type()
	 * @model
	 * @generated
	 */
	QueryType getType();

	/**
	 * Sets the value of the '{@link query.QuerySurface#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see query.QueryType
	 * @see #getType()
	 * @generated
	 */
	void setType(QueryType value);

} // QuerySurface

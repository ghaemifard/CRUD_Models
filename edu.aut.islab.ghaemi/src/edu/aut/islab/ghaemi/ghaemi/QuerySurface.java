/**
 */
package edu.aut.islab.ghaemi.ghaemi;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Query Surface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.aut.islab.ghaemi.ghaemi.QuerySurface#getOutputinstalment <em>Outputinstalment</em>}</li>
 *   <li>{@link edu.aut.islab.ghaemi.ghaemi.QuerySurface#getQueryselectinstalment <em>Queryselectinstalment</em>}</li>
 *   <li>{@link edu.aut.islab.ghaemi.ghaemi.QuerySurface#getWhereInstalment <em>Where Instalment</em>}</li>
 *   <li>{@link edu.aut.islab.ghaemi.ghaemi.QuerySurface#getHavingInstalment <em>Having Instalment</em>}</li>
 *   <li>{@link edu.aut.islab.ghaemi.ghaemi.QuerySurface#getInputinstalment <em>Inputinstalment</em>}</li>
 * </ul>
 *
 * @see edu.aut.islab.ghaemi.ghaemi.GhaemiPackage#getQuerySurface()
 * @model
 * @generated
 */
public interface QuerySurface extends Surface {
	/**
	 * Returns the value of the '<em><b>Queryselectinstalment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Queryselectinstalment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Queryselectinstalment</em>' containment reference.
	 * @see #setQueryselectinstalment(QuerySelectInstalment)
	 * @see edu.aut.islab.ghaemi.ghaemi.GhaemiPackage#getQuerySurface_Queryselectinstalment()
	 * @model containment="true" required="true"
	 * @generated
	 */
	QuerySelectInstalment getQueryselectinstalment();

	/**
	 * Sets the value of the '{@link edu.aut.islab.ghaemi.ghaemi.QuerySurface#getQueryselectinstalment <em>Queryselectinstalment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Queryselectinstalment</em>' containment reference.
	 * @see #getQueryselectinstalment()
	 * @generated
	 */
	void setQueryselectinstalment(QuerySelectInstalment value);

	/**
	 * Returns the value of the '<em><b>Where Instalment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Where Instalment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Where Instalment</em>' containment reference.
	 * @see #setWhereInstalment(QueryConditionalInstalmnet)
	 * @see edu.aut.islab.ghaemi.ghaemi.GhaemiPackage#getQuerySurface_WhereInstalment()
	 * @model containment="true" required="true"
	 * @generated
	 */
	QueryConditionalInstalmnet getWhereInstalment();

	/**
	 * Sets the value of the '{@link edu.aut.islab.ghaemi.ghaemi.QuerySurface#getWhereInstalment <em>Where Instalment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Where Instalment</em>' containment reference.
	 * @see #getWhereInstalment()
	 * @generated
	 */
	void setWhereInstalment(QueryConditionalInstalmnet value);

	/**
	 * Returns the value of the '<em><b>Having Instalment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Having Instalment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Having Instalment</em>' containment reference.
	 * @see #setHavingInstalment(QueryConditionalInstalmnet)
	 * @see edu.aut.islab.ghaemi.ghaemi.GhaemiPackage#getQuerySurface_HavingInstalment()
	 * @model containment="true" required="true"
	 * @generated
	 */
	QueryConditionalInstalmnet getHavingInstalment();

	/**
	 * Sets the value of the '{@link edu.aut.islab.ghaemi.ghaemi.QuerySurface#getHavingInstalment <em>Having Instalment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Having Instalment</em>' containment reference.
	 * @see #getHavingInstalment()
	 * @generated
	 */
	void setHavingInstalment(QueryConditionalInstalmnet value);

	/**
	 * Returns the value of the '<em><b>Outputinstalment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outputinstalment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputinstalment</em>' containment reference.
	 * @see #setOutputinstalment(OutputInstalment)
	 * @see edu.aut.islab.ghaemi.ghaemi.GhaemiPackage#getQuerySurface_Outputinstalment()
	 * @model containment="true" required="true"
	 * @generated
	 */
	OutputInstalment getOutputinstalment();

	/**
	 * Sets the value of the '{@link edu.aut.islab.ghaemi.ghaemi.QuerySurface#getOutputinstalment <em>Outputinstalment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outputinstalment</em>' containment reference.
	 * @see #getOutputinstalment()
	 * @generated
	 */
	void setOutputinstalment(OutputInstalment value);

	/**
	 * Returns the value of the '<em><b>Inputinstalment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inputinstalment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputinstalment</em>' containment reference.
	 * @see #setInputinstalment(InputInstalment)
	 * @see edu.aut.islab.ghaemi.ghaemi.GhaemiPackage#getQuerySurface_Inputinstalment()
	 * @model containment="true" required="true"
	 * @generated
	 */
	InputInstalment getInputinstalment();

	/**
	 * Sets the value of the '{@link edu.aut.islab.ghaemi.ghaemi.QuerySurface#getInputinstalment <em>Inputinstalment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inputinstalment</em>' containment reference.
	 * @see #getInputinstalment()
	 * @generated
	 */
	void setInputinstalment(InputInstalment value);

} // QuerySurface

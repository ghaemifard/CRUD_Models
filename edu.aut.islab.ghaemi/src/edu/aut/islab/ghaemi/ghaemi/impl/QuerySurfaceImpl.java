/**
 */
package edu.aut.islab.ghaemi.ghaemi.impl;

import edu.aut.islab.ghaemi.ghaemi.GhaemiPackage;
import edu.aut.islab.ghaemi.ghaemi.InputInstalment;
import edu.aut.islab.ghaemi.ghaemi.OutputInstalment;
import edu.aut.islab.ghaemi.ghaemi.QueryConditionalInstalmnet;
import edu.aut.islab.ghaemi.ghaemi.QuerySelectInstalment;
import edu.aut.islab.ghaemi.ghaemi.QuerySurface;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Query Surface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.aut.islab.ghaemi.ghaemi.impl.QuerySurfaceImpl#getOutputinstalment <em>Outputinstalment</em>}</li>
 *   <li>{@link edu.aut.islab.ghaemi.ghaemi.impl.QuerySurfaceImpl#getQueryselectinstalment <em>Queryselectinstalment</em>}</li>
 *   <li>{@link edu.aut.islab.ghaemi.ghaemi.impl.QuerySurfaceImpl#getWhereInstalment <em>Where Instalment</em>}</li>
 *   <li>{@link edu.aut.islab.ghaemi.ghaemi.impl.QuerySurfaceImpl#getHavingInstalment <em>Having Instalment</em>}</li>
 *   <li>{@link edu.aut.islab.ghaemi.ghaemi.impl.QuerySurfaceImpl#getInputinstalment <em>Inputinstalment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuerySurfaceImpl extends SurfaceImpl implements QuerySurface {
	/**
	 * The cached value of the '{@link #getOutputinstalment() <em>Outputinstalment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputinstalment()
	 * @generated
	 * @ordered
	 */
	protected OutputInstalment outputinstalment;

	/**
	 * The cached value of the '{@link #getQueryselectinstalment() <em>Queryselectinstalment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryselectinstalment()
	 * @generated
	 * @ordered
	 */
	protected QuerySelectInstalment queryselectinstalment;

	/**
	 * The cached value of the '{@link #getWhereInstalment() <em>Where Instalment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhereInstalment()
	 * @generated
	 * @ordered
	 */
	protected QueryConditionalInstalmnet whereInstalment;

	/**
	 * The cached value of the '{@link #getHavingInstalment() <em>Having Instalment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHavingInstalment()
	 * @generated
	 * @ordered
	 */
	protected QueryConditionalInstalmnet havingInstalment;

	/**
	 * The cached value of the '{@link #getInputinstalment() <em>Inputinstalment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputinstalment()
	 * @generated
	 * @ordered
	 */
	protected InputInstalment inputinstalment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuerySurfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GhaemiPackage.Literals.QUERY_SURFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuerySelectInstalment getQueryselectinstalment() {
		return queryselectinstalment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQueryselectinstalment(QuerySelectInstalment newQueryselectinstalment, NotificationChain msgs) {
		QuerySelectInstalment oldQueryselectinstalment = queryselectinstalment;
		queryselectinstalment = newQueryselectinstalment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GhaemiPackage.QUERY_SURFACE__QUERYSELECTINSTALMENT, oldQueryselectinstalment, newQueryselectinstalment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueryselectinstalment(QuerySelectInstalment newQueryselectinstalment) {
		if (newQueryselectinstalment != queryselectinstalment) {
			NotificationChain msgs = null;
			if (queryselectinstalment != null)
				msgs = ((InternalEObject)queryselectinstalment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GhaemiPackage.QUERY_SURFACE__QUERYSELECTINSTALMENT, null, msgs);
			if (newQueryselectinstalment != null)
				msgs = ((InternalEObject)newQueryselectinstalment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GhaemiPackage.QUERY_SURFACE__QUERYSELECTINSTALMENT, null, msgs);
			msgs = basicSetQueryselectinstalment(newQueryselectinstalment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GhaemiPackage.QUERY_SURFACE__QUERYSELECTINSTALMENT, newQueryselectinstalment, newQueryselectinstalment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryConditionalInstalmnet getWhereInstalment() {
		return whereInstalment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhereInstalment(QueryConditionalInstalmnet newWhereInstalment, NotificationChain msgs) {
		QueryConditionalInstalmnet oldWhereInstalment = whereInstalment;
		whereInstalment = newWhereInstalment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GhaemiPackage.QUERY_SURFACE__WHERE_INSTALMENT, oldWhereInstalment, newWhereInstalment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhereInstalment(QueryConditionalInstalmnet newWhereInstalment) {
		if (newWhereInstalment != whereInstalment) {
			NotificationChain msgs = null;
			if (whereInstalment != null)
				msgs = ((InternalEObject)whereInstalment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GhaemiPackage.QUERY_SURFACE__WHERE_INSTALMENT, null, msgs);
			if (newWhereInstalment != null)
				msgs = ((InternalEObject)newWhereInstalment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GhaemiPackage.QUERY_SURFACE__WHERE_INSTALMENT, null, msgs);
			msgs = basicSetWhereInstalment(newWhereInstalment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GhaemiPackage.QUERY_SURFACE__WHERE_INSTALMENT, newWhereInstalment, newWhereInstalment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryConditionalInstalmnet getHavingInstalment() {
		return havingInstalment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHavingInstalment(QueryConditionalInstalmnet newHavingInstalment, NotificationChain msgs) {
		QueryConditionalInstalmnet oldHavingInstalment = havingInstalment;
		havingInstalment = newHavingInstalment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GhaemiPackage.QUERY_SURFACE__HAVING_INSTALMENT, oldHavingInstalment, newHavingInstalment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHavingInstalment(QueryConditionalInstalmnet newHavingInstalment) {
		if (newHavingInstalment != havingInstalment) {
			NotificationChain msgs = null;
			if (havingInstalment != null)
				msgs = ((InternalEObject)havingInstalment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GhaemiPackage.QUERY_SURFACE__HAVING_INSTALMENT, null, msgs);
			if (newHavingInstalment != null)
				msgs = ((InternalEObject)newHavingInstalment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GhaemiPackage.QUERY_SURFACE__HAVING_INSTALMENT, null, msgs);
			msgs = basicSetHavingInstalment(newHavingInstalment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GhaemiPackage.QUERY_SURFACE__HAVING_INSTALMENT, newHavingInstalment, newHavingInstalment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputInstalment getOutputinstalment() {
		return outputinstalment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutputinstalment(OutputInstalment newOutputinstalment, NotificationChain msgs) {
		OutputInstalment oldOutputinstalment = outputinstalment;
		outputinstalment = newOutputinstalment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GhaemiPackage.QUERY_SURFACE__OUTPUTINSTALMENT, oldOutputinstalment, newOutputinstalment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputinstalment(OutputInstalment newOutputinstalment) {
		if (newOutputinstalment != outputinstalment) {
			NotificationChain msgs = null;
			if (outputinstalment != null)
				msgs = ((InternalEObject)outputinstalment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GhaemiPackage.QUERY_SURFACE__OUTPUTINSTALMENT, null, msgs);
			if (newOutputinstalment != null)
				msgs = ((InternalEObject)newOutputinstalment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GhaemiPackage.QUERY_SURFACE__OUTPUTINSTALMENT, null, msgs);
			msgs = basicSetOutputinstalment(newOutputinstalment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GhaemiPackage.QUERY_SURFACE__OUTPUTINSTALMENT, newOutputinstalment, newOutputinstalment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputInstalment getInputinstalment() {
		return inputinstalment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputinstalment(InputInstalment newInputinstalment, NotificationChain msgs) {
		InputInstalment oldInputinstalment = inputinstalment;
		inputinstalment = newInputinstalment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GhaemiPackage.QUERY_SURFACE__INPUTINSTALMENT, oldInputinstalment, newInputinstalment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputinstalment(InputInstalment newInputinstalment) {
		if (newInputinstalment != inputinstalment) {
			NotificationChain msgs = null;
			if (inputinstalment != null)
				msgs = ((InternalEObject)inputinstalment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GhaemiPackage.QUERY_SURFACE__INPUTINSTALMENT, null, msgs);
			if (newInputinstalment != null)
				msgs = ((InternalEObject)newInputinstalment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GhaemiPackage.QUERY_SURFACE__INPUTINSTALMENT, null, msgs);
			msgs = basicSetInputinstalment(newInputinstalment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GhaemiPackage.QUERY_SURFACE__INPUTINSTALMENT, newInputinstalment, newInputinstalment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GhaemiPackage.QUERY_SURFACE__OUTPUTINSTALMENT:
				return basicSetOutputinstalment(null, msgs);
			case GhaemiPackage.QUERY_SURFACE__QUERYSELECTINSTALMENT:
				return basicSetQueryselectinstalment(null, msgs);
			case GhaemiPackage.QUERY_SURFACE__WHERE_INSTALMENT:
				return basicSetWhereInstalment(null, msgs);
			case GhaemiPackage.QUERY_SURFACE__HAVING_INSTALMENT:
				return basicSetHavingInstalment(null, msgs);
			case GhaemiPackage.QUERY_SURFACE__INPUTINSTALMENT:
				return basicSetInputinstalment(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GhaemiPackage.QUERY_SURFACE__OUTPUTINSTALMENT:
				return getOutputinstalment();
			case GhaemiPackage.QUERY_SURFACE__QUERYSELECTINSTALMENT:
				return getQueryselectinstalment();
			case GhaemiPackage.QUERY_SURFACE__WHERE_INSTALMENT:
				return getWhereInstalment();
			case GhaemiPackage.QUERY_SURFACE__HAVING_INSTALMENT:
				return getHavingInstalment();
			case GhaemiPackage.QUERY_SURFACE__INPUTINSTALMENT:
				return getInputinstalment();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GhaemiPackage.QUERY_SURFACE__OUTPUTINSTALMENT:
				setOutputinstalment((OutputInstalment)newValue);
				return;
			case GhaemiPackage.QUERY_SURFACE__QUERYSELECTINSTALMENT:
				setQueryselectinstalment((QuerySelectInstalment)newValue);
				return;
			case GhaemiPackage.QUERY_SURFACE__WHERE_INSTALMENT:
				setWhereInstalment((QueryConditionalInstalmnet)newValue);
				return;
			case GhaemiPackage.QUERY_SURFACE__HAVING_INSTALMENT:
				setHavingInstalment((QueryConditionalInstalmnet)newValue);
				return;
			case GhaemiPackage.QUERY_SURFACE__INPUTINSTALMENT:
				setInputinstalment((InputInstalment)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GhaemiPackage.QUERY_SURFACE__OUTPUTINSTALMENT:
				setOutputinstalment((OutputInstalment)null);
				return;
			case GhaemiPackage.QUERY_SURFACE__QUERYSELECTINSTALMENT:
				setQueryselectinstalment((QuerySelectInstalment)null);
				return;
			case GhaemiPackage.QUERY_SURFACE__WHERE_INSTALMENT:
				setWhereInstalment((QueryConditionalInstalmnet)null);
				return;
			case GhaemiPackage.QUERY_SURFACE__HAVING_INSTALMENT:
				setHavingInstalment((QueryConditionalInstalmnet)null);
				return;
			case GhaemiPackage.QUERY_SURFACE__INPUTINSTALMENT:
				setInputinstalment((InputInstalment)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GhaemiPackage.QUERY_SURFACE__OUTPUTINSTALMENT:
				return outputinstalment != null;
			case GhaemiPackage.QUERY_SURFACE__QUERYSELECTINSTALMENT:
				return queryselectinstalment != null;
			case GhaemiPackage.QUERY_SURFACE__WHERE_INSTALMENT:
				return whereInstalment != null;
			case GhaemiPackage.QUERY_SURFACE__HAVING_INSTALMENT:
				return havingInstalment != null;
			case GhaemiPackage.QUERY_SURFACE__INPUTINSTALMENT:
				return inputinstalment != null;
		}
		return super.eIsSet(featureID);
	}

} //QuerySurfaceImpl

/**
 */
package edu.aut.islab.ghaemi.ghaemi.impl;

import edu.aut.islab.ghaemi.ghaemi.FuncDefinition;
import edu.aut.islab.ghaemi.ghaemi.Function;
import edu.aut.islab.ghaemi.ghaemi.GhaemiPackage;
import edu.aut.islab.ghaemi.ghaemi.Node;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.aut.islab.ghaemi.ghaemi.impl.FunctionImpl#getParams <em>Params</em>}</li>
 *   <li>{@link edu.aut.islab.ghaemi.ghaemi.impl.FunctionImpl#getFuncRef <em>Func Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionImpl extends NodeImpl implements Function {
	/**
	 * The cached value of the '{@link #getParams() <em>Params</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParams()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> params;

	/**
	 * The cached value of the '{@link #getFuncRef() <em>Func Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuncRef()
	 * @generated
	 * @ordered
	 */
	protected FuncDefinition funcRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GhaemiPackage.Literals.FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getParams() {
		if (params == null) {
			params = new EObjectContainmentEList<Node>(Node.class, this, GhaemiPackage.FUNCTION__PARAMS);
		}
		return params;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FuncDefinition getFuncRef() {
		if (funcRef != null && funcRef.eIsProxy()) {
			InternalEObject oldFuncRef = (InternalEObject)funcRef;
			funcRef = (FuncDefinition)eResolveProxy(oldFuncRef);
			if (funcRef != oldFuncRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GhaemiPackage.FUNCTION__FUNC_REF, oldFuncRef, funcRef));
			}
		}
		return funcRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FuncDefinition basicGetFuncRef() {
		return funcRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFuncRef(FuncDefinition newFuncRef) {
		FuncDefinition oldFuncRef = funcRef;
		funcRef = newFuncRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GhaemiPackage.FUNCTION__FUNC_REF, oldFuncRef, funcRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GhaemiPackage.FUNCTION__PARAMS:
				return ((InternalEList<?>)getParams()).basicRemove(otherEnd, msgs);
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
			case GhaemiPackage.FUNCTION__PARAMS:
				return getParams();
			case GhaemiPackage.FUNCTION__FUNC_REF:
				if (resolve) return getFuncRef();
				return basicGetFuncRef();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GhaemiPackage.FUNCTION__PARAMS:
				getParams().clear();
				getParams().addAll((Collection<? extends Node>)newValue);
				return;
			case GhaemiPackage.FUNCTION__FUNC_REF:
				setFuncRef((FuncDefinition)newValue);
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
			case GhaemiPackage.FUNCTION__PARAMS:
				getParams().clear();
				return;
			case GhaemiPackage.FUNCTION__FUNC_REF:
				setFuncRef((FuncDefinition)null);
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
			case GhaemiPackage.FUNCTION__PARAMS:
				return params != null && !params.isEmpty();
			case GhaemiPackage.FUNCTION__FUNC_REF:
				return funcRef != null;
		}
		return super.eIsSet(featureID);
	}

} //FunctionImpl

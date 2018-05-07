/**
 */
package query.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import query.Input;
import query.InputDef;
import query.QueryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link query.impl.InputImpl#getInputRef <em>Input Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InputImpl extends NodeImpl implements Input {
	/**
	 * The cached value of the '{@link #getInputRef() <em>Input Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputRef()
	 * @generated
	 * @ordered
	 */
	protected InputDef inputRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QueryPackage.Literals.INPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputDef getInputRef() {
		if (inputRef != null && inputRef.eIsProxy()) {
			InternalEObject oldInputRef = (InternalEObject)inputRef;
			inputRef = (InputDef)eResolveProxy(oldInputRef);
			if (inputRef != oldInputRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, QueryPackage.INPUT__INPUT_REF, oldInputRef, inputRef));
			}
		}
		return inputRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputDef basicGetInputRef() {
		return inputRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputRef(InputDef newInputRef) {
		InputDef oldInputRef = inputRef;
		inputRef = newInputRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.INPUT__INPUT_REF, oldInputRef, inputRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QueryPackage.INPUT__INPUT_REF:
				if (resolve) return getInputRef();
				return basicGetInputRef();
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
			case QueryPackage.INPUT__INPUT_REF:
				setInputRef((InputDef)newValue);
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
			case QueryPackage.INPUT__INPUT_REF:
				setInputRef((InputDef)null);
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
			case QueryPackage.INPUT__INPUT_REF:
				return inputRef != null;
		}
		return super.eIsSet(featureID);
	}

} //InputImpl

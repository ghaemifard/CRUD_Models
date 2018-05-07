/**
 */
package edu.aut.islab.ghaemi.ghaemi.impl;

import edu.aut.islab.ghaemi.ghaemi.CallQuerySurface;
import edu.aut.islab.ghaemi.ghaemi.GhaemiPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call Query Surface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.aut.islab.ghaemi.ghaemi.impl.CallQuerySurfaceImpl#getQuerySurface <em>Query Surface</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CallQuerySurfaceImpl extends FunctionImpl implements CallQuerySurface {
	/**
	 * The default value of the '{@link #getQuerySurface() <em>Query Surface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuerySurface()
	 * @generated
	 * @ordered
	 */
	protected static final String QUERY_SURFACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuerySurface() <em>Query Surface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuerySurface()
	 * @generated
	 * @ordered
	 */
	protected String querySurface = QUERY_SURFACE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallQuerySurfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GhaemiPackage.Literals.CALL_QUERY_SURFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQuerySurface() {
		return querySurface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuerySurface(String newQuerySurface) {
		String oldQuerySurface = querySurface;
		querySurface = newQuerySurface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GhaemiPackage.CALL_QUERY_SURFACE__QUERY_SURFACE, oldQuerySurface, querySurface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GhaemiPackage.CALL_QUERY_SURFACE__QUERY_SURFACE:
				return getQuerySurface();
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
			case GhaemiPackage.CALL_QUERY_SURFACE__QUERY_SURFACE:
				setQuerySurface((String)newValue);
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
			case GhaemiPackage.CALL_QUERY_SURFACE__QUERY_SURFACE:
				setQuerySurface(QUERY_SURFACE_EDEFAULT);
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
			case GhaemiPackage.CALL_QUERY_SURFACE__QUERY_SURFACE:
				return QUERY_SURFACE_EDEFAULT == null ? querySurface != null : !QUERY_SURFACE_EDEFAULT.equals(querySurface);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (querySurface: ");
		result.append(querySurface);
		result.append(')');
		return result.toString();
	}

} //CallQuerySurfaceImpl

/**
 */
package query.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import query.CallQuerySurface;
import query.QueryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call Query Surface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link query.impl.CallQuerySurfaceImpl#getSurfaceName <em>Surface Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CallQuerySurfaceImpl extends FunctionImpl implements CallQuerySurface {
	/**
	 * The default value of the '{@link #getSurfaceName() <em>Surface Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurfaceName()
	 * @generated
	 * @ordered
	 */
	protected static final String SURFACE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSurfaceName() <em>Surface Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurfaceName()
	 * @generated
	 * @ordered
	 */
	protected String surfaceName = SURFACE_NAME_EDEFAULT;

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
		return QueryPackage.Literals.CALL_QUERY_SURFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSurfaceName() {
		return surfaceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSurfaceName(String newSurfaceName) {
		String oldSurfaceName = surfaceName;
		surfaceName = newSurfaceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.CALL_QUERY_SURFACE__SURFACE_NAME, oldSurfaceName, surfaceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QueryPackage.CALL_QUERY_SURFACE__SURFACE_NAME:
				return getSurfaceName();
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
			case QueryPackage.CALL_QUERY_SURFACE__SURFACE_NAME:
				setSurfaceName((String)newValue);
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
			case QueryPackage.CALL_QUERY_SURFACE__SURFACE_NAME:
				setSurfaceName(SURFACE_NAME_EDEFAULT);
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
			case QueryPackage.CALL_QUERY_SURFACE__SURFACE_NAME:
				return SURFACE_NAME_EDEFAULT == null ? surfaceName != null : !SURFACE_NAME_EDEFAULT.equals(surfaceName);
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
		result.append(" (surfaceName: ");
		result.append(surfaceName);
		result.append(')');
		return result.toString();
	}

} //CallQuerySurfaceImpl

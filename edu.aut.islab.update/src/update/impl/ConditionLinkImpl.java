/**
 */
package update.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import update.ConditionLink;
import update.Node;
import update.UpdatePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link update.impl.ConditionLinkImpl#getSrc <em>Src</em>}</li>
 *   <li>{@link update.impl.ConditionLinkImpl#getDst <em>Dst</em>}</li>
 *   <li>{@link update.impl.ConditionLinkImpl#isNegative <em>Negative</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ConditionLinkImpl extends EObjectImpl implements ConditionLink {
	/**
	 * The cached value of the '{@link #getSrc() <em>Src</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrc()
	 * @generated
	 * @ordered
	 */
	protected Node src;

	/**
	 * The cached value of the '{@link #getDst() <em>Dst</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDst()
	 * @generated
	 * @ordered
	 */
	protected Node dst;

	/**
	 * The default value of the '{@link #isNegative() <em>Negative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNegative()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NEGATIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNegative() <em>Negative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNegative()
	 * @generated
	 * @ordered
	 */
	protected boolean negative = NEGATIVE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UpdatePackage.Literals.CONDITION_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getSrc() {
		if (src != null && src.eIsProxy()) {
			InternalEObject oldSrc = (InternalEObject)src;
			src = (Node)eResolveProxy(oldSrc);
			if (src != oldSrc) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UpdatePackage.CONDITION_LINK__SRC, oldSrc, src));
			}
		}
		return src;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetSrc() {
		return src;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSrc(Node newSrc) {
		Node oldSrc = src;
		src = newSrc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UpdatePackage.CONDITION_LINK__SRC, oldSrc, src));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getDst() {
		if (dst != null && dst.eIsProxy()) {
			InternalEObject oldDst = (InternalEObject)dst;
			dst = (Node)eResolveProxy(oldDst);
			if (dst != oldDst) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UpdatePackage.CONDITION_LINK__DST, oldDst, dst));
			}
		}
		return dst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetDst() {
		return dst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDst(Node newDst) {
		Node oldDst = dst;
		dst = newDst;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UpdatePackage.CONDITION_LINK__DST, oldDst, dst));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNegative() {
		return negative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNegative(boolean newNegative) {
		boolean oldNegative = negative;
		negative = newNegative;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UpdatePackage.CONDITION_LINK__NEGATIVE, oldNegative, negative));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UpdatePackage.CONDITION_LINK__SRC:
				if (resolve) return getSrc();
				return basicGetSrc();
			case UpdatePackage.CONDITION_LINK__DST:
				if (resolve) return getDst();
				return basicGetDst();
			case UpdatePackage.CONDITION_LINK__NEGATIVE:
				return isNegative();
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
			case UpdatePackage.CONDITION_LINK__SRC:
				setSrc((Node)newValue);
				return;
			case UpdatePackage.CONDITION_LINK__DST:
				setDst((Node)newValue);
				return;
			case UpdatePackage.CONDITION_LINK__NEGATIVE:
				setNegative((Boolean)newValue);
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
			case UpdatePackage.CONDITION_LINK__SRC:
				setSrc((Node)null);
				return;
			case UpdatePackage.CONDITION_LINK__DST:
				setDst((Node)null);
				return;
			case UpdatePackage.CONDITION_LINK__NEGATIVE:
				setNegative(NEGATIVE_EDEFAULT);
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
			case UpdatePackage.CONDITION_LINK__SRC:
				return src != null;
			case UpdatePackage.CONDITION_LINK__DST:
				return dst != null;
			case UpdatePackage.CONDITION_LINK__NEGATIVE:
				return negative != NEGATIVE_EDEFAULT;
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
		result.append(" (negative: ");
		result.append(negative);
		result.append(')');
		return result.toString();
	}

} //ConditionLinkImpl

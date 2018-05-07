/**
 */
package edu.aut.islab.ghaemi.ghaemi.impl;

import edu.aut.islab.ghaemi.ghaemi.AbstractCondElement;
import edu.aut.islab.ghaemi.ghaemi.Disjunction;
import edu.aut.islab.ghaemi.ghaemi.DisjunctionRelationship;
import edu.aut.islab.ghaemi.ghaemi.GhaemiPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Disjunction Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.aut.islab.ghaemi.ghaemi.impl.DisjunctionRelationshipImpl#getSrc <em>Src</em>}</li>
 *   <li>{@link edu.aut.islab.ghaemi.ghaemi.impl.DisjunctionRelationshipImpl#getDst <em>Dst</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DisjunctionRelationshipImpl extends MinimalEObjectImpl.Container implements DisjunctionRelationship {
	/**
	 * The cached value of the '{@link #getSrc() <em>Src</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrc()
	 * @generated
	 * @ordered
	 */
	protected Disjunction src;

	/**
	 * The cached value of the '{@link #getDst() <em>Dst</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDst()
	 * @generated
	 * @ordered
	 */
	protected AbstractCondElement dst;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DisjunctionRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GhaemiPackage.Literals.DISJUNCTION_RELATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Disjunction getSrc() {
		if (src != null && src.eIsProxy()) {
			InternalEObject oldSrc = (InternalEObject)src;
			src = (Disjunction)eResolveProxy(oldSrc);
			if (src != oldSrc) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GhaemiPackage.DISJUNCTION_RELATIONSHIP__SRC, oldSrc, src));
			}
		}
		return src;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Disjunction basicGetSrc() {
		return src;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSrc(Disjunction newSrc) {
		Disjunction oldSrc = src;
		src = newSrc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GhaemiPackage.DISJUNCTION_RELATIONSHIP__SRC, oldSrc, src));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractCondElement getDst() {
		if (dst != null && dst.eIsProxy()) {
			InternalEObject oldDst = (InternalEObject)dst;
			dst = (AbstractCondElement)eResolveProxy(oldDst);
			if (dst != oldDst) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GhaemiPackage.DISJUNCTION_RELATIONSHIP__DST, oldDst, dst));
			}
		}
		return dst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractCondElement basicGetDst() {
		return dst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDst(AbstractCondElement newDst) {
		AbstractCondElement oldDst = dst;
		dst = newDst;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GhaemiPackage.DISJUNCTION_RELATIONSHIP__DST, oldDst, dst));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GhaemiPackage.DISJUNCTION_RELATIONSHIP__SRC:
				if (resolve) return getSrc();
				return basicGetSrc();
			case GhaemiPackage.DISJUNCTION_RELATIONSHIP__DST:
				if (resolve) return getDst();
				return basicGetDst();
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
			case GhaemiPackage.DISJUNCTION_RELATIONSHIP__SRC:
				setSrc((Disjunction)newValue);
				return;
			case GhaemiPackage.DISJUNCTION_RELATIONSHIP__DST:
				setDst((AbstractCondElement)newValue);
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
			case GhaemiPackage.DISJUNCTION_RELATIONSHIP__SRC:
				setSrc((Disjunction)null);
				return;
			case GhaemiPackage.DISJUNCTION_RELATIONSHIP__DST:
				setDst((AbstractCondElement)null);
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
			case GhaemiPackage.DISJUNCTION_RELATIONSHIP__SRC:
				return src != null;
			case GhaemiPackage.DISJUNCTION_RELATIONSHIP__DST:
				return dst != null;
		}
		return super.eIsSet(featureID);
	}

} //DisjunctionRelationshipImpl

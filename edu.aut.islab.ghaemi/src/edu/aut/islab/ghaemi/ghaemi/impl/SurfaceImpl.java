/**
 */
package edu.aut.islab.ghaemi.ghaemi.impl;

import edu.aut.islab.ghaemi.ghaemi.FuncDefinition;
import edu.aut.islab.ghaemi.ghaemi.GhaemiPackage;
import edu.aut.islab.ghaemi.ghaemi.Surface;
import edu.aut.islab.ghaemi.ghaemi.Type;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Surface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.aut.islab.ghaemi.ghaemi.impl.SurfaceImpl#getType <em>Type</em>}</li>
 *   <li>{@link edu.aut.islab.ghaemi.ghaemi.impl.SurfaceImpl#getFuncDefs <em>Func Defs</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SurfaceImpl extends MinimalEObjectImpl.Container implements Surface {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> type;

	/**
	 * The cached value of the '{@link #getFuncDefs() <em>Func Defs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuncDefs()
	 * @generated
	 * @ordered
	 */
	protected EList<FuncDefinition> funcDefs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SurfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GhaemiPackage.Literals.SURFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getType() {
		if (type == null) {
			type = new EObjectContainmentEList<Type>(Type.class, this, GhaemiPackage.SURFACE__TYPE);
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FuncDefinition> getFuncDefs() {
		if (funcDefs == null) {
			funcDefs = new EObjectContainmentEList<FuncDefinition>(FuncDefinition.class, this, GhaemiPackage.SURFACE__FUNC_DEFS);
		}
		return funcDefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GhaemiPackage.SURFACE__TYPE:
				return ((InternalEList<?>)getType()).basicRemove(otherEnd, msgs);
			case GhaemiPackage.SURFACE__FUNC_DEFS:
				return ((InternalEList<?>)getFuncDefs()).basicRemove(otherEnd, msgs);
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
			case GhaemiPackage.SURFACE__TYPE:
				return getType();
			case GhaemiPackage.SURFACE__FUNC_DEFS:
				return getFuncDefs();
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
			case GhaemiPackage.SURFACE__TYPE:
				getType().clear();
				getType().addAll((Collection<? extends Type>)newValue);
				return;
			case GhaemiPackage.SURFACE__FUNC_DEFS:
				getFuncDefs().clear();
				getFuncDefs().addAll((Collection<? extends FuncDefinition>)newValue);
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
			case GhaemiPackage.SURFACE__TYPE:
				getType().clear();
				return;
			case GhaemiPackage.SURFACE__FUNC_DEFS:
				getFuncDefs().clear();
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
			case GhaemiPackage.SURFACE__TYPE:
				return type != null && !type.isEmpty();
			case GhaemiPackage.SURFACE__FUNC_DEFS:
				return funcDefs != null && !funcDefs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SurfaceImpl

/**
 */
package edu.aut.islab.ghaemi.ghaemi.impl;

import edu.aut.islab.ghaemi.ghaemi.GhaemiPackage;
import edu.aut.islab.ghaemi.ghaemi.OutputInstalment;
import edu.aut.islab.ghaemi.ghaemi.OutputNode;

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
 * An implementation of the model object '<em><b>Output Instalment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.aut.islab.ghaemi.ghaemi.impl.OutputInstalmentImpl#getOutputnode <em>Outputnode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OutputInstalmentImpl extends MinimalEObjectImpl.Container implements OutputInstalment {
	/**
	 * The cached value of the '{@link #getOutputnode() <em>Outputnode</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputnode()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputNode> outputnode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputInstalmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GhaemiPackage.Literals.OUTPUT_INSTALMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputNode> getOutputnode() {
		if (outputnode == null) {
			outputnode = new EObjectContainmentEList<OutputNode>(OutputNode.class, this, GhaemiPackage.OUTPUT_INSTALMENT__OUTPUTNODE);
		}
		return outputnode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GhaemiPackage.OUTPUT_INSTALMENT__OUTPUTNODE:
				return ((InternalEList<?>)getOutputnode()).basicRemove(otherEnd, msgs);
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
			case GhaemiPackage.OUTPUT_INSTALMENT__OUTPUTNODE:
				return getOutputnode();
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
			case GhaemiPackage.OUTPUT_INSTALMENT__OUTPUTNODE:
				getOutputnode().clear();
				getOutputnode().addAll((Collection<? extends OutputNode>)newValue);
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
			case GhaemiPackage.OUTPUT_INSTALMENT__OUTPUTNODE:
				getOutputnode().clear();
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
			case GhaemiPackage.OUTPUT_INSTALMENT__OUTPUTNODE:
				return outputnode != null && !outputnode.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OutputInstalmentImpl

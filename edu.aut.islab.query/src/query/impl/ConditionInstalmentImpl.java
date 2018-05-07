/**
 */
package query.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import query.AbstractConditionElement;
import query.ConditionInstalment;
import query.JuncRelationship;
import query.QueryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition Instalment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link query.impl.ConditionInstalmentImpl#getParts <em>Parts</em>}</li>
 *   <li>{@link query.impl.ConditionInstalmentImpl#getLinks <em>Links</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ConditionInstalmentImpl extends EObjectImpl implements ConditionInstalment {
	/**
	 * The cached value of the '{@link #getParts() <em>Parts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParts()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractConditionElement> parts;

	/**
	 * The cached value of the '{@link #getLinks() <em>Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<JuncRelationship> links;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionInstalmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QueryPackage.Literals.CONDITION_INSTALMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractConditionElement> getParts() {
		if (parts == null) {
			parts = new EObjectContainmentEList<AbstractConditionElement>(AbstractConditionElement.class, this, QueryPackage.CONDITION_INSTALMENT__PARTS);
		}
		return parts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JuncRelationship> getLinks() {
		if (links == null) {
			links = new EObjectContainmentEList<JuncRelationship>(JuncRelationship.class, this, QueryPackage.CONDITION_INSTALMENT__LINKS);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QueryPackage.CONDITION_INSTALMENT__PARTS:
				return ((InternalEList<?>)getParts()).basicRemove(otherEnd, msgs);
			case QueryPackage.CONDITION_INSTALMENT__LINKS:
				return ((InternalEList<?>)getLinks()).basicRemove(otherEnd, msgs);
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
			case QueryPackage.CONDITION_INSTALMENT__PARTS:
				return getParts();
			case QueryPackage.CONDITION_INSTALMENT__LINKS:
				return getLinks();
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
			case QueryPackage.CONDITION_INSTALMENT__PARTS:
				getParts().clear();
				getParts().addAll((Collection<? extends AbstractConditionElement>)newValue);
				return;
			case QueryPackage.CONDITION_INSTALMENT__LINKS:
				getLinks().clear();
				getLinks().addAll((Collection<? extends JuncRelationship>)newValue);
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
			case QueryPackage.CONDITION_INSTALMENT__PARTS:
				getParts().clear();
				return;
			case QueryPackage.CONDITION_INSTALMENT__LINKS:
				getLinks().clear();
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
			case QueryPackage.CONDITION_INSTALMENT__PARTS:
				return parts != null && !parts.isEmpty();
			case QueryPackage.CONDITION_INSTALMENT__LINKS:
				return links != null && !links.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConditionInstalmentImpl

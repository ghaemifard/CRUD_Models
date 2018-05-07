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

import query.AbstractNode;
import query.OutputInstalment;
import query.QueryPackage;
import query.RelationSelect;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Output Instalment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link query.impl.OutputInstalmentImpl#getName <em>Name</em>}</li>
 *   <li>{@link query.impl.OutputInstalmentImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link query.impl.OutputInstalmentImpl#getRels <em>Rels</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OutputInstalmentImpl extends EObjectImpl implements OutputInstalment {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "Output";

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNodes() <em>Nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractNode> nodes;

	/**
	 * The cached value of the '{@link #getRels() <em>Rels</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRels()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationSelect> rels;

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
		return QueryPackage.Literals.OUTPUT_INSTALMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractNode> getNodes() {
		if (nodes == null) {
			nodes = new EObjectContainmentEList<AbstractNode>(AbstractNode.class, this, QueryPackage.OUTPUT_INSTALMENT__NODES);
		}
		return nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RelationSelect> getRels() {
		if (rels == null) {
			rels = new EObjectContainmentEList<RelationSelect>(RelationSelect.class, this, QueryPackage.OUTPUT_INSTALMENT__RELS);
		}
		return rels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QueryPackage.OUTPUT_INSTALMENT__NODES:
				return ((InternalEList<?>)getNodes()).basicRemove(otherEnd, msgs);
			case QueryPackage.OUTPUT_INSTALMENT__RELS:
				return ((InternalEList<?>)getRels()).basicRemove(otherEnd, msgs);
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
			case QueryPackage.OUTPUT_INSTALMENT__NAME:
				return getName();
			case QueryPackage.OUTPUT_INSTALMENT__NODES:
				return getNodes();
			case QueryPackage.OUTPUT_INSTALMENT__RELS:
				return getRels();
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
			case QueryPackage.OUTPUT_INSTALMENT__NODES:
				getNodes().clear();
				getNodes().addAll((Collection<? extends AbstractNode>)newValue);
				return;
			case QueryPackage.OUTPUT_INSTALMENT__RELS:
				getRels().clear();
				getRels().addAll((Collection<? extends RelationSelect>)newValue);
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
			case QueryPackage.OUTPUT_INSTALMENT__NODES:
				getNodes().clear();
				return;
			case QueryPackage.OUTPUT_INSTALMENT__RELS:
				getRels().clear();
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
			case QueryPackage.OUTPUT_INSTALMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case QueryPackage.OUTPUT_INSTALMENT__NODES:
				return nodes != null && !nodes.isEmpty();
			case QueryPackage.OUTPUT_INSTALMENT__RELS:
				return rels != null && !rels.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //OutputInstalmentImpl

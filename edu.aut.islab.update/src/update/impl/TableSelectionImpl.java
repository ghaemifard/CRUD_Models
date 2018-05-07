/**
 */
package update.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import update.MyTable;
import update.RelationSelect;
import update.TableSelection;
import update.UpdatePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table Selection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link update.impl.TableSelectionImpl#getName <em>Name</em>}</li>
 *   <li>{@link update.impl.TableSelectionImpl#getTables <em>Tables</em>}</li>
 *   <li>{@link update.impl.TableSelectionImpl#getRels <em>Rels</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TableSelectionImpl extends EObjectImpl implements TableSelection {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "TableSelection";

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
	 * The cached value of the '{@link #getTables() <em>Tables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTables()
	 * @generated
	 * @ordered
	 */
	protected EList<MyTable> tables;

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
	protected TableSelectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UpdatePackage.Literals.TABLE_SELECTION;
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
	public EList<MyTable> getTables() {
		if (tables == null) {
			tables = new EObjectContainmentEList<MyTable>(MyTable.class, this, UpdatePackage.TABLE_SELECTION__TABLES);
		}
		return tables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RelationSelect> getRels() {
		if (rels == null) {
			rels = new EObjectContainmentEList<RelationSelect>(RelationSelect.class, this, UpdatePackage.TABLE_SELECTION__RELS);
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
			case UpdatePackage.TABLE_SELECTION__TABLES:
				return ((InternalEList<?>)getTables()).basicRemove(otherEnd, msgs);
			case UpdatePackage.TABLE_SELECTION__RELS:
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
			case UpdatePackage.TABLE_SELECTION__NAME:
				return getName();
			case UpdatePackage.TABLE_SELECTION__TABLES:
				return getTables();
			case UpdatePackage.TABLE_SELECTION__RELS:
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
			case UpdatePackage.TABLE_SELECTION__TABLES:
				getTables().clear();
				getTables().addAll((Collection<? extends MyTable>)newValue);
				return;
			case UpdatePackage.TABLE_SELECTION__RELS:
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
			case UpdatePackage.TABLE_SELECTION__TABLES:
				getTables().clear();
				return;
			case UpdatePackage.TABLE_SELECTION__RELS:
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
			case UpdatePackage.TABLE_SELECTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UpdatePackage.TABLE_SELECTION__TABLES:
				return tables != null && !tables.isEmpty();
			case UpdatePackage.TABLE_SELECTION__RELS:
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

} //TableSelectionImpl

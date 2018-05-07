/**
 */
package delete.impl;

import delete.DeletePackage;
import delete.MyTable;
import delete.RelationSelect;
import delete.TableListInstalment;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table List Instalment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link delete.impl.TableListInstalmentImpl#getName <em>Name</em>}</li>
 *   <li>{@link delete.impl.TableListInstalmentImpl#getTables <em>Tables</em>}</li>
 *   <li>{@link delete.impl.TableListInstalmentImpl#getRels <em>Rels</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TableListInstalmentImpl extends EObjectImpl implements TableListInstalment {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "Table Selection";

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
	protected TableListInstalmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DeletePackage.Literals.TABLE_LIST_INSTALMENT;
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
			tables = new EObjectContainmentEList<MyTable>(MyTable.class, this, DeletePackage.TABLE_LIST_INSTALMENT__TABLES);
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
			rels = new EObjectContainmentEList<RelationSelect>(RelationSelect.class, this, DeletePackage.TABLE_LIST_INSTALMENT__RELS);
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
			case DeletePackage.TABLE_LIST_INSTALMENT__TABLES:
				return ((InternalEList<?>)getTables()).basicRemove(otherEnd, msgs);
			case DeletePackage.TABLE_LIST_INSTALMENT__RELS:
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
			case DeletePackage.TABLE_LIST_INSTALMENT__NAME:
				return getName();
			case DeletePackage.TABLE_LIST_INSTALMENT__TABLES:
				return getTables();
			case DeletePackage.TABLE_LIST_INSTALMENT__RELS:
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
			case DeletePackage.TABLE_LIST_INSTALMENT__TABLES:
				getTables().clear();
				getTables().addAll((Collection<? extends MyTable>)newValue);
				return;
			case DeletePackage.TABLE_LIST_INSTALMENT__RELS:
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
			case DeletePackage.TABLE_LIST_INSTALMENT__TABLES:
				getTables().clear();
				return;
			case DeletePackage.TABLE_LIST_INSTALMENT__RELS:
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
			case DeletePackage.TABLE_LIST_INSTALMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case DeletePackage.TABLE_LIST_INSTALMENT__TABLES:
				return tables != null && !tables.isEmpty();
			case DeletePackage.TABLE_LIST_INSTALMENT__RELS:
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

} //TableListInstalmentImpl

/**
 */
package query.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import query.FunctionDef;
import query.GroupInstalment;
import query.HavingInstalment;
import query.InputInstalment;
import query.OutputInstalment;
import query.QueryPackage;
import query.QuerySurface;
import query.QueryType;
import query.SortInstalment;
import query.Type;
import query.WhereInstalment;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Surface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link query.impl.QuerySurfaceImpl#getOutputInstalment <em>Output Instalment</em>}</li>
 *   <li>{@link query.impl.QuerySurfaceImpl#getInputInstalment <em>Input Instalment</em>}</li>
 *   <li>{@link query.impl.QuerySurfaceImpl#getWhereInstalment <em>Where Instalment</em>}</li>
 *   <li>{@link query.impl.QuerySurfaceImpl#getHavingInstalment <em>Having Instalment</em>}</li>
 *   <li>{@link query.impl.QuerySurfaceImpl#getGroupInstalment <em>Group Instalment</em>}</li>
 *   <li>{@link query.impl.QuerySurfaceImpl#getSortInstalment <em>Sort Instalment</em>}</li>
 *   <li>{@link query.impl.QuerySurfaceImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link query.impl.QuerySurfaceImpl#getFuncs <em>Funcs</em>}</li>
 *   <li>{@link query.impl.QuerySurfaceImpl#getName <em>Name</em>}</li>
 *   <li>{@link query.impl.QuerySurfaceImpl#getUserName <em>User Name</em>}</li>
 *   <li>{@link query.impl.QuerySurfaceImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link query.impl.QuerySurfaceImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link query.impl.QuerySurfaceImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link query.impl.QuerySurfaceImpl#getNumberOfRow <em>Number Of Row</em>}</li>
 *   <li>{@link query.impl.QuerySurfaceImpl#getIndexOfRoes <em>Index Of Roes</em>}</li>
 *   <li>{@link query.impl.QuerySurfaceImpl#isCreateClass <em>Create Class</em>}</li>
 *   <li>{@link query.impl.QuerySurfaceImpl#getAssociatedClass <em>Associated Class</em>}</li>
 *   <li>{@link query.impl.QuerySurfaceImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuerySurfaceImpl extends EObjectImpl implements QuerySurface {
	/**
	 * The cached value of the '{@link #getOutputInstalment() <em>Output Instalment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputInstalment()
	 * @generated
	 * @ordered
	 */
	protected OutputInstalment outputInstalment;

	/**
	 * The cached value of the '{@link #getInputInstalment() <em>Input Instalment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputInstalment()
	 * @generated
	 * @ordered
	 */
	protected InputInstalment inputInstalment;

	/**
	 * The cached value of the '{@link #getWhereInstalment() <em>Where Instalment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhereInstalment()
	 * @generated
	 * @ordered
	 */
	protected WhereInstalment whereInstalment;

	/**
	 * The cached value of the '{@link #getHavingInstalment() <em>Having Instalment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHavingInstalment()
	 * @generated
	 * @ordered
	 */
	protected HavingInstalment havingInstalment;

	/**
	 * The cached value of the '{@link #getGroupInstalment() <em>Group Instalment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupInstalment()
	 * @generated
	 * @ordered
	 */
	protected GroupInstalment groupInstalment;

	/**
	 * The cached value of the '{@link #getSortInstalment() <em>Sort Instalment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortInstalment()
	 * @generated
	 * @ordered
	 */
	protected SortInstalment sortInstalment;

	/**
	 * The cached value of the '{@link #getTypes() <em>Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> types;

	/**
	 * The cached value of the '{@link #getFuncs() <em>Funcs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuncs()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionDef> funcs;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

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
	 * The default value of the '{@link #getUserName() <em>User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserName()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserName() <em>User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserName()
	 * @generated
	 * @ordered
	 */
	protected String userName = USER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected String password = PASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected String uri = URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfRow() <em>Number Of Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfRow()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_ROW_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfRow() <em>Number Of Row</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfRow()
	 * @generated
	 * @ordered
	 */
	protected int numberOfRow = NUMBER_OF_ROW_EDEFAULT;

	/**
	 * The default value of the '{@link #getIndexOfRoes() <em>Index Of Roes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexOfRoes()
	 * @generated
	 * @ordered
	 */
	protected static final int INDEX_OF_ROES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIndexOfRoes() <em>Index Of Roes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndexOfRoes()
	 * @generated
	 * @ordered
	 */
	protected int indexOfRoes = INDEX_OF_ROES_EDEFAULT;

	/**
	 * The default value of the '{@link #isCreateClass() <em>Create Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCreateClass()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CREATE_CLASS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCreateClass() <em>Create Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCreateClass()
	 * @generated
	 * @ordered
	 */
	protected boolean createClass = CREATE_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAssociatedClass() <em>Associated Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociatedClass()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSOCIATED_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssociatedClass() <em>Associated Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociatedClass()
	 * @generated
	 * @ordered
	 */
	protected String associatedClass = ASSOCIATED_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final QueryType TYPE_EDEFAULT = QueryType.SELECT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected QueryType type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuerySurfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QueryPackage.Literals.QUERY_SURFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputInstalment getOutputInstalment() {
		return outputInstalment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutputInstalment(OutputInstalment newOutputInstalment, NotificationChain msgs) {
		OutputInstalment oldOutputInstalment = outputInstalment;
		outputInstalment = newOutputInstalment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.QUERY_SURFACE__OUTPUT_INSTALMENT, oldOutputInstalment, newOutputInstalment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputInstalment(OutputInstalment newOutputInstalment) {
		if (newOutputInstalment != outputInstalment) {
			NotificationChain msgs = null;
			if (outputInstalment != null)
				msgs = ((InternalEObject)outputInstalment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.QUERY_SURFACE__OUTPUT_INSTALMENT, null, msgs);
			if (newOutputInstalment != null)
				msgs = ((InternalEObject)newOutputInstalment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.QUERY_SURFACE__OUTPUT_INSTALMENT, null, msgs);
			msgs = basicSetOutputInstalment(newOutputInstalment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.QUERY_SURFACE__OUTPUT_INSTALMENT, newOutputInstalment, newOutputInstalment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputInstalment getInputInstalment() {
		return inputInstalment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputInstalment(InputInstalment newInputInstalment, NotificationChain msgs) {
		InputInstalment oldInputInstalment = inputInstalment;
		inputInstalment = newInputInstalment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.QUERY_SURFACE__INPUT_INSTALMENT, oldInputInstalment, newInputInstalment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputInstalment(InputInstalment newInputInstalment) {
		if (newInputInstalment != inputInstalment) {
			NotificationChain msgs = null;
			if (inputInstalment != null)
				msgs = ((InternalEObject)inputInstalment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.QUERY_SURFACE__INPUT_INSTALMENT, null, msgs);
			if (newInputInstalment != null)
				msgs = ((InternalEObject)newInputInstalment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.QUERY_SURFACE__INPUT_INSTALMENT, null, msgs);
			msgs = basicSetInputInstalment(newInputInstalment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.QUERY_SURFACE__INPUT_INSTALMENT, newInputInstalment, newInputInstalment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhereInstalment getWhereInstalment() {
		return whereInstalment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhereInstalment(WhereInstalment newWhereInstalment, NotificationChain msgs) {
		WhereInstalment oldWhereInstalment = whereInstalment;
		whereInstalment = newWhereInstalment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.QUERY_SURFACE__WHERE_INSTALMENT, oldWhereInstalment, newWhereInstalment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhereInstalment(WhereInstalment newWhereInstalment) {
		if (newWhereInstalment != whereInstalment) {
			NotificationChain msgs = null;
			if (whereInstalment != null)
				msgs = ((InternalEObject)whereInstalment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.QUERY_SURFACE__WHERE_INSTALMENT, null, msgs);
			if (newWhereInstalment != null)
				msgs = ((InternalEObject)newWhereInstalment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.QUERY_SURFACE__WHERE_INSTALMENT, null, msgs);
			msgs = basicSetWhereInstalment(newWhereInstalment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.QUERY_SURFACE__WHERE_INSTALMENT, newWhereInstalment, newWhereInstalment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HavingInstalment getHavingInstalment() {
		return havingInstalment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHavingInstalment(HavingInstalment newHavingInstalment, NotificationChain msgs) {
		HavingInstalment oldHavingInstalment = havingInstalment;
		havingInstalment = newHavingInstalment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.QUERY_SURFACE__HAVING_INSTALMENT, oldHavingInstalment, newHavingInstalment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHavingInstalment(HavingInstalment newHavingInstalment) {
		if (newHavingInstalment != havingInstalment) {
			NotificationChain msgs = null;
			if (havingInstalment != null)
				msgs = ((InternalEObject)havingInstalment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.QUERY_SURFACE__HAVING_INSTALMENT, null, msgs);
			if (newHavingInstalment != null)
				msgs = ((InternalEObject)newHavingInstalment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.QUERY_SURFACE__HAVING_INSTALMENT, null, msgs);
			msgs = basicSetHavingInstalment(newHavingInstalment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.QUERY_SURFACE__HAVING_INSTALMENT, newHavingInstalment, newHavingInstalment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupInstalment getGroupInstalment() {
		return groupInstalment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroupInstalment(GroupInstalment newGroupInstalment, NotificationChain msgs) {
		GroupInstalment oldGroupInstalment = groupInstalment;
		groupInstalment = newGroupInstalment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.QUERY_SURFACE__GROUP_INSTALMENT, oldGroupInstalment, newGroupInstalment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupInstalment(GroupInstalment newGroupInstalment) {
		if (newGroupInstalment != groupInstalment) {
			NotificationChain msgs = null;
			if (groupInstalment != null)
				msgs = ((InternalEObject)groupInstalment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.QUERY_SURFACE__GROUP_INSTALMENT, null, msgs);
			if (newGroupInstalment != null)
				msgs = ((InternalEObject)newGroupInstalment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.QUERY_SURFACE__GROUP_INSTALMENT, null, msgs);
			msgs = basicSetGroupInstalment(newGroupInstalment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.QUERY_SURFACE__GROUP_INSTALMENT, newGroupInstalment, newGroupInstalment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortInstalment getSortInstalment() {
		return sortInstalment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSortInstalment(SortInstalment newSortInstalment, NotificationChain msgs) {
		SortInstalment oldSortInstalment = sortInstalment;
		sortInstalment = newSortInstalment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QueryPackage.QUERY_SURFACE__SORT_INSTALMENT, oldSortInstalment, newSortInstalment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSortInstalment(SortInstalment newSortInstalment) {
		if (newSortInstalment != sortInstalment) {
			NotificationChain msgs = null;
			if (sortInstalment != null)
				msgs = ((InternalEObject)sortInstalment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QueryPackage.QUERY_SURFACE__SORT_INSTALMENT, null, msgs);
			if (newSortInstalment != null)
				msgs = ((InternalEObject)newSortInstalment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QueryPackage.QUERY_SURFACE__SORT_INSTALMENT, null, msgs);
			msgs = basicSetSortInstalment(newSortInstalment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.QUERY_SURFACE__SORT_INSTALMENT, newSortInstalment, newSortInstalment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getTypes() {
		if (types == null) {
			types = new EObjectResolvingEList<Type>(Type.class, this, QueryPackage.QUERY_SURFACE__TYPES);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionDef> getFuncs() {
		if (funcs == null) {
			funcs = new EObjectResolvingEList<FunctionDef>(FunctionDef.class, this, QueryPackage.QUERY_SURFACE__FUNCS);
		}
		return funcs;
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
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.QUERY_SURFACE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserName(String newUserName) {
		String oldUserName = userName;
		userName = newUserName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.QUERY_SURFACE__USER_NAME, oldUserName, userName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassword(String newPassword) {
		String oldPassword = password;
		password = newPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.QUERY_SURFACE__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUri() {
		return uri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUri(String newUri) {
		String oldUri = uri;
		uri = newUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.QUERY_SURFACE__URI, oldUri, uri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.QUERY_SURFACE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfRow() {
		return numberOfRow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfRow(int newNumberOfRow) {
		int oldNumberOfRow = numberOfRow;
		numberOfRow = newNumberOfRow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.QUERY_SURFACE__NUMBER_OF_ROW, oldNumberOfRow, numberOfRow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIndexOfRoes() {
		return indexOfRoes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndexOfRoes(int newIndexOfRoes) {
		int oldIndexOfRoes = indexOfRoes;
		indexOfRoes = newIndexOfRoes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.QUERY_SURFACE__INDEX_OF_ROES, oldIndexOfRoes, indexOfRoes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCreateClass() {
		return createClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreateClass(boolean newCreateClass) {
		boolean oldCreateClass = createClass;
		createClass = newCreateClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.QUERY_SURFACE__CREATE_CLASS, oldCreateClass, createClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAssociatedClass() {
		return associatedClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssociatedClass(String newAssociatedClass) {
		String oldAssociatedClass = associatedClass;
		associatedClass = newAssociatedClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.QUERY_SURFACE__ASSOCIATED_CLASS, oldAssociatedClass, associatedClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(QueryType newType) {
		QueryType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QueryPackage.QUERY_SURFACE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QueryPackage.QUERY_SURFACE__OUTPUT_INSTALMENT:
				return basicSetOutputInstalment(null, msgs);
			case QueryPackage.QUERY_SURFACE__INPUT_INSTALMENT:
				return basicSetInputInstalment(null, msgs);
			case QueryPackage.QUERY_SURFACE__WHERE_INSTALMENT:
				return basicSetWhereInstalment(null, msgs);
			case QueryPackage.QUERY_SURFACE__HAVING_INSTALMENT:
				return basicSetHavingInstalment(null, msgs);
			case QueryPackage.QUERY_SURFACE__GROUP_INSTALMENT:
				return basicSetGroupInstalment(null, msgs);
			case QueryPackage.QUERY_SURFACE__SORT_INSTALMENT:
				return basicSetSortInstalment(null, msgs);
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
			case QueryPackage.QUERY_SURFACE__OUTPUT_INSTALMENT:
				return getOutputInstalment();
			case QueryPackage.QUERY_SURFACE__INPUT_INSTALMENT:
				return getInputInstalment();
			case QueryPackage.QUERY_SURFACE__WHERE_INSTALMENT:
				return getWhereInstalment();
			case QueryPackage.QUERY_SURFACE__HAVING_INSTALMENT:
				return getHavingInstalment();
			case QueryPackage.QUERY_SURFACE__GROUP_INSTALMENT:
				return getGroupInstalment();
			case QueryPackage.QUERY_SURFACE__SORT_INSTALMENT:
				return getSortInstalment();
			case QueryPackage.QUERY_SURFACE__TYPES:
				return getTypes();
			case QueryPackage.QUERY_SURFACE__FUNCS:
				return getFuncs();
			case QueryPackage.QUERY_SURFACE__NAME:
				return getName();
			case QueryPackage.QUERY_SURFACE__USER_NAME:
				return getUserName();
			case QueryPackage.QUERY_SURFACE__PASSWORD:
				return getPassword();
			case QueryPackage.QUERY_SURFACE__URI:
				return getUri();
			case QueryPackage.QUERY_SURFACE__DESCRIPTION:
				return getDescription();
			case QueryPackage.QUERY_SURFACE__NUMBER_OF_ROW:
				return getNumberOfRow();
			case QueryPackage.QUERY_SURFACE__INDEX_OF_ROES:
				return getIndexOfRoes();
			case QueryPackage.QUERY_SURFACE__CREATE_CLASS:
				return isCreateClass();
			case QueryPackage.QUERY_SURFACE__ASSOCIATED_CLASS:
				return getAssociatedClass();
			case QueryPackage.QUERY_SURFACE__TYPE:
				return getType();
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
			case QueryPackage.QUERY_SURFACE__OUTPUT_INSTALMENT:
				setOutputInstalment((OutputInstalment)newValue);
				return;
			case QueryPackage.QUERY_SURFACE__INPUT_INSTALMENT:
				setInputInstalment((InputInstalment)newValue);
				return;
			case QueryPackage.QUERY_SURFACE__WHERE_INSTALMENT:
				setWhereInstalment((WhereInstalment)newValue);
				return;
			case QueryPackage.QUERY_SURFACE__HAVING_INSTALMENT:
				setHavingInstalment((HavingInstalment)newValue);
				return;
			case QueryPackage.QUERY_SURFACE__GROUP_INSTALMENT:
				setGroupInstalment((GroupInstalment)newValue);
				return;
			case QueryPackage.QUERY_SURFACE__SORT_INSTALMENT:
				setSortInstalment((SortInstalment)newValue);
				return;
			case QueryPackage.QUERY_SURFACE__TYPES:
				getTypes().clear();
				getTypes().addAll((Collection<? extends Type>)newValue);
				return;
			case QueryPackage.QUERY_SURFACE__FUNCS:
				getFuncs().clear();
				getFuncs().addAll((Collection<? extends FunctionDef>)newValue);
				return;
			case QueryPackage.QUERY_SURFACE__NAME:
				setName((String)newValue);
				return;
			case QueryPackage.QUERY_SURFACE__USER_NAME:
				setUserName((String)newValue);
				return;
			case QueryPackage.QUERY_SURFACE__PASSWORD:
				setPassword((String)newValue);
				return;
			case QueryPackage.QUERY_SURFACE__URI:
				setUri((String)newValue);
				return;
			case QueryPackage.QUERY_SURFACE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case QueryPackage.QUERY_SURFACE__NUMBER_OF_ROW:
				setNumberOfRow((Integer)newValue);
				return;
			case QueryPackage.QUERY_SURFACE__INDEX_OF_ROES:
				setIndexOfRoes((Integer)newValue);
				return;
			case QueryPackage.QUERY_SURFACE__CREATE_CLASS:
				setCreateClass((Boolean)newValue);
				return;
			case QueryPackage.QUERY_SURFACE__ASSOCIATED_CLASS:
				setAssociatedClass((String)newValue);
				return;
			case QueryPackage.QUERY_SURFACE__TYPE:
				setType((QueryType)newValue);
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
			case QueryPackage.QUERY_SURFACE__OUTPUT_INSTALMENT:
				setOutputInstalment((OutputInstalment)null);
				return;
			case QueryPackage.QUERY_SURFACE__INPUT_INSTALMENT:
				setInputInstalment((InputInstalment)null);
				return;
			case QueryPackage.QUERY_SURFACE__WHERE_INSTALMENT:
				setWhereInstalment((WhereInstalment)null);
				return;
			case QueryPackage.QUERY_SURFACE__HAVING_INSTALMENT:
				setHavingInstalment((HavingInstalment)null);
				return;
			case QueryPackage.QUERY_SURFACE__GROUP_INSTALMENT:
				setGroupInstalment((GroupInstalment)null);
				return;
			case QueryPackage.QUERY_SURFACE__SORT_INSTALMENT:
				setSortInstalment((SortInstalment)null);
				return;
			case QueryPackage.QUERY_SURFACE__TYPES:
				getTypes().clear();
				return;
			case QueryPackage.QUERY_SURFACE__FUNCS:
				getFuncs().clear();
				return;
			case QueryPackage.QUERY_SURFACE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case QueryPackage.QUERY_SURFACE__USER_NAME:
				setUserName(USER_NAME_EDEFAULT);
				return;
			case QueryPackage.QUERY_SURFACE__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
				return;
			case QueryPackage.QUERY_SURFACE__URI:
				setUri(URI_EDEFAULT);
				return;
			case QueryPackage.QUERY_SURFACE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case QueryPackage.QUERY_SURFACE__NUMBER_OF_ROW:
				setNumberOfRow(NUMBER_OF_ROW_EDEFAULT);
				return;
			case QueryPackage.QUERY_SURFACE__INDEX_OF_ROES:
				setIndexOfRoes(INDEX_OF_ROES_EDEFAULT);
				return;
			case QueryPackage.QUERY_SURFACE__CREATE_CLASS:
				setCreateClass(CREATE_CLASS_EDEFAULT);
				return;
			case QueryPackage.QUERY_SURFACE__ASSOCIATED_CLASS:
				setAssociatedClass(ASSOCIATED_CLASS_EDEFAULT);
				return;
			case QueryPackage.QUERY_SURFACE__TYPE:
				setType(TYPE_EDEFAULT);
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
			case QueryPackage.QUERY_SURFACE__OUTPUT_INSTALMENT:
				return outputInstalment != null;
			case QueryPackage.QUERY_SURFACE__INPUT_INSTALMENT:
				return inputInstalment != null;
			case QueryPackage.QUERY_SURFACE__WHERE_INSTALMENT:
				return whereInstalment != null;
			case QueryPackage.QUERY_SURFACE__HAVING_INSTALMENT:
				return havingInstalment != null;
			case QueryPackage.QUERY_SURFACE__GROUP_INSTALMENT:
				return groupInstalment != null;
			case QueryPackage.QUERY_SURFACE__SORT_INSTALMENT:
				return sortInstalment != null;
			case QueryPackage.QUERY_SURFACE__TYPES:
				return types != null && !types.isEmpty();
			case QueryPackage.QUERY_SURFACE__FUNCS:
				return funcs != null && !funcs.isEmpty();
			case QueryPackage.QUERY_SURFACE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case QueryPackage.QUERY_SURFACE__USER_NAME:
				return USER_NAME_EDEFAULT == null ? userName != null : !USER_NAME_EDEFAULT.equals(userName);
			case QueryPackage.QUERY_SURFACE__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
			case QueryPackage.QUERY_SURFACE__URI:
				return URI_EDEFAULT == null ? uri != null : !URI_EDEFAULT.equals(uri);
			case QueryPackage.QUERY_SURFACE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case QueryPackage.QUERY_SURFACE__NUMBER_OF_ROW:
				return numberOfRow != NUMBER_OF_ROW_EDEFAULT;
			case QueryPackage.QUERY_SURFACE__INDEX_OF_ROES:
				return indexOfRoes != INDEX_OF_ROES_EDEFAULT;
			case QueryPackage.QUERY_SURFACE__CREATE_CLASS:
				return createClass != CREATE_CLASS_EDEFAULT;
			case QueryPackage.QUERY_SURFACE__ASSOCIATED_CLASS:
				return ASSOCIATED_CLASS_EDEFAULT == null ? associatedClass != null : !ASSOCIATED_CLASS_EDEFAULT.equals(associatedClass);
			case QueryPackage.QUERY_SURFACE__TYPE:
				return type != TYPE_EDEFAULT;
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
		result.append(", userName: ");
		result.append(userName);
		result.append(", password: ");
		result.append(password);
		result.append(", uri: ");
		result.append(uri);
		result.append(", description: ");
		result.append(description);
		result.append(", numberOfRow: ");
		result.append(numberOfRow);
		result.append(", indexOfRoes: ");
		result.append(indexOfRoes);
		result.append(", createClass: ");
		result.append(createClass);
		result.append(", associatedClass: ");
		result.append(associatedClass);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //QuerySurfaceImpl

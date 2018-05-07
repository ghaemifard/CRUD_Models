/**
 */
package query.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import query.QueryFactory;
import query.QueryPackage;
import query.QuerySurface;

/**
 * This is the item provider adapter for a {@link query.QuerySurface} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class QuerySurfaceItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuerySurfaceItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addTypesPropertyDescriptor(object);
			addFuncsPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addUserNamePropertyDescriptor(object);
			addPasswordPropertyDescriptor(object);
			addUriPropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addNumberOfRowPropertyDescriptor(object);
			addIndexOfRoesPropertyDescriptor(object);
			addCreateClassPropertyDescriptor(object);
			addAssociatedClassPropertyDescriptor(object);
			addTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Types feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_QuerySurface_types_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_QuerySurface_types_feature", "_UI_QuerySurface_type"),
				 QueryPackage.Literals.QUERY_SURFACE__TYPES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Funcs feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFuncsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_QuerySurface_funcs_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_QuerySurface_funcs_feature", "_UI_QuerySurface_type"),
				 QueryPackage.Literals.QUERY_SURFACE__FUNCS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_QuerySurface_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_QuerySurface_name_feature", "_UI_QuerySurface_type"),
				 QueryPackage.Literals.QUERY_SURFACE__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the User Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUserNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_QuerySurface_userName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_QuerySurface_userName_feature", "_UI_QuerySurface_type"),
				 QueryPackage.Literals.QUERY_SURFACE__USER_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Password feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPasswordPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_QuerySurface_password_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_QuerySurface_password_feature", "_UI_QuerySurface_type"),
				 QueryPackage.Literals.QUERY_SURFACE__PASSWORD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Uri feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUriPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_QuerySurface_uri_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_QuerySurface_uri_feature", "_UI_QuerySurface_type"),
				 QueryPackage.Literals.QUERY_SURFACE__URI,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_QuerySurface_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_QuerySurface_description_feature", "_UI_QuerySurface_type"),
				 QueryPackage.Literals.QUERY_SURFACE__DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Number Of Row feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNumberOfRowPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_QuerySurface_numberOfRow_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_QuerySurface_numberOfRow_feature", "_UI_QuerySurface_type"),
				 QueryPackage.Literals.QUERY_SURFACE__NUMBER_OF_ROW,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Index Of Roes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIndexOfRoesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_QuerySurface_indexOfRoes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_QuerySurface_indexOfRoes_feature", "_UI_QuerySurface_type"),
				 QueryPackage.Literals.QUERY_SURFACE__INDEX_OF_ROES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Create Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCreateClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_QuerySurface_createClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_QuerySurface_createClass_feature", "_UI_QuerySurface_type"),
				 QueryPackage.Literals.QUERY_SURFACE__CREATE_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Associated Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAssociatedClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_QuerySurface_associatedClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_QuerySurface_associatedClass_feature", "_UI_QuerySurface_type"),
				 QueryPackage.Literals.QUERY_SURFACE__ASSOCIATED_CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_QuerySurface_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_QuerySurface_type_feature", "_UI_QuerySurface_type"),
				 QueryPackage.Literals.QUERY_SURFACE__TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(QueryPackage.Literals.QUERY_SURFACE__OUTPUT_INSTALMENT);
			childrenFeatures.add(QueryPackage.Literals.QUERY_SURFACE__INPUT_INSTALMENT);
			childrenFeatures.add(QueryPackage.Literals.QUERY_SURFACE__WHERE_INSTALMENT);
			childrenFeatures.add(QueryPackage.Literals.QUERY_SURFACE__HAVING_INSTALMENT);
			childrenFeatures.add(QueryPackage.Literals.QUERY_SURFACE__GROUP_INSTALMENT);
			childrenFeatures.add(QueryPackage.Literals.QUERY_SURFACE__SORT_INSTALMENT);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns QuerySurface.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/QuerySurface"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((QuerySurface)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_QuerySurface_type") :
			getString("_UI_QuerySurface_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(QuerySurface.class)) {
			case QueryPackage.QUERY_SURFACE__NAME:
			case QueryPackage.QUERY_SURFACE__USER_NAME:
			case QueryPackage.QUERY_SURFACE__PASSWORD:
			case QueryPackage.QUERY_SURFACE__URI:
			case QueryPackage.QUERY_SURFACE__DESCRIPTION:
			case QueryPackage.QUERY_SURFACE__NUMBER_OF_ROW:
			case QueryPackage.QUERY_SURFACE__INDEX_OF_ROES:
			case QueryPackage.QUERY_SURFACE__CREATE_CLASS:
			case QueryPackage.QUERY_SURFACE__ASSOCIATED_CLASS:
			case QueryPackage.QUERY_SURFACE__TYPE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case QueryPackage.QUERY_SURFACE__OUTPUT_INSTALMENT:
			case QueryPackage.QUERY_SURFACE__INPUT_INSTALMENT:
			case QueryPackage.QUERY_SURFACE__WHERE_INSTALMENT:
			case QueryPackage.QUERY_SURFACE__HAVING_INSTALMENT:
			case QueryPackage.QUERY_SURFACE__GROUP_INSTALMENT:
			case QueryPackage.QUERY_SURFACE__SORT_INSTALMENT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(QueryPackage.Literals.QUERY_SURFACE__OUTPUT_INSTALMENT,
				 QueryFactory.eINSTANCE.createOutputInstalment()));

		newChildDescriptors.add
			(createChildParameter
				(QueryPackage.Literals.QUERY_SURFACE__INPUT_INSTALMENT,
				 QueryFactory.eINSTANCE.createInputInstalment()));

		newChildDescriptors.add
			(createChildParameter
				(QueryPackage.Literals.QUERY_SURFACE__WHERE_INSTALMENT,
				 QueryFactory.eINSTANCE.createWhereInstalment()));

		newChildDescriptors.add
			(createChildParameter
				(QueryPackage.Literals.QUERY_SURFACE__HAVING_INSTALMENT,
				 QueryFactory.eINSTANCE.createHavingInstalment()));

		newChildDescriptors.add
			(createChildParameter
				(QueryPackage.Literals.QUERY_SURFACE__GROUP_INSTALMENT,
				 QueryFactory.eINSTANCE.createGroupInstalment()));

		newChildDescriptors.add
			(createChildParameter
				(QueryPackage.Literals.QUERY_SURFACE__SORT_INSTALMENT,
				 QueryFactory.eINSTANCE.createSortInstalment()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return QueryEditPlugin.INSTANCE;
	}

}

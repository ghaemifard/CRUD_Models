/**
 */
package update.provider;


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

import update.UpdateFactory;
import update.UpdatePackage;
import update.UpdateSurface;

/**
 * This is the item provider adapter for a {@link update.UpdateSurface} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class UpdateSurfaceItemProvider 
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
	public UpdateSurfaceItemProvider(AdapterFactory adapterFactory) {
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
			addDescriptionPropertyDescriptor(object);
			addAssociatedClassPropertyDescriptor(object);
			addUserNamePropertyDescriptor(object);
			addPasswordPropertyDescriptor(object);
			addUriPropertyDescriptor(object);
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
				 getString("_UI_UpdateSurface_types_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UpdateSurface_types_feature", "_UI_UpdateSurface_type"),
				 UpdatePackage.Literals.UPDATE_SURFACE__TYPES,
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
				 getString("_UI_UpdateSurface_funcs_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UpdateSurface_funcs_feature", "_UI_UpdateSurface_type"),
				 UpdatePackage.Literals.UPDATE_SURFACE__FUNCS,
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
				 getString("_UI_UpdateSurface_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UpdateSurface_name_feature", "_UI_UpdateSurface_type"),
				 UpdatePackage.Literals.UPDATE_SURFACE__NAME,
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
				 getString("_UI_UpdateSurface_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UpdateSurface_description_feature", "_UI_UpdateSurface_type"),
				 UpdatePackage.Literals.UPDATE_SURFACE__DESCRIPTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
				 getString("_UI_UpdateSurface_associatedClass_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UpdateSurface_associatedClass_feature", "_UI_UpdateSurface_type"),
				 UpdatePackage.Literals.UPDATE_SURFACE__ASSOCIATED_CLASS,
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
				 getString("_UI_UpdateSurface_userName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UpdateSurface_userName_feature", "_UI_UpdateSurface_type"),
				 UpdatePackage.Literals.UPDATE_SURFACE__USER_NAME,
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
				 getString("_UI_UpdateSurface_password_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UpdateSurface_password_feature", "_UI_UpdateSurface_type"),
				 UpdatePackage.Literals.UPDATE_SURFACE__PASSWORD,
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
				 getString("_UI_UpdateSurface_uri_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_UpdateSurface_uri_feature", "_UI_UpdateSurface_type"),
				 UpdatePackage.Literals.UPDATE_SURFACE__URI,
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
			childrenFeatures.add(UpdatePackage.Literals.UPDATE_SURFACE__INPUT_INSTALMENT);
			childrenFeatures.add(UpdatePackage.Literals.UPDATE_SURFACE__PREPARE_LIST);
			childrenFeatures.add(UpdatePackage.Literals.UPDATE_SURFACE__TABLE_INSTALMENT);
			childrenFeatures.add(UpdatePackage.Literals.UPDATE_SURFACE__SORT_INSTALMENT);
			childrenFeatures.add(UpdatePackage.Literals.UPDATE_SURFACE__WHERE_INSTALMENT);
			childrenFeatures.add(UpdatePackage.Literals.UPDATE_SURFACE__LFS);
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
	 * This returns UpdateSurface.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/UpdateSurface"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((UpdateSurface)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_UpdateSurface_type") :
			getString("_UI_UpdateSurface_type") + " " + label;
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

		switch (notification.getFeatureID(UpdateSurface.class)) {
			case UpdatePackage.UPDATE_SURFACE__NAME:
			case UpdatePackage.UPDATE_SURFACE__DESCRIPTION:
			case UpdatePackage.UPDATE_SURFACE__ASSOCIATED_CLASS:
			case UpdatePackage.UPDATE_SURFACE__USER_NAME:
			case UpdatePackage.UPDATE_SURFACE__PASSWORD:
			case UpdatePackage.UPDATE_SURFACE__URI:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case UpdatePackage.UPDATE_SURFACE__INPUT_INSTALMENT:
			case UpdatePackage.UPDATE_SURFACE__PREPARE_LIST:
			case UpdatePackage.UPDATE_SURFACE__TABLE_INSTALMENT:
			case UpdatePackage.UPDATE_SURFACE__SORT_INSTALMENT:
			case UpdatePackage.UPDATE_SURFACE__WHERE_INSTALMENT:
			case UpdatePackage.UPDATE_SURFACE__LFS:
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
				(UpdatePackage.Literals.UPDATE_SURFACE__INPUT_INSTALMENT,
				 UpdateFactory.eINSTANCE.createInputInstalment()));

		newChildDescriptors.add
			(createChildParameter
				(UpdatePackage.Literals.UPDATE_SURFACE__PREPARE_LIST,
				 UpdateFactory.eINSTANCE.createPrepareList()));

		newChildDescriptors.add
			(createChildParameter
				(UpdatePackage.Literals.UPDATE_SURFACE__TABLE_INSTALMENT,
				 UpdateFactory.eINSTANCE.createTableSelection()));

		newChildDescriptors.add
			(createChildParameter
				(UpdatePackage.Literals.UPDATE_SURFACE__SORT_INSTALMENT,
				 UpdateFactory.eINSTANCE.createSortInstalment()));

		newChildDescriptors.add
			(createChildParameter
				(UpdatePackage.Literals.UPDATE_SURFACE__WHERE_INSTALMENT,
				 UpdateFactory.eINSTANCE.createConditionInstalment()));

		newChildDescriptors.add
			(createChildParameter
				(UpdatePackage.Literals.UPDATE_SURFACE__LFS,
				 UpdateFactory.eINSTANCE.createLinkField()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return UpdateEditPlugin.INSTANCE;
	}

}

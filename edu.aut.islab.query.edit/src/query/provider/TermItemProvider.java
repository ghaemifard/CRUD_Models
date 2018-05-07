/**
 */
package query.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import query.ConditionOperationType;
import query.QueryFactory;
import query.QueryPackage;
import query.Term;

/**
 * This is the item provider adapter for a {@link query.Term} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TermItemProvider extends AbstractConditionElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TermItemProvider(AdapterFactory adapterFactory) {
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

			addTitlePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Title feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTitlePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Term_title_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Term_title_feature", "_UI_Term_type"),
				 QueryPackage.Literals.TERM__TITLE,
				 false,
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
			childrenFeatures.add(QueryPackage.Literals.TERM__PARAMS);
			childrenFeatures.add(QueryPackage.Literals.TERM__LINK);
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
	 * This returns Term.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Term"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Term)object).getTitle();
		return label == null || label.length() == 0 ?
			getString("_UI_Term_type") :
			getString("_UI_Term_type") + " " + label;
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

		switch (notification.getFeatureID(Term.class)) {
			case QueryPackage.TERM__TITLE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case QueryPackage.TERM__PARAMS:
			case QueryPackage.TERM__LINK:
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
				(QueryPackage.Literals.TERM__PARAMS,
				 QueryFactory.eINSTANCE.createField()));

		newChildDescriptors.add
			(createChildParameter
				(QueryPackage.Literals.TERM__PARAMS,
				 QueryFactory.eINSTANCE.createLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(QueryPackage.Literals.TERM__PARAMS,
				 QueryFactory.eINSTANCE.createNullLiteral()));

		newChildDescriptors.add
			(createChildParameter
				(QueryPackage.Literals.TERM__PARAMS,
				 QueryFactory.eINSTANCE.createFunction()));

		newChildDescriptors.add
			(createChildParameter
				(QueryPackage.Literals.TERM__PARAMS,
				 QueryFactory.eINSTANCE.createInput()));

		newChildDescriptors.add
			(createChildParameter
				(QueryPackage.Literals.TERM__PARAMS,
				 QueryFactory.eINSTANCE.createCallQuerySurface()));

		newChildDescriptors.add
			(createChildParameter
				(QueryPackage.Literals.TERM__LINK,
				 QueryFactory.eINSTANCE.createEqualLink()));

		newChildDescriptors.add
			(createChildParameter
				(QueryPackage.Literals.TERM__LINK,
				 QueryFactory.eINSTANCE.createGreaterThanLink()));

		newChildDescriptors.add
			(createChildParameter
				(QueryPackage.Literals.TERM__LINK,
				 QueryFactory.eINSTANCE.createGreaterEqualThanLink()));

		newChildDescriptors.add
			(createChildParameter
				(QueryPackage.Literals.TERM__LINK,
				 QueryFactory.eINSTANCE.createLowerThanLink()));

		newChildDescriptors.add
			(createChildParameter
				(QueryPackage.Literals.TERM__LINK,
				 QueryFactory.eINSTANCE.createLowerEqualThanLink()));

		newChildDescriptors.add
			(createChildParameter
				(QueryPackage.Literals.TERM__LINK,
				 QueryFactory.eINSTANCE.createInLink()));

		newChildDescriptors.add
			(createChildParameter
				(QueryPackage.Literals.TERM__LINK,
				 QueryFactory.eINSTANCE.createLikeLink()));
	}

}

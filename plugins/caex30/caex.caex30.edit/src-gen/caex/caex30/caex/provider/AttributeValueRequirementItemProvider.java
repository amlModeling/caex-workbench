/**
 */
package caex.caex30.caex.provider;


import caex.caex30.caex.AttributeValueRequirement;
import caex.caex30.caex.CAEXFactory;
import caex.caex30.caex.CAEXPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link caex.caex30.caex.AttributeValueRequirement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AttributeValueRequirementItemProvider extends CAEXBasicObjectItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeValueRequirementItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_AttributeValueRequirement_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AttributeValueRequirement_name_feature", "_UI_AttributeValueRequirement_type"),
				 CAEXPackage.Literals.ATTRIBUTE_VALUE_REQUIREMENT__NAME,
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
			childrenFeatures.add(CAEXPackage.Literals.ATTRIBUTE_VALUE_REQUIREMENT__ORDINAL_SCALED_TYPE);
			childrenFeatures.add(CAEXPackage.Literals.ATTRIBUTE_VALUE_REQUIREMENT__NOMINAL_SCALED_TYPE);
			childrenFeatures.add(CAEXPackage.Literals.ATTRIBUTE_VALUE_REQUIREMENT__UNKNOWN_TYPE);
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
	 * This returns AttributeValueRequirement.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AttributeValueRequirement"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((AttributeValueRequirement)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_AttributeValueRequirement_type") :
			getString("_UI_AttributeValueRequirement_type") + " " + label;
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

		switch (notification.getFeatureID(AttributeValueRequirement.class)) {
			case CAEXPackage.ATTRIBUTE_VALUE_REQUIREMENT__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case CAEXPackage.ATTRIBUTE_VALUE_REQUIREMENT__ORDINAL_SCALED_TYPE:
			case CAEXPackage.ATTRIBUTE_VALUE_REQUIREMENT__NOMINAL_SCALED_TYPE:
			case CAEXPackage.ATTRIBUTE_VALUE_REQUIREMENT__UNKNOWN_TYPE:
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
				(CAEXPackage.Literals.ATTRIBUTE_VALUE_REQUIREMENT__ORDINAL_SCALED_TYPE,
				 CAEXFactory.eINSTANCE.createOrdinalScaled()));

		newChildDescriptors.add
			(createChildParameter
				(CAEXPackage.Literals.ATTRIBUTE_VALUE_REQUIREMENT__NOMINAL_SCALED_TYPE,
				 CAEXFactory.eINSTANCE.createNominalScaled()));

		newChildDescriptors.add
			(createChildParameter
				(CAEXPackage.Literals.ATTRIBUTE_VALUE_REQUIREMENT__UNKNOWN_TYPE,
				 CAEXFactory.eINSTANCE.createUnknownType()));
	}

}

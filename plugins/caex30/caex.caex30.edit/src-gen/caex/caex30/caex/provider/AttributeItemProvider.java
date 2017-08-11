/**
 */
package caex.caex30.caex.provider;


import caex.caex30.caex.Attribute;
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
 * This is the item provider adapter for a {@link caex.caex30.caex.Attribute} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AttributeItemProvider extends CAEXObjectItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeItemProvider(AdapterFactory adapterFactory) {
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

			addDefaultValuePropertyDescriptor(object);
			addValuePropertyDescriptor(object);
			addAttributeDataTypePropertyDescriptor(object);
			addRefAttributeTypePropertyDescriptor(object);
			addUnitPropertyDescriptor(object);
			addReferenceAttributePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Default Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Attribute_defaultValue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Attribute_defaultValue_feature", "_UI_Attribute_type"),
				 CAEXPackage.Literals.ATTRIBUTE__DEFAULT_VALUE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Attribute_value_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Attribute_value_feature", "_UI_Attribute_type"),
				 CAEXPackage.Literals.ATTRIBUTE__VALUE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Attribute Data Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAttributeDataTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Attribute_attributeDataType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Attribute_attributeDataType_feature", "_UI_Attribute_type"),
				 CAEXPackage.Literals.ATTRIBUTE__ATTRIBUTE_DATA_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ref Attribute Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRefAttributeTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Attribute_refAttributeType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Attribute_refAttributeType_feature", "_UI_Attribute_type"),
				 CAEXPackage.Literals.ATTRIBUTE__REF_ATTRIBUTE_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Unit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUnitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Attribute_unit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Attribute_unit_feature", "_UI_Attribute_type"),
				 CAEXPackage.Literals.ATTRIBUTE__UNIT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Reference Attribute feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReferenceAttributePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Attribute_referenceAttribute_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Attribute_referenceAttribute_feature", "_UI_Attribute_type"),
				 CAEXPackage.Literals.ATTRIBUTE__REFERENCE_ATTRIBUTE,
				 true,
				 false,
				 true,
				 null,
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
			childrenFeatures.add(CAEXPackage.Literals.ATTRIBUTE__REF_SEMANTIC);
			childrenFeatures.add(CAEXPackage.Literals.ATTRIBUTE__CONSTRAINT);
			childrenFeatures.add(CAEXPackage.Literals.ATTRIBUTE__ATTRIBUTE);
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
	 * This returns Attribute.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Attribute"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Attribute)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Attribute_type") :
			getString("_UI_Attribute_type") + " " + label;
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

		switch (notification.getFeatureID(Attribute.class)) {
			case CAEXPackage.ATTRIBUTE__DEFAULT_VALUE:
			case CAEXPackage.ATTRIBUTE__VALUE:
			case CAEXPackage.ATTRIBUTE__ATTRIBUTE_DATA_TYPE:
			case CAEXPackage.ATTRIBUTE__REF_ATTRIBUTE_TYPE:
			case CAEXPackage.ATTRIBUTE__UNIT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case CAEXPackage.ATTRIBUTE__REF_SEMANTIC:
			case CAEXPackage.ATTRIBUTE__CONSTRAINT:
			case CAEXPackage.ATTRIBUTE__ATTRIBUTE:
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
				(CAEXPackage.Literals.ATTRIBUTE__REF_SEMANTIC,
				 CAEXFactory.eINSTANCE.createRefSemantic()));

		newChildDescriptors.add
			(createChildParameter
				(CAEXPackage.Literals.ATTRIBUTE__CONSTRAINT,
				 CAEXFactory.eINSTANCE.createAttributeValueRequirement()));

		newChildDescriptors.add
			(createChildParameter
				(CAEXPackage.Literals.ATTRIBUTE__ATTRIBUTE,
				 CAEXFactory.eINSTANCE.createAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(CAEXPackage.Literals.ATTRIBUTE__ATTRIBUTE,
				 CAEXFactory.eINSTANCE.createAttributeFamily()));
	}

}

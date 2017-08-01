/**
 */
package caex.caex215.caex.provider;


import caex.caex215.caex.CAEXBasicObject;
import caex.caex215.caex.CAEXFactory;
import caex.caex215.caex.CAEXPackage;
import caex.caex215.caex.ChangeMode;

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

/**
 * This is the item provider adapter for a {@link caex.caex215.caex.CAEXBasicObject} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CAEXBasicObjectItemProvider 
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
	public CAEXBasicObjectItemProvider(AdapterFactory adapterFactory) {
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

			addChangeModePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Change Mode feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addChangeModePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CAEXBasicObject_changeMode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CAEXBasicObject_changeMode_feature", "_UI_CAEXBasicObject_type"),
				 CAEXPackage.Literals.CAEX_BASIC_OBJECT__CHANGE_MODE,
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
			childrenFeatures.add(CAEXPackage.Literals.CAEX_BASIC_OBJECT__DESCRIPTION);
			childrenFeatures.add(CAEXPackage.Literals.CAEX_BASIC_OBJECT__VERSION);
			childrenFeatures.add(CAEXPackage.Literals.CAEX_BASIC_OBJECT__REVISION);
			childrenFeatures.add(CAEXPackage.Literals.CAEX_BASIC_OBJECT__COPYRIGHT);
			childrenFeatures.add(CAEXPackage.Literals.CAEX_BASIC_OBJECT__ADDITIONAL_INFORMATION);
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
	 * This returns CAEXBasicObject.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CAEXBasicObject"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		ChangeMode labelValue = ((CAEXBasicObject)object).getChangeMode();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_CAEXBasicObject_type") :
			getString("_UI_CAEXBasicObject_type") + " " + label;
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

		switch (notification.getFeatureID(CAEXBasicObject.class)) {
			case CAEXPackage.CAEX_BASIC_OBJECT__CHANGE_MODE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case CAEXPackage.CAEX_BASIC_OBJECT__DESCRIPTION:
			case CAEXPackage.CAEX_BASIC_OBJECT__VERSION:
			case CAEXPackage.CAEX_BASIC_OBJECT__REVISION:
			case CAEXPackage.CAEX_BASIC_OBJECT__COPYRIGHT:
			case CAEXPackage.CAEX_BASIC_OBJECT__ADDITIONAL_INFORMATION:
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
				(CAEXPackage.Literals.CAEX_BASIC_OBJECT__DESCRIPTION,
				 CAEXFactory.eINSTANCE.createDescription()));

		newChildDescriptors.add
			(createChildParameter
				(CAEXPackage.Literals.CAEX_BASIC_OBJECT__VERSION,
				 CAEXFactory.eINSTANCE.createVersion()));

		newChildDescriptors.add
			(createChildParameter
				(CAEXPackage.Literals.CAEX_BASIC_OBJECT__REVISION,
				 CAEXFactory.eINSTANCE.createRevision()));

		newChildDescriptors.add
			(createChildParameter
				(CAEXPackage.Literals.CAEX_BASIC_OBJECT__COPYRIGHT,
				 CAEXFactory.eINSTANCE.createCopyright()));

		newChildDescriptors.add
			(createChildParameter
				(CAEXPackage.Literals.CAEX_BASIC_OBJECT__ADDITIONAL_INFORMATION,
				 CAEXFactory.eINSTANCE.createAdditionalInformation()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return CAEX215EditPlugin.INSTANCE;
	}

}

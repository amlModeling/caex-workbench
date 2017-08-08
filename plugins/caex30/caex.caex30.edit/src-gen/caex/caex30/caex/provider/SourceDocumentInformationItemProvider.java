/**
 */
package caex.caex30.caex.provider;


import caex.caex30.caex.CAEXPackage;
import caex.caex30.caex.SourceDocumentInformation;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

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
 * This is the item provider adapter for a {@link caex.caex30.caex.SourceDocumentInformation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SourceDocumentInformationItemProvider 
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
	public SourceDocumentInformationItemProvider(AdapterFactory adapterFactory) {
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

			addLastWritingDateTimePropertyDescriptor(object);
			addOriginIDPropertyDescriptor(object);
			addOriginNamePropertyDescriptor(object);
			addOriginProjectIDPropertyDescriptor(object);
			addOriginProjectTitlePropertyDescriptor(object);
			addOriginReleasePropertyDescriptor(object);
			addOriginVendorPropertyDescriptor(object);
			addOriginVendorURLPropertyDescriptor(object);
			addOriginVersionPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Last Writing Date Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLastWritingDateTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SourceDocumentInformation_lastWritingDateTime_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SourceDocumentInformation_lastWritingDateTime_feature", "_UI_SourceDocumentInformation_type"),
				 CAEXPackage.Literals.SOURCE_DOCUMENT_INFORMATION__LAST_WRITING_DATE_TIME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Origin ID feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOriginIDPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SourceDocumentInformation_originID_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SourceDocumentInformation_originID_feature", "_UI_SourceDocumentInformation_type"),
				 CAEXPackage.Literals.SOURCE_DOCUMENT_INFORMATION__ORIGIN_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Origin Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOriginNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SourceDocumentInformation_originName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SourceDocumentInformation_originName_feature", "_UI_SourceDocumentInformation_type"),
				 CAEXPackage.Literals.SOURCE_DOCUMENT_INFORMATION__ORIGIN_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Origin Project ID feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOriginProjectIDPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SourceDocumentInformation_originProjectID_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SourceDocumentInformation_originProjectID_feature", "_UI_SourceDocumentInformation_type"),
				 CAEXPackage.Literals.SOURCE_DOCUMENT_INFORMATION__ORIGIN_PROJECT_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Origin Project Title feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOriginProjectTitlePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SourceDocumentInformation_originProjectTitle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SourceDocumentInformation_originProjectTitle_feature", "_UI_SourceDocumentInformation_type"),
				 CAEXPackage.Literals.SOURCE_DOCUMENT_INFORMATION__ORIGIN_PROJECT_TITLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Origin Release feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOriginReleasePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SourceDocumentInformation_originRelease_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SourceDocumentInformation_originRelease_feature", "_UI_SourceDocumentInformation_type"),
				 CAEXPackage.Literals.SOURCE_DOCUMENT_INFORMATION__ORIGIN_RELEASE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Origin Vendor feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOriginVendorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SourceDocumentInformation_originVendor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SourceDocumentInformation_originVendor_feature", "_UI_SourceDocumentInformation_type"),
				 CAEXPackage.Literals.SOURCE_DOCUMENT_INFORMATION__ORIGIN_VENDOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Origin Vendor URL feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOriginVendorURLPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SourceDocumentInformation_originVendorURL_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SourceDocumentInformation_originVendorURL_feature", "_UI_SourceDocumentInformation_type"),
				 CAEXPackage.Literals.SOURCE_DOCUMENT_INFORMATION__ORIGIN_VENDOR_URL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Origin Version feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOriginVersionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SourceDocumentInformation_originVersion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SourceDocumentInformation_originVersion_feature", "_UI_SourceDocumentInformation_type"),
				 CAEXPackage.Literals.SOURCE_DOCUMENT_INFORMATION__ORIGIN_VERSION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns SourceDocumentInformation.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SourceDocumentInformation"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SourceDocumentInformation)object).getOriginName();
		return label == null || label.length() == 0 ?
			getString("_UI_SourceDocumentInformation_type") :
			getString("_UI_SourceDocumentInformation_type") + " " + label;
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

		switch (notification.getFeatureID(SourceDocumentInformation.class)) {
			case CAEXPackage.SOURCE_DOCUMENT_INFORMATION__LAST_WRITING_DATE_TIME:
			case CAEXPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_ID:
			case CAEXPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_NAME:
			case CAEXPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_PROJECT_ID:
			case CAEXPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_PROJECT_TITLE:
			case CAEXPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_RELEASE:
			case CAEXPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_VENDOR:
			case CAEXPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_VENDOR_URL:
			case CAEXPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_VERSION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return CAEX30EditPlugin.INSTANCE;
	}

}

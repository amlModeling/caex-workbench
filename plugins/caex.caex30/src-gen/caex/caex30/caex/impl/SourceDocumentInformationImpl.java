/**
 */
package caex.caex30.caex.impl;

import caex.caex30.caex.CAEXPackage;
import caex.caex30.caex.SourceDocumentInformation;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Source Document Information</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link caex.caex30.caex.impl.SourceDocumentInformationImpl#getLastWritingDateTime <em>Last Writing Date Time</em>}</li>
 *   <li>{@link caex.caex30.caex.impl.SourceDocumentInformationImpl#getOriginID <em>Origin ID</em>}</li>
 *   <li>{@link caex.caex30.caex.impl.SourceDocumentInformationImpl#getOriginName <em>Origin Name</em>}</li>
 *   <li>{@link caex.caex30.caex.impl.SourceDocumentInformationImpl#getOriginProjectID <em>Origin Project ID</em>}</li>
 *   <li>{@link caex.caex30.caex.impl.SourceDocumentInformationImpl#getOriginProjectTitle <em>Origin Project Title</em>}</li>
 *   <li>{@link caex.caex30.caex.impl.SourceDocumentInformationImpl#getOriginRelease <em>Origin Release</em>}</li>
 *   <li>{@link caex.caex30.caex.impl.SourceDocumentInformationImpl#getOriginVendor <em>Origin Vendor</em>}</li>
 *   <li>{@link caex.caex30.caex.impl.SourceDocumentInformationImpl#getOriginVendorURL <em>Origin Vendor URL</em>}</li>
 *   <li>{@link caex.caex30.caex.impl.SourceDocumentInformationImpl#getOriginVersion <em>Origin Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SourceDocumentInformationImpl extends MinimalEObjectImpl.Container implements SourceDocumentInformation {
	/**
	 * The default value of the '{@link #getLastWritingDateTime() <em>Last Writing Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastWritingDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar LAST_WRITING_DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastWritingDateTime() <em>Last Writing Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastWritingDateTime()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar lastWritingDateTime = LAST_WRITING_DATE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getOriginID() <em>Origin ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginID()
	 * @generated
	 * @ordered
	 */
	protected static final String ORIGIN_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOriginID() <em>Origin ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginID()
	 * @generated
	 * @ordered
	 */
	protected String originID = ORIGIN_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getOriginName() <em>Origin Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginName()
	 * @generated
	 * @ordered
	 */
	protected static final String ORIGIN_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOriginName() <em>Origin Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginName()
	 * @generated
	 * @ordered
	 */
	protected String originName = ORIGIN_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getOriginProjectID() <em>Origin Project ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginProjectID()
	 * @generated
	 * @ordered
	 */
	protected static final String ORIGIN_PROJECT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOriginProjectID() <em>Origin Project ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginProjectID()
	 * @generated
	 * @ordered
	 */
	protected String originProjectID = ORIGIN_PROJECT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getOriginProjectTitle() <em>Origin Project Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginProjectTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String ORIGIN_PROJECT_TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOriginProjectTitle() <em>Origin Project Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginProjectTitle()
	 * @generated
	 * @ordered
	 */
	protected String originProjectTitle = ORIGIN_PROJECT_TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOriginRelease() <em>Origin Release</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginRelease()
	 * @generated
	 * @ordered
	 */
	protected static final String ORIGIN_RELEASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOriginRelease() <em>Origin Release</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginRelease()
	 * @generated
	 * @ordered
	 */
	protected String originRelease = ORIGIN_RELEASE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOriginVendor() <em>Origin Vendor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginVendor()
	 * @generated
	 * @ordered
	 */
	protected static final String ORIGIN_VENDOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOriginVendor() <em>Origin Vendor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginVendor()
	 * @generated
	 * @ordered
	 */
	protected String originVendor = ORIGIN_VENDOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getOriginVendorURL() <em>Origin Vendor URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginVendorURL()
	 * @generated
	 * @ordered
	 */
	protected static final String ORIGIN_VENDOR_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOriginVendorURL() <em>Origin Vendor URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginVendorURL()
	 * @generated
	 * @ordered
	 */
	protected String originVendorURL = ORIGIN_VENDOR_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getOriginVersion() <em>Origin Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String ORIGIN_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOriginVersion() <em>Origin Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginVersion()
	 * @generated
	 * @ordered
	 */
	protected String originVersion = ORIGIN_VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SourceDocumentInformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CAEXPackage.Literals.SOURCE_DOCUMENT_INFORMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getLastWritingDateTime() {
		return lastWritingDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastWritingDateTime(XMLGregorianCalendar newLastWritingDateTime) {
		XMLGregorianCalendar oldLastWritingDateTime = lastWritingDateTime;
		lastWritingDateTime = newLastWritingDateTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CAEXPackage.SOURCE_DOCUMENT_INFORMATION__LAST_WRITING_DATE_TIME, oldLastWritingDateTime, lastWritingDateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOriginID() {
		return originID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginID(String newOriginID) {
		String oldOriginID = originID;
		originID = newOriginID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CAEXPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_ID, oldOriginID, originID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOriginName() {
		return originName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginName(String newOriginName) {
		String oldOriginName = originName;
		originName = newOriginName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CAEXPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_NAME, oldOriginName, originName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOriginProjectID() {
		return originProjectID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginProjectID(String newOriginProjectID) {
		String oldOriginProjectID = originProjectID;
		originProjectID = newOriginProjectID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CAEXPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_PROJECT_ID, oldOriginProjectID, originProjectID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOriginProjectTitle() {
		return originProjectTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginProjectTitle(String newOriginProjectTitle) {
		String oldOriginProjectTitle = originProjectTitle;
		originProjectTitle = newOriginProjectTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CAEXPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_PROJECT_TITLE, oldOriginProjectTitle, originProjectTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOriginRelease() {
		return originRelease;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginRelease(String newOriginRelease) {
		String oldOriginRelease = originRelease;
		originRelease = newOriginRelease;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CAEXPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_RELEASE, oldOriginRelease, originRelease));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOriginVendor() {
		return originVendor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginVendor(String newOriginVendor) {
		String oldOriginVendor = originVendor;
		originVendor = newOriginVendor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CAEXPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_VENDOR, oldOriginVendor, originVendor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOriginVendorURL() {
		return originVendorURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginVendorURL(String newOriginVendorURL) {
		String oldOriginVendorURL = originVendorURL;
		originVendorURL = newOriginVendorURL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CAEXPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_VENDOR_URL, oldOriginVendorURL, originVendorURL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOriginVersion() {
		return originVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginVersion(String newOriginVersion) {
		String oldOriginVersion = originVersion;
		originVersion = newOriginVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CAEXPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_VERSION, oldOriginVersion, originVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CAEXPackage.SOURCE_DOCUMENT_INFORMATION__LAST_WRITING_DATE_TIME:
				return getLastWritingDateTime();
			case CAEXPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_ID:
				return getOriginID();
			case CAEXPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_NAME:
				return getOriginName();
			case CAEXPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_PROJECT_ID:
				return getOriginProjectID();
			case CAEXPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_PROJECT_TITLE:
				return getOriginProjectTitle();
			case CAEXPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_RELEASE:
				return getOriginRelease();
			case CAEXPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_VENDOR:
				return getOriginVendor();
			case CAEXPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_VENDOR_URL:
				return getOriginVendorURL();
			case CAEXPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_VERSION:
				return getOriginVersion();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CAEXPackage.SOURCE_DOCUMENT_INFORMATION__LAST_WRITING_DATE_TIME:
				setLastWritingDateTime((XMLGregorianCalendar)newValue);
				return;
			case CAEXPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_ID:
				setOriginID((String)newValue);
				return;
			case CAEXPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_NAME:
				setOriginName((String)newValue);
				return;
			case CAEXPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_PROJECT_ID:
				setOriginProjectID((String)newValue);
				return;
			case CAEXPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_PROJECT_TITLE:
				setOriginProjectTitle((String)newValue);
				return;
			case CAEXPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_RELEASE:
				setOriginRelease((String)newValue);
				return;
			case CAEXPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_VENDOR:
				setOriginVendor((String)newValue);
				return;
			case CAEXPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_VENDOR_URL:
				setOriginVendorURL((String)newValue);
				return;
			case CAEXPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_VERSION:
				setOriginVersion((String)newValue);
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
			case CAEXPackage.SOURCE_DOCUMENT_INFORMATION__LAST_WRITING_DATE_TIME:
				setLastWritingDateTime(LAST_WRITING_DATE_TIME_EDEFAULT);
				return;
			case CAEXPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_ID:
				setOriginID(ORIGIN_ID_EDEFAULT);
				return;
			case CAEXPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_NAME:
				setOriginName(ORIGIN_NAME_EDEFAULT);
				return;
			case CAEXPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_PROJECT_ID:
				setOriginProjectID(ORIGIN_PROJECT_ID_EDEFAULT);
				return;
			case CAEXPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_PROJECT_TITLE:
				setOriginProjectTitle(ORIGIN_PROJECT_TITLE_EDEFAULT);
				return;
			case CAEXPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_RELEASE:
				setOriginRelease(ORIGIN_RELEASE_EDEFAULT);
				return;
			case CAEXPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_VENDOR:
				setOriginVendor(ORIGIN_VENDOR_EDEFAULT);
				return;
			case CAEXPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_VENDOR_URL:
				setOriginVendorURL(ORIGIN_VENDOR_URL_EDEFAULT);
				return;
			case CAEXPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_VERSION:
				setOriginVersion(ORIGIN_VERSION_EDEFAULT);
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
			case CAEXPackage.SOURCE_DOCUMENT_INFORMATION__LAST_WRITING_DATE_TIME:
				return LAST_WRITING_DATE_TIME_EDEFAULT == null ? lastWritingDateTime != null : !LAST_WRITING_DATE_TIME_EDEFAULT.equals(lastWritingDateTime);
			case CAEXPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_ID:
				return ORIGIN_ID_EDEFAULT == null ? originID != null : !ORIGIN_ID_EDEFAULT.equals(originID);
			case CAEXPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_NAME:
				return ORIGIN_NAME_EDEFAULT == null ? originName != null : !ORIGIN_NAME_EDEFAULT.equals(originName);
			case CAEXPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_PROJECT_ID:
				return ORIGIN_PROJECT_ID_EDEFAULT == null ? originProjectID != null : !ORIGIN_PROJECT_ID_EDEFAULT.equals(originProjectID);
			case CAEXPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_PROJECT_TITLE:
				return ORIGIN_PROJECT_TITLE_EDEFAULT == null ? originProjectTitle != null : !ORIGIN_PROJECT_TITLE_EDEFAULT.equals(originProjectTitle);
			case CAEXPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_RELEASE:
				return ORIGIN_RELEASE_EDEFAULT == null ? originRelease != null : !ORIGIN_RELEASE_EDEFAULT.equals(originRelease);
			case CAEXPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_VENDOR:
				return ORIGIN_VENDOR_EDEFAULT == null ? originVendor != null : !ORIGIN_VENDOR_EDEFAULT.equals(originVendor);
			case CAEXPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_VENDOR_URL:
				return ORIGIN_VENDOR_URL_EDEFAULT == null ? originVendorURL != null : !ORIGIN_VENDOR_URL_EDEFAULT.equals(originVendorURL);
			case CAEXPackage.SOURCE_DOCUMENT_INFORMATION__ORIGIN_VERSION:
				return ORIGIN_VERSION_EDEFAULT == null ? originVersion != null : !ORIGIN_VERSION_EDEFAULT.equals(originVersion);
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
		result.append(" (lastWritingDateTime: ");
		result.append(lastWritingDateTime);
		result.append(", originID: ");
		result.append(originID);
		result.append(", originName: ");
		result.append(originName);
		result.append(", originProjectID: ");
		result.append(originProjectID);
		result.append(", originProjectTitle: ");
		result.append(originProjectTitle);
		result.append(", originRelease: ");
		result.append(originRelease);
		result.append(", originVendor: ");
		result.append(originVendor);
		result.append(", originVendorURL: ");
		result.append(originVendorURL);
		result.append(", originVersion: ");
		result.append(originVersion);
		result.append(')');
		return result.toString();
	}

} //SourceDocumentInformationImpl

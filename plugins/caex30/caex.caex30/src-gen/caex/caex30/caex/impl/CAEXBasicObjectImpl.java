/**
 */
package caex.caex30.caex.impl;

import caex.caex30.caex.AdditionalInformation;
import caex.caex30.caex.CAEXBasicObject;
import caex.caex30.caex.CAEXPackage;
import caex.caex30.caex.ChangeMode;
import caex.caex30.caex.Copyright;
import caex.caex30.caex.Description;
import caex.caex30.caex.Revision;
import caex.caex30.caex.Version;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Basic Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link caex.caex30.caex.impl.CAEXBasicObjectImpl#getChangeMode <em>Change Mode</em>}</li>
 *   <li>{@link caex.caex30.caex.impl.CAEXBasicObjectImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link caex.caex30.caex.impl.CAEXBasicObjectImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link caex.caex30.caex.impl.CAEXBasicObjectImpl#getRevision <em>Revision</em>}</li>
 *   <li>{@link caex.caex30.caex.impl.CAEXBasicObjectImpl#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link caex.caex30.caex.impl.CAEXBasicObjectImpl#getAdditionalInformation <em>Additional Information</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CAEXBasicObjectImpl extends MinimalEObjectImpl.Container implements CAEXBasicObject {
	/**
	 * The default value of the '{@link #getChangeMode() <em>Change Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeMode()
	 * @generated
	 * @ordered
	 */
	protected static final ChangeMode CHANGE_MODE_EDEFAULT = ChangeMode.STATE;

	/**
	 * The cached value of the '{@link #getChangeMode() <em>Change Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeMode()
	 * @generated
	 * @ordered
	 */
	protected ChangeMode changeMode = CHANGE_MODE_EDEFAULT;

	/**
	 * This is true if the Change Mode attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean changeModeESet;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected Description description;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected Version version;

	/**
	 * The cached value of the '{@link #getRevision() <em>Revision</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevision()
	 * @generated
	 * @ordered
	 */
	protected EList<Revision> revision;

	/**
	 * The cached value of the '{@link #getCopyright() <em>Copyright</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyright()
	 * @generated
	 * @ordered
	 */
	protected Copyright copyright;

	/**
	 * The cached value of the '{@link #getAdditionalInformation() <em>Additional Information</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalInformation()
	 * @generated
	 * @ordered
	 */
	protected AdditionalInformation additionalInformation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CAEXBasicObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CAEXPackage.Literals.CAEX_BASIC_OBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeMode getChangeMode() {
		return changeMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangeMode(ChangeMode newChangeMode) {
		ChangeMode oldChangeMode = changeMode;
		changeMode = newChangeMode == null ? CHANGE_MODE_EDEFAULT : newChangeMode;
		boolean oldChangeModeESet = changeModeESet;
		changeModeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CAEXPackage.CAEX_BASIC_OBJECT__CHANGE_MODE, oldChangeMode, changeMode, !oldChangeModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetChangeMode() {
		ChangeMode oldChangeMode = changeMode;
		boolean oldChangeModeESet = changeModeESet;
		changeMode = CHANGE_MODE_EDEFAULT;
		changeModeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CAEXPackage.CAEX_BASIC_OBJECT__CHANGE_MODE, oldChangeMode, CHANGE_MODE_EDEFAULT, oldChangeModeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetChangeMode() {
		return changeModeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Description getDescription() {
		if (description != null && description.eIsProxy()) {
			InternalEObject oldDescription = (InternalEObject)description;
			description = (Description)eResolveProxy(oldDescription);
			if (description != oldDescription) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CAEXPackage.CAEX_BASIC_OBJECT__DESCRIPTION, oldDescription, description));
			}
		}
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Description basicGetDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(Description newDescription) {
		Description oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CAEXPackage.CAEX_BASIC_OBJECT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Version getVersion() {
		if (version != null && version.eIsProxy()) {
			InternalEObject oldVersion = (InternalEObject)version;
			version = (Version)eResolveProxy(oldVersion);
			if (version != oldVersion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CAEXPackage.CAEX_BASIC_OBJECT__VERSION, oldVersion, version));
			}
		}
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Version basicGetVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(Version newVersion) {
		Version oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CAEXPackage.CAEX_BASIC_OBJECT__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Revision> getRevision() {
		if (revision == null) {
			revision = new EObjectResolvingEList<Revision>(Revision.class, this, CAEXPackage.CAEX_BASIC_OBJECT__REVISION);
		}
		return revision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Copyright getCopyright() {
		if (copyright != null && copyright.eIsProxy()) {
			InternalEObject oldCopyright = (InternalEObject)copyright;
			copyright = (Copyright)eResolveProxy(oldCopyright);
			if (copyright != oldCopyright) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CAEXPackage.CAEX_BASIC_OBJECT__COPYRIGHT, oldCopyright, copyright));
			}
		}
		return copyright;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Copyright basicGetCopyright() {
		return copyright;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCopyright(Copyright newCopyright) {
		Copyright oldCopyright = copyright;
		copyright = newCopyright;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CAEXPackage.CAEX_BASIC_OBJECT__COPYRIGHT, oldCopyright, copyright));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdditionalInformation getAdditionalInformation() {
		if (additionalInformation != null && additionalInformation.eIsProxy()) {
			InternalEObject oldAdditionalInformation = (InternalEObject)additionalInformation;
			additionalInformation = (AdditionalInformation)eResolveProxy(oldAdditionalInformation);
			if (additionalInformation != oldAdditionalInformation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CAEXPackage.CAEX_BASIC_OBJECT__ADDITIONAL_INFORMATION, oldAdditionalInformation, additionalInformation));
			}
		}
		return additionalInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdditionalInformation basicGetAdditionalInformation() {
		return additionalInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdditionalInformation(AdditionalInformation newAdditionalInformation) {
		AdditionalInformation oldAdditionalInformation = additionalInformation;
		additionalInformation = newAdditionalInformation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CAEXPackage.CAEX_BASIC_OBJECT__ADDITIONAL_INFORMATION, oldAdditionalInformation, additionalInformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CAEXPackage.CAEX_BASIC_OBJECT__CHANGE_MODE:
				return getChangeMode();
			case CAEXPackage.CAEX_BASIC_OBJECT__DESCRIPTION:
				if (resolve) return getDescription();
				return basicGetDescription();
			case CAEXPackage.CAEX_BASIC_OBJECT__VERSION:
				if (resolve) return getVersion();
				return basicGetVersion();
			case CAEXPackage.CAEX_BASIC_OBJECT__REVISION:
				return getRevision();
			case CAEXPackage.CAEX_BASIC_OBJECT__COPYRIGHT:
				if (resolve) return getCopyright();
				return basicGetCopyright();
			case CAEXPackage.CAEX_BASIC_OBJECT__ADDITIONAL_INFORMATION:
				if (resolve) return getAdditionalInformation();
				return basicGetAdditionalInformation();
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
			case CAEXPackage.CAEX_BASIC_OBJECT__CHANGE_MODE:
				setChangeMode((ChangeMode)newValue);
				return;
			case CAEXPackage.CAEX_BASIC_OBJECT__DESCRIPTION:
				setDescription((Description)newValue);
				return;
			case CAEXPackage.CAEX_BASIC_OBJECT__VERSION:
				setVersion((Version)newValue);
				return;
			case CAEXPackage.CAEX_BASIC_OBJECT__REVISION:
				getRevision().clear();
				getRevision().addAll((Collection<? extends Revision>)newValue);
				return;
			case CAEXPackage.CAEX_BASIC_OBJECT__COPYRIGHT:
				setCopyright((Copyright)newValue);
				return;
			case CAEXPackage.CAEX_BASIC_OBJECT__ADDITIONAL_INFORMATION:
				setAdditionalInformation((AdditionalInformation)newValue);
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
			case CAEXPackage.CAEX_BASIC_OBJECT__CHANGE_MODE:
				unsetChangeMode();
				return;
			case CAEXPackage.CAEX_BASIC_OBJECT__DESCRIPTION:
				setDescription((Description)null);
				return;
			case CAEXPackage.CAEX_BASIC_OBJECT__VERSION:
				setVersion((Version)null);
				return;
			case CAEXPackage.CAEX_BASIC_OBJECT__REVISION:
				getRevision().clear();
				return;
			case CAEXPackage.CAEX_BASIC_OBJECT__COPYRIGHT:
				setCopyright((Copyright)null);
				return;
			case CAEXPackage.CAEX_BASIC_OBJECT__ADDITIONAL_INFORMATION:
				setAdditionalInformation((AdditionalInformation)null);
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
			case CAEXPackage.CAEX_BASIC_OBJECT__CHANGE_MODE:
				return isSetChangeMode();
			case CAEXPackage.CAEX_BASIC_OBJECT__DESCRIPTION:
				return description != null;
			case CAEXPackage.CAEX_BASIC_OBJECT__VERSION:
				return version != null;
			case CAEXPackage.CAEX_BASIC_OBJECT__REVISION:
				return revision != null && !revision.isEmpty();
			case CAEXPackage.CAEX_BASIC_OBJECT__COPYRIGHT:
				return copyright != null;
			case CAEXPackage.CAEX_BASIC_OBJECT__ADDITIONAL_INFORMATION:
				return additionalInformation != null;
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
		result.append(" (changeMode: ");
		if (changeModeESet) result.append(changeMode); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //CAEXBasicObjectImpl

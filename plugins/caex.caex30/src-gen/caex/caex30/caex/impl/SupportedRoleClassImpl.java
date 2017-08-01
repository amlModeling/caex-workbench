/**
 */
package caex.caex30.caex.impl;

import caex.caex30.caex.CAEXPackage;
import caex.caex30.caex.Mapping;
import caex.caex30.caex.RoleClass;
import caex.caex30.caex.SupportedRoleClass;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Supported Role Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link caex.caex30.caex.impl.SupportedRoleClassImpl#getMappingObject <em>Mapping Object</em>}</li>
 *   <li>{@link caex.caex30.caex.impl.SupportedRoleClassImpl#getRefRoleClassPath <em>Ref Role Class Path</em>}</li>
 *   <li>{@link caex.caex30.caex.impl.SupportedRoleClassImpl#getRoleClass <em>Role Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SupportedRoleClassImpl extends CAEXBasicObjectImpl implements SupportedRoleClass {
	/**
	 * The cached value of the '{@link #getMappingObject() <em>Mapping Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappingObject()
	 * @generated
	 * @ordered
	 */
	protected Mapping mappingObject;

	/**
	 * The default value of the '{@link #getRefRoleClassPath() <em>Ref Role Class Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefRoleClassPath()
	 * @generated
	 * @ordered
	 */
	protected static final String REF_ROLE_CLASS_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRefRoleClassPath() <em>Ref Role Class Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefRoleClassPath()
	 * @generated
	 * @ordered
	 */
	protected String refRoleClassPath = REF_ROLE_CLASS_PATH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRoleClass() <em>Role Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleClass()
	 * @generated
	 * @ordered
	 */
	protected RoleClass roleClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SupportedRoleClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CAEXPackage.Literals.SUPPORTED_ROLE_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mapping getMappingObject() {
		return mappingObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMappingObject(Mapping newMappingObject, NotificationChain msgs) {
		Mapping oldMappingObject = mappingObject;
		mappingObject = newMappingObject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CAEXPackage.SUPPORTED_ROLE_CLASS__MAPPING_OBJECT, oldMappingObject, newMappingObject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMappingObject(Mapping newMappingObject) {
		if (newMappingObject != mappingObject) {
			NotificationChain msgs = null;
			if (mappingObject != null)
				msgs = ((InternalEObject)mappingObject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CAEXPackage.SUPPORTED_ROLE_CLASS__MAPPING_OBJECT, null, msgs);
			if (newMappingObject != null)
				msgs = ((InternalEObject)newMappingObject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CAEXPackage.SUPPORTED_ROLE_CLASS__MAPPING_OBJECT, null, msgs);
			msgs = basicSetMappingObject(newMappingObject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CAEXPackage.SUPPORTED_ROLE_CLASS__MAPPING_OBJECT, newMappingObject, newMappingObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRefRoleClassPath() {
		return refRoleClassPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefRoleClassPath(String newRefRoleClassPath) {
		String oldRefRoleClassPath = refRoleClassPath;
		refRoleClassPath = newRefRoleClassPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CAEXPackage.SUPPORTED_ROLE_CLASS__REF_ROLE_CLASS_PATH, oldRefRoleClassPath, refRoleClassPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleClass getRoleClass() {
		if (roleClass != null && roleClass.eIsProxy()) {
			InternalEObject oldRoleClass = (InternalEObject)roleClass;
			roleClass = (RoleClass)eResolveProxy(oldRoleClass);
			if (roleClass != oldRoleClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CAEXPackage.SUPPORTED_ROLE_CLASS__ROLE_CLASS, oldRoleClass, roleClass));
			}
		}
		return roleClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleClass basicGetRoleClass() {
		return roleClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoleClass(RoleClass newRoleClass) {
		RoleClass oldRoleClass = roleClass;
		roleClass = newRoleClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CAEXPackage.SUPPORTED_ROLE_CLASS__ROLE_CLASS, oldRoleClass, roleClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CAEXPackage.SUPPORTED_ROLE_CLASS__MAPPING_OBJECT:
				return basicSetMappingObject(null, msgs);
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
			case CAEXPackage.SUPPORTED_ROLE_CLASS__MAPPING_OBJECT:
				return getMappingObject();
			case CAEXPackage.SUPPORTED_ROLE_CLASS__REF_ROLE_CLASS_PATH:
				return getRefRoleClassPath();
			case CAEXPackage.SUPPORTED_ROLE_CLASS__ROLE_CLASS:
				if (resolve) return getRoleClass();
				return basicGetRoleClass();
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
			case CAEXPackage.SUPPORTED_ROLE_CLASS__MAPPING_OBJECT:
				setMappingObject((Mapping)newValue);
				return;
			case CAEXPackage.SUPPORTED_ROLE_CLASS__REF_ROLE_CLASS_PATH:
				setRefRoleClassPath((String)newValue);
				return;
			case CAEXPackage.SUPPORTED_ROLE_CLASS__ROLE_CLASS:
				setRoleClass((RoleClass)newValue);
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
			case CAEXPackage.SUPPORTED_ROLE_CLASS__MAPPING_OBJECT:
				setMappingObject((Mapping)null);
				return;
			case CAEXPackage.SUPPORTED_ROLE_CLASS__REF_ROLE_CLASS_PATH:
				setRefRoleClassPath(REF_ROLE_CLASS_PATH_EDEFAULT);
				return;
			case CAEXPackage.SUPPORTED_ROLE_CLASS__ROLE_CLASS:
				setRoleClass((RoleClass)null);
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
			case CAEXPackage.SUPPORTED_ROLE_CLASS__MAPPING_OBJECT:
				return mappingObject != null;
			case CAEXPackage.SUPPORTED_ROLE_CLASS__REF_ROLE_CLASS_PATH:
				return REF_ROLE_CLASS_PATH_EDEFAULT == null ? refRoleClassPath != null : !REF_ROLE_CLASS_PATH_EDEFAULT.equals(refRoleClassPath);
			case CAEXPackage.SUPPORTED_ROLE_CLASS__ROLE_CLASS:
				return roleClass != null;
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
		result.append(" (refRoleClassPath: ");
		result.append(refRoleClassPath);
		result.append(')');
		return result.toString();
	}

} //SupportedRoleClassImpl

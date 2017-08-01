/**
 */
package caex.caex30.caex.impl;

import caex.caex30.caex.Attribute;
import caex.caex30.caex.AttributeNameMapping;
import caex.caex30.caex.CAEXPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Name Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link caex.caex30.caex.impl.AttributeNameMappingImpl#getRoleAttributeName <em>Role Attribute Name</em>}</li>
 *   <li>{@link caex.caex30.caex.impl.AttributeNameMappingImpl#getSystemUnitAttributeName <em>System Unit Attribute Name</em>}</li>
 *   <li>{@link caex.caex30.caex.impl.AttributeNameMappingImpl#getRoleAttribute <em>Role Attribute</em>}</li>
 *   <li>{@link caex.caex30.caex.impl.AttributeNameMappingImpl#getSystemUnitAttribute <em>System Unit Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeNameMappingImpl extends CAEXBasicObjectImpl implements AttributeNameMapping {
	/**
	 * The default value of the '{@link #getRoleAttributeName() <em>Role Attribute Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleAttributeName()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_ATTRIBUTE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRoleAttributeName() <em>Role Attribute Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleAttributeName()
	 * @generated
	 * @ordered
	 */
	protected String roleAttributeName = ROLE_ATTRIBUTE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSystemUnitAttributeName() <em>System Unit Attribute Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemUnitAttributeName()
	 * @generated
	 * @ordered
	 */
	protected static final String SYSTEM_UNIT_ATTRIBUTE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSystemUnitAttributeName() <em>System Unit Attribute Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemUnitAttributeName()
	 * @generated
	 * @ordered
	 */
	protected String systemUnitAttributeName = SYSTEM_UNIT_ATTRIBUTE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRoleAttribute() <em>Role Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleAttribute()
	 * @generated
	 * @ordered
	 */
	protected Attribute roleAttribute;

	/**
	 * The cached value of the '{@link #getSystemUnitAttribute() <em>System Unit Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemUnitAttribute()
	 * @generated
	 * @ordered
	 */
	protected Attribute systemUnitAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeNameMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CAEXPackage.Literals.ATTRIBUTE_NAME_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRoleAttributeName() {
		return roleAttributeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoleAttributeName(String newRoleAttributeName) {
		String oldRoleAttributeName = roleAttributeName;
		roleAttributeName = newRoleAttributeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CAEXPackage.ATTRIBUTE_NAME_MAPPING__ROLE_ATTRIBUTE_NAME, oldRoleAttributeName, roleAttributeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSystemUnitAttributeName() {
		return systemUnitAttributeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystemUnitAttributeName(String newSystemUnitAttributeName) {
		String oldSystemUnitAttributeName = systemUnitAttributeName;
		systemUnitAttributeName = newSystemUnitAttributeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CAEXPackage.ATTRIBUTE_NAME_MAPPING__SYSTEM_UNIT_ATTRIBUTE_NAME, oldSystemUnitAttributeName, systemUnitAttributeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getRoleAttribute() {
		if (roleAttribute != null && roleAttribute.eIsProxy()) {
			InternalEObject oldRoleAttribute = (InternalEObject)roleAttribute;
			roleAttribute = (Attribute)eResolveProxy(oldRoleAttribute);
			if (roleAttribute != oldRoleAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CAEXPackage.ATTRIBUTE_NAME_MAPPING__ROLE_ATTRIBUTE, oldRoleAttribute, roleAttribute));
			}
		}
		return roleAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetRoleAttribute() {
		return roleAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoleAttribute(Attribute newRoleAttribute) {
		Attribute oldRoleAttribute = roleAttribute;
		roleAttribute = newRoleAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CAEXPackage.ATTRIBUTE_NAME_MAPPING__ROLE_ATTRIBUTE, oldRoleAttribute, roleAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getSystemUnitAttribute() {
		if (systemUnitAttribute != null && systemUnitAttribute.eIsProxy()) {
			InternalEObject oldSystemUnitAttribute = (InternalEObject)systemUnitAttribute;
			systemUnitAttribute = (Attribute)eResolveProxy(oldSystemUnitAttribute);
			if (systemUnitAttribute != oldSystemUnitAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CAEXPackage.ATTRIBUTE_NAME_MAPPING__SYSTEM_UNIT_ATTRIBUTE, oldSystemUnitAttribute, systemUnitAttribute));
			}
		}
		return systemUnitAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetSystemUnitAttribute() {
		return systemUnitAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystemUnitAttribute(Attribute newSystemUnitAttribute) {
		Attribute oldSystemUnitAttribute = systemUnitAttribute;
		systemUnitAttribute = newSystemUnitAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CAEXPackage.ATTRIBUTE_NAME_MAPPING__SYSTEM_UNIT_ATTRIBUTE, oldSystemUnitAttribute, systemUnitAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CAEXPackage.ATTRIBUTE_NAME_MAPPING__ROLE_ATTRIBUTE_NAME:
				return getRoleAttributeName();
			case CAEXPackage.ATTRIBUTE_NAME_MAPPING__SYSTEM_UNIT_ATTRIBUTE_NAME:
				return getSystemUnitAttributeName();
			case CAEXPackage.ATTRIBUTE_NAME_MAPPING__ROLE_ATTRIBUTE:
				if (resolve) return getRoleAttribute();
				return basicGetRoleAttribute();
			case CAEXPackage.ATTRIBUTE_NAME_MAPPING__SYSTEM_UNIT_ATTRIBUTE:
				if (resolve) return getSystemUnitAttribute();
				return basicGetSystemUnitAttribute();
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
			case CAEXPackage.ATTRIBUTE_NAME_MAPPING__ROLE_ATTRIBUTE_NAME:
				setRoleAttributeName((String)newValue);
				return;
			case CAEXPackage.ATTRIBUTE_NAME_MAPPING__SYSTEM_UNIT_ATTRIBUTE_NAME:
				setSystemUnitAttributeName((String)newValue);
				return;
			case CAEXPackage.ATTRIBUTE_NAME_MAPPING__ROLE_ATTRIBUTE:
				setRoleAttribute((Attribute)newValue);
				return;
			case CAEXPackage.ATTRIBUTE_NAME_MAPPING__SYSTEM_UNIT_ATTRIBUTE:
				setSystemUnitAttribute((Attribute)newValue);
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
			case CAEXPackage.ATTRIBUTE_NAME_MAPPING__ROLE_ATTRIBUTE_NAME:
				setRoleAttributeName(ROLE_ATTRIBUTE_NAME_EDEFAULT);
				return;
			case CAEXPackage.ATTRIBUTE_NAME_MAPPING__SYSTEM_UNIT_ATTRIBUTE_NAME:
				setSystemUnitAttributeName(SYSTEM_UNIT_ATTRIBUTE_NAME_EDEFAULT);
				return;
			case CAEXPackage.ATTRIBUTE_NAME_MAPPING__ROLE_ATTRIBUTE:
				setRoleAttribute((Attribute)null);
				return;
			case CAEXPackage.ATTRIBUTE_NAME_MAPPING__SYSTEM_UNIT_ATTRIBUTE:
				setSystemUnitAttribute((Attribute)null);
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
			case CAEXPackage.ATTRIBUTE_NAME_MAPPING__ROLE_ATTRIBUTE_NAME:
				return ROLE_ATTRIBUTE_NAME_EDEFAULT == null ? roleAttributeName != null : !ROLE_ATTRIBUTE_NAME_EDEFAULT.equals(roleAttributeName);
			case CAEXPackage.ATTRIBUTE_NAME_MAPPING__SYSTEM_UNIT_ATTRIBUTE_NAME:
				return SYSTEM_UNIT_ATTRIBUTE_NAME_EDEFAULT == null ? systemUnitAttributeName != null : !SYSTEM_UNIT_ATTRIBUTE_NAME_EDEFAULT.equals(systemUnitAttributeName);
			case CAEXPackage.ATTRIBUTE_NAME_MAPPING__ROLE_ATTRIBUTE:
				return roleAttribute != null;
			case CAEXPackage.ATTRIBUTE_NAME_MAPPING__SYSTEM_UNIT_ATTRIBUTE:
				return systemUnitAttribute != null;
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
		result.append(" (roleAttributeName: ");
		result.append(roleAttributeName);
		result.append(", systemUnitAttributeName: ");
		result.append(systemUnitAttributeName);
		result.append(')');
		return result.toString();
	}

} //AttributeNameMappingImpl

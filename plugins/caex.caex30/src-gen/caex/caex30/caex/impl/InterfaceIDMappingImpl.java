/**
 */
package caex.caex30.caex.impl;

import caex.caex30.caex.CAEXPackage;
import caex.caex30.caex.ExternalInterface;
import caex.caex30.caex.InterfaceIDMapping;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface ID Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link caex.caex30.caex.impl.InterfaceIDMappingImpl#getRoleInterfaceID <em>Role Interface ID</em>}</li>
 *   <li>{@link caex.caex30.caex.impl.InterfaceIDMappingImpl#getSystemUnitInterfaceID <em>System Unit Interface ID</em>}</li>
 *   <li>{@link caex.caex30.caex.impl.InterfaceIDMappingImpl#getRoleInterface <em>Role Interface</em>}</li>
 *   <li>{@link caex.caex30.caex.impl.InterfaceIDMappingImpl#getSystemUnitInterface <em>System Unit Interface</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterfaceIDMappingImpl extends CAEXBasicObjectImpl implements InterfaceIDMapping {
	/**
	 * The default value of the '{@link #getRoleInterfaceID() <em>Role Interface ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleInterfaceID()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_INTERFACE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRoleInterfaceID() <em>Role Interface ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleInterfaceID()
	 * @generated
	 * @ordered
	 */
	protected String roleInterfaceID = ROLE_INTERFACE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSystemUnitInterfaceID() <em>System Unit Interface ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemUnitInterfaceID()
	 * @generated
	 * @ordered
	 */
	protected static final String SYSTEM_UNIT_INTERFACE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSystemUnitInterfaceID() <em>System Unit Interface ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemUnitInterfaceID()
	 * @generated
	 * @ordered
	 */
	protected String systemUnitInterfaceID = SYSTEM_UNIT_INTERFACE_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRoleInterface() <em>Role Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleInterface()
	 * @generated
	 * @ordered
	 */
	protected ExternalInterface roleInterface;

	/**
	 * The cached value of the '{@link #getSystemUnitInterface() <em>System Unit Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemUnitInterface()
	 * @generated
	 * @ordered
	 */
	protected ExternalInterface systemUnitInterface;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceIDMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CAEXPackage.Literals.INTERFACE_ID_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRoleInterfaceID() {
		return roleInterfaceID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoleInterfaceID(String newRoleInterfaceID) {
		String oldRoleInterfaceID = roleInterfaceID;
		roleInterfaceID = newRoleInterfaceID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CAEXPackage.INTERFACE_ID_MAPPING__ROLE_INTERFACE_ID, oldRoleInterfaceID, roleInterfaceID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSystemUnitInterfaceID() {
		return systemUnitInterfaceID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystemUnitInterfaceID(String newSystemUnitInterfaceID) {
		String oldSystemUnitInterfaceID = systemUnitInterfaceID;
		systemUnitInterfaceID = newSystemUnitInterfaceID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CAEXPackage.INTERFACE_ID_MAPPING__SYSTEM_UNIT_INTERFACE_ID, oldSystemUnitInterfaceID, systemUnitInterfaceID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalInterface getRoleInterface() {
		if (roleInterface != null && roleInterface.eIsProxy()) {
			InternalEObject oldRoleInterface = (InternalEObject)roleInterface;
			roleInterface = (ExternalInterface)eResolveProxy(oldRoleInterface);
			if (roleInterface != oldRoleInterface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CAEXPackage.INTERFACE_ID_MAPPING__ROLE_INTERFACE, oldRoleInterface, roleInterface));
			}
		}
		return roleInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalInterface basicGetRoleInterface() {
		return roleInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoleInterface(ExternalInterface newRoleInterface) {
		ExternalInterface oldRoleInterface = roleInterface;
		roleInterface = newRoleInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CAEXPackage.INTERFACE_ID_MAPPING__ROLE_INTERFACE, oldRoleInterface, roleInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalInterface getSystemUnitInterface() {
		if (systemUnitInterface != null && systemUnitInterface.eIsProxy()) {
			InternalEObject oldSystemUnitInterface = (InternalEObject)systemUnitInterface;
			systemUnitInterface = (ExternalInterface)eResolveProxy(oldSystemUnitInterface);
			if (systemUnitInterface != oldSystemUnitInterface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CAEXPackage.INTERFACE_ID_MAPPING__SYSTEM_UNIT_INTERFACE, oldSystemUnitInterface, systemUnitInterface));
			}
		}
		return systemUnitInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalInterface basicGetSystemUnitInterface() {
		return systemUnitInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystemUnitInterface(ExternalInterface newSystemUnitInterface) {
		ExternalInterface oldSystemUnitInterface = systemUnitInterface;
		systemUnitInterface = newSystemUnitInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CAEXPackage.INTERFACE_ID_MAPPING__SYSTEM_UNIT_INTERFACE, oldSystemUnitInterface, systemUnitInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CAEXPackage.INTERFACE_ID_MAPPING__ROLE_INTERFACE_ID:
				return getRoleInterfaceID();
			case CAEXPackage.INTERFACE_ID_MAPPING__SYSTEM_UNIT_INTERFACE_ID:
				return getSystemUnitInterfaceID();
			case CAEXPackage.INTERFACE_ID_MAPPING__ROLE_INTERFACE:
				if (resolve) return getRoleInterface();
				return basicGetRoleInterface();
			case CAEXPackage.INTERFACE_ID_MAPPING__SYSTEM_UNIT_INTERFACE:
				if (resolve) return getSystemUnitInterface();
				return basicGetSystemUnitInterface();
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
			case CAEXPackage.INTERFACE_ID_MAPPING__ROLE_INTERFACE_ID:
				setRoleInterfaceID((String)newValue);
				return;
			case CAEXPackage.INTERFACE_ID_MAPPING__SYSTEM_UNIT_INTERFACE_ID:
				setSystemUnitInterfaceID((String)newValue);
				return;
			case CAEXPackage.INTERFACE_ID_MAPPING__ROLE_INTERFACE:
				setRoleInterface((ExternalInterface)newValue);
				return;
			case CAEXPackage.INTERFACE_ID_MAPPING__SYSTEM_UNIT_INTERFACE:
				setSystemUnitInterface((ExternalInterface)newValue);
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
			case CAEXPackage.INTERFACE_ID_MAPPING__ROLE_INTERFACE_ID:
				setRoleInterfaceID(ROLE_INTERFACE_ID_EDEFAULT);
				return;
			case CAEXPackage.INTERFACE_ID_MAPPING__SYSTEM_UNIT_INTERFACE_ID:
				setSystemUnitInterfaceID(SYSTEM_UNIT_INTERFACE_ID_EDEFAULT);
				return;
			case CAEXPackage.INTERFACE_ID_MAPPING__ROLE_INTERFACE:
				setRoleInterface((ExternalInterface)null);
				return;
			case CAEXPackage.INTERFACE_ID_MAPPING__SYSTEM_UNIT_INTERFACE:
				setSystemUnitInterface((ExternalInterface)null);
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
			case CAEXPackage.INTERFACE_ID_MAPPING__ROLE_INTERFACE_ID:
				return ROLE_INTERFACE_ID_EDEFAULT == null ? roleInterfaceID != null : !ROLE_INTERFACE_ID_EDEFAULT.equals(roleInterfaceID);
			case CAEXPackage.INTERFACE_ID_MAPPING__SYSTEM_UNIT_INTERFACE_ID:
				return SYSTEM_UNIT_INTERFACE_ID_EDEFAULT == null ? systemUnitInterfaceID != null : !SYSTEM_UNIT_INTERFACE_ID_EDEFAULT.equals(systemUnitInterfaceID);
			case CAEXPackage.INTERFACE_ID_MAPPING__ROLE_INTERFACE:
				return roleInterface != null;
			case CAEXPackage.INTERFACE_ID_MAPPING__SYSTEM_UNIT_INTERFACE:
				return systemUnitInterface != null;
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
		result.append(" (roleInterfaceID: ");
		result.append(roleInterfaceID);
		result.append(", systemUnitInterfaceID: ");
		result.append(systemUnitInterfaceID);
		result.append(')');
		return result.toString();
	}

} //InterfaceIDMappingImpl

/**
 */
package caex.caex215.caex.impl;

import caex.caex215.caex.CAEXPackage;
import caex.caex215.caex.ExternalInterface;
import caex.caex215.caex.InterfaceNameMapping;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface Name Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link caex.caex215.caex.impl.InterfaceNameMappingImpl#getRoleInterfaceName <em>Role Interface Name</em>}</li>
 *   <li>{@link caex.caex215.caex.impl.InterfaceNameMappingImpl#getSystemUnitInterfaceName <em>System Unit Interface Name</em>}</li>
 *   <li>{@link caex.caex215.caex.impl.InterfaceNameMappingImpl#getRoleInterface <em>Role Interface</em>}</li>
 *   <li>{@link caex.caex215.caex.impl.InterfaceNameMappingImpl#getSystemUnitInterface <em>System Unit Interface</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterfaceNameMappingImpl extends CAEXBasicObjectImpl implements InterfaceNameMapping {
	/**
	 * The default value of the '{@link #getRoleInterfaceName() <em>Role Interface Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleInterfaceName()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_INTERFACE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRoleInterfaceName() <em>Role Interface Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleInterfaceName()
	 * @generated
	 * @ordered
	 */
	protected String roleInterfaceName = ROLE_INTERFACE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSystemUnitInterfaceName() <em>System Unit Interface Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemUnitInterfaceName()
	 * @generated
	 * @ordered
	 */
	protected static final String SYSTEM_UNIT_INTERFACE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSystemUnitInterfaceName() <em>System Unit Interface Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemUnitInterfaceName()
	 * @generated
	 * @ordered
	 */
	protected String systemUnitInterfaceName = SYSTEM_UNIT_INTERFACE_NAME_EDEFAULT;

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
	protected InterfaceNameMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CAEXPackage.Literals.INTERFACE_NAME_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRoleInterfaceName() {
		return roleInterfaceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoleInterfaceName(String newRoleInterfaceName) {
		String oldRoleInterfaceName = roleInterfaceName;
		roleInterfaceName = newRoleInterfaceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CAEXPackage.INTERFACE_NAME_MAPPING__ROLE_INTERFACE_NAME, oldRoleInterfaceName, roleInterfaceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSystemUnitInterfaceName() {
		return systemUnitInterfaceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystemUnitInterfaceName(String newSystemUnitInterfaceName) {
		String oldSystemUnitInterfaceName = systemUnitInterfaceName;
		systemUnitInterfaceName = newSystemUnitInterfaceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CAEXPackage.INTERFACE_NAME_MAPPING__SYSTEM_UNIT_INTERFACE_NAME, oldSystemUnitInterfaceName, systemUnitInterfaceName));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CAEXPackage.INTERFACE_NAME_MAPPING__ROLE_INTERFACE, oldRoleInterface, roleInterface));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CAEXPackage.INTERFACE_NAME_MAPPING__ROLE_INTERFACE, oldRoleInterface, roleInterface));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CAEXPackage.INTERFACE_NAME_MAPPING__SYSTEM_UNIT_INTERFACE, oldSystemUnitInterface, systemUnitInterface));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CAEXPackage.INTERFACE_NAME_MAPPING__SYSTEM_UNIT_INTERFACE, oldSystemUnitInterface, systemUnitInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CAEXPackage.INTERFACE_NAME_MAPPING__ROLE_INTERFACE_NAME:
				return getRoleInterfaceName();
			case CAEXPackage.INTERFACE_NAME_MAPPING__SYSTEM_UNIT_INTERFACE_NAME:
				return getSystemUnitInterfaceName();
			case CAEXPackage.INTERFACE_NAME_MAPPING__ROLE_INTERFACE:
				if (resolve) return getRoleInterface();
				return basicGetRoleInterface();
			case CAEXPackage.INTERFACE_NAME_MAPPING__SYSTEM_UNIT_INTERFACE:
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
			case CAEXPackage.INTERFACE_NAME_MAPPING__ROLE_INTERFACE_NAME:
				setRoleInterfaceName((String)newValue);
				return;
			case CAEXPackage.INTERFACE_NAME_MAPPING__SYSTEM_UNIT_INTERFACE_NAME:
				setSystemUnitInterfaceName((String)newValue);
				return;
			case CAEXPackage.INTERFACE_NAME_MAPPING__ROLE_INTERFACE:
				setRoleInterface((ExternalInterface)newValue);
				return;
			case CAEXPackage.INTERFACE_NAME_MAPPING__SYSTEM_UNIT_INTERFACE:
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
			case CAEXPackage.INTERFACE_NAME_MAPPING__ROLE_INTERFACE_NAME:
				setRoleInterfaceName(ROLE_INTERFACE_NAME_EDEFAULT);
				return;
			case CAEXPackage.INTERFACE_NAME_MAPPING__SYSTEM_UNIT_INTERFACE_NAME:
				setSystemUnitInterfaceName(SYSTEM_UNIT_INTERFACE_NAME_EDEFAULT);
				return;
			case CAEXPackage.INTERFACE_NAME_MAPPING__ROLE_INTERFACE:
				setRoleInterface((ExternalInterface)null);
				return;
			case CAEXPackage.INTERFACE_NAME_MAPPING__SYSTEM_UNIT_INTERFACE:
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
			case CAEXPackage.INTERFACE_NAME_MAPPING__ROLE_INTERFACE_NAME:
				return ROLE_INTERFACE_NAME_EDEFAULT == null ? roleInterfaceName != null : !ROLE_INTERFACE_NAME_EDEFAULT.equals(roleInterfaceName);
			case CAEXPackage.INTERFACE_NAME_MAPPING__SYSTEM_UNIT_INTERFACE_NAME:
				return SYSTEM_UNIT_INTERFACE_NAME_EDEFAULT == null ? systemUnitInterfaceName != null : !SYSTEM_UNIT_INTERFACE_NAME_EDEFAULT.equals(systemUnitInterfaceName);
			case CAEXPackage.INTERFACE_NAME_MAPPING__ROLE_INTERFACE:
				return roleInterface != null;
			case CAEXPackage.INTERFACE_NAME_MAPPING__SYSTEM_UNIT_INTERFACE:
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
		result.append(" (roleInterfaceName: ");
		result.append(roleInterfaceName);
		result.append(", systemUnitInterfaceName: ");
		result.append(systemUnitInterfaceName);
		result.append(')');
		return result.toString();
	}

} //InterfaceNameMappingImpl

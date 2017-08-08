/**
 */
package caex.caex30.caex.impl;

import caex.caex30.caex.CAEXPackage;
import caex.caex30.caex.InternalElement;
import caex.caex30.caex.RoleRequirements;
import caex.caex30.caex.SystemUnitClass;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Internal Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link caex.caex30.caex.impl.InternalElementImpl#getRoleRequirements <em>Role Requirements</em>}</li>
 *   <li>{@link caex.caex30.caex.impl.InternalElementImpl#getRefBaseSystemUnitPath <em>Ref Base System Unit Path</em>}</li>
 *   <li>{@link caex.caex30.caex.impl.InternalElementImpl#getBaseSystemUnit <em>Base System Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InternalElementImpl extends SystemUnitClassImpl implements InternalElement {
	/**
	 * The cached value of the '{@link #getRoleRequirements() <em>Role Requirements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleRequirements()
	 * @generated
	 * @ordered
	 */
	protected EList<RoleRequirements> roleRequirements;

	/**
	 * The default value of the '{@link #getRefBaseSystemUnitPath() <em>Ref Base System Unit Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefBaseSystemUnitPath()
	 * @generated
	 * @ordered
	 */
	protected static final String REF_BASE_SYSTEM_UNIT_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRefBaseSystemUnitPath() <em>Ref Base System Unit Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefBaseSystemUnitPath()
	 * @generated
	 * @ordered
	 */
	protected String refBaseSystemUnitPath = REF_BASE_SYSTEM_UNIT_PATH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBaseSystemUnit() <em>Base System Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseSystemUnit()
	 * @generated
	 * @ordered
	 */
	protected SystemUnitClass baseSystemUnit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InternalElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CAEXPackage.Literals.INTERNAL_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoleRequirements> getRoleRequirements() {
		if (roleRequirements == null) {
			roleRequirements = new EObjectContainmentEList<RoleRequirements>(RoleRequirements.class, this, CAEXPackage.INTERNAL_ELEMENT__ROLE_REQUIREMENTS);
		}
		return roleRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRefBaseSystemUnitPath() {
		return refBaseSystemUnitPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefBaseSystemUnitPath(String newRefBaseSystemUnitPath) {
		String oldRefBaseSystemUnitPath = refBaseSystemUnitPath;
		refBaseSystemUnitPath = newRefBaseSystemUnitPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CAEXPackage.INTERNAL_ELEMENT__REF_BASE_SYSTEM_UNIT_PATH, oldRefBaseSystemUnitPath, refBaseSystemUnitPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemUnitClass getBaseSystemUnit() {
		if (baseSystemUnit != null && baseSystemUnit.eIsProxy()) {
			InternalEObject oldBaseSystemUnit = (InternalEObject)baseSystemUnit;
			baseSystemUnit = (SystemUnitClass)eResolveProxy(oldBaseSystemUnit);
			if (baseSystemUnit != oldBaseSystemUnit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CAEXPackage.INTERNAL_ELEMENT__BASE_SYSTEM_UNIT, oldBaseSystemUnit, baseSystemUnit));
			}
		}
		return baseSystemUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemUnitClass basicGetBaseSystemUnit() {
		return baseSystemUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseSystemUnit(SystemUnitClass newBaseSystemUnit) {
		SystemUnitClass oldBaseSystemUnit = baseSystemUnit;
		baseSystemUnit = newBaseSystemUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CAEXPackage.INTERNAL_ELEMENT__BASE_SYSTEM_UNIT, oldBaseSystemUnit, baseSystemUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CAEXPackage.INTERNAL_ELEMENT__ROLE_REQUIREMENTS:
				return ((InternalEList<?>)getRoleRequirements()).basicRemove(otherEnd, msgs);
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
			case CAEXPackage.INTERNAL_ELEMENT__ROLE_REQUIREMENTS:
				return getRoleRequirements();
			case CAEXPackage.INTERNAL_ELEMENT__REF_BASE_SYSTEM_UNIT_PATH:
				return getRefBaseSystemUnitPath();
			case CAEXPackage.INTERNAL_ELEMENT__BASE_SYSTEM_UNIT:
				if (resolve) return getBaseSystemUnit();
				return basicGetBaseSystemUnit();
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
			case CAEXPackage.INTERNAL_ELEMENT__ROLE_REQUIREMENTS:
				getRoleRequirements().clear();
				getRoleRequirements().addAll((Collection<? extends RoleRequirements>)newValue);
				return;
			case CAEXPackage.INTERNAL_ELEMENT__REF_BASE_SYSTEM_UNIT_PATH:
				setRefBaseSystemUnitPath((String)newValue);
				return;
			case CAEXPackage.INTERNAL_ELEMENT__BASE_SYSTEM_UNIT:
				setBaseSystemUnit((SystemUnitClass)newValue);
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
			case CAEXPackage.INTERNAL_ELEMENT__ROLE_REQUIREMENTS:
				getRoleRequirements().clear();
				return;
			case CAEXPackage.INTERNAL_ELEMENT__REF_BASE_SYSTEM_UNIT_PATH:
				setRefBaseSystemUnitPath(REF_BASE_SYSTEM_UNIT_PATH_EDEFAULT);
				return;
			case CAEXPackage.INTERNAL_ELEMENT__BASE_SYSTEM_UNIT:
				setBaseSystemUnit((SystemUnitClass)null);
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
			case CAEXPackage.INTERNAL_ELEMENT__ROLE_REQUIREMENTS:
				return roleRequirements != null && !roleRequirements.isEmpty();
			case CAEXPackage.INTERNAL_ELEMENT__REF_BASE_SYSTEM_UNIT_PATH:
				return REF_BASE_SYSTEM_UNIT_PATH_EDEFAULT == null ? refBaseSystemUnitPath != null : !REF_BASE_SYSTEM_UNIT_PATH_EDEFAULT.equals(refBaseSystemUnitPath);
			case CAEXPackage.INTERNAL_ELEMENT__BASE_SYSTEM_UNIT:
				return baseSystemUnit != null;
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
		result.append(" (refBaseSystemUnitPath: ");
		result.append(refBaseSystemUnitPath);
		result.append(')');
		return result.toString();
	}

} //InternalElementImpl

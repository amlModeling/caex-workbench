/**
 */
package caex.caex30.caex.impl;

import caex.caex30.caex.Attribute;
import caex.caex30.caex.CAEXPackage;
import caex.caex30.caex.ExternalInterface;
import caex.caex30.caex.RoleClass;

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
 * An implementation of the model object '<em><b>Role Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link caex.caex30.caex.impl.RoleClassImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link caex.caex30.caex.impl.RoleClassImpl#getExternalInterface <em>External Interface</em>}</li>
 *   <li>{@link caex.caex30.caex.impl.RoleClassImpl#getRefBaseClassPath <em>Ref Base Class Path</em>}</li>
 *   <li>{@link caex.caex30.caex.impl.RoleClassImpl#getBaseClass <em>Base Class</em>}</li>
 *   <li>{@link caex.caex30.caex.impl.RoleClassImpl#getRoleClass <em>Role Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoleClassImpl extends CAEXObjectImpl implements RoleClass {
	/**
	 * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attribute;

	/**
	 * The cached value of the '{@link #getExternalInterface() <em>External Interface</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalInterface()
	 * @generated
	 * @ordered
	 */
	protected EList<ExternalInterface> externalInterface;

	/**
	 * The default value of the '{@link #getRefBaseClassPath() <em>Ref Base Class Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefBaseClassPath()
	 * @generated
	 * @ordered
	 */
	protected static final String REF_BASE_CLASS_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRefBaseClassPath() <em>Ref Base Class Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefBaseClassPath()
	 * @generated
	 * @ordered
	 */
	protected String refBaseClassPath = REF_BASE_CLASS_PATH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBaseClass() <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseClass()
	 * @generated
	 * @ordered
	 */
	protected RoleClass baseClass;

	/**
	 * The cached value of the '{@link #getRoleClass() <em>Role Class</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleClass()
	 * @generated
	 * @ordered
	 */
	protected EList<RoleClass> roleClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CAEXPackage.Literals.ROLE_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getAttribute() {
		if (attribute == null) {
			attribute = new EObjectContainmentEList<Attribute>(Attribute.class, this, CAEXPackage.ROLE_CLASS__ATTRIBUTE);
		}
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExternalInterface> getExternalInterface() {
		if (externalInterface == null) {
			externalInterface = new EObjectContainmentEList<ExternalInterface>(ExternalInterface.class, this, CAEXPackage.ROLE_CLASS__EXTERNAL_INTERFACE);
		}
		return externalInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRefBaseClassPath() {
		return refBaseClassPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefBaseClassPath(String newRefBaseClassPath) {
		String oldRefBaseClassPath = refBaseClassPath;
		refBaseClassPath = newRefBaseClassPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CAEXPackage.ROLE_CLASS__REF_BASE_CLASS_PATH, oldRefBaseClassPath, refBaseClassPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleClass getBaseClass() {
		if (baseClass != null && baseClass.eIsProxy()) {
			InternalEObject oldBaseClass = (InternalEObject)baseClass;
			baseClass = (RoleClass)eResolveProxy(oldBaseClass);
			if (baseClass != oldBaseClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CAEXPackage.ROLE_CLASS__BASE_CLASS, oldBaseClass, baseClass));
			}
		}
		return baseClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoleClass basicGetBaseClass() {
		return baseClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseClass(RoleClass newBaseClass) {
		RoleClass oldBaseClass = baseClass;
		baseClass = newBaseClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CAEXPackage.ROLE_CLASS__BASE_CLASS, oldBaseClass, baseClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoleClass> getRoleClass() {
		if (roleClass == null) {
			roleClass = new EObjectContainmentEList<RoleClass>(RoleClass.class, this, CAEXPackage.ROLE_CLASS__ROLE_CLASS);
		}
		return roleClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CAEXPackage.ROLE_CLASS__ATTRIBUTE:
				return ((InternalEList<?>)getAttribute()).basicRemove(otherEnd, msgs);
			case CAEXPackage.ROLE_CLASS__EXTERNAL_INTERFACE:
				return ((InternalEList<?>)getExternalInterface()).basicRemove(otherEnd, msgs);
			case CAEXPackage.ROLE_CLASS__ROLE_CLASS:
				return ((InternalEList<?>)getRoleClass()).basicRemove(otherEnd, msgs);
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
			case CAEXPackage.ROLE_CLASS__ATTRIBUTE:
				return getAttribute();
			case CAEXPackage.ROLE_CLASS__EXTERNAL_INTERFACE:
				return getExternalInterface();
			case CAEXPackage.ROLE_CLASS__REF_BASE_CLASS_PATH:
				return getRefBaseClassPath();
			case CAEXPackage.ROLE_CLASS__BASE_CLASS:
				if (resolve) return getBaseClass();
				return basicGetBaseClass();
			case CAEXPackage.ROLE_CLASS__ROLE_CLASS:
				return getRoleClass();
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
			case CAEXPackage.ROLE_CLASS__ATTRIBUTE:
				getAttribute().clear();
				getAttribute().addAll((Collection<? extends Attribute>)newValue);
				return;
			case CAEXPackage.ROLE_CLASS__EXTERNAL_INTERFACE:
				getExternalInterface().clear();
				getExternalInterface().addAll((Collection<? extends ExternalInterface>)newValue);
				return;
			case CAEXPackage.ROLE_CLASS__REF_BASE_CLASS_PATH:
				setRefBaseClassPath((String)newValue);
				return;
			case CAEXPackage.ROLE_CLASS__BASE_CLASS:
				setBaseClass((RoleClass)newValue);
				return;
			case CAEXPackage.ROLE_CLASS__ROLE_CLASS:
				getRoleClass().clear();
				getRoleClass().addAll((Collection<? extends RoleClass>)newValue);
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
			case CAEXPackage.ROLE_CLASS__ATTRIBUTE:
				getAttribute().clear();
				return;
			case CAEXPackage.ROLE_CLASS__EXTERNAL_INTERFACE:
				getExternalInterface().clear();
				return;
			case CAEXPackage.ROLE_CLASS__REF_BASE_CLASS_PATH:
				setRefBaseClassPath(REF_BASE_CLASS_PATH_EDEFAULT);
				return;
			case CAEXPackage.ROLE_CLASS__BASE_CLASS:
				setBaseClass((RoleClass)null);
				return;
			case CAEXPackage.ROLE_CLASS__ROLE_CLASS:
				getRoleClass().clear();
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
			case CAEXPackage.ROLE_CLASS__ATTRIBUTE:
				return attribute != null && !attribute.isEmpty();
			case CAEXPackage.ROLE_CLASS__EXTERNAL_INTERFACE:
				return externalInterface != null && !externalInterface.isEmpty();
			case CAEXPackage.ROLE_CLASS__REF_BASE_CLASS_PATH:
				return REF_BASE_CLASS_PATH_EDEFAULT == null ? refBaseClassPath != null : !REF_BASE_CLASS_PATH_EDEFAULT.equals(refBaseClassPath);
			case CAEXPackage.ROLE_CLASS__BASE_CLASS:
				return baseClass != null;
			case CAEXPackage.ROLE_CLASS__ROLE_CLASS:
				return roleClass != null && !roleClass.isEmpty();
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
		result.append(" (refBaseClassPath: ");
		result.append(refBaseClassPath);
		result.append(')');
		return result.toString();
	}

} //RoleClassImpl

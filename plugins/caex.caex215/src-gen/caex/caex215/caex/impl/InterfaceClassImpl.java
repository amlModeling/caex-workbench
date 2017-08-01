/**
 */
package caex.caex215.caex.impl;

import caex.caex215.caex.Attribute;
import caex.caex215.caex.CAEXPackage;
import caex.caex215.caex.InterfaceClass;

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
 * An implementation of the model object '<em><b>Interface Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link caex.caex215.caex.impl.InterfaceClassImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link caex.caex215.caex.impl.InterfaceClassImpl#getRefBaseClassPath <em>Ref Base Class Path</em>}</li>
 *   <li>{@link caex.caex215.caex.impl.InterfaceClassImpl#getBaseClass <em>Base Class</em>}</li>
 *   <li>{@link caex.caex215.caex.impl.InterfaceClassImpl#getInterfaceClass <em>Interface Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterfaceClassImpl extends CAEXObjectImpl implements InterfaceClass {
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
	protected InterfaceClass baseClass;

	/**
	 * The cached value of the '{@link #getInterfaceClass() <em>Interface Class</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceClass()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceClass> interfaceClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CAEXPackage.Literals.INTERFACE_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getAttribute() {
		if (attribute == null) {
			attribute = new EObjectContainmentEList<Attribute>(Attribute.class, this, CAEXPackage.INTERFACE_CLASS__ATTRIBUTE);
		}
		return attribute;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CAEXPackage.INTERFACE_CLASS__REF_BASE_CLASS_PATH, oldRefBaseClassPath, refBaseClassPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceClass getBaseClass() {
		if (baseClass != null && baseClass.eIsProxy()) {
			InternalEObject oldBaseClass = (InternalEObject)baseClass;
			baseClass = (InterfaceClass)eResolveProxy(oldBaseClass);
			if (baseClass != oldBaseClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CAEXPackage.INTERFACE_CLASS__BASE_CLASS, oldBaseClass, baseClass));
			}
		}
		return baseClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceClass basicGetBaseClass() {
		return baseClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseClass(InterfaceClass newBaseClass) {
		InterfaceClass oldBaseClass = baseClass;
		baseClass = newBaseClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CAEXPackage.INTERFACE_CLASS__BASE_CLASS, oldBaseClass, baseClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfaceClass> getInterfaceClass() {
		if (interfaceClass == null) {
			interfaceClass = new EObjectContainmentEList<InterfaceClass>(InterfaceClass.class, this, CAEXPackage.INTERFACE_CLASS__INTERFACE_CLASS);
		}
		return interfaceClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CAEXPackage.INTERFACE_CLASS__ATTRIBUTE:
				return ((InternalEList<?>)getAttribute()).basicRemove(otherEnd, msgs);
			case CAEXPackage.INTERFACE_CLASS__INTERFACE_CLASS:
				return ((InternalEList<?>)getInterfaceClass()).basicRemove(otherEnd, msgs);
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
			case CAEXPackage.INTERFACE_CLASS__ATTRIBUTE:
				return getAttribute();
			case CAEXPackage.INTERFACE_CLASS__REF_BASE_CLASS_PATH:
				return getRefBaseClassPath();
			case CAEXPackage.INTERFACE_CLASS__BASE_CLASS:
				if (resolve) return getBaseClass();
				return basicGetBaseClass();
			case CAEXPackage.INTERFACE_CLASS__INTERFACE_CLASS:
				return getInterfaceClass();
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
			case CAEXPackage.INTERFACE_CLASS__ATTRIBUTE:
				getAttribute().clear();
				getAttribute().addAll((Collection<? extends Attribute>)newValue);
				return;
			case CAEXPackage.INTERFACE_CLASS__REF_BASE_CLASS_PATH:
				setRefBaseClassPath((String)newValue);
				return;
			case CAEXPackage.INTERFACE_CLASS__BASE_CLASS:
				setBaseClass((InterfaceClass)newValue);
				return;
			case CAEXPackage.INTERFACE_CLASS__INTERFACE_CLASS:
				getInterfaceClass().clear();
				getInterfaceClass().addAll((Collection<? extends InterfaceClass>)newValue);
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
			case CAEXPackage.INTERFACE_CLASS__ATTRIBUTE:
				getAttribute().clear();
				return;
			case CAEXPackage.INTERFACE_CLASS__REF_BASE_CLASS_PATH:
				setRefBaseClassPath(REF_BASE_CLASS_PATH_EDEFAULT);
				return;
			case CAEXPackage.INTERFACE_CLASS__BASE_CLASS:
				setBaseClass((InterfaceClass)null);
				return;
			case CAEXPackage.INTERFACE_CLASS__INTERFACE_CLASS:
				getInterfaceClass().clear();
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
			case CAEXPackage.INTERFACE_CLASS__ATTRIBUTE:
				return attribute != null && !attribute.isEmpty();
			case CAEXPackage.INTERFACE_CLASS__REF_BASE_CLASS_PATH:
				return REF_BASE_CLASS_PATH_EDEFAULT == null ? refBaseClassPath != null : !REF_BASE_CLASS_PATH_EDEFAULT.equals(refBaseClassPath);
			case CAEXPackage.INTERFACE_CLASS__BASE_CLASS:
				return baseClass != null;
			case CAEXPackage.INTERFACE_CLASS__INTERFACE_CLASS:
				return interfaceClass != null && !interfaceClass.isEmpty();
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

} //InterfaceClassImpl

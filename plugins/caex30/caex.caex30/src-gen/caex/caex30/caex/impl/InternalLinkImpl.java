/**
 */
package caex.caex30.caex.impl;

import caex.caex30.caex.CAEXPackage;
import caex.caex30.caex.InterfaceClass;
import caex.caex30.caex.InternalLink;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Internal Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link caex.caex30.caex.impl.InternalLinkImpl#getRefPartnerSideA <em>Ref Partner Side A</em>}</li>
 *   <li>{@link caex.caex30.caex.impl.InternalLinkImpl#getRefPartnerSideB <em>Ref Partner Side B</em>}</li>
 *   <li>{@link caex.caex30.caex.impl.InternalLinkImpl#getPartnerSideA <em>Partner Side A</em>}</li>
 *   <li>{@link caex.caex30.caex.impl.InternalLinkImpl#getPartnerSideB <em>Partner Side B</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InternalLinkImpl extends CAEXObjectImpl implements InternalLink {
	/**
	 * The default value of the '{@link #getRefPartnerSideA() <em>Ref Partner Side A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefPartnerSideA()
	 * @generated
	 * @ordered
	 */
	protected static final String REF_PARTNER_SIDE_A_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRefPartnerSideA() <em>Ref Partner Side A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefPartnerSideA()
	 * @generated
	 * @ordered
	 */
	protected String refPartnerSideA = REF_PARTNER_SIDE_A_EDEFAULT;

	/**
	 * The default value of the '{@link #getRefPartnerSideB() <em>Ref Partner Side B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefPartnerSideB()
	 * @generated
	 * @ordered
	 */
	protected static final String REF_PARTNER_SIDE_B_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRefPartnerSideB() <em>Ref Partner Side B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefPartnerSideB()
	 * @generated
	 * @ordered
	 */
	protected String refPartnerSideB = REF_PARTNER_SIDE_B_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPartnerSideA() <em>Partner Side A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartnerSideA()
	 * @generated
	 * @ordered
	 */
	protected InterfaceClass partnerSideA;

	/**
	 * The cached value of the '{@link #getPartnerSideB() <em>Partner Side B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartnerSideB()
	 * @generated
	 * @ordered
	 */
	protected InterfaceClass partnerSideB;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InternalLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CAEXPackage.Literals.INTERNAL_LINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRefPartnerSideA() {
		return refPartnerSideA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefPartnerSideA(String newRefPartnerSideA) {
		String oldRefPartnerSideA = refPartnerSideA;
		refPartnerSideA = newRefPartnerSideA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CAEXPackage.INTERNAL_LINK__REF_PARTNER_SIDE_A, oldRefPartnerSideA, refPartnerSideA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRefPartnerSideB() {
		return refPartnerSideB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefPartnerSideB(String newRefPartnerSideB) {
		String oldRefPartnerSideB = refPartnerSideB;
		refPartnerSideB = newRefPartnerSideB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CAEXPackage.INTERNAL_LINK__REF_PARTNER_SIDE_B, oldRefPartnerSideB, refPartnerSideB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceClass getPartnerSideA() {
		if (partnerSideA != null && partnerSideA.eIsProxy()) {
			InternalEObject oldPartnerSideA = (InternalEObject)partnerSideA;
			partnerSideA = (InterfaceClass)eResolveProxy(oldPartnerSideA);
			if (partnerSideA != oldPartnerSideA) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CAEXPackage.INTERNAL_LINK__PARTNER_SIDE_A, oldPartnerSideA, partnerSideA));
			}
		}
		return partnerSideA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceClass basicGetPartnerSideA() {
		return partnerSideA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartnerSideA(InterfaceClass newPartnerSideA) {
		InterfaceClass oldPartnerSideA = partnerSideA;
		partnerSideA = newPartnerSideA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CAEXPackage.INTERNAL_LINK__PARTNER_SIDE_A, oldPartnerSideA, partnerSideA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceClass getPartnerSideB() {
		if (partnerSideB != null && partnerSideB.eIsProxy()) {
			InternalEObject oldPartnerSideB = (InternalEObject)partnerSideB;
			partnerSideB = (InterfaceClass)eResolveProxy(oldPartnerSideB);
			if (partnerSideB != oldPartnerSideB) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CAEXPackage.INTERNAL_LINK__PARTNER_SIDE_B, oldPartnerSideB, partnerSideB));
			}
		}
		return partnerSideB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceClass basicGetPartnerSideB() {
		return partnerSideB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartnerSideB(InterfaceClass newPartnerSideB) {
		InterfaceClass oldPartnerSideB = partnerSideB;
		partnerSideB = newPartnerSideB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CAEXPackage.INTERNAL_LINK__PARTNER_SIDE_B, oldPartnerSideB, partnerSideB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CAEXPackage.INTERNAL_LINK__REF_PARTNER_SIDE_A:
				return getRefPartnerSideA();
			case CAEXPackage.INTERNAL_LINK__REF_PARTNER_SIDE_B:
				return getRefPartnerSideB();
			case CAEXPackage.INTERNAL_LINK__PARTNER_SIDE_A:
				if (resolve) return getPartnerSideA();
				return basicGetPartnerSideA();
			case CAEXPackage.INTERNAL_LINK__PARTNER_SIDE_B:
				if (resolve) return getPartnerSideB();
				return basicGetPartnerSideB();
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
			case CAEXPackage.INTERNAL_LINK__REF_PARTNER_SIDE_A:
				setRefPartnerSideA((String)newValue);
				return;
			case CAEXPackage.INTERNAL_LINK__REF_PARTNER_SIDE_B:
				setRefPartnerSideB((String)newValue);
				return;
			case CAEXPackage.INTERNAL_LINK__PARTNER_SIDE_A:
				setPartnerSideA((InterfaceClass)newValue);
				return;
			case CAEXPackage.INTERNAL_LINK__PARTNER_SIDE_B:
				setPartnerSideB((InterfaceClass)newValue);
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
			case CAEXPackage.INTERNAL_LINK__REF_PARTNER_SIDE_A:
				setRefPartnerSideA(REF_PARTNER_SIDE_A_EDEFAULT);
				return;
			case CAEXPackage.INTERNAL_LINK__REF_PARTNER_SIDE_B:
				setRefPartnerSideB(REF_PARTNER_SIDE_B_EDEFAULT);
				return;
			case CAEXPackage.INTERNAL_LINK__PARTNER_SIDE_A:
				setPartnerSideA((InterfaceClass)null);
				return;
			case CAEXPackage.INTERNAL_LINK__PARTNER_SIDE_B:
				setPartnerSideB((InterfaceClass)null);
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
			case CAEXPackage.INTERNAL_LINK__REF_PARTNER_SIDE_A:
				return REF_PARTNER_SIDE_A_EDEFAULT == null ? refPartnerSideA != null : !REF_PARTNER_SIDE_A_EDEFAULT.equals(refPartnerSideA);
			case CAEXPackage.INTERNAL_LINK__REF_PARTNER_SIDE_B:
				return REF_PARTNER_SIDE_B_EDEFAULT == null ? refPartnerSideB != null : !REF_PARTNER_SIDE_B_EDEFAULT.equals(refPartnerSideB);
			case CAEXPackage.INTERNAL_LINK__PARTNER_SIDE_A:
				return partnerSideA != null;
			case CAEXPackage.INTERNAL_LINK__PARTNER_SIDE_B:
				return partnerSideB != null;
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
		result.append(" (refPartnerSideA: ");
		result.append(refPartnerSideA);
		result.append(", refPartnerSideB: ");
		result.append(refPartnerSideB);
		result.append(')');
		return result.toString();
	}

} //InternalLinkImpl

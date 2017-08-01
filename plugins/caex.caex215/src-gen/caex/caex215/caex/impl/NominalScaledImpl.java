/**
 */
package caex.caex215.caex.impl;

import caex.caex215.caex.CAEXPackage;
import caex.caex215.caex.NominalScaled;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nominal Scaled</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link caex.caex215.caex.impl.NominalScaledImpl#getRequiredValue <em>Required Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NominalScaledImpl extends MinimalEObjectImpl.Container implements NominalScaled {
	/**
	 * The default value of the '{@link #getRequiredValue() <em>Required Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredValue()
	 * @generated
	 * @ordered
	 */
	protected static final String REQUIRED_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequiredValue() <em>Required Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredValue()
	 * @generated
	 * @ordered
	 */
	protected String requiredValue = REQUIRED_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NominalScaledImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CAEXPackage.Literals.NOMINAL_SCALED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRequiredValue() {
		return requiredValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredValue(String newRequiredValue) {
		String oldRequiredValue = requiredValue;
		requiredValue = newRequiredValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CAEXPackage.NOMINAL_SCALED__REQUIRED_VALUE, oldRequiredValue, requiredValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CAEXPackage.NOMINAL_SCALED__REQUIRED_VALUE:
				return getRequiredValue();
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
			case CAEXPackage.NOMINAL_SCALED__REQUIRED_VALUE:
				setRequiredValue((String)newValue);
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
			case CAEXPackage.NOMINAL_SCALED__REQUIRED_VALUE:
				setRequiredValue(REQUIRED_VALUE_EDEFAULT);
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
			case CAEXPackage.NOMINAL_SCALED__REQUIRED_VALUE:
				return REQUIRED_VALUE_EDEFAULT == null ? requiredValue != null : !REQUIRED_VALUE_EDEFAULT.equals(requiredValue);
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
		result.append(" (requiredValue: ");
		result.append(requiredValue);
		result.append(')');
		return result.toString();
	}

} //NominalScaledImpl

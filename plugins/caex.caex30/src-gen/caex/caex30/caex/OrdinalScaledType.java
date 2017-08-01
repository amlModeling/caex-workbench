/**
 */
package caex.caex30.caex;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ordinal Scaled Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link caex.caex30.caex.OrdinalScaledType#getRequiredMaxValue <em>Required Max Value</em>}</li>
 *   <li>{@link caex.caex30.caex.OrdinalScaledType#getRequiredValue <em>Required Value</em>}</li>
 *   <li>{@link caex.caex30.caex.OrdinalScaledType#getRequiredMinValue <em>Required Min Value</em>}</li>
 * </ul>
 *
 * @see caex.caex30.caex.CAEXPackage#getOrdinalScaledType()
 * @model
 * @generated
 */
public interface OrdinalScaledType extends EObject {
	/**
	 * Returns the value of the '<em><b>Required Max Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Max Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Max Value</em>' attribute.
	 * @see #setRequiredMaxValue(String)
	 * @see caex.caex30.caex.CAEXPackage#getOrdinalScaledType_RequiredMaxValue()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getRequiredMaxValue();

	/**
	 * Sets the value of the '{@link caex.caex30.caex.OrdinalScaledType#getRequiredMaxValue <em>Required Max Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Max Value</em>' attribute.
	 * @see #getRequiredMaxValue()
	 * @generated
	 */
	void setRequiredMaxValue(String value);

	/**
	 * Returns the value of the '<em><b>Required Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Value</em>' attribute.
	 * @see #setRequiredValue(String)
	 * @see caex.caex30.caex.CAEXPackage#getOrdinalScaledType_RequiredValue()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getRequiredValue();

	/**
	 * Sets the value of the '{@link caex.caex30.caex.OrdinalScaledType#getRequiredValue <em>Required Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Value</em>' attribute.
	 * @see #getRequiredValue()
	 * @generated
	 */
	void setRequiredValue(String value);

	/**
	 * Returns the value of the '<em><b>Required Min Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Min Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Min Value</em>' attribute.
	 * @see #setRequiredMinValue(String)
	 * @see caex.caex30.caex.CAEXPackage#getOrdinalScaledType_RequiredMinValue()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getRequiredMinValue();

	/**
	 * Sets the value of the '{@link caex.caex30.caex.OrdinalScaledType#getRequiredMinValue <em>Required Min Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Min Value</em>' attribute.
	 * @see #getRequiredMinValue()
	 * @generated
	 */
	void setRequiredMinValue(String value);

} // OrdinalScaledType

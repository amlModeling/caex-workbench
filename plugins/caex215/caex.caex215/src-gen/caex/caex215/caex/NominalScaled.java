/**
 */
package caex.caex215.caex;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Nominal Scaled</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link caex.caex215.caex.NominalScaled#getRequiredValue <em>Required Value</em>}</li>
 * </ul>
 *
 * @see caex.caex215.caex.CAEXPackage#getNominalScaled()
 * @model extendedMetaData="name='NominalScaledType' kind='elementOnly'"
 * @generated
 */
public interface NominalScaled extends EObject {
	/**
	 * Returns the value of the '<em><b>Required Value</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Element to define a required value of an attribute. It may be defined multiple times in order to define a discrete value range of the attribute.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Required Value</em>' attribute list.
	 * @see caex.caex215.caex.CAEXPackage#getNominalScaled_RequiredValue()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='RequiredValue' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getRequiredValue();

} // NominalScaled

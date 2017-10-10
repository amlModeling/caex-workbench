/**
 */
package caex.caex215.caex;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unknown Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link caex.caex215.caex.UnknownType#getRequirements <em>Requirements</em>}</li>
 * </ul>
 *
 * @see caex.caex215.caex.CAEXPackage#getUnknownType()
 * @model extendedMetaData="name='UnknownType' kind='elementOnly'"
 * @generated
 */
public interface UnknownType extends EObject {
	/**
	 * Returns the value of the '<em><b>Requirements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirements</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines informative requirements as a constraint for an attribute value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requirements</em>' attribute.
	 * @see #setRequirements(String)
	 * @see caex.caex215.caex.CAEXPackage#getUnknownType_Requirements()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Requirements' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRequirements();

	/**
	 * Sets the value of the '{@link caex.caex215.caex.UnknownType#getRequirements <em>Requirements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirements</em>' attribute.
	 * @see #getRequirements()
	 * @generated
	 */
	void setRequirements(String value);

} // UnknownType

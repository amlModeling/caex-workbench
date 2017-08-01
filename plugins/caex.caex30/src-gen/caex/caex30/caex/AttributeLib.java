/**
 */
package caex.caex30.caex;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Lib</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link caex.caex30.caex.AttributeLib#getAttributeType <em>Attribute Type</em>}</li>
 * </ul>
 *
 * @see caex.caex30.caex.CAEXPackage#getAttributeLib()
 * @model
 * @generated
 */
public interface AttributeLib extends CAEXObject {
	/**
	 * Returns the value of the '<em><b>Attribute Type</b></em>' containment reference list.
	 * The list contents are of type {@link caex.caex30.caex.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Type</em>' containment reference list.
	 * @see caex.caex30.caex.CAEXPackage#getAttributeLib_AttributeType()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttributeType();

} // AttributeLib

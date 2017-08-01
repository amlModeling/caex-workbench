/**
 */
package caex.caex215.caex;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link caex.caex215.caex.Mapping#getAttributeNameMapping <em>Attribute Name Mapping</em>}</li>
 *   <li>{@link caex.caex215.caex.Mapping#getInterfaceNameMapping <em>Interface Name Mapping</em>}</li>
 * </ul>
 *
 * @see caex.caex215.caex.CAEXPackage#getMapping()
 * @model
 * @generated
 */
public interface Mapping extends CAEXBasicObject {
	/**
	 * Returns the value of the '<em><b>Attribute Name Mapping</b></em>' containment reference list.
	 * The list contents are of type {@link caex.caex215.caex.AttributeNameMapping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Name Mapping</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Name Mapping</em>' containment reference list.
	 * @see caex.caex215.caex.CAEXPackage#getMapping_AttributeNameMapping()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttributeNameMapping> getAttributeNameMapping();

	/**
	 * Returns the value of the '<em><b>Interface Name Mapping</b></em>' containment reference list.
	 * The list contents are of type {@link caex.caex215.caex.InterfaceNameMapping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Name Mapping</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Name Mapping</em>' containment reference list.
	 * @see caex.caex215.caex.CAEXPackage#getMapping_InterfaceNameMapping()
	 * @model containment="true"
	 * @generated
	 */
	EList<InterfaceNameMapping> getInterfaceNameMapping();

} // Mapping

/**
 */
package caex.caex215.caex;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance Hierarchy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link caex.caex215.caex.InstanceHierarchy#getInternalElement <em>Internal Element</em>}</li>
 * </ul>
 *
 * @see caex.caex215.caex.CAEXPackage#getInstanceHierarchy()
 * @model extendedMetaData="name='InstanceHierarchy' kind='elementOnly'"
 * @generated
 */
public interface InstanceHierarchy extends CAEXObject {
	/**
	 * Returns the value of the '<em><b>Internal Element</b></em>' containment reference list.
	 * The list contents are of type {@link caex.caex215.caex.InternalElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Internal Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Shall be used in order to define nested objects inside of a SystemUnitClass or another InternalElement. Allows description of the internal structure of an CAEX object.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Internal Element</em>' containment reference list.
	 * @see caex.caex215.caex.CAEXPackage#getInstanceHierarchy_InternalElement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='InternalElement' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InternalElement> getInternalElement();

} // InstanceHierarchy

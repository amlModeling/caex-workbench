/**
 */
package caex.caex30.caex;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Internal Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link caex.caex30.caex.InternalElement#getRoleRequirements <em>Role Requirements</em>}</li>
 *   <li>{@link caex.caex30.caex.InternalElement#getRefBaseSystemUnitPath <em>Ref Base System Unit Path</em>}</li>
 *   <li>{@link caex.caex30.caex.InternalElement#getBaseSystemUnit <em>Base System Unit</em>}</li>
 * </ul>
 *
 * @see caex.caex30.caex.CAEXPackage#getInternalElement()
 * @model
 * @generated
 */
public interface InternalElement extends SystemUnitClass {
	/**
	 * Returns the value of the '<em><b>Role Requirements</b></em>' containment reference list.
	 * The list contents are of type {@link caex.caex30.caex.RoleRequirements}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Requirements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Requirements</em>' containment reference list.
	 * @see caex.caex30.caex.CAEXPackage#getInternalElement_RoleRequirements()
	 * @model containment="true"
	 * @generated
	 */
	EList<RoleRequirements> getRoleRequirements();

	/**
	 * Returns the value of the '<em><b>Ref Base System Unit Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref Base System Unit Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Base System Unit Path</em>' attribute.
	 * @see #setRefBaseSystemUnitPath(String)
	 * @see caex.caex30.caex.CAEXPackage#getInternalElement_RefBaseSystemUnitPath()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getRefBaseSystemUnitPath();

	/**
	 * Sets the value of the '{@link caex.caex30.caex.InternalElement#getRefBaseSystemUnitPath <em>Ref Base System Unit Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Base System Unit Path</em>' attribute.
	 * @see #getRefBaseSystemUnitPath()
	 * @generated
	 */
	void setRefBaseSystemUnitPath(String value);

	/**
	 * Returns the value of the '<em><b>Base System Unit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base System Unit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base System Unit</em>' reference.
	 * @see #setBaseSystemUnit(SystemUnitClass)
	 * @see caex.caex30.caex.CAEXPackage#getInternalElement_BaseSystemUnit()
	 * @model
	 * @generated
	 */
	SystemUnitClass getBaseSystemUnit();

	/**
	 * Sets the value of the '{@link caex.caex30.caex.InternalElement#getBaseSystemUnit <em>Base System Unit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base System Unit</em>' reference.
	 * @see #getBaseSystemUnit()
	 * @generated
	 */
	void setBaseSystemUnit(SystemUnitClass value);

} // InternalElement

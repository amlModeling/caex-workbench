/**
 */
package caex.caex30.caex;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Requirements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link caex.caex30.caex.RoleRequirements#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link caex.caex30.caex.RoleRequirements#getExternalInterface <em>External Interface</em>}</li>
 *   <li>{@link caex.caex30.caex.RoleRequirements#getMappingObject <em>Mapping Object</em>}</li>
 *   <li>{@link caex.caex30.caex.RoleRequirements#getRoleClass <em>Role Class</em>}</li>
 *   <li>{@link caex.caex30.caex.RoleRequirements#getRefBaseRoleClassPath <em>Ref Base Role Class Path</em>}</li>
 * </ul>
 *
 * @see caex.caex30.caex.CAEXPackage#getRoleRequirements()
 * @model
 * @generated
 */
public interface RoleRequirements extends CAEXBasicObject {
	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link caex.caex30.caex.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' containment reference list.
	 * @see caex.caex30.caex.CAEXPackage#getRoleRequirements_Attribute()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttribute();

	/**
	 * Returns the value of the '<em><b>External Interface</b></em>' containment reference list.
	 * The list contents are of type {@link caex.caex30.caex.InterfaceClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Interface</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Interface</em>' containment reference list.
	 * @see caex.caex30.caex.CAEXPackage#getRoleRequirements_ExternalInterface()
	 * @model containment="true"
	 * @generated
	 */
	EList<InterfaceClass> getExternalInterface();

	/**
	 * Returns the value of the '<em><b>Mapping Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapping Object</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping Object</em>' containment reference.
	 * @see #setMappingObject(Mapping)
	 * @see caex.caex30.caex.CAEXPackage#getRoleRequirements_MappingObject()
	 * @model containment="true"
	 * @generated
	 */
	Mapping getMappingObject();

	/**
	 * Sets the value of the '{@link caex.caex30.caex.RoleRequirements#getMappingObject <em>Mapping Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping Object</em>' containment reference.
	 * @see #getMappingObject()
	 * @generated
	 */
	void setMappingObject(Mapping value);

	/**
	 * Returns the value of the '<em><b>Role Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Class</em>' reference.
	 * @see #setRoleClass(RoleClass)
	 * @see caex.caex30.caex.CAEXPackage#getRoleRequirements_RoleClass()
	 * @model required="true"
	 * @generated
	 */
	RoleClass getRoleClass();

	/**
	 * Sets the value of the '{@link caex.caex30.caex.RoleRequirements#getRoleClass <em>Role Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Class</em>' reference.
	 * @see #getRoleClass()
	 * @generated
	 */
	void setRoleClass(RoleClass value);

	/**
	 * Returns the value of the '<em><b>Ref Base Role Class Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref Base Role Class Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Base Role Class Path</em>' attribute.
	 * @see #setRefBaseRoleClassPath(String)
	 * @see caex.caex30.caex.CAEXPackage#getRoleRequirements_RefBaseRoleClassPath()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getRefBaseRoleClassPath();

	/**
	 * Sets the value of the '{@link caex.caex30.caex.RoleRequirements#getRefBaseRoleClassPath <em>Ref Base Role Class Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Base Role Class Path</em>' attribute.
	 * @see #getRefBaseRoleClassPath()
	 * @generated
	 */
	void setRefBaseRoleClassPath(String value);

} // RoleRequirements

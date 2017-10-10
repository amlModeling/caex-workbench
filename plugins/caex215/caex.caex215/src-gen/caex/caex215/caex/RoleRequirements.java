/**
 */
package caex.caex215.caex;

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
 *   <li>{@link caex.caex215.caex.RoleRequirements#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link caex.caex215.caex.RoleRequirements#getExternalInterface <em>External Interface</em>}</li>
 *   <li>{@link caex.caex215.caex.RoleRequirements#getRefBaseRoleClassPath <em>Ref Base Role Class Path</em>}</li>
 *   <li>{@link caex.caex215.caex.RoleRequirements#getRoleClass <em>Role Class</em>}</li>
 * </ul>
 *
 * @see caex.caex215.caex.CAEXPackage#getRoleRequirements()
 * @model extendedMetaData="name='RoleRequirements' kind='elementOnly'"
 * @generated
 */
public interface RoleRequirements extends CAEXBasicObject {
	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link caex.caex215.caex.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Characterizes properties of the RoleRequirements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attribute</em>' containment reference list.
	 * @see caex.caex215.caex.CAEXPackage#getRoleRequirements_Attribute()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Attribute' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Attribute> getAttribute();

	/**
	 * Returns the value of the '<em><b>External Interface</b></em>' containment reference list.
	 * The list contents are of type {@link caex.caex215.caex.InterfaceClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Interface</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Interface</em>' containment reference list.
	 * @see caex.caex215.caex.CAEXPackage#getRoleRequirements_ExternalInterface()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ExternalInterface' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InterfaceClass> getExternalInterface();

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
	 * @see caex.caex215.caex.CAEXPackage#getRoleRequirements_RefBaseRoleClassPath()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='RefBaseRoleClassPath' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRefBaseRoleClassPath();

	/**
	 * Sets the value of the '{@link caex.caex215.caex.RoleRequirements#getRefBaseRoleClassPath <em>Ref Base Role Class Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Base Role Class Path</em>' attribute.
	 * @see #getRefBaseRoleClassPath()
	 * @generated
	 */
	void setRefBaseRoleClassPath(String value);

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
	 * @see caex.caex215.caex.CAEXPackage#getRoleRequirements_RoleClass()
	 * @model
	 * @generated
	 */
	RoleClass getRoleClass();

	/**
	 * Sets the value of the '{@link caex.caex215.caex.RoleRequirements#getRoleClass <em>Role Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role Class</em>' reference.
	 * @see #getRoleClass()
	 * @generated
	 */
	void setRoleClass(RoleClass value);

} // RoleRequirements

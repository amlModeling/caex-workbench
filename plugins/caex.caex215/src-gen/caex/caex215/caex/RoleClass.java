/**
 */
package caex.caex215.caex;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Role Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link caex.caex215.caex.RoleClass#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link caex.caex215.caex.RoleClass#getExternalInterface <em>External Interface</em>}</li>
 *   <li>{@link caex.caex215.caex.RoleClass#getRefBaseClassPath <em>Ref Base Class Path</em>}</li>
 *   <li>{@link caex.caex215.caex.RoleClass#getBaseClass <em>Base Class</em>}</li>
 *   <li>{@link caex.caex215.caex.RoleClass#getRoleClass <em>Role Class</em>}</li>
 * </ul>
 *
 * @see caex.caex215.caex.CAEXPackage#getRoleClass()
 * @model
 * @generated
 */
public interface RoleClass extends CAEXObject {
	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link caex.caex215.caex.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' containment reference list.
	 * @see caex.caex215.caex.CAEXPackage#getRoleClass_Attribute()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttribute();

	/**
	 * Returns the value of the '<em><b>External Interface</b></em>' containment reference list.
	 * The list contents are of type {@link caex.caex215.caex.ExternalInterface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Interface</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Interface</em>' containment reference list.
	 * @see caex.caex215.caex.CAEXPackage#getRoleClass_ExternalInterface()
	 * @model containment="true"
	 * @generated
	 */
	EList<ExternalInterface> getExternalInterface();

	/**
	 * Returns the value of the '<em><b>Ref Base Class Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref Base Class Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Base Class Path</em>' attribute.
	 * @see #setRefBaseClassPath(String)
	 * @see caex.caex215.caex.CAEXPackage#getRoleClass_RefBaseClassPath()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getRefBaseClassPath();

	/**
	 * Sets the value of the '{@link caex.caex215.caex.RoleClass#getRefBaseClassPath <em>Ref Base Class Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Base Class Path</em>' attribute.
	 * @see #getRefBaseClassPath()
	 * @generated
	 */
	void setRefBaseClassPath(String value);

	/**
	 * Returns the value of the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Class</em>' reference.
	 * @see #setBaseClass(RoleClass)
	 * @see caex.caex215.caex.CAEXPackage#getRoleClass_BaseClass()
	 * @model
	 * @generated
	 */
	RoleClass getBaseClass();

	/**
	 * Sets the value of the '{@link caex.caex215.caex.RoleClass#getBaseClass <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Class</em>' reference.
	 * @see #getBaseClass()
	 * @generated
	 */
	void setBaseClass(RoleClass value);

	/**
	 * Returns the value of the '<em><b>Role Class</b></em>' containment reference list.
	 * The list contents are of type {@link caex.caex215.caex.RoleClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Class</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role Class</em>' containment reference list.
	 * @see caex.caex215.caex.CAEXPackage#getRoleClass_RoleClass()
	 * @model containment="true"
	 * @generated
	 */
	EList<RoleClass> getRoleClass();

} // RoleClass

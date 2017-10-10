/**
 */
package caex.caex215.caex;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Shall be used for InterfaceClass definition, provides base structures for an interface class definition.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link caex.caex215.caex.InterfaceClass#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link caex.caex215.caex.InterfaceClass#getRefBaseClassPath <em>Ref Base Class Path</em>}</li>
 *   <li>{@link caex.caex215.caex.InterfaceClass#getBaseClass <em>Base Class</em>}</li>
 *   <li>{@link caex.caex215.caex.InterfaceClass#getInterfaceClass <em>Interface Class</em>}</li>
 * </ul>
 *
 * @see caex.caex215.caex.CAEXPackage#getInterfaceClass()
 * @model extendedMetaData="name='InterfaceClassType' kind='elementOnly'"
 * @generated
 */
public interface InterfaceClass extends CAEXObject {
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
	 * Characterizes properties of the InterfaceClass.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attribute</em>' containment reference list.
	 * @see caex.caex215.caex.CAEXPackage#getInterfaceClass_Attribute()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Attribute' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Attribute> getAttribute();

	/**
	 * Returns the value of the '<em><b>Ref Base Class Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref Base Class Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Stores the reference of a class to its base class. References contain the full path to the refered class object.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ref Base Class Path</em>' attribute.
	 * @see #setRefBaseClassPath(String)
	 * @see caex.caex215.caex.CAEXPackage#getInterfaceClass_RefBaseClassPath()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='RefBaseClassPath' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRefBaseClassPath();

	/**
	 * Sets the value of the '{@link caex.caex215.caex.InterfaceClass#getRefBaseClassPath <em>Ref Base Class Path</em>}' attribute.
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
	 * @see #setBaseClass(InterfaceClass)
	 * @see caex.caex215.caex.CAEXPackage#getInterfaceClass_BaseClass()
	 * @model
	 * @generated
	 */
	InterfaceClass getBaseClass();

	/**
	 * Sets the value of the '{@link caex.caex215.caex.InterfaceClass#getBaseClass <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Class</em>' reference.
	 * @see #getBaseClass()
	 * @generated
	 */
	void setBaseClass(InterfaceClass value);

	/**
	 * Returns the value of the '<em><b>Interface Class</b></em>' containment reference list.
	 * The list contents are of type {@link caex.caex215.caex.InterfaceClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Class</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Class</em>' containment reference list.
	 * @see caex.caex215.caex.CAEXPackage#getInterfaceClass_InterfaceClass()
	 * @model containment="true"
	 * @generated
	 */
	EList<InterfaceClass> getInterfaceClass();

} // InterfaceClass

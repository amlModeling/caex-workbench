/**
 */
package caex.caex215.caex;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link caex.caex215.caex.CAEXFile#getExternalReference <em>External Reference</em>}</li>
 *   <li>{@link caex.caex215.caex.CAEXFile#getInstanceHierarchy <em>Instance Hierarchy</em>}</li>
 *   <li>{@link caex.caex215.caex.CAEXFile#getInterfaceClassLib <em>Interface Class Lib</em>}</li>
 *   <li>{@link caex.caex215.caex.CAEXFile#getRoleClassLib <em>Role Class Lib</em>}</li>
 *   <li>{@link caex.caex215.caex.CAEXFile#getSystemUnitClassLib <em>System Unit Class Lib</em>}</li>
 *   <li>{@link caex.caex215.caex.CAEXFile#getFileName <em>File Name</em>}</li>
 *   <li>{@link caex.caex215.caex.CAEXFile#getSchemaVersion <em>Schema Version</em>}</li>
 * </ul>
 *
 * @see caex.caex215.caex.CAEXPackage#getCAEXFile()
 * @model extendedMetaData="name='CAEXFile' kind='elementOnly'"
 * @generated
 */
public interface CAEXFile extends CAEXBasicObject {
	/**
	 * Returns the value of the '<em><b>External Reference</b></em>' containment reference list.
	 * The list contents are of type {@link caex.caex215.caex.ExternalReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Reference</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Container element for the alias definition of external CAEX files.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>External Reference</em>' containment reference list.
	 * @see caex.caex215.caex.CAEXPackage#getCAEXFile_ExternalReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ExternalReference' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ExternalReference> getExternalReference();

	/**
	 * Returns the value of the '<em><b>Instance Hierarchy</b></em>' containment reference list.
	 * The list contents are of type {@link caex.caex215.caex.InstanceHierarchy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance Hierarchy</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Root element for a system hierarchy of object instances.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instance Hierarchy</em>' containment reference list.
	 * @see caex.caex215.caex.CAEXPackage#getCAEXFile_InstanceHierarchy()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='InstanceHierarchy' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InstanceHierarchy> getInstanceHierarchy();

	/**
	 * Returns the value of the '<em><b>Interface Class Lib</b></em>' containment reference list.
	 * The list contents are of type {@link caex.caex215.caex.InterfaceClassLib}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Class Lib</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Container element for a hierarchy of InterfaceClass definitions. It shall contain any interface class definitions. CAEX supports multiple interface libraries..
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interface Class Lib</em>' containment reference list.
	 * @see caex.caex215.caex.CAEXPackage#getCAEXFile_InterfaceClassLib()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='InterfaceClassLib' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InterfaceClassLib> getInterfaceClassLib();

	/**
	 * Returns the value of the '<em><b>Role Class Lib</b></em>' containment reference list.
	 * The list contents are of type {@link caex.caex215.caex.RoleClassLib}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role Class Lib</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Container element for a hierarchy of RoleClass definitions. It shall contain any RoleClass definitions. CAEX supports multiple role libraries.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Role Class Lib</em>' containment reference list.
	 * @see caex.caex215.caex.CAEXPackage#getCAEXFile_RoleClassLib()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RoleClassLib' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RoleClassLib> getRoleClassLib();

	/**
	 * Returns the value of the '<em><b>System Unit Class Lib</b></em>' containment reference list.
	 * The list contents are of type {@link caex.caex215.caex.SystemUnitClassLib}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Unit Class Lib</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Container element for a hierarchy of SystemUnitClass definitions. It shall contain any SystemunitClass definitions. CAEX supports multiple SystemUnitClass libraries.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System Unit Class Lib</em>' containment reference list.
	 * @see caex.caex215.caex.CAEXPackage#getCAEXFile_SystemUnitClassLib()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SystemUnitClassLib' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SystemUnitClassLib> getSystemUnitClassLib();

	/**
	 * Returns the value of the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the name of the CAEX file.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>File Name</em>' attribute.
	 * @see #setFileName(String)
	 * @see caex.caex215.caex.CAEXPackage#getCAEXFile_FileName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='FileName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFileName();

	/**
	 * Sets the value of the '{@link caex.caex215.caex.CAEXFile#getFileName <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Name</em>' attribute.
	 * @see #getFileName()
	 * @generated
	 */
	void setFileName(String value);

	/**
	 * Returns the value of the '<em><b>Schema Version</b></em>' attribute.
	 * The default value is <code>"2.15"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schema Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the version of the schema. Each CAEX document must specify which CAEX version it requires. The version number of a CAEX document must fit to the version number specified in the CAEX schema file. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Schema Version</em>' attribute.
	 * @see #isSetSchemaVersion()
	 * @see #unsetSchemaVersion()
	 * @see #setSchemaVersion(String)
	 * @see caex.caex215.caex.CAEXPackage#getCAEXFile_SchemaVersion()
	 * @model default="2.15" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='SchemaVersion' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSchemaVersion();

	/**
	 * Sets the value of the '{@link caex.caex215.caex.CAEXFile#getSchemaVersion <em>Schema Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema Version</em>' attribute.
	 * @see #isSetSchemaVersion()
	 * @see #unsetSchemaVersion()
	 * @see #getSchemaVersion()
	 * @generated
	 */
	void setSchemaVersion(String value);

	/**
	 * Unsets the value of the '{@link caex.caex215.caex.CAEXFile#getSchemaVersion <em>Schema Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSchemaVersion()
	 * @see #getSchemaVersion()
	 * @see #setSchemaVersion(String)
	 * @generated
	 */
	void unsetSchemaVersion();

	/**
	 * Returns whether the value of the '{@link caex.caex215.caex.CAEXFile#getSchemaVersion <em>Schema Version</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Schema Version</em>' attribute is set.
	 * @see #unsetSchemaVersion()
	 * @see #getSchemaVersion()
	 * @see #setSchemaVersion(String)
	 * @generated
	 */
	boolean isSetSchemaVersion();

} // CAEXFile

/**
 */
package caex.caex30.caex;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source Document Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link caex.caex30.caex.SourceDocumentInformation#getLastWritingDateTime <em>Last Writing Date Time</em>}</li>
 *   <li>{@link caex.caex30.caex.SourceDocumentInformation#getOriginID <em>Origin ID</em>}</li>
 *   <li>{@link caex.caex30.caex.SourceDocumentInformation#getOriginName <em>Origin Name</em>}</li>
 *   <li>{@link caex.caex30.caex.SourceDocumentInformation#getOriginProjectID <em>Origin Project ID</em>}</li>
 *   <li>{@link caex.caex30.caex.SourceDocumentInformation#getOriginProjectTitle <em>Origin Project Title</em>}</li>
 *   <li>{@link caex.caex30.caex.SourceDocumentInformation#getOriginRelease <em>Origin Release</em>}</li>
 *   <li>{@link caex.caex30.caex.SourceDocumentInformation#getOriginVendor <em>Origin Vendor</em>}</li>
 *   <li>{@link caex.caex30.caex.SourceDocumentInformation#getOriginVendorURL <em>Origin Vendor URL</em>}</li>
 *   <li>{@link caex.caex30.caex.SourceDocumentInformation#getOriginVersion <em>Origin Version</em>}</li>
 * </ul>
 *
 * @see caex.caex30.caex.CAEXPackage#getSourceDocumentInformation()
 * @model
 * @generated
 */
public interface SourceDocumentInformation extends EObject {
	/**
	 * Returns the value of the '<em><b>Last Writing Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Writing Date Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Writing Date Time</em>' attribute.
	 * @see #setLastWritingDateTime(XMLGregorianCalendar)
	 * @see caex.caex30.caex.CAEXPackage#getSourceDocumentInformation_LastWritingDateTime()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime" required="true"
	 * @generated
	 */
	XMLGregorianCalendar getLastWritingDateTime();

	/**
	 * Sets the value of the '{@link caex.caex30.caex.SourceDocumentInformation#getLastWritingDateTime <em>Last Writing Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Writing Date Time</em>' attribute.
	 * @see #getLastWritingDateTime()
	 * @generated
	 */
	void setLastWritingDateTime(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Origin ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origin ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin ID</em>' attribute.
	 * @see #setOriginID(String)
	 * @see caex.caex30.caex.CAEXPackage#getSourceDocumentInformation_OriginID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getOriginID();

	/**
	 * Sets the value of the '{@link caex.caex30.caex.SourceDocumentInformation#getOriginID <em>Origin ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin ID</em>' attribute.
	 * @see #getOriginID()
	 * @generated
	 */
	void setOriginID(String value);

	/**
	 * Returns the value of the '<em><b>Origin Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origin Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin Name</em>' attribute.
	 * @see #setOriginName(String)
	 * @see caex.caex30.caex.CAEXPackage#getSourceDocumentInformation_OriginName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getOriginName();

	/**
	 * Sets the value of the '{@link caex.caex30.caex.SourceDocumentInformation#getOriginName <em>Origin Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin Name</em>' attribute.
	 * @see #getOriginName()
	 * @generated
	 */
	void setOriginName(String value);

	/**
	 * Returns the value of the '<em><b>Origin Project ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origin Project ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin Project ID</em>' attribute.
	 * @see #setOriginProjectID(String)
	 * @see caex.caex30.caex.CAEXPackage#getSourceDocumentInformation_OriginProjectID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getOriginProjectID();

	/**
	 * Sets the value of the '{@link caex.caex30.caex.SourceDocumentInformation#getOriginProjectID <em>Origin Project ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin Project ID</em>' attribute.
	 * @see #getOriginProjectID()
	 * @generated
	 */
	void setOriginProjectID(String value);

	/**
	 * Returns the value of the '<em><b>Origin Project Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origin Project Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin Project Title</em>' attribute.
	 * @see #setOriginProjectTitle(String)
	 * @see caex.caex30.caex.CAEXPackage#getSourceDocumentInformation_OriginProjectTitle()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getOriginProjectTitle();

	/**
	 * Sets the value of the '{@link caex.caex30.caex.SourceDocumentInformation#getOriginProjectTitle <em>Origin Project Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin Project Title</em>' attribute.
	 * @see #getOriginProjectTitle()
	 * @generated
	 */
	void setOriginProjectTitle(String value);

	/**
	 * Returns the value of the '<em><b>Origin Release</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origin Release</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin Release</em>' attribute.
	 * @see #setOriginRelease(String)
	 * @see caex.caex30.caex.CAEXPackage#getSourceDocumentInformation_OriginRelease()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getOriginRelease();

	/**
	 * Sets the value of the '{@link caex.caex30.caex.SourceDocumentInformation#getOriginRelease <em>Origin Release</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin Release</em>' attribute.
	 * @see #getOriginRelease()
	 * @generated
	 */
	void setOriginRelease(String value);

	/**
	 * Returns the value of the '<em><b>Origin Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origin Vendor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin Vendor</em>' attribute.
	 * @see #setOriginVendor(String)
	 * @see caex.caex30.caex.CAEXPackage#getSourceDocumentInformation_OriginVendor()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getOriginVendor();

	/**
	 * Sets the value of the '{@link caex.caex30.caex.SourceDocumentInformation#getOriginVendor <em>Origin Vendor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin Vendor</em>' attribute.
	 * @see #getOriginVendor()
	 * @generated
	 */
	void setOriginVendor(String value);

	/**
	 * Returns the value of the '<em><b>Origin Vendor URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origin Vendor URL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin Vendor URL</em>' attribute.
	 * @see #setOriginVendorURL(String)
	 * @see caex.caex30.caex.CAEXPackage#getSourceDocumentInformation_OriginVendorURL()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getOriginVendorURL();

	/**
	 * Sets the value of the '{@link caex.caex30.caex.SourceDocumentInformation#getOriginVendorURL <em>Origin Vendor URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin Vendor URL</em>' attribute.
	 * @see #getOriginVendorURL()
	 * @generated
	 */
	void setOriginVendorURL(String value);

	/**
	 * Returns the value of the '<em><b>Origin Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origin Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin Version</em>' attribute.
	 * @see #setOriginVersion(String)
	 * @see caex.caex30.caex.CAEXPackage#getSourceDocumentInformation_OriginVersion()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getOriginVersion();

	/**
	 * Sets the value of the '{@link caex.caex30.caex.SourceDocumentInformation#getOriginVersion <em>Origin Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin Version</em>' attribute.
	 * @see #getOriginVersion()
	 * @generated
	 */
	void setOriginVersion(String value);

} // SourceDocumentInformation

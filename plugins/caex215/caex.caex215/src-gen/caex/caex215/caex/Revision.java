/**
 */
package caex.caex215.caex;

import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Revision</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link caex.caex215.caex.Revision#getRevisionDate <em>Revision Date</em>}</li>
 *   <li>{@link caex.caex215.caex.Revision#getOldVersion <em>Old Version</em>}</li>
 *   <li>{@link caex.caex215.caex.Revision#getNewVersion <em>New Version</em>}</li>
 *   <li>{@link caex.caex215.caex.Revision#getAuthorName <em>Author Name</em>}</li>
 *   <li>{@link caex.caex215.caex.Revision#getComment <em>Comment</em>}</li>
 * </ul>
 *
 * @see caex.caex215.caex.CAEXPackage#getRevision()
 * @model extendedMetaData="name='Revision' kind='elementOnly'"
 * @generated
 */
public interface Revision extends CAEXBasicObject {
	/**
	 * Returns the value of the '<em><b>Revision Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Revision Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revision Date</em>' attribute.
	 * @see #setRevisionDate(XMLGregorianCalendar)
	 * @see caex.caex215.caex.CAEXPackage#getRevision_RevisionDate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime" required="true"
	 *        extendedMetaData="kind='element' name='RevisionDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getRevisionDate();

	/**
	 * Sets the value of the '{@link caex.caex215.caex.Revision#getRevisionDate <em>Revision Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revision Date</em>' attribute.
	 * @see #getRevisionDate()
	 * @generated
	 */
	void setRevisionDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Old Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Old Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Old Version</em>' attribute.
	 * @see #setOldVersion(String)
	 * @see caex.caex215.caex.CAEXPackage#getRevision_OldVersion()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='OldVersion' namespace='##targetNamespace'"
	 * @generated
	 */
	String getOldVersion();

	/**
	 * Sets the value of the '{@link caex.caex215.caex.Revision#getOldVersion <em>Old Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Old Version</em>' attribute.
	 * @see #getOldVersion()
	 * @generated
	 */
	void setOldVersion(String value);

	/**
	 * Returns the value of the '<em><b>New Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Version</em>' attribute.
	 * @see #setNewVersion(String)
	 * @see caex.caex215.caex.CAEXPackage#getRevision_NewVersion()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='NewVersion' namespace='##targetNamespace'"
	 * @generated
	 */
	String getNewVersion();

	/**
	 * Sets the value of the '{@link caex.caex215.caex.Revision#getNewVersion <em>New Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Version</em>' attribute.
	 * @see #getNewVersion()
	 * @generated
	 */
	void setNewVersion(String value);

	/**
	 * Returns the value of the '<em><b>Author Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author Name</em>' attribute.
	 * @see #setAuthorName(String)
	 * @see caex.caex215.caex.CAEXPackage#getRevision_AuthorName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='AuthorName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAuthorName();

	/**
	 * Sets the value of the '{@link caex.caex215.caex.Revision#getAuthorName <em>Author Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author Name</em>' attribute.
	 * @see #getAuthorName()
	 * @generated
	 */
	void setAuthorName(String value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see caex.caex215.caex.CAEXPackage#getRevision_Comment()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='Comment' namespace='##targetNamespace'"
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link caex.caex215.caex.Revision#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

} // Revision

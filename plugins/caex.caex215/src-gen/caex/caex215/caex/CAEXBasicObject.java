/**
 */
package caex.caex215.caex;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Basic Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link caex.caex215.caex.CAEXBasicObject#getDescription <em>Description</em>}</li>
 *   <li>{@link caex.caex215.caex.CAEXBasicObject#getVersion <em>Version</em>}</li>
 *   <li>{@link caex.caex215.caex.CAEXBasicObject#getRevision <em>Revision</em>}</li>
 *   <li>{@link caex.caex215.caex.CAEXBasicObject#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link caex.caex215.caex.CAEXBasicObject#getAdditionalInformation <em>Additional Information</em>}</li>
 *   <li>{@link caex.caex215.caex.CAEXBasicObject#getChangeMode <em>Change Mode</em>}</li>
 * </ul>
 *
 * @see caex.caex215.caex.CAEXPackage#getCAEXBasicObject()
 * @model
 * @generated
 */
public interface CAEXBasicObject extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(Description)
	 * @see caex.caex215.caex.CAEXPackage#getCAEXBasicObject_Description()
	 * @model containment="true"
	 * @generated
	 */
	Description getDescription();

	/**
	 * Sets the value of the '{@link caex.caex215.caex.CAEXBasicObject#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(Description value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' containment reference.
	 * @see #setVersion(Version)
	 * @see caex.caex215.caex.CAEXPackage#getCAEXBasicObject_Version()
	 * @model containment="true"
	 * @generated
	 */
	Version getVersion();

	/**
	 * Sets the value of the '{@link caex.caex215.caex.CAEXBasicObject#getVersion <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' containment reference.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(Version value);

	/**
	 * Returns the value of the '<em><b>Revision</b></em>' containment reference list.
	 * The list contents are of type {@link caex.caex215.caex.Revision}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Revision</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revision</em>' containment reference list.
	 * @see caex.caex215.caex.CAEXPackage#getCAEXBasicObject_Revision()
	 * @model containment="true"
	 * @generated
	 */
	EList<Revision> getRevision();

	/**
	 * Returns the value of the '<em><b>Copyright</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Copyright</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Copyright</em>' containment reference.
	 * @see #setCopyright(Copyright)
	 * @see caex.caex215.caex.CAEXPackage#getCAEXBasicObject_Copyright()
	 * @model containment="true"
	 * @generated
	 */
	Copyright getCopyright();

	/**
	 * Sets the value of the '{@link caex.caex215.caex.CAEXBasicObject#getCopyright <em>Copyright</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copyright</em>' containment reference.
	 * @see #getCopyright()
	 * @generated
	 */
	void setCopyright(Copyright value);

	/**
	 * Returns the value of the '<em><b>Additional Information</b></em>' containment reference list.
	 * The list contents are of type {@link caex.caex215.caex.AdditionalInformation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additional Information</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Information</em>' containment reference list.
	 * @see caex.caex215.caex.CAEXPackage#getCAEXBasicObject_AdditionalInformation()
	 * @model containment="true"
	 * @generated
	 */
	EList<AdditionalInformation> getAdditionalInformation();

	/**
	 * Returns the value of the '<em><b>Change Mode</b></em>' attribute.
	 * The default value is <code>"state"</code>.
	 * The literals are from the enumeration {@link caex.caex215.caex.ChangeMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Mode</em>' attribute.
	 * @see caex.caex215.caex.ChangeMode
	 * @see #isSetChangeMode()
	 * @see #unsetChangeMode()
	 * @see #setChangeMode(ChangeMode)
	 * @see caex.caex215.caex.CAEXPackage#getCAEXBasicObject_ChangeMode()
	 * @model default="state" unsettable="true"
	 * @generated
	 */
	ChangeMode getChangeMode();

	/**
	 * Sets the value of the '{@link caex.caex215.caex.CAEXBasicObject#getChangeMode <em>Change Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Mode</em>' attribute.
	 * @see caex.caex215.caex.ChangeMode
	 * @see #isSetChangeMode()
	 * @see #unsetChangeMode()
	 * @see #getChangeMode()
	 * @generated
	 */
	void setChangeMode(ChangeMode value);

	/**
	 * Unsets the value of the '{@link caex.caex215.caex.CAEXBasicObject#getChangeMode <em>Change Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetChangeMode()
	 * @see #getChangeMode()
	 * @see #setChangeMode(ChangeMode)
	 * @generated
	 */
	void unsetChangeMode();

	/**
	 * Returns whether the value of the '{@link caex.caex215.caex.CAEXBasicObject#getChangeMode <em>Change Mode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Change Mode</em>' attribute is set.
	 * @see #unsetChangeMode()
	 * @see #getChangeMode()
	 * @see #setChangeMode(ChangeMode)
	 * @generated
	 */
	boolean isSetChangeMode();

} // CAEXBasicObject

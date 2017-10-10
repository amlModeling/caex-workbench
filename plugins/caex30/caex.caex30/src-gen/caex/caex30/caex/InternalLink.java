/**
 */
package caex.caex30.caex;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Internal Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link caex.caex30.caex.InternalLink#getRefPartnerSideA <em>Ref Partner Side A</em>}</li>
 *   <li>{@link caex.caex30.caex.InternalLink#getRefPartnerSideB <em>Ref Partner Side B</em>}</li>
 *   <li>{@link caex.caex30.caex.InternalLink#getPartnerSideA <em>Partner Side A</em>}</li>
 *   <li>{@link caex.caex30.caex.InternalLink#getPartnerSideB <em>Partner Side B</em>}</li>
 * </ul>
 *
 * @see caex.caex30.caex.CAEXPackage#getInternalLink()
 * @model extendedMetaData="name='InternalLink_._type' kind='elementOnly'"
 * @generated
 */
public interface InternalLink extends CAEXObject {
	/**
	 * Returns the value of the '<em><b>Ref Partner Side A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref Partner Side A</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Partner Side A</em>' attribute.
	 * @see #setRefPartnerSideA(String)
	 * @see caex.caex30.caex.CAEXPackage#getInternalLink_RefPartnerSideA()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='RefPartnerSideA'"
	 * @generated
	 */
	String getRefPartnerSideA();

	/**
	 * Sets the value of the '{@link caex.caex30.caex.InternalLink#getRefPartnerSideA <em>Ref Partner Side A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Partner Side A</em>' attribute.
	 * @see #getRefPartnerSideA()
	 * @generated
	 */
	void setRefPartnerSideA(String value);

	/**
	 * Returns the value of the '<em><b>Ref Partner Side B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref Partner Side B</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Partner Side B</em>' attribute.
	 * @see #setRefPartnerSideB(String)
	 * @see caex.caex30.caex.CAEXPackage#getInternalLink_RefPartnerSideB()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='RefPartnerSideB'"
	 * @generated
	 */
	String getRefPartnerSideB();

	/**
	 * Sets the value of the '{@link caex.caex30.caex.InternalLink#getRefPartnerSideB <em>Ref Partner Side B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Partner Side B</em>' attribute.
	 * @see #getRefPartnerSideB()
	 * @generated
	 */
	void setRefPartnerSideB(String value);

	/**
	 * Returns the value of the '<em><b>Partner Side A</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Partner Side A</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partner Side A</em>' reference.
	 * @see #setPartnerSideA(InterfaceClass)
	 * @see caex.caex30.caex.CAEXPackage#getInternalLink_PartnerSideA()
	 * @model required="true"
	 * @generated
	 */
	InterfaceClass getPartnerSideA();

	/**
	 * Sets the value of the '{@link caex.caex30.caex.InternalLink#getPartnerSideA <em>Partner Side A</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partner Side A</em>' reference.
	 * @see #getPartnerSideA()
	 * @generated
	 */
	void setPartnerSideA(InterfaceClass value);

	/**
	 * Returns the value of the '<em><b>Partner Side B</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Partner Side B</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partner Side B</em>' reference.
	 * @see #setPartnerSideB(InterfaceClass)
	 * @see caex.caex30.caex.CAEXPackage#getInternalLink_PartnerSideB()
	 * @model required="true"
	 * @generated
	 */
	InterfaceClass getPartnerSideB();

	/**
	 * Sets the value of the '{@link caex.caex30.caex.InternalLink#getPartnerSideB <em>Partner Side B</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partner Side B</em>' reference.
	 * @see #getPartnerSideB()
	 * @generated
	 */
	void setPartnerSideB(InterfaceClass value);

} // InternalLink

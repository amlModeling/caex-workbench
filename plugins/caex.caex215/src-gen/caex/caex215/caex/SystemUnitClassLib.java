/**
 */
package caex.caex215.caex;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Unit Class Lib</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link caex.caex215.caex.SystemUnitClassLib#getSystemUnitClass <em>System Unit Class</em>}</li>
 * </ul>
 *
 * @see caex.caex215.caex.CAEXPackage#getSystemUnitClassLib()
 * @model
 * @generated
 */
public interface SystemUnitClassLib extends CAEXObject {
	/**
	 * Returns the value of the '<em><b>System Unit Class</b></em>' containment reference list.
	 * The list contents are of type {@link caex.caex215.caex.SystemUnitClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Unit Class</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Unit Class</em>' containment reference list.
	 * @see caex.caex215.caex.CAEXPackage#getSystemUnitClassLib_SystemUnitClass()
	 * @model containment="true"
	 * @generated
	 */
	EList<SystemUnitClass> getSystemUnitClass();

} // SystemUnitClassLib

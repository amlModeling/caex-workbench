/**
 */
package caex.caex215.caex.impl;

import caex.caex215.caex.CAEXPackage;
import caex.caex215.caex.Revision;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Revision</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link caex.caex215.caex.impl.RevisionImpl#getRevisionDate <em>Revision Date</em>}</li>
 *   <li>{@link caex.caex215.caex.impl.RevisionImpl#getOldVersion <em>Old Version</em>}</li>
 *   <li>{@link caex.caex215.caex.impl.RevisionImpl#getNewVersion <em>New Version</em>}</li>
 *   <li>{@link caex.caex215.caex.impl.RevisionImpl#getAuthorName <em>Author Name</em>}</li>
 *   <li>{@link caex.caex215.caex.impl.RevisionImpl#getComment <em>Comment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RevisionImpl extends CAEXBasicObjectImpl implements Revision {
	/**
	 * The default value of the '{@link #getRevisionDate() <em>Revision Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevisionDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar REVISION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRevisionDate() <em>Revision Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevisionDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar revisionDate = REVISION_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOldVersion() <em>Old Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOldVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String OLD_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOldVersion() <em>Old Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOldVersion()
	 * @generated
	 * @ordered
	 */
	protected String oldVersion = OLD_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getNewVersion() <em>New Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNewVersion() <em>New Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewVersion()
	 * @generated
	 * @ordered
	 */
	protected String newVersion = NEW_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuthorName() <em>Author Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorName()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHOR_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthorName() <em>Author Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorName()
	 * @generated
	 * @ordered
	 */
	protected String authorName = AUTHOR_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RevisionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CAEXPackage.Literals.REVISION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getRevisionDate() {
		return revisionDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRevisionDate(XMLGregorianCalendar newRevisionDate) {
		XMLGregorianCalendar oldRevisionDate = revisionDate;
		revisionDate = newRevisionDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CAEXPackage.REVISION__REVISION_DATE, oldRevisionDate, revisionDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOldVersion() {
		return oldVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOldVersion(String newOldVersion) {
		String oldOldVersion = oldVersion;
		oldVersion = newOldVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CAEXPackage.REVISION__OLD_VERSION, oldOldVersion, oldVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNewVersion() {
		return newVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewVersion(String newNewVersion) {
		String oldNewVersion = newVersion;
		newVersion = newNewVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CAEXPackage.REVISION__NEW_VERSION, oldNewVersion, newVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuthorName() {
		return authorName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthorName(String newAuthorName) {
		String oldAuthorName = authorName;
		authorName = newAuthorName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CAEXPackage.REVISION__AUTHOR_NAME, oldAuthorName, authorName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CAEXPackage.REVISION__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CAEXPackage.REVISION__REVISION_DATE:
				return getRevisionDate();
			case CAEXPackage.REVISION__OLD_VERSION:
				return getOldVersion();
			case CAEXPackage.REVISION__NEW_VERSION:
				return getNewVersion();
			case CAEXPackage.REVISION__AUTHOR_NAME:
				return getAuthorName();
			case CAEXPackage.REVISION__COMMENT:
				return getComment();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CAEXPackage.REVISION__REVISION_DATE:
				setRevisionDate((XMLGregorianCalendar)newValue);
				return;
			case CAEXPackage.REVISION__OLD_VERSION:
				setOldVersion((String)newValue);
				return;
			case CAEXPackage.REVISION__NEW_VERSION:
				setNewVersion((String)newValue);
				return;
			case CAEXPackage.REVISION__AUTHOR_NAME:
				setAuthorName((String)newValue);
				return;
			case CAEXPackage.REVISION__COMMENT:
				setComment((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CAEXPackage.REVISION__REVISION_DATE:
				setRevisionDate(REVISION_DATE_EDEFAULT);
				return;
			case CAEXPackage.REVISION__OLD_VERSION:
				setOldVersion(OLD_VERSION_EDEFAULT);
				return;
			case CAEXPackage.REVISION__NEW_VERSION:
				setNewVersion(NEW_VERSION_EDEFAULT);
				return;
			case CAEXPackage.REVISION__AUTHOR_NAME:
				setAuthorName(AUTHOR_NAME_EDEFAULT);
				return;
			case CAEXPackage.REVISION__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CAEXPackage.REVISION__REVISION_DATE:
				return REVISION_DATE_EDEFAULT == null ? revisionDate != null : !REVISION_DATE_EDEFAULT.equals(revisionDate);
			case CAEXPackage.REVISION__OLD_VERSION:
				return OLD_VERSION_EDEFAULT == null ? oldVersion != null : !OLD_VERSION_EDEFAULT.equals(oldVersion);
			case CAEXPackage.REVISION__NEW_VERSION:
				return NEW_VERSION_EDEFAULT == null ? newVersion != null : !NEW_VERSION_EDEFAULT.equals(newVersion);
			case CAEXPackage.REVISION__AUTHOR_NAME:
				return AUTHOR_NAME_EDEFAULT == null ? authorName != null : !AUTHOR_NAME_EDEFAULT.equals(authorName);
			case CAEXPackage.REVISION__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (revisionDate: ");
		result.append(revisionDate);
		result.append(", oldVersion: ");
		result.append(oldVersion);
		result.append(", newVersion: ");
		result.append(newVersion);
		result.append(", authorName: ");
		result.append(authorName);
		result.append(", comment: ");
		result.append(comment);
		result.append(')');
		return result.toString();
	}

} //RevisionImpl

/**
 */
package notebookMM.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import notebookMM.MarkdownCell;
import notebookMM.NotebookMMPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Markdown Cell</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link notebookMM.impl.MarkdownCellImpl#getContent <em>Content</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MarkdownCellImpl extends CellImpl implements MarkdownCell {
	/**
	 * The default value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected String content = CONTENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MarkdownCellImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NotebookMMPackage.Literals.MARKDOWN_CELL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContent() {
		return content;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContent(String newContent) {
		String oldContent = content;
		content = newContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotebookMMPackage.MARKDOWN_CELL__CONTENT, oldContent,
					content));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean isHeader() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT

		if (getContent() == null)
			return false;
		return getContent().trim().startsWith("#");

		//throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public int getHeaderLevel() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT

		if (!isHeader())
			return 0;

		Pattern pattern = Pattern.compile("^(#{1,6})\\s+");
		Matcher matcher = pattern.matcher(getContent().trim());
		if (matcher.find()) {
			return matcher.group(1).length();
		}
		return 0;

		//throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String extractTitle() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT

		if (!isHeader())
			return "";

		Pattern pattern = Pattern.compile("^#{1,6}\\s+(.+)$", Pattern.MULTILINE);
		Matcher matcher = pattern.matcher(getContent().trim());
		if (matcher.find()) {
			return matcher.group(1).trim();
		}
		return "";

		//throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case NotebookMMPackage.MARKDOWN_CELL__CONTENT:
			return getContent();
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
		case NotebookMMPackage.MARKDOWN_CELL__CONTENT:
			setContent((String) newValue);
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
		case NotebookMMPackage.MARKDOWN_CELL__CONTENT:
			setContent(CONTENT_EDEFAULT);
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
		case NotebookMMPackage.MARKDOWN_CELL__CONTENT:
			return CONTENT_EDEFAULT == null ? content != null : !CONTENT_EDEFAULT.equals(content);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case NotebookMMPackage.MARKDOWN_CELL___IS_HEADER:
			return isHeader();
		case NotebookMMPackage.MARKDOWN_CELL___GET_HEADER_LEVEL:
			return getHeaderLevel();
		case NotebookMMPackage.MARKDOWN_CELL___EXTRACT_TITLE:
			return extractTitle();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (content: ");
		result.append(content);
		result.append(')');
		return result.toString();
	}

} //MarkdownCellImpl

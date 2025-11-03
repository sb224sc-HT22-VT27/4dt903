/**
 */
package notebookMM.impl;

import java.lang.reflect.InvocationTargetException;
import notebookMM.NotebookMMPackage;
import notebookMM.NotebookMetadata;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Notebook Metadata</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link notebookMM.impl.NotebookMetadataImpl#getKernelspec <em>Kernelspec</em>}</li>
 *   <li>{@link notebookMM.impl.NotebookMetadataImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link notebookMM.impl.NotebookMetadataImpl#getNbformat <em>Nbformat</em>}</li>
 *   <li>{@link notebookMM.impl.NotebookMetadataImpl#getNbformatMinor <em>Nbformat Minor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NotebookMetadataImpl extends MinimalEObjectImpl.Container implements NotebookMetadata {
	/**
	 * The default value of the '{@link #getKernelspec() <em>Kernelspec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKernelspec()
	 * @generated
	 * @ordered
	 */
	protected static final String KERNELSPEC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKernelspec() <em>Kernelspec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKernelspec()
	 * @generated
	 * @ordered
	 */
	protected String kernelspec = KERNELSPEC_EDEFAULT;

	/**
	 * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String LANGUAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected String language = LANGUAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNbformat() <em>Nbformat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbformat()
	 * @generated
	 * @ordered
	 */
	protected static final int NBFORMAT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNbformat() <em>Nbformat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbformat()
	 * @generated
	 * @ordered
	 */
	protected int nbformat = NBFORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNbformatMinor() <em>Nbformat Minor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbformatMinor()
	 * @generated
	 * @ordered
	 */
	protected static final int NBFORMAT_MINOR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNbformatMinor() <em>Nbformat Minor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbformatMinor()
	 * @generated
	 * @ordered
	 */
	protected int nbformatMinor = NBFORMAT_MINOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NotebookMetadataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NotebookMMPackage.Literals.NOTEBOOK_METADATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getKernelspec() {
		return kernelspec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKernelspec(String newKernelspec) {
		String oldKernelspec = kernelspec;
		kernelspec = newKernelspec;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotebookMMPackage.NOTEBOOK_METADATA__KERNELSPEC,
					oldKernelspec, kernelspec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLanguage(String newLanguage) {
		String oldLanguage = language;
		language = newLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotebookMMPackage.NOTEBOOK_METADATA__LANGUAGE,
					oldLanguage, language));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNbformat() {
		return nbformat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNbformat(int newNbformat) {
		int oldNbformat = nbformat;
		nbformat = newNbformat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotebookMMPackage.NOTEBOOK_METADATA__NBFORMAT,
					oldNbformat, nbformat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNbformatMinor() {
		return nbformatMinor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNbformatMinor(int newNbformatMinor) {
		int oldNbformatMinor = nbformatMinor;
		nbformatMinor = newNbformatMinor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotebookMMPackage.NOTEBOOK_METADATA__NBFORMAT_MINOR,
					oldNbformatMinor, nbformatMinor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isPythonKernel() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case NotebookMMPackage.NOTEBOOK_METADATA__KERNELSPEC:
			return getKernelspec();
		case NotebookMMPackage.NOTEBOOK_METADATA__LANGUAGE:
			return getLanguage();
		case NotebookMMPackage.NOTEBOOK_METADATA__NBFORMAT:
			return getNbformat();
		case NotebookMMPackage.NOTEBOOK_METADATA__NBFORMAT_MINOR:
			return getNbformatMinor();
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
		case NotebookMMPackage.NOTEBOOK_METADATA__KERNELSPEC:
			setKernelspec((String) newValue);
			return;
		case NotebookMMPackage.NOTEBOOK_METADATA__LANGUAGE:
			setLanguage((String) newValue);
			return;
		case NotebookMMPackage.NOTEBOOK_METADATA__NBFORMAT:
			setNbformat((Integer) newValue);
			return;
		case NotebookMMPackage.NOTEBOOK_METADATA__NBFORMAT_MINOR:
			setNbformatMinor((Integer) newValue);
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
		case NotebookMMPackage.NOTEBOOK_METADATA__KERNELSPEC:
			setKernelspec(KERNELSPEC_EDEFAULT);
			return;
		case NotebookMMPackage.NOTEBOOK_METADATA__LANGUAGE:
			setLanguage(LANGUAGE_EDEFAULT);
			return;
		case NotebookMMPackage.NOTEBOOK_METADATA__NBFORMAT:
			setNbformat(NBFORMAT_EDEFAULT);
			return;
		case NotebookMMPackage.NOTEBOOK_METADATA__NBFORMAT_MINOR:
			setNbformatMinor(NBFORMAT_MINOR_EDEFAULT);
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
		case NotebookMMPackage.NOTEBOOK_METADATA__KERNELSPEC:
			return KERNELSPEC_EDEFAULT == null ? kernelspec != null : !KERNELSPEC_EDEFAULT.equals(kernelspec);
		case NotebookMMPackage.NOTEBOOK_METADATA__LANGUAGE:
			return LANGUAGE_EDEFAULT == null ? language != null : !LANGUAGE_EDEFAULT.equals(language);
		case NotebookMMPackage.NOTEBOOK_METADATA__NBFORMAT:
			return nbformat != NBFORMAT_EDEFAULT;
		case NotebookMMPackage.NOTEBOOK_METADATA__NBFORMAT_MINOR:
			return nbformatMinor != NBFORMAT_MINOR_EDEFAULT;
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
		case NotebookMMPackage.NOTEBOOK_METADATA___IS_PYTHON_KERNEL:
			return isPythonKernel();
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
		result.append(" (kernelspec: ");
		result.append(kernelspec);
		result.append(", language: ");
		result.append(language);
		result.append(", nbformat: ");
		result.append(nbformat);
		result.append(", nbformatMinor: ");
		result.append(nbformatMinor);
		result.append(')');
		return result.toString();
	}

} //NotebookMetadataImpl

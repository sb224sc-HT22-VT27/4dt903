/**
 */
package notebookMM.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

import notebookMM.Cell;
import notebookMM.CellType;
import notebookMM.CodeCell;
import notebookMM.MarkdownCell;
import notebookMM.NotebookMMPackage;
import notebookMM.NotebookMetadata;
import notebookMM.NotebookModel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Notebook Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link notebookMM.impl.NotebookModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link notebookMM.impl.NotebookModelImpl#getCells <em>Cells</em>}</li>
 *   <li>{@link notebookMM.impl.NotebookModelImpl#getMetadata <em>Metadata</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NotebookModelImpl extends MinimalEObjectImpl.Container implements NotebookModel {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCells() <em>Cells</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCells()
	 * @generated
	 * @ordered
	 */
	protected EList<Cell> cells;

	/**
	 * The cached value of the '{@link #getMetadata() <em>Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadata()
	 * @generated
	 * @ordered
	 */
	protected NotebookMetadata metadata;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NotebookModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NotebookMMPackage.Literals.NOTEBOOK_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotebookMMPackage.NOTEBOOK_MODEL__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Cell> getCells() {
		if (cells == null) {
			cells = new EObjectContainmentEList<Cell>(Cell.class, this, NotebookMMPackage.NOTEBOOK_MODEL__CELLS);
		}
		return cells;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotebookMetadata getMetadata() {
		return metadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetadata(NotebookMetadata newMetadata, NotificationChain msgs) {
		NotebookMetadata oldMetadata = metadata;
		metadata = newMetadata;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					NotebookMMPackage.NOTEBOOK_MODEL__METADATA, oldMetadata, newMetadata);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMetadata(NotebookMetadata newMetadata) {
		if (newMetadata != metadata) {
			NotificationChain msgs = null;
			if (metadata != null)
				msgs = ((InternalEObject) metadata).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - NotebookMMPackage.NOTEBOOK_MODEL__METADATA, null, msgs);
			if (newMetadata != null)
				msgs = ((InternalEObject) newMetadata).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - NotebookMMPackage.NOTEBOOK_MODEL__METADATA, null, msgs);
			msgs = basicSetMetadata(newMetadata, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotebookMMPackage.NOTEBOOK_MODEL__METADATA,
					newMetadata, newMetadata));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<CodeCell> getCodeCells() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		
		EList<CodeCell> codeCells = new BasicEList<>();
		for (Cell cell : getCells()) {
			if (cell instanceof CodeCell) {
				codeCells.add((CodeCell) cell);
			}
		}
		return codeCells;
		
		//throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<MarkdownCell> getMarkdownCells() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		
		EList<MarkdownCell> markdownCells = new BasicEList<>();
		for (Cell cell : getCells()) {
			if (cell instanceof MarkdownCell) {
				markdownCells.add((MarkdownCell) cell);
			}
		}
		return markdownCells;
		
		//throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<String> getAllImports() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		
		Set<String> allImports = new LinkedHashSet<>();
		for (CodeCell codeCell : getCodeCells()) {
			allImports.addAll(codeCell.extractImports());
		}
		return new BasicEList<>(allImports);
		
		//throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Cell> getCellsByType(CellType type) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean validate() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		
		// Basic validation logic
		if (getName() == null || getName().isEmpty()) {
			return false;
		}
		if (getCells() == null || getCells().isEmpty()) {
			return false;
		}
		if (getMetadata() == null) {
			return false;
		}
		return true;
		
		//throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case NotebookMMPackage.NOTEBOOK_MODEL__CELLS:
			return ((InternalEList<?>) getCells()).basicRemove(otherEnd, msgs);
		case NotebookMMPackage.NOTEBOOK_MODEL__METADATA:
			return basicSetMetadata(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case NotebookMMPackage.NOTEBOOK_MODEL__NAME:
			return getName();
		case NotebookMMPackage.NOTEBOOK_MODEL__CELLS:
			return getCells();
		case NotebookMMPackage.NOTEBOOK_MODEL__METADATA:
			return getMetadata();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case NotebookMMPackage.NOTEBOOK_MODEL__NAME:
			setName((String) newValue);
			return;
		case NotebookMMPackage.NOTEBOOK_MODEL__CELLS:
			getCells().clear();
			getCells().addAll((Collection<? extends Cell>) newValue);
			return;
		case NotebookMMPackage.NOTEBOOK_MODEL__METADATA:
			setMetadata((NotebookMetadata) newValue);
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
		case NotebookMMPackage.NOTEBOOK_MODEL__NAME:
			setName(NAME_EDEFAULT);
			return;
		case NotebookMMPackage.NOTEBOOK_MODEL__CELLS:
			getCells().clear();
			return;
		case NotebookMMPackage.NOTEBOOK_MODEL__METADATA:
			setMetadata((NotebookMetadata) null);
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
		case NotebookMMPackage.NOTEBOOK_MODEL__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case NotebookMMPackage.NOTEBOOK_MODEL__CELLS:
			return cells != null && !cells.isEmpty();
		case NotebookMMPackage.NOTEBOOK_MODEL__METADATA:
			return metadata != null;
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
		case NotebookMMPackage.NOTEBOOK_MODEL___GET_CODE_CELLS:
			return getCodeCells();
		case NotebookMMPackage.NOTEBOOK_MODEL___GET_MARKDOWN_CELLS:
			return getMarkdownCells();
		case NotebookMMPackage.NOTEBOOK_MODEL___GET_ALL_IMPORTS:
			return getAllImports();
		case NotebookMMPackage.NOTEBOOK_MODEL___GET_CELLS_BY_TYPE__CELLTYPE:
			return getCellsByType((CellType) arguments.get(0));
		case NotebookMMPackage.NOTEBOOK_MODEL___VALIDATE:
			return validate();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //NotebookModelImpl

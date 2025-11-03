/**
 */
package notebookMM.impl;

import notebookMM.Cell;
import notebookMM.CellType;
import notebookMM.NotebookMMPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cell</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link notebookMM.impl.CellImpl#getCellType <em>Cell Type</em>}</li>
 *   <li>{@link notebookMM.impl.CellImpl#getExecutionOrder <em>Execution Order</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CellImpl extends MinimalEObjectImpl.Container implements Cell {
	/**
	 * The default value of the '{@link #getCellType() <em>Cell Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCellType()
	 * @generated
	 * @ordered
	 */
	protected static final CellType CELL_TYPE_EDEFAULT = CellType.CODE;

	/**
	 * The cached value of the '{@link #getCellType() <em>Cell Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCellType()
	 * @generated
	 * @ordered
	 */
	protected CellType cellType = CELL_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getExecutionOrder() <em>Execution Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionOrder()
	 * @generated
	 * @ordered
	 */
	protected static final int EXECUTION_ORDER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getExecutionOrder() <em>Execution Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionOrder()
	 * @generated
	 * @ordered
	 */
	protected int executionOrder = EXECUTION_ORDER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CellImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NotebookMMPackage.Literals.CELL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CellType getCellType() {
		return cellType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCellType(CellType newCellType) {
		CellType oldCellType = cellType;
		cellType = newCellType == null ? CELL_TYPE_EDEFAULT : newCellType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotebookMMPackage.CELL__CELL_TYPE, oldCellType,
					cellType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getExecutionOrder() {
		return executionOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExecutionOrder(int newExecutionOrder) {
		int oldExecutionOrder = executionOrder;
		executionOrder = newExecutionOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotebookMMPackage.CELL__EXECUTION_ORDER,
					oldExecutionOrder, executionOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case NotebookMMPackage.CELL__CELL_TYPE:
			return getCellType();
		case NotebookMMPackage.CELL__EXECUTION_ORDER:
			return getExecutionOrder();
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
		case NotebookMMPackage.CELL__CELL_TYPE:
			setCellType((CellType) newValue);
			return;
		case NotebookMMPackage.CELL__EXECUTION_ORDER:
			setExecutionOrder((Integer) newValue);
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
		case NotebookMMPackage.CELL__CELL_TYPE:
			setCellType(CELL_TYPE_EDEFAULT);
			return;
		case NotebookMMPackage.CELL__EXECUTION_ORDER:
			setExecutionOrder(EXECUTION_ORDER_EDEFAULT);
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
		case NotebookMMPackage.CELL__CELL_TYPE:
			return cellType != CELL_TYPE_EDEFAULT;
		case NotebookMMPackage.CELL__EXECUTION_ORDER:
			return executionOrder != EXECUTION_ORDER_EDEFAULT;
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (cellType: ");
		result.append(cellType);
		result.append(", executionOrder: ");
		result.append(executionOrder);
		result.append(')');
		return result.toString();
	}

} //CellImpl

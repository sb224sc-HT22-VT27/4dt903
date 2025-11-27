/**
 */
package notebookMM.impl;

import notebookMM.Cell;
import notebookMM.CellType;
import notebookMM.CodeCell;
import notebookMM.MarkdownCell;
import notebookMM.NotebookMMFactory;
import notebookMM.NotebookMMPackage;
import notebookMM.NotebookMetadata;
import notebookMM.NotebookModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NotebookMMPackageImpl extends EPackageImpl implements NotebookMMPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notebookModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notebookMetadataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cellEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeCellEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass markdownCellEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cellTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see notebookMM.NotebookMMPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private NotebookMMPackageImpl() {
		super(eNS_URI, NotebookMMFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link NotebookMMPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static NotebookMMPackage init() {
		if (isInited)
			return (NotebookMMPackage) EPackage.Registry.INSTANCE.getEPackage(NotebookMMPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredNotebookMMPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		NotebookMMPackageImpl theNotebookMMPackage = registeredNotebookMMPackage instanceof NotebookMMPackageImpl
				? (NotebookMMPackageImpl) registeredNotebookMMPackage
				: new NotebookMMPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theNotebookMMPackage.createPackageContents();

		// Initialize created meta-data
		theNotebookMMPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theNotebookMMPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(NotebookMMPackage.eNS_URI, theNotebookMMPackage);
		return theNotebookMMPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNotebookModel() {
		return notebookModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNotebookModel_Name() {
		return (EAttribute) notebookModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNotebookModel_Cells() {
		return (EReference) notebookModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNotebookModel_Metadata() {
		return (EReference) notebookModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNotebookModel__GetCodeCells() {
		return notebookModelEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNotebookModel__GetMarkdownCells() {
		return notebookModelEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNotebookModel__GetAllImports() {
		return notebookModelEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNotebookModel__GetCellsByType__CellType() {
		return notebookModelEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNotebookModel__Validate() {
		return notebookModelEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNotebookMetadata() {
		return notebookMetadataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNotebookMetadata_Kernelspec() {
		return (EAttribute) notebookMetadataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNotebookMetadata_Language() {
		return (EAttribute) notebookMetadataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNotebookMetadata_PythonVersion() {
		return (EAttribute) notebookMetadataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNotebookMetadata_Nbformat() {
		return (EAttribute) notebookMetadataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNotebookMetadata_NbformatMinor() {
		return (EAttribute) notebookMetadataEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNotebookMetadata__IsPythonKernel() {
		return notebookMetadataEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCell() {
		return cellEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCell_CellType() {
		return (EAttribute) cellEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCell_ExecutionOrder() {
		return (EAttribute) cellEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCell_Id() {
		return (EAttribute) cellEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCell__IsEmpty() {
		return cellEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCell__GetContentLength() {
		return cellEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCodeCell() {
		return codeCellEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCodeCell_Source() {
		return (EAttribute) codeCellEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCodeCell_Imports() {
		return (EAttribute) codeCellEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCodeCell_Constants() {
		return (EAttribute) codeCellEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCodeCell_Commands() {
		return (EAttribute) codeCellEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCodeCell_Outputs() {
		return (EAttribute) codeCellEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCodeCell__ExtractImports() {
		return codeCellEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCodeCell__HasImports() {
		return codeCellEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCodeCell__ExtractConstants() {
		return codeCellEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCodeCell__HasConstants() {
		return codeCellEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCodeCell__ExtractCommands() {
		return codeCellEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCodeCell__HasCommands() {
		return codeCellEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCodeCell__IsTrainingCode() {
		return codeCellEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCodeCell__IsDataPreprocessing() {
		return codeCellEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCodeCell__IsPredictionCode() {
		return codeCellEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCodeCell__GetSourceLines() {
		return codeCellEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCodeCell__ContainsKeyword__String() {
		return codeCellEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMarkdownCell() {
		return markdownCellEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMarkdownCell_Content() {
		return (EAttribute) markdownCellEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMarkdownCell__IsHeader() {
		return markdownCellEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMarkdownCell__GetHeaderLevel() {
		return markdownCellEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMarkdownCell__ExtractTitle() {
		return markdownCellEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCellType() {
		return cellTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotebookMMFactory getNotebookMMFactory() {
		return (NotebookMMFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		notebookModelEClass = createEClass(NOTEBOOK_MODEL);
		createEAttribute(notebookModelEClass, NOTEBOOK_MODEL__NAME);
		createEReference(notebookModelEClass, NOTEBOOK_MODEL__CELLS);
		createEReference(notebookModelEClass, NOTEBOOK_MODEL__METADATA);
		createEOperation(notebookModelEClass, NOTEBOOK_MODEL___GET_CODE_CELLS);
		createEOperation(notebookModelEClass, NOTEBOOK_MODEL___GET_MARKDOWN_CELLS);
		createEOperation(notebookModelEClass, NOTEBOOK_MODEL___GET_ALL_IMPORTS);
		createEOperation(notebookModelEClass, NOTEBOOK_MODEL___GET_CELLS_BY_TYPE__CELLTYPE);
		createEOperation(notebookModelEClass, NOTEBOOK_MODEL___VALIDATE);

		notebookMetadataEClass = createEClass(NOTEBOOK_METADATA);
		createEAttribute(notebookMetadataEClass, NOTEBOOK_METADATA__KERNELSPEC);
		createEAttribute(notebookMetadataEClass, NOTEBOOK_METADATA__LANGUAGE);
		createEAttribute(notebookMetadataEClass, NOTEBOOK_METADATA__PYTHON_VERSION);
		createEAttribute(notebookMetadataEClass, NOTEBOOK_METADATA__NBFORMAT);
		createEAttribute(notebookMetadataEClass, NOTEBOOK_METADATA__NBFORMAT_MINOR);
		createEOperation(notebookMetadataEClass, NOTEBOOK_METADATA___IS_PYTHON_KERNEL);

		cellEClass = createEClass(CELL);
		createEAttribute(cellEClass, CELL__CELL_TYPE);
		createEAttribute(cellEClass, CELL__EXECUTION_ORDER);
		createEAttribute(cellEClass, CELL__ID);
		createEOperation(cellEClass, CELL___IS_EMPTY);
		createEOperation(cellEClass, CELL___GET_CONTENT_LENGTH);

		codeCellEClass = createEClass(CODE_CELL);
		createEAttribute(codeCellEClass, CODE_CELL__SOURCE);
		createEAttribute(codeCellEClass, CODE_CELL__IMPORTS);
		createEAttribute(codeCellEClass, CODE_CELL__CONSTANTS);
		createEAttribute(codeCellEClass, CODE_CELL__COMMANDS);
		createEAttribute(codeCellEClass, CODE_CELL__OUTPUTS);
		createEOperation(codeCellEClass, CODE_CELL___EXTRACT_IMPORTS);
		createEOperation(codeCellEClass, CODE_CELL___HAS_IMPORTS);
		createEOperation(codeCellEClass, CODE_CELL___EXTRACT_CONSTANTS);
		createEOperation(codeCellEClass, CODE_CELL___HAS_CONSTANTS);
		createEOperation(codeCellEClass, CODE_CELL___EXTRACT_COMMANDS);
		createEOperation(codeCellEClass, CODE_CELL___HAS_COMMANDS);
		createEOperation(codeCellEClass, CODE_CELL___IS_TRAINING_CODE);
		createEOperation(codeCellEClass, CODE_CELL___IS_DATA_PREPROCESSING);
		createEOperation(codeCellEClass, CODE_CELL___IS_PREDICTION_CODE);
		createEOperation(codeCellEClass, CODE_CELL___GET_SOURCE_LINES);
		createEOperation(codeCellEClass, CODE_CELL___CONTAINS_KEYWORD__STRING);

		markdownCellEClass = createEClass(MARKDOWN_CELL);
		createEAttribute(markdownCellEClass, MARKDOWN_CELL__CONTENT);
		createEOperation(markdownCellEClass, MARKDOWN_CELL___IS_HEADER);
		createEOperation(markdownCellEClass, MARKDOWN_CELL___GET_HEADER_LEVEL);
		createEOperation(markdownCellEClass, MARKDOWN_CELL___EXTRACT_TITLE);

		// Create enums
		cellTypeEEnum = createEEnum(CELL_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		codeCellEClass.getESuperTypes().add(this.getCell());
		markdownCellEClass.getESuperTypes().add(this.getCell());

		// Initialize classes, features, and operations; add parameters
		initEClass(notebookModelEClass, NotebookModel.class, "NotebookModel", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNotebookModel_Name(), ecorePackage.getEString(), "name", null, 0, 1, NotebookModel.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNotebookModel_Cells(), this.getCell(), null, "cells", null, 0, -1, NotebookModel.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNotebookModel_Metadata(), this.getNotebookMetadata(), null, "metadata", null, 0, 1,
				NotebookModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getNotebookModel__GetCodeCells(), this.getCodeCell(), "getCodeCells", 0, -1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getNotebookModel__GetMarkdownCells(), this.getMarkdownCell(), "getMarkdownCells", 0, -1,
				IS_UNIQUE, IS_ORDERED);

		initEOperation(getNotebookModel__GetAllImports(), ecorePackage.getEString(), "getAllImports", 0, -1, IS_UNIQUE,
				IS_ORDERED);

		EOperation op = initEOperation(getNotebookModel__GetCellsByType__CellType(), this.getCell(), "getCellsByType",
				0, -1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getCellType(), "type", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getNotebookModel__Validate(), ecorePackage.getEBoolean(), "validate", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(notebookMetadataEClass, NotebookMetadata.class, "NotebookMetadata", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNotebookMetadata_Kernelspec(), ecorePackage.getEString(), "kernelspec", null, 0, 1,
				NotebookMetadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getNotebookMetadata_Language(), ecorePackage.getEString(), "language", null, 0, 1,
				NotebookMetadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getNotebookMetadata_PythonVersion(), ecorePackage.getEString(), "pythonVersion", null, 0, 1,
				NotebookMetadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getNotebookMetadata_Nbformat(), ecorePackage.getEInt(), "nbformat", null, 0, 1,
				NotebookMetadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getNotebookMetadata_NbformatMinor(), ecorePackage.getEInt(), "nbformatMinor", null, 0, 1,
				NotebookMetadata.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEOperation(getNotebookMetadata__IsPythonKernel(), ecorePackage.getEBoolean(), "isPythonKernel", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(cellEClass, Cell.class, "Cell", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCell_CellType(), this.getCellType(), "cellType", null, 0, 1, Cell.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCell_ExecutionOrder(), ecorePackage.getEInt(), "executionOrder", null, 0, 1, Cell.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCell_Id(), ecorePackage.getEString(), "id", null, 0, 1, Cell.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getCell__IsEmpty(), ecorePackage.getEBoolean(), "isEmpty", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getCell__GetContentLength(), ecorePackage.getEInt(), "getContentLength", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(codeCellEClass, CodeCell.class, "CodeCell", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCodeCell_Source(), ecorePackage.getEString(), "source", null, 0, 1, CodeCell.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCodeCell_Imports(), ecorePackage.getEString(), "imports", null, 0, -1, CodeCell.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCodeCell_Constants(), ecorePackage.getEString(), "constants", null, 0, -1, CodeCell.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCodeCell_Commands(), ecorePackage.getEString(), "commands", null, 0, -1, CodeCell.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCodeCell_Outputs(), ecorePackage.getEString(), "outputs", null, 0, -1, CodeCell.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getCodeCell__ExtractImports(), ecorePackage.getEString(), "extractImports", 0, -1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getCodeCell__HasImports(), ecorePackage.getEBoolean(), "hasImports", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getCodeCell__ExtractConstants(), ecorePackage.getEString(), "extractConstants", 0, -1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getCodeCell__HasConstants(), ecorePackage.getEBoolean(), "hasConstants", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getCodeCell__ExtractCommands(), ecorePackage.getEString(), "extractCommands", 0, -1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getCodeCell__HasCommands(), ecorePackage.getEBoolean(), "hasCommands", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getCodeCell__IsTrainingCode(), ecorePackage.getEBoolean(), "isTrainingCode", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getCodeCell__IsDataPreprocessing(), ecorePackage.getEBoolean(), "isDataPreprocessing", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEOperation(getCodeCell__IsPredictionCode(), ecorePackage.getEBoolean(), "isPredictionCode", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getCodeCell__GetSourceLines(), ecorePackage.getEString(), "getSourceLines", 0, -1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(getCodeCell__ContainsKeyword__String(), ecorePackage.getEBoolean(), "containsKeyword", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "keyword", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(markdownCellEClass, MarkdownCell.class, "MarkdownCell", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMarkdownCell_Content(), ecorePackage.getEString(), "content", null, 0, 1, MarkdownCell.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getMarkdownCell__IsHeader(), ecorePackage.getEBoolean(), "isHeader", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getMarkdownCell__GetHeaderLevel(), ecorePackage.getEInt(), "getHeaderLevel", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getMarkdownCell__ExtractTitle(), ecorePackage.getEString(), "extractTitle", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(cellTypeEEnum, CellType.class, "CellType");
		addEEnumLiteral(cellTypeEEnum, CellType.CODE);
		addEEnumLiteral(cellTypeEEnum, CellType.MARKDOWN);

		// Create resource
		createResource(eNS_URI);
	}

} //NotebookMMPackageImpl

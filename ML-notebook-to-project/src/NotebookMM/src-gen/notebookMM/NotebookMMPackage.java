/**
 */
package notebookMM;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see notebookMM.NotebookMMFactory
 * @model kind="package"
 * @generated
 */
public interface NotebookMMPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "notebookMM";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.g7.org/notebookMM";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "notebookMM";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NotebookMMPackage eINSTANCE = notebookMM.impl.NotebookMMPackageImpl.init();

	/**
	 * The meta object id for the '{@link notebookMM.impl.NotebookModelImpl <em>Notebook Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see notebookMM.impl.NotebookModelImpl
	 * @see notebookMM.impl.NotebookMMPackageImpl#getNotebookModel()
	 * @generated
	 */
	int NOTEBOOK_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTEBOOK_MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Cells</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTEBOOK_MODEL__CELLS = 1;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTEBOOK_MODEL__METADATA = 2;

	/**
	 * The number of structural features of the '<em>Notebook Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTEBOOK_MODEL_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Get Code Cells</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTEBOOK_MODEL___GET_CODE_CELLS = 0;

	/**
	 * The operation id for the '<em>Get Markdown Cells</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTEBOOK_MODEL___GET_MARKDOWN_CELLS = 1;

	/**
	 * The operation id for the '<em>Get All Imports</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTEBOOK_MODEL___GET_ALL_IMPORTS = 2;

	/**
	 * The operation id for the '<em>Get Cells By Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTEBOOK_MODEL___GET_CELLS_BY_TYPE__CELLTYPE = 3;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTEBOOK_MODEL___VALIDATE = 4;

	/**
	 * The number of operations of the '<em>Notebook Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTEBOOK_MODEL_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link notebookMM.impl.NotebookMetadataImpl <em>Notebook Metadata</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see notebookMM.impl.NotebookMetadataImpl
	 * @see notebookMM.impl.NotebookMMPackageImpl#getNotebookMetadata()
	 * @generated
	 */
	int NOTEBOOK_METADATA = 1;

	/**
	 * The feature id for the '<em><b>Kernelspec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTEBOOK_METADATA__KERNELSPEC = 0;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTEBOOK_METADATA__LANGUAGE = 1;

	/**
	 * The feature id for the '<em><b>Python Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTEBOOK_METADATA__PYTHON_VERSION = 2;

	/**
	 * The feature id for the '<em><b>Nbformat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTEBOOK_METADATA__NBFORMAT = 3;

	/**
	 * The feature id for the '<em><b>Nbformat Minor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTEBOOK_METADATA__NBFORMAT_MINOR = 4;

	/**
	 * The number of structural features of the '<em>Notebook Metadata</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTEBOOK_METADATA_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Is Python Kernel</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTEBOOK_METADATA___IS_PYTHON_KERNEL = 0;

	/**
	 * The number of operations of the '<em>Notebook Metadata</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTEBOOK_METADATA_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link notebookMM.impl.CellImpl <em>Cell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see notebookMM.impl.CellImpl
	 * @see notebookMM.impl.NotebookMMPackageImpl#getCell()
	 * @generated
	 */
	int CELL = 2;

	/**
	 * The feature id for the '<em><b>Cell Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL__CELL_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Execution Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL__EXECUTION_ORDER = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL__ID = 2;

	/**
	 * The number of structural features of the '<em>Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Is Empty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL___IS_EMPTY = 0;

	/**
	 * The operation id for the '<em>Get Content Length</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL___GET_CONTENT_LENGTH = 1;

	/**
	 * The number of operations of the '<em>Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link notebookMM.impl.CodeCellImpl <em>Code Cell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see notebookMM.impl.CodeCellImpl
	 * @see notebookMM.impl.NotebookMMPackageImpl#getCodeCell()
	 * @generated
	 */
	int CODE_CELL = 3;

	/**
	 * The feature id for the '<em><b>Cell Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_CELL__CELL_TYPE = CELL__CELL_TYPE;

	/**
	 * The feature id for the '<em><b>Execution Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_CELL__EXECUTION_ORDER = CELL__EXECUTION_ORDER;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_CELL__ID = CELL__ID;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_CELL__SOURCE = CELL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_CELL__IMPORTS = CELL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Constants</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_CELL__CONSTANTS = CELL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Commands</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_CELL__COMMANDS = CELL_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_CELL__OUTPUTS = CELL_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Code Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_CELL_FEATURE_COUNT = CELL_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Empty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_CELL___IS_EMPTY = CELL___IS_EMPTY;

	/**
	 * The operation id for the '<em>Get Content Length</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_CELL___GET_CONTENT_LENGTH = CELL___GET_CONTENT_LENGTH;

	/**
	 * The operation id for the '<em>Extract Imports</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_CELL___EXTRACT_IMPORTS = CELL_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Has Imports</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_CELL___HAS_IMPORTS = CELL_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Extract Constants</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_CELL___EXTRACT_CONSTANTS = CELL_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Has Constants</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_CELL___HAS_CONSTANTS = CELL_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Extract Commands</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_CELL___EXTRACT_COMMANDS = CELL_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Has Commands</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_CELL___HAS_COMMANDS = CELL_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Training Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_CELL___IS_TRAINING_CODE = CELL_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Data Preprocessing</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_CELL___IS_DATA_PREPROCESSING = CELL_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Is Prediction Code</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_CELL___IS_PREDICTION_CODE = CELL_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Get Source Lines</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_CELL___GET_SOURCE_LINES = CELL_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Contains Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_CELL___CONTAINS_KEYWORD__STRING = CELL_OPERATION_COUNT + 10;

	/**
	 * The number of operations of the '<em>Code Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_CELL_OPERATION_COUNT = CELL_OPERATION_COUNT + 11;

	/**
	 * The meta object id for the '{@link notebookMM.impl.MarkdownCellImpl <em>Markdown Cell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see notebookMM.impl.MarkdownCellImpl
	 * @see notebookMM.impl.NotebookMMPackageImpl#getMarkdownCell()
	 * @generated
	 */
	int MARKDOWN_CELL = 4;

	/**
	 * The feature id for the '<em><b>Cell Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKDOWN_CELL__CELL_TYPE = CELL__CELL_TYPE;

	/**
	 * The feature id for the '<em><b>Execution Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKDOWN_CELL__EXECUTION_ORDER = CELL__EXECUTION_ORDER;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKDOWN_CELL__ID = CELL__ID;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKDOWN_CELL__CONTENT = CELL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Markdown Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKDOWN_CELL_FEATURE_COUNT = CELL_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Empty</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKDOWN_CELL___IS_EMPTY = CELL___IS_EMPTY;

	/**
	 * The operation id for the '<em>Get Content Length</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKDOWN_CELL___GET_CONTENT_LENGTH = CELL___GET_CONTENT_LENGTH;

	/**
	 * The operation id for the '<em>Is Header</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKDOWN_CELL___IS_HEADER = CELL_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Header Level</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKDOWN_CELL___GET_HEADER_LEVEL = CELL_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Extract Title</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKDOWN_CELL___EXTRACT_TITLE = CELL_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Markdown Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKDOWN_CELL_OPERATION_COUNT = CELL_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link notebookMM.CellType <em>Cell Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see notebookMM.CellType
	 * @see notebookMM.impl.NotebookMMPackageImpl#getCellType()
	 * @generated
	 */
	int CELL_TYPE = 5;

	/**
	 * Returns the meta object for class '{@link notebookMM.NotebookModel <em>Notebook Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Notebook Model</em>'.
	 * @see notebookMM.NotebookModel
	 * @generated
	 */
	EClass getNotebookModel();

	/**
	 * Returns the meta object for the attribute '{@link notebookMM.NotebookModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see notebookMM.NotebookModel#getName()
	 * @see #getNotebookModel()
	 * @generated
	 */
	EAttribute getNotebookModel_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link notebookMM.NotebookModel#getCells <em>Cells</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cells</em>'.
	 * @see notebookMM.NotebookModel#getCells()
	 * @see #getNotebookModel()
	 * @generated
	 */
	EReference getNotebookModel_Cells();

	/**
	 * Returns the meta object for the containment reference '{@link notebookMM.NotebookModel#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Metadata</em>'.
	 * @see notebookMM.NotebookModel#getMetadata()
	 * @see #getNotebookModel()
	 * @generated
	 */
	EReference getNotebookModel_Metadata();

	/**
	 * Returns the meta object for the '{@link notebookMM.NotebookModel#getCodeCells() <em>Get Code Cells</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Code Cells</em>' operation.
	 * @see notebookMM.NotebookModel#getCodeCells()
	 * @generated
	 */
	EOperation getNotebookModel__GetCodeCells();

	/**
	 * Returns the meta object for the '{@link notebookMM.NotebookModel#getMarkdownCells() <em>Get Markdown Cells</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Markdown Cells</em>' operation.
	 * @see notebookMM.NotebookModel#getMarkdownCells()
	 * @generated
	 */
	EOperation getNotebookModel__GetMarkdownCells();

	/**
	 * Returns the meta object for the '{@link notebookMM.NotebookModel#getAllImports() <em>Get All Imports</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Imports</em>' operation.
	 * @see notebookMM.NotebookModel#getAllImports()
	 * @generated
	 */
	EOperation getNotebookModel__GetAllImports();

	/**
	 * Returns the meta object for the '{@link notebookMM.NotebookModel#getCellsByType(notebookMM.CellType) <em>Get Cells By Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Cells By Type</em>' operation.
	 * @see notebookMM.NotebookModel#getCellsByType(notebookMM.CellType)
	 * @generated
	 */
	EOperation getNotebookModel__GetCellsByType__CellType();

	/**
	 * Returns the meta object for the '{@link notebookMM.NotebookModel#validate() <em>Validate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate</em>' operation.
	 * @see notebookMM.NotebookModel#validate()
	 * @generated
	 */
	EOperation getNotebookModel__Validate();

	/**
	 * Returns the meta object for class '{@link notebookMM.NotebookMetadata <em>Notebook Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Notebook Metadata</em>'.
	 * @see notebookMM.NotebookMetadata
	 * @generated
	 */
	EClass getNotebookMetadata();

	/**
	 * Returns the meta object for the attribute '{@link notebookMM.NotebookMetadata#getKernelspec <em>Kernelspec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kernelspec</em>'.
	 * @see notebookMM.NotebookMetadata#getKernelspec()
	 * @see #getNotebookMetadata()
	 * @generated
	 */
	EAttribute getNotebookMetadata_Kernelspec();

	/**
	 * Returns the meta object for the attribute '{@link notebookMM.NotebookMetadata#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see notebookMM.NotebookMetadata#getLanguage()
	 * @see #getNotebookMetadata()
	 * @generated
	 */
	EAttribute getNotebookMetadata_Language();

	/**
	 * Returns the meta object for the attribute '{@link notebookMM.NotebookMetadata#getPythonVersion <em>Python Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Python Version</em>'.
	 * @see notebookMM.NotebookMetadata#getPythonVersion()
	 * @see #getNotebookMetadata()
	 * @generated
	 */
	EAttribute getNotebookMetadata_PythonVersion();

	/**
	 * Returns the meta object for the attribute '{@link notebookMM.NotebookMetadata#getNbformat <em>Nbformat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nbformat</em>'.
	 * @see notebookMM.NotebookMetadata#getNbformat()
	 * @see #getNotebookMetadata()
	 * @generated
	 */
	EAttribute getNotebookMetadata_Nbformat();

	/**
	 * Returns the meta object for the attribute '{@link notebookMM.NotebookMetadata#getNbformatMinor <em>Nbformat Minor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nbformat Minor</em>'.
	 * @see notebookMM.NotebookMetadata#getNbformatMinor()
	 * @see #getNotebookMetadata()
	 * @generated
	 */
	EAttribute getNotebookMetadata_NbformatMinor();

	/**
	 * Returns the meta object for the '{@link notebookMM.NotebookMetadata#isPythonKernel() <em>Is Python Kernel</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Python Kernel</em>' operation.
	 * @see notebookMM.NotebookMetadata#isPythonKernel()
	 * @generated
	 */
	EOperation getNotebookMetadata__IsPythonKernel();

	/**
	 * Returns the meta object for class '{@link notebookMM.Cell <em>Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cell</em>'.
	 * @see notebookMM.Cell
	 * @generated
	 */
	EClass getCell();

	/**
	 * Returns the meta object for the attribute '{@link notebookMM.Cell#getCellType <em>Cell Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cell Type</em>'.
	 * @see notebookMM.Cell#getCellType()
	 * @see #getCell()
	 * @generated
	 */
	EAttribute getCell_CellType();

	/**
	 * Returns the meta object for the attribute '{@link notebookMM.Cell#getExecutionOrder <em>Execution Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Execution Order</em>'.
	 * @see notebookMM.Cell#getExecutionOrder()
	 * @see #getCell()
	 * @generated
	 */
	EAttribute getCell_ExecutionOrder();

	/**
	 * Returns the meta object for the attribute '{@link notebookMM.Cell#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see notebookMM.Cell#getId()
	 * @see #getCell()
	 * @generated
	 */
	EAttribute getCell_Id();

	/**
	 * Returns the meta object for the '{@link notebookMM.Cell#isEmpty() <em>Is Empty</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Empty</em>' operation.
	 * @see notebookMM.Cell#isEmpty()
	 * @generated
	 */
	EOperation getCell__IsEmpty();

	/**
	 * Returns the meta object for the '{@link notebookMM.Cell#getContentLength() <em>Get Content Length</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Content Length</em>' operation.
	 * @see notebookMM.Cell#getContentLength()
	 * @generated
	 */
	EOperation getCell__GetContentLength();

	/**
	 * Returns the meta object for class '{@link notebookMM.CodeCell <em>Code Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Cell</em>'.
	 * @see notebookMM.CodeCell
	 * @generated
	 */
	EClass getCodeCell();

	/**
	 * Returns the meta object for the attribute '{@link notebookMM.CodeCell#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see notebookMM.CodeCell#getSource()
	 * @see #getCodeCell()
	 * @generated
	 */
	EAttribute getCodeCell_Source();

	/**
	 * Returns the meta object for the attribute list '{@link notebookMM.CodeCell#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Imports</em>'.
	 * @see notebookMM.CodeCell#getImports()
	 * @see #getCodeCell()
	 * @generated
	 */
	EAttribute getCodeCell_Imports();

	/**
	 * Returns the meta object for the attribute list '{@link notebookMM.CodeCell#getConstants <em>Constants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Constants</em>'.
	 * @see notebookMM.CodeCell#getConstants()
	 * @see #getCodeCell()
	 * @generated
	 */
	EAttribute getCodeCell_Constants();

	/**
	 * Returns the meta object for the attribute list '{@link notebookMM.CodeCell#getCommands <em>Commands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Commands</em>'.
	 * @see notebookMM.CodeCell#getCommands()
	 * @see #getCodeCell()
	 * @generated
	 */
	EAttribute getCodeCell_Commands();

	/**
	 * Returns the meta object for the attribute list '{@link notebookMM.CodeCell#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Outputs</em>'.
	 * @see notebookMM.CodeCell#getOutputs()
	 * @see #getCodeCell()
	 * @generated
	 */
	EAttribute getCodeCell_Outputs();

	/**
	 * Returns the meta object for the '{@link notebookMM.CodeCell#extractImports() <em>Extract Imports</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Extract Imports</em>' operation.
	 * @see notebookMM.CodeCell#extractImports()
	 * @generated
	 */
	EOperation getCodeCell__ExtractImports();

	/**
	 * Returns the meta object for the '{@link notebookMM.CodeCell#hasImports() <em>Has Imports</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Imports</em>' operation.
	 * @see notebookMM.CodeCell#hasImports()
	 * @generated
	 */
	EOperation getCodeCell__HasImports();

	/**
	 * Returns the meta object for the '{@link notebookMM.CodeCell#extractConstants() <em>Extract Constants</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Extract Constants</em>' operation.
	 * @see notebookMM.CodeCell#extractConstants()
	 * @generated
	 */
	EOperation getCodeCell__ExtractConstants();

	/**
	 * Returns the meta object for the '{@link notebookMM.CodeCell#hasConstants() <em>Has Constants</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Constants</em>' operation.
	 * @see notebookMM.CodeCell#hasConstants()
	 * @generated
	 */
	EOperation getCodeCell__HasConstants();

	/**
	 * Returns the meta object for the '{@link notebookMM.CodeCell#extractCommands() <em>Extract Commands</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Extract Commands</em>' operation.
	 * @see notebookMM.CodeCell#extractCommands()
	 * @generated
	 */
	EOperation getCodeCell__ExtractCommands();

	/**
	 * Returns the meta object for the '{@link notebookMM.CodeCell#hasCommands() <em>Has Commands</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Has Commands</em>' operation.
	 * @see notebookMM.CodeCell#hasCommands()
	 * @generated
	 */
	EOperation getCodeCell__HasCommands();

	/**
	 * Returns the meta object for the '{@link notebookMM.CodeCell#isTrainingCode() <em>Is Training Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Training Code</em>' operation.
	 * @see notebookMM.CodeCell#isTrainingCode()
	 * @generated
	 */
	EOperation getCodeCell__IsTrainingCode();

	/**
	 * Returns the meta object for the '{@link notebookMM.CodeCell#isDataPreprocessing() <em>Is Data Preprocessing</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Data Preprocessing</em>' operation.
	 * @see notebookMM.CodeCell#isDataPreprocessing()
	 * @generated
	 */
	EOperation getCodeCell__IsDataPreprocessing();

	/**
	 * Returns the meta object for the '{@link notebookMM.CodeCell#isPredictionCode() <em>Is Prediction Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Prediction Code</em>' operation.
	 * @see notebookMM.CodeCell#isPredictionCode()
	 * @generated
	 */
	EOperation getCodeCell__IsPredictionCode();

	/**
	 * Returns the meta object for the '{@link notebookMM.CodeCell#getSourceLines() <em>Get Source Lines</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Source Lines</em>' operation.
	 * @see notebookMM.CodeCell#getSourceLines()
	 * @generated
	 */
	EOperation getCodeCell__GetSourceLines();

	/**
	 * Returns the meta object for the '{@link notebookMM.CodeCell#containsKeyword(java.lang.String) <em>Contains Keyword</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Contains Keyword</em>' operation.
	 * @see notebookMM.CodeCell#containsKeyword(java.lang.String)
	 * @generated
	 */
	EOperation getCodeCell__ContainsKeyword__String();

	/**
	 * Returns the meta object for class '{@link notebookMM.MarkdownCell <em>Markdown Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Markdown Cell</em>'.
	 * @see notebookMM.MarkdownCell
	 * @generated
	 */
	EClass getMarkdownCell();

	/**
	 * Returns the meta object for the attribute '{@link notebookMM.MarkdownCell#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see notebookMM.MarkdownCell#getContent()
	 * @see #getMarkdownCell()
	 * @generated
	 */
	EAttribute getMarkdownCell_Content();

	/**
	 * Returns the meta object for the '{@link notebookMM.MarkdownCell#isHeader() <em>Is Header</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Header</em>' operation.
	 * @see notebookMM.MarkdownCell#isHeader()
	 * @generated
	 */
	EOperation getMarkdownCell__IsHeader();

	/**
	 * Returns the meta object for the '{@link notebookMM.MarkdownCell#getHeaderLevel() <em>Get Header Level</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Header Level</em>' operation.
	 * @see notebookMM.MarkdownCell#getHeaderLevel()
	 * @generated
	 */
	EOperation getMarkdownCell__GetHeaderLevel();

	/**
	 * Returns the meta object for the '{@link notebookMM.MarkdownCell#extractTitle() <em>Extract Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Extract Title</em>' operation.
	 * @see notebookMM.MarkdownCell#extractTitle()
	 * @generated
	 */
	EOperation getMarkdownCell__ExtractTitle();

	/**
	 * Returns the meta object for enum '{@link notebookMM.CellType <em>Cell Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cell Type</em>'.
	 * @see notebookMM.CellType
	 * @generated
	 */
	EEnum getCellType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	NotebookMMFactory getNotebookMMFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link notebookMM.impl.NotebookModelImpl <em>Notebook Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see notebookMM.impl.NotebookModelImpl
		 * @see notebookMM.impl.NotebookMMPackageImpl#getNotebookModel()
		 * @generated
		 */
		EClass NOTEBOOK_MODEL = eINSTANCE.getNotebookModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTEBOOK_MODEL__NAME = eINSTANCE.getNotebookModel_Name();

		/**
		 * The meta object literal for the '<em><b>Cells</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOTEBOOK_MODEL__CELLS = eINSTANCE.getNotebookModel_Cells();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOTEBOOK_MODEL__METADATA = eINSTANCE.getNotebookModel_Metadata();

		/**
		 * The meta object literal for the '<em><b>Get Code Cells</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NOTEBOOK_MODEL___GET_CODE_CELLS = eINSTANCE.getNotebookModel__GetCodeCells();

		/**
		 * The meta object literal for the '<em><b>Get Markdown Cells</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NOTEBOOK_MODEL___GET_MARKDOWN_CELLS = eINSTANCE.getNotebookModel__GetMarkdownCells();

		/**
		 * The meta object literal for the '<em><b>Get All Imports</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NOTEBOOK_MODEL___GET_ALL_IMPORTS = eINSTANCE.getNotebookModel__GetAllImports();

		/**
		 * The meta object literal for the '<em><b>Get Cells By Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NOTEBOOK_MODEL___GET_CELLS_BY_TYPE__CELLTYPE = eINSTANCE
				.getNotebookModel__GetCellsByType__CellType();

		/**
		 * The meta object literal for the '<em><b>Validate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NOTEBOOK_MODEL___VALIDATE = eINSTANCE.getNotebookModel__Validate();

		/**
		 * The meta object literal for the '{@link notebookMM.impl.NotebookMetadataImpl <em>Notebook Metadata</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see notebookMM.impl.NotebookMetadataImpl
		 * @see notebookMM.impl.NotebookMMPackageImpl#getNotebookMetadata()
		 * @generated
		 */
		EClass NOTEBOOK_METADATA = eINSTANCE.getNotebookMetadata();

		/**
		 * The meta object literal for the '<em><b>Kernelspec</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTEBOOK_METADATA__KERNELSPEC = eINSTANCE.getNotebookMetadata_Kernelspec();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTEBOOK_METADATA__LANGUAGE = eINSTANCE.getNotebookMetadata_Language();

		/**
		 * The meta object literal for the '<em><b>Python Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTEBOOK_METADATA__PYTHON_VERSION = eINSTANCE.getNotebookMetadata_PythonVersion();

		/**
		 * The meta object literal for the '<em><b>Nbformat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTEBOOK_METADATA__NBFORMAT = eINSTANCE.getNotebookMetadata_Nbformat();

		/**
		 * The meta object literal for the '<em><b>Nbformat Minor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTEBOOK_METADATA__NBFORMAT_MINOR = eINSTANCE.getNotebookMetadata_NbformatMinor();

		/**
		 * The meta object literal for the '<em><b>Is Python Kernel</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NOTEBOOK_METADATA___IS_PYTHON_KERNEL = eINSTANCE.getNotebookMetadata__IsPythonKernel();

		/**
		 * The meta object literal for the '{@link notebookMM.impl.CellImpl <em>Cell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see notebookMM.impl.CellImpl
		 * @see notebookMM.impl.NotebookMMPackageImpl#getCell()
		 * @generated
		 */
		EClass CELL = eINSTANCE.getCell();

		/**
		 * The meta object literal for the '<em><b>Cell Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CELL__CELL_TYPE = eINSTANCE.getCell_CellType();

		/**
		 * The meta object literal for the '<em><b>Execution Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CELL__EXECUTION_ORDER = eINSTANCE.getCell_ExecutionOrder();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CELL__ID = eINSTANCE.getCell_Id();

		/**
		 * The meta object literal for the '<em><b>Is Empty</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CELL___IS_EMPTY = eINSTANCE.getCell__IsEmpty();

		/**
		 * The meta object literal for the '<em><b>Get Content Length</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CELL___GET_CONTENT_LENGTH = eINSTANCE.getCell__GetContentLength();

		/**
		 * The meta object literal for the '{@link notebookMM.impl.CodeCellImpl <em>Code Cell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see notebookMM.impl.CodeCellImpl
		 * @see notebookMM.impl.NotebookMMPackageImpl#getCodeCell()
		 * @generated
		 */
		EClass CODE_CELL = eINSTANCE.getCodeCell();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE_CELL__SOURCE = eINSTANCE.getCodeCell_Source();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE_CELL__IMPORTS = eINSTANCE.getCodeCell_Imports();

		/**
		 * The meta object literal for the '<em><b>Constants</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE_CELL__CONSTANTS = eINSTANCE.getCodeCell_Constants();

		/**
		 * The meta object literal for the '<em><b>Commands</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE_CELL__COMMANDS = eINSTANCE.getCodeCell_Commands();

		/**
		 * The meta object literal for the '<em><b>Outputs</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE_CELL__OUTPUTS = eINSTANCE.getCodeCell_Outputs();

		/**
		 * The meta object literal for the '<em><b>Extract Imports</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CODE_CELL___EXTRACT_IMPORTS = eINSTANCE.getCodeCell__ExtractImports();

		/**
		 * The meta object literal for the '<em><b>Has Imports</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CODE_CELL___HAS_IMPORTS = eINSTANCE.getCodeCell__HasImports();

		/**
		 * The meta object literal for the '<em><b>Extract Constants</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CODE_CELL___EXTRACT_CONSTANTS = eINSTANCE.getCodeCell__ExtractConstants();

		/**
		 * The meta object literal for the '<em><b>Has Constants</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CODE_CELL___HAS_CONSTANTS = eINSTANCE.getCodeCell__HasConstants();

		/**
		 * The meta object literal for the '<em><b>Extract Commands</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CODE_CELL___EXTRACT_COMMANDS = eINSTANCE.getCodeCell__ExtractCommands();

		/**
		 * The meta object literal for the '<em><b>Has Commands</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CODE_CELL___HAS_COMMANDS = eINSTANCE.getCodeCell__HasCommands();

		/**
		 * The meta object literal for the '<em><b>Is Training Code</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CODE_CELL___IS_TRAINING_CODE = eINSTANCE.getCodeCell__IsTrainingCode();

		/**
		 * The meta object literal for the '<em><b>Is Data Preprocessing</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CODE_CELL___IS_DATA_PREPROCESSING = eINSTANCE.getCodeCell__IsDataPreprocessing();

		/**
		 * The meta object literal for the '<em><b>Is Prediction Code</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CODE_CELL___IS_PREDICTION_CODE = eINSTANCE.getCodeCell__IsPredictionCode();

		/**
		 * The meta object literal for the '<em><b>Get Source Lines</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CODE_CELL___GET_SOURCE_LINES = eINSTANCE.getCodeCell__GetSourceLines();

		/**
		 * The meta object literal for the '<em><b>Contains Keyword</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CODE_CELL___CONTAINS_KEYWORD__STRING = eINSTANCE.getCodeCell__ContainsKeyword__String();

		/**
		 * The meta object literal for the '{@link notebookMM.impl.MarkdownCellImpl <em>Markdown Cell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see notebookMM.impl.MarkdownCellImpl
		 * @see notebookMM.impl.NotebookMMPackageImpl#getMarkdownCell()
		 * @generated
		 */
		EClass MARKDOWN_CELL = eINSTANCE.getMarkdownCell();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MARKDOWN_CELL__CONTENT = eINSTANCE.getMarkdownCell_Content();

		/**
		 * The meta object literal for the '<em><b>Is Header</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MARKDOWN_CELL___IS_HEADER = eINSTANCE.getMarkdownCell__IsHeader();

		/**
		 * The meta object literal for the '<em><b>Get Header Level</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MARKDOWN_CELL___GET_HEADER_LEVEL = eINSTANCE.getMarkdownCell__GetHeaderLevel();

		/**
		 * The meta object literal for the '<em><b>Extract Title</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MARKDOWN_CELL___EXTRACT_TITLE = eINSTANCE.getMarkdownCell__ExtractTitle();

		/**
		 * The meta object literal for the '{@link notebookMM.CellType <em>Cell Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see notebookMM.CellType
		 * @see notebookMM.impl.NotebookMMPackageImpl#getCellType()
		 * @generated
		 */
		EEnum CELL_TYPE = eINSTANCE.getCellType();

	}

} //NotebookMMPackage

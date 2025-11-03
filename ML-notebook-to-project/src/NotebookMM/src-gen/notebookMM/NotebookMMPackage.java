/**
 */
package notebookMM;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
	 * The number of operations of the '<em>Notebook Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTEBOOK_MODEL_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>Nbformat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTEBOOK_METADATA__NBFORMAT = 2;

	/**
	 * The feature id for the '<em><b>Nbformat Minor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTEBOOK_METADATA__NBFORMAT_MINOR = 3;

	/**
	 * The number of structural features of the '<em>Notebook Metadata</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTEBOOK_METADATA_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Notebook Metadata</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTEBOOK_METADATA_OPERATION_COUNT = 0;

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
	 * The number of structural features of the '<em>Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_CELL__SOURCE = CELL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Code Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_CELL_FEATURE_COUNT = CELL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Code Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_CELL_OPERATION_COUNT = CELL_OPERATION_COUNT + 0;

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
	 * The number of operations of the '<em>Markdown Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARKDOWN_CELL_OPERATION_COUNT = CELL_OPERATION_COUNT + 0;

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

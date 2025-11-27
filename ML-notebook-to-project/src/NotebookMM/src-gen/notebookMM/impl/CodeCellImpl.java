/**
 */
package notebookMM.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import notebookMM.CodeCell;
import notebookMM.NotebookMMPackage;
import notebookMM.util.AIClassificationService;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Code
 * Cell</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link notebookMM.impl.CodeCellImpl#getSource <em>Source</em>}</li>
 *   <li>{@link notebookMM.impl.CodeCellImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link notebookMM.impl.CodeCellImpl#getConstants <em>Constants</em>}</li>
 *   <li>{@link notebookMM.impl.CodeCellImpl#getCommands <em>Commands</em>}</li>
 *   <li>{@link notebookMM.impl.CodeCellImpl#getOutputs <em>Outputs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CodeCellImpl extends CellImpl implements CodeCell {
	/**
	 * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_EDEFAULT = null;

	/**
	 * Singleton instance of AI classification service (volatile for thread-safety)
	 */
	private static volatile AIClassificationService aiService = null;

	/**
	 * Cached classification result to avoid redundant API calls
	 */
	private transient AIClassificationService.ClassificationResult cachedClassification = null;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected String source = SOURCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getImports() <em>Imports</em>}' attribute list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getImports()
	 * @generated
	 * @ordered
	 */
	protected EList<String> imports;

	/**
	 * The cached value of the '{@link #getConstants() <em>Constants</em>}' attribute list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getConstants()
	 * @generated
	 * @ordered
	 */
	protected EList<String> constants;

	/**
	 * The cached value of the '{@link #getCommands() <em>Commands</em>}' attribute list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getCommands()
	 * @generated
	 * @ordered
	 */
	protected EList<String> commands;

	/**
	 * The cached value of the '{@link #getOutputs() <em>Outputs</em>}' attribute list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getOutputs()
	 * @generated
	 * @ordered
	 */
	protected EList<String> outputs;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected CodeCellImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NotebookMMPackage.Literals.CODE_CELL;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(String newSource) {
		String oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NotebookMMPackage.CODE_CELL__SOURCE, oldSource,
					source));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getImports() {
		if (imports == null) {
			imports = new EDataTypeUniqueEList<String>(String.class, this, NotebookMMPackage.CODE_CELL__IMPORTS);
		}
		return imports;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getConstants() {
		if (constants == null) {
			constants = new EDataTypeUniqueEList<String>(String.class, this, NotebookMMPackage.CODE_CELL__CONSTANTS);
		}
		return constants;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getCommands() {
		if (commands == null) {
			commands = new EDataTypeUniqueEList<String>(String.class, this, NotebookMMPackage.CODE_CELL__COMMANDS);
		}
		return commands;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getOutputs() {
		if (outputs == null) {
			outputs = new EDataTypeUniqueEList<String>(String.class, this, NotebookMMPackage.CODE_CELL__OUTPUTS);
		}
		return outputs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public EList<String> extractImports() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT

		EList<String> imports = new BasicEList<>();
		if (getSource() == null || getSource().isEmpty()) {
			return imports;
		}

		// Regex patterns for Python imports
		Pattern importPattern = Pattern.compile(
				"^\\s*(import\\s+[\\w.]+(?:\\s+as\\s+\\w+)?|from\\s+[\\w.]+\\s+import\\s+.+)\\s*$", Pattern.MULTILINE);

		Matcher matcher = importPattern.matcher(getSource());
		while (matcher.find()) {
			imports.add(matcher.group(0).trim());
		}

		// Update the imports attribute
		getImports().clear();
		getImports().addAll(imports);

		return imports;

		// throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public boolean hasImports() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT

		return !extractImports().isEmpty();

		// throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public EList<String> extractConstants() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT

		EList<String> constants = new BasicEList<>();
		if (getSource() == null || getSource().isEmpty()) {
			return constants;
		}

		// Regex pattern for Python constant definitions
		// Constants are typically uppercase variable assignments at module level
		Pattern constantPattern = Pattern.compile("^\\s*([A-Z][A-Z0-9_]*)\\s*=\\s*(.+)\\s*$", Pattern.MULTILINE);

		Matcher matcher = constantPattern.matcher(getSource());
		while (matcher.find()) {
			constants.add(matcher.group(0).trim());
		}

		// Update the constants attribute
		getConstants().clear();
		getConstants().addAll(constants);

		return constants;

		// throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public boolean hasConstants() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT

		return !extractConstants().isEmpty();

		// throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public EList<String> extractCommands() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT

		EList<String> commands = new BasicEList<>();
		if (getSource() == null || getSource().isEmpty()) {
			return commands;
		}

		// Extract all non-import, non-constant lines as commands
		String[] lines = getSource().split("\\r?\\n");
		Pattern importPattern = Pattern
				.compile("^\\s*(import\\s+[\\w.]+(?:\\s+as\\s+\\w+)?|from\\s+[\\w.]+\\s+import\\s+.+)\\s*$");
		Pattern constantPattern = Pattern.compile("^\\s*([A-Z][A-Z0-9_]*)\\s*=\\s*(.+)\\s*$");

		for (String line : lines) {
			String trimmedLine = line.trim();
			// Skip empty lines, comments, imports, and constants
			if (!trimmedLine.isEmpty() && !trimmedLine.startsWith("#") && !importPattern.matcher(line).matches()
					&& !constantPattern.matcher(line).matches()) {
				commands.add(line);
			}
		}

		// Update the commands attribute
		getCommands().clear();
		getCommands().addAll(commands);

		return commands;

		// throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public boolean hasCommands() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT

		return !extractCommands().isEmpty();

		// throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public boolean isTrainingCode() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT

		AIClassificationService.ClassificationResult result = getClassification();
		return result.isModelTraining();

		// throw new UnsupportedOperationException();
	}

	/**
	 * Gets or initializes the AI classification service using double-checked
	 * locking
	 */
	private static AIClassificationService getAIService() {
		if (aiService == null) {
			synchronized (CodeCellImpl.class) {
				if (aiService == null) {
					aiService = new AIClassificationService();
				}
			}
		}
		return aiService;
	}

	/**
	 * Gets classification result, using cache if available
	 */
	private AIClassificationService.ClassificationResult getClassification() {
		if (cachedClassification == null) {
			if (getSource() == null || getSource().trim().isEmpty()) {
				cachedClassification = new AIClassificationService.ClassificationResult(false, false, false);
			} else {
				cachedClassification = getAIService().classifyCode(getSource());
			}
		}
		return cachedClassification;
	}

	/**
	 * Invalidates the cached classification (should be called when source changes)
	 */
	private void invalidateCache() {
		cachedClassification = null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public boolean isDataPreprocessing() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT

		AIClassificationService.ClassificationResult result = getClassification();
		return result.isDataPreprocessing();

		// throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public boolean isPredictionCode() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT

		AIClassificationService.ClassificationResult result = getClassification();
		return result.isPrediction();

		// throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public EList<String> getSourceLines() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT

		EList<String> lines = new BasicEList<>();
		if (getSource() != null && !getSource().isEmpty()) {
			String[] lineArray = getSource().split("\\r?\\n");
			for (String line : lineArray) {
				lines.add(line);
			}
		}
		return lines;

		// throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public boolean containsKeyword(String keyword) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT

		if (getSource() == null || keyword == null)
			return false;
		return getSource().toLowerCase().contains(keyword.toLowerCase());

		// throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case NotebookMMPackage.CODE_CELL__SOURCE:
			return getSource();
		case NotebookMMPackage.CODE_CELL__IMPORTS:
			return getImports();
		case NotebookMMPackage.CODE_CELL__CONSTANTS:
			return getConstants();
		case NotebookMMPackage.CODE_CELL__COMMANDS:
			return getCommands();
		case NotebookMMPackage.CODE_CELL__OUTPUTS:
			return getOutputs();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case NotebookMMPackage.CODE_CELL__SOURCE:
			setSource((String) newValue);
			return;
		case NotebookMMPackage.CODE_CELL__IMPORTS:
			getImports().clear();
			getImports().addAll((Collection<? extends String>) newValue);
			return;
		case NotebookMMPackage.CODE_CELL__CONSTANTS:
			getConstants().clear();
			getConstants().addAll((Collection<? extends String>) newValue);
			return;
		case NotebookMMPackage.CODE_CELL__COMMANDS:
			getCommands().clear();
			getCommands().addAll((Collection<? extends String>) newValue);
			return;
		case NotebookMMPackage.CODE_CELL__OUTPUTS:
			getOutputs().clear();
			getOutputs().addAll((Collection<? extends String>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case NotebookMMPackage.CODE_CELL__SOURCE:
			setSource(SOURCE_EDEFAULT);
			return;
		case NotebookMMPackage.CODE_CELL__IMPORTS:
			getImports().clear();
			return;
		case NotebookMMPackage.CODE_CELL__CONSTANTS:
			getConstants().clear();
			return;
		case NotebookMMPackage.CODE_CELL__COMMANDS:
			getCommands().clear();
			return;
		case NotebookMMPackage.CODE_CELL__OUTPUTS:
			getOutputs().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case NotebookMMPackage.CODE_CELL__SOURCE:
			return SOURCE_EDEFAULT == null ? source != null : !SOURCE_EDEFAULT.equals(source);
		case NotebookMMPackage.CODE_CELL__IMPORTS:
			return imports != null && !imports.isEmpty();
		case NotebookMMPackage.CODE_CELL__CONSTANTS:
			return constants != null && !constants.isEmpty();
		case NotebookMMPackage.CODE_CELL__COMMANDS:
			return commands != null && !commands.isEmpty();
		case NotebookMMPackage.CODE_CELL__OUTPUTS:
			return outputs != null && !outputs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case NotebookMMPackage.CODE_CELL___EXTRACT_IMPORTS:
			return extractImports();
		case NotebookMMPackage.CODE_CELL___HAS_IMPORTS:
			return hasImports();
		case NotebookMMPackage.CODE_CELL___EXTRACT_CONSTANTS:
			return extractConstants();
		case NotebookMMPackage.CODE_CELL___HAS_CONSTANTS:
			return hasConstants();
		case NotebookMMPackage.CODE_CELL___EXTRACT_COMMANDS:
			return extractCommands();
		case NotebookMMPackage.CODE_CELL___HAS_COMMANDS:
			return hasCommands();
		case NotebookMMPackage.CODE_CELL___IS_TRAINING_CODE:
			return isTrainingCode();
		case NotebookMMPackage.CODE_CELL___IS_DATA_PREPROCESSING:
			return isDataPreprocessing();
		case NotebookMMPackage.CODE_CELL___IS_PREDICTION_CODE:
			return isPredictionCode();
		case NotebookMMPackage.CODE_CELL___GET_SOURCE_LINES:
			return getSourceLines();
		case NotebookMMPackage.CODE_CELL___CONTAINS_KEYWORD__STRING:
			return containsKeyword((String) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (source: ");
		result.append(source);
		result.append(", imports: ");
		result.append(imports);
		result.append(", constants: ");
		result.append(constants);
		result.append(", commands: ");
		result.append(commands);
		result.append(", outputs: ");
		result.append(outputs);
		result.append(')');
		return result.toString();
	}

} // CodeCellImpl

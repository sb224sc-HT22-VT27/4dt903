/**
 */
package olympics;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medalable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link olympics.Medalable#getName <em>Name</em>}</li>
 *   <li>{@link olympics.Medalable#getWinnerOf <em>Winner Of</em>}</li>
 * </ul>
 *
 * @see olympics.OlympicsPackage#getMedalable()
 * @model abstract="true"
 * @generated
 */
public interface Medalable extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see olympics.OlympicsPackage#getMedalable_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link olympics.Medalable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Winner Of</b></em>' reference list.
	 * The list contents are of type {@link olympics.Event}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Winner Of</em>' reference list.
	 * @see olympics.OlympicsPackage#getMedalable_WinnerOf()
	 * @model
	 * @generated
	 */
	EList<Event> getWinnerOf();

} // Medalable

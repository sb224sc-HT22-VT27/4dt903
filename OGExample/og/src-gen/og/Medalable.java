/**
 */
package og;

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
 *   <li>{@link og.Medalable#getName <em>Name</em>}</li>
 *   <li>{@link og.Medalable#getWinnerOf <em>Winner Of</em>}</li>
 * </ul>
 *
 * @see og.OgPackage#getMedalable()
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
	 * @see og.OgPackage#getMedalable_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link og.Medalable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Winner Of</b></em>' reference list.
	 * The list contents are of type {@link og.Event}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Winner Of</em>' reference list.
	 * @see og.OgPackage#getMedalable_WinnerOf()
	 * @model
	 * @generated
	 */
	EList<Event> getWinnerOf();

} // Medalable

/**
 */
package og;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Og</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link og.Og#getName <em>Name</em>}</li>
 *   <li>{@link og.Og#getDisciplines <em>Disciplines</em>}</li>
 *   <li>{@link og.Og#getInvitedCommittees <em>Invited Committees</em>}</li>
 * </ul>
 *
 * @see og.OgPackage#getOg()
 * @model
 * @generated
 */
public interface Og extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see og.OgPackage#getOg_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link og.Og#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Disciplines</b></em>' containment reference list.
	 * The list contents are of type {@link og.Discipline}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disciplines</em>' containment reference list.
	 * @see og.OgPackage#getOg_Disciplines()
	 * @model containment="true"
	 * @generated
	 */
	EList<Discipline> getDisciplines();

	/**
	 * Returns the value of the '<em><b>Invited Committees</b></em>' containment reference list.
	 * The list contents are of type {@link og.InvitedCommittee}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invited Committees</em>' containment reference list.
	 * @see og.OgPackage#getOg_InvitedCommittees()
	 * @model containment="true"
	 * @generated
	 */
	EList<InvitedCommittee> getInvitedCommittees();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addCommittee(InvitedCommittee theCommittee);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addDiscipline(Discipline theDiscipline);

} // Og

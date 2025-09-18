/**
 */
package olympics;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Olympic Games</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link olympics.OlympicGames#getName <em>Name</em>}</li>
 *   <li>{@link olympics.OlympicGames#getInvitedcommittees <em>Invitedcommittees</em>}</li>
 *   <li>{@link olympics.OlympicGames#getDisciplines <em>Disciplines</em>}</li>
 * </ul>
 *
 * @see olympics.OlympicsPackage#getOlympicGames()
 * @model
 * @generated
 */
public interface OlympicGames extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see olympics.OlympicsPackage#getOlympicGames_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link olympics.OlympicGames#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Invitedcommittees</b></em>' containment reference list.
	 * The list contents are of type {@link olympics.InvitedCommittee}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invitedcommittees</em>' containment reference list.
	 * @see olympics.OlympicsPackage#getOlympicGames_Invitedcommittees()
	 * @model containment="true"
	 * @generated
	 */
	EList<InvitedCommittee> getInvitedcommittees();

	/**
	 * Returns the value of the '<em><b>Disciplines</b></em>' containment reference list.
	 * The list contents are of type {@link olympics.Discipline}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disciplines</em>' containment reference list.
	 * @see olympics.OlympicsPackage#getOlympicGames_Disciplines()
	 * @model containment="true"
	 * @generated
	 */
	EList<Discipline> getDisciplines();

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

} // OlympicGames

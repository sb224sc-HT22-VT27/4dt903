/**
 */
package og;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see og.OgFactory
 * @model kind="package"
 * @generated
 */
public interface OgPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "og";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.sb224sc.org/og";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "og";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OgPackage eINSTANCE = og.impl.OgPackageImpl.init();

	/**
	 * The meta object id for the '{@link og.impl.OgImpl <em>Og</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see og.impl.OgImpl
	 * @see og.impl.OgPackageImpl#getOg()
	 * @generated
	 */
	int OG = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OG__NAME = 0;

	/**
	 * The feature id for the '<em><b>Disciplines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OG__DISCIPLINES = 1;

	/**
	 * The feature id for the '<em><b>Invited Committees</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OG__INVITED_COMMITTEES = 2;

	/**
	 * The number of structural features of the '<em>Og</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OG_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Add Committee</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OG___ADD_COMMITTEE__INVITEDCOMMITTEE = 0;

	/**
	 * The operation id for the '<em>Add Discipline</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OG___ADD_DISCIPLINE__DISCIPLINE = 1;

	/**
	 * The number of operations of the '<em>Og</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OG_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link og.impl.DisciplineImpl <em>Discipline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see og.impl.DisciplineImpl
	 * @see og.impl.OgPackageImpl#getDiscipline()
	 * @generated
	 */
	int DISCIPLINE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINE__EVENTS = 1;

	/**
	 * The number of structural features of the '<em>Discipline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINE_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Add Event</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINE___ADD_EVENT__EVENT = 0;

	/**
	 * The number of operations of the '<em>Discipline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCIPLINE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link og.impl.InvitedCommitteeImpl <em>Invited Committee</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see og.impl.InvitedCommitteeImpl
	 * @see og.impl.OgPackageImpl#getInvitedCommittee()
	 * @generated
	 */
	int INVITED_COMMITTEE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVITED_COMMITTEE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Path To Flag Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVITED_COMMITTEE__PATH_TO_FLAG_IMAGE = 1;

	/**
	 * The feature id for the '<em><b>Number Of Gold Medals</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVITED_COMMITTEE__NUMBER_OF_GOLD_MEDALS = 2;

	/**
	 * The feature id for the '<em><b>Team</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVITED_COMMITTEE__TEAM = 3;

	/**
	 * The feature id for the '<em><b>Athletes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVITED_COMMITTEE__ATHLETES = 4;

	/**
	 * The number of structural features of the '<em>Invited Committee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVITED_COMMITTEE_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Add Team</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVITED_COMMITTEE___ADD_TEAM__TEAM = 0;

	/**
	 * The operation id for the '<em>Add Athlete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVITED_COMMITTEE___ADD_ATHLETE__ATHLETE = 1;

	/**
	 * The number of operations of the '<em>Invited Committee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVITED_COMMITTEE_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link og.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see og.impl.EventImpl
	 * @see og.impl.OgPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Add Participant</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___ADD_PARTICIPANT__MEDALABLE = 0;

	/**
	 * The operation id for the '<em>Get Participants</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT___GET_PARTICIPANTS = 1;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link og.impl.TeamEventImpl <em>Team Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see og.impl.TeamEventImpl
	 * @see og.impl.OgPackageImpl#getTeamEvent()
	 * @generated
	 */
	int TEAM_EVENT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_EVENT__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Gold Medal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_EVENT__GOLD_MEDAL = EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Silver Medal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_EVENT__SILVER_MEDAL = EVENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Bronze Medal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_EVENT__BRONZE_MEDAL = EVENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Participants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_EVENT__PARTICIPANTS = EVENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Team Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Add Participant</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_EVENT___ADD_PARTICIPANT__MEDALABLE = EVENT___ADD_PARTICIPANT__MEDALABLE;

	/**
	 * The operation id for the '<em>Get Participants</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_EVENT___GET_PARTICIPANTS = EVENT___GET_PARTICIPANTS;

	/**
	 * The operation id for the '<em>Set Gold</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_EVENT___SET_GOLD__TEAM = EVENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Silver</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_EVENT___SET_SILVER__TEAM = EVENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Set Bronze</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_EVENT___SET_BRONZE__TEAM = EVENT_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Team Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link og.impl.IndividualEventImpl <em>Individual Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see og.impl.IndividualEventImpl
	 * @see og.impl.OgPackageImpl#getIndividualEvent()
	 * @generated
	 */
	int INDIVIDUAL_EVENT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_EVENT__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Participants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_EVENT__PARTICIPANTS = EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Gold Medal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_EVENT__GOLD_MEDAL = EVENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Silver Medal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_EVENT__SILVER_MEDAL = EVENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Bronze Medal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_EVENT__BRONZE_MEDAL = EVENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Individual Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Add Participant</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_EVENT___ADD_PARTICIPANT__MEDALABLE = EVENT___ADD_PARTICIPANT__MEDALABLE;

	/**
	 * The operation id for the '<em>Get Participants</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_EVENT___GET_PARTICIPANTS = EVENT___GET_PARTICIPANTS;

	/**
	 * The operation id for the '<em>Set Bronze</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_EVENT___SET_BRONZE__ATHLETE = EVENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set Silver</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_EVENT___SET_SILVER__ATHLETE = EVENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Set Gold</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_EVENT___SET_GOLD__ATHLETE = EVENT_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Individual Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link og.impl.MedalableImpl <em>Medalable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see og.impl.MedalableImpl
	 * @see og.impl.OgPackageImpl#getMedalable()
	 * @generated
	 */
	int MEDALABLE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDALABLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Winner Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDALABLE__WINNER_OF = 1;

	/**
	 * The number of structural features of the '<em>Medalable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDALABLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Medalable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDALABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link og.impl.AthleteImpl <em>Athlete</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see og.impl.AthleteImpl
	 * @see og.impl.OgPackageImpl#getAthlete()
	 * @generated
	 */
	int ATHLETE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATHLETE__NAME = MEDALABLE__NAME;

	/**
	 * The feature id for the '<em><b>Winner Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATHLETE__WINNER_OF = MEDALABLE__WINNER_OF;

	/**
	 * The feature id for the '<em><b>Invited Committee</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATHLETE__INVITED_COMMITTEE = MEDALABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATHLETE__AGE = MEDALABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATHLETE__WEIGHT = MEDALABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Team Membership</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATHLETE__TEAM_MEMBERSHIP = MEDALABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Athlete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATHLETE_FEATURE_COUNT = MEDALABLE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Invited Committe</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATHLETE___GET_INVITED_COMMITTE = MEDALABLE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Athlete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATHLETE_OPERATION_COUNT = MEDALABLE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link og.impl.TeamImpl <em>Team</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see og.impl.TeamImpl
	 * @see og.impl.OgPackageImpl#getTeam()
	 * @generated
	 */
	int TEAM = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__NAME = MEDALABLE__NAME;

	/**
	 * The feature id for the '<em><b>Winner Of</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__WINNER_OF = MEDALABLE__WINNER_OF;

	/**
	 * The feature id for the '<em><b>Team Members</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__TEAM_MEMBERS = MEDALABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Team</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_FEATURE_COUNT = MEDALABLE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Add Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM___ADD_MEMBER__ATHLETE = MEDALABLE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Invited Committe</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM___GET_INVITED_COMMITTE = MEDALABLE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Team</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_OPERATION_COUNT = MEDALABLE_OPERATION_COUNT + 2;

	/**
	 * Returns the meta object for class '{@link og.Og <em>Og</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Og</em>'.
	 * @see og.Og
	 * @generated
	 */
	EClass getOg();

	/**
	 * Returns the meta object for the attribute '{@link og.Og#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see og.Og#getName()
	 * @see #getOg()
	 * @generated
	 */
	EAttribute getOg_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link og.Og#getDisciplines <em>Disciplines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Disciplines</em>'.
	 * @see og.Og#getDisciplines()
	 * @see #getOg()
	 * @generated
	 */
	EReference getOg_Disciplines();

	/**
	 * Returns the meta object for the containment reference list '{@link og.Og#getInvitedCommittees <em>Invited Committees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Invited Committees</em>'.
	 * @see og.Og#getInvitedCommittees()
	 * @see #getOg()
	 * @generated
	 */
	EReference getOg_InvitedCommittees();

	/**
	 * Returns the meta object for the '{@link og.Og#addCommittee(og.InvitedCommittee) <em>Add Committee</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Committee</em>' operation.
	 * @see og.Og#addCommittee(og.InvitedCommittee)
	 * @generated
	 */
	EOperation getOg__AddCommittee__InvitedCommittee();

	/**
	 * Returns the meta object for the '{@link og.Og#addDiscipline(og.Discipline) <em>Add Discipline</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Discipline</em>' operation.
	 * @see og.Og#addDiscipline(og.Discipline)
	 * @generated
	 */
	EOperation getOg__AddDiscipline__Discipline();

	/**
	 * Returns the meta object for class '{@link og.Discipline <em>Discipline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discipline</em>'.
	 * @see og.Discipline
	 * @generated
	 */
	EClass getDiscipline();

	/**
	 * Returns the meta object for the attribute '{@link og.Discipline#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see og.Discipline#getName()
	 * @see #getDiscipline()
	 * @generated
	 */
	EAttribute getDiscipline_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link og.Discipline#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Events</em>'.
	 * @see og.Discipline#getEvents()
	 * @see #getDiscipline()
	 * @generated
	 */
	EReference getDiscipline_Events();

	/**
	 * Returns the meta object for the '{@link og.Discipline#addEvent(og.Event) <em>Add Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Event</em>' operation.
	 * @see og.Discipline#addEvent(og.Event)
	 * @generated
	 */
	EOperation getDiscipline__AddEvent__Event();

	/**
	 * Returns the meta object for class '{@link og.InvitedCommittee <em>Invited Committee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invited Committee</em>'.
	 * @see og.InvitedCommittee
	 * @generated
	 */
	EClass getInvitedCommittee();

	/**
	 * Returns the meta object for the attribute '{@link og.InvitedCommittee#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see og.InvitedCommittee#getName()
	 * @see #getInvitedCommittee()
	 * @generated
	 */
	EAttribute getInvitedCommittee_Name();

	/**
	 * Returns the meta object for the attribute '{@link og.InvitedCommittee#getPathToFlagImage <em>Path To Flag Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path To Flag Image</em>'.
	 * @see og.InvitedCommittee#getPathToFlagImage()
	 * @see #getInvitedCommittee()
	 * @generated
	 */
	EAttribute getInvitedCommittee_PathToFlagImage();

	/**
	 * Returns the meta object for the attribute '{@link og.InvitedCommittee#getNumberOfGoldMedals <em>Number Of Gold Medals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Gold Medals</em>'.
	 * @see og.InvitedCommittee#getNumberOfGoldMedals()
	 * @see #getInvitedCommittee()
	 * @generated
	 */
	EAttribute getInvitedCommittee_NumberOfGoldMedals();

	/**
	 * Returns the meta object for the containment reference list '{@link og.InvitedCommittee#getTeam <em>Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Team</em>'.
	 * @see og.InvitedCommittee#getTeam()
	 * @see #getInvitedCommittee()
	 * @generated
	 */
	EReference getInvitedCommittee_Team();

	/**
	 * Returns the meta object for the containment reference list '{@link og.InvitedCommittee#getAthletes <em>Athletes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Athletes</em>'.
	 * @see og.InvitedCommittee#getAthletes()
	 * @see #getInvitedCommittee()
	 * @generated
	 */
	EReference getInvitedCommittee_Athletes();

	/**
	 * Returns the meta object for the '{@link og.InvitedCommittee#addTeam(og.Team) <em>Add Team</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Team</em>' operation.
	 * @see og.InvitedCommittee#addTeam(og.Team)
	 * @generated
	 */
	EOperation getInvitedCommittee__AddTeam__Team();

	/**
	 * Returns the meta object for the '{@link og.InvitedCommittee#addAthlete(og.Athlete) <em>Add Athlete</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Athlete</em>' operation.
	 * @see og.InvitedCommittee#addAthlete(og.Athlete)
	 * @generated
	 */
	EOperation getInvitedCommittee__AddAthlete__Athlete();

	/**
	 * Returns the meta object for class '{@link og.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see og.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the attribute '{@link og.Event#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see og.Event#getName()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Name();

	/**
	 * Returns the meta object for the '{@link og.Event#addParticipant(og.Medalable) <em>Add Participant</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Participant</em>' operation.
	 * @see og.Event#addParticipant(og.Medalable)
	 * @generated
	 */
	EOperation getEvent__AddParticipant__Medalable();

	/**
	 * Returns the meta object for the '{@link og.Event#getParticipants() <em>Get Participants</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Participants</em>' operation.
	 * @see og.Event#getParticipants()
	 * @generated
	 */
	EOperation getEvent__GetParticipants();

	/**
	 * Returns the meta object for class '{@link og.TeamEvent <em>Team Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Team Event</em>'.
	 * @see og.TeamEvent
	 * @generated
	 */
	EClass getTeamEvent();

	/**
	 * Returns the meta object for the reference '{@link og.TeamEvent#getGoldMedal <em>Gold Medal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gold Medal</em>'.
	 * @see og.TeamEvent#getGoldMedal()
	 * @see #getTeamEvent()
	 * @generated
	 */
	EReference getTeamEvent_GoldMedal();

	/**
	 * Returns the meta object for the reference '{@link og.TeamEvent#getSilverMedal <em>Silver Medal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Silver Medal</em>'.
	 * @see og.TeamEvent#getSilverMedal()
	 * @see #getTeamEvent()
	 * @generated
	 */
	EReference getTeamEvent_SilverMedal();

	/**
	 * Returns the meta object for the reference '{@link og.TeamEvent#getBronzeMedal <em>Bronze Medal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bronze Medal</em>'.
	 * @see og.TeamEvent#getBronzeMedal()
	 * @see #getTeamEvent()
	 * @generated
	 */
	EReference getTeamEvent_BronzeMedal();

	/**
	 * Returns the meta object for the reference list '{@link og.TeamEvent#getParticipants <em>Participants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Participants</em>'.
	 * @see og.TeamEvent#getParticipants()
	 * @see #getTeamEvent()
	 * @generated
	 */
	EReference getTeamEvent_Participants();

	/**
	 * Returns the meta object for the '{@link og.TeamEvent#setGold(og.Team) <em>Set Gold</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Gold</em>' operation.
	 * @see og.TeamEvent#setGold(og.Team)
	 * @generated
	 */
	EOperation getTeamEvent__SetGold__Team();

	/**
	 * Returns the meta object for the '{@link og.TeamEvent#setSilver(og.Team) <em>Set Silver</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Silver</em>' operation.
	 * @see og.TeamEvent#setSilver(og.Team)
	 * @generated
	 */
	EOperation getTeamEvent__SetSilver__Team();

	/**
	 * Returns the meta object for the '{@link og.TeamEvent#setBronze(og.Team) <em>Set Bronze</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Bronze</em>' operation.
	 * @see og.TeamEvent#setBronze(og.Team)
	 * @generated
	 */
	EOperation getTeamEvent__SetBronze__Team();

	/**
	 * Returns the meta object for class '{@link og.IndividualEvent <em>Individual Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Individual Event</em>'.
	 * @see og.IndividualEvent
	 * @generated
	 */
	EClass getIndividualEvent();

	/**
	 * Returns the meta object for the reference list '{@link og.IndividualEvent#getParticipants <em>Participants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Participants</em>'.
	 * @see og.IndividualEvent#getParticipants()
	 * @see #getIndividualEvent()
	 * @generated
	 */
	EReference getIndividualEvent_Participants();

	/**
	 * Returns the meta object for the reference '{@link og.IndividualEvent#getGoldMedal <em>Gold Medal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gold Medal</em>'.
	 * @see og.IndividualEvent#getGoldMedal()
	 * @see #getIndividualEvent()
	 * @generated
	 */
	EReference getIndividualEvent_GoldMedal();

	/**
	 * Returns the meta object for the reference '{@link og.IndividualEvent#getSilverMedal <em>Silver Medal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Silver Medal</em>'.
	 * @see og.IndividualEvent#getSilverMedal()
	 * @see #getIndividualEvent()
	 * @generated
	 */
	EReference getIndividualEvent_SilverMedal();

	/**
	 * Returns the meta object for the reference '{@link og.IndividualEvent#getBronzeMedal <em>Bronze Medal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bronze Medal</em>'.
	 * @see og.IndividualEvent#getBronzeMedal()
	 * @see #getIndividualEvent()
	 * @generated
	 */
	EReference getIndividualEvent_BronzeMedal();

	/**
	 * Returns the meta object for the '{@link og.IndividualEvent#setBronze(og.Athlete) <em>Set Bronze</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Bronze</em>' operation.
	 * @see og.IndividualEvent#setBronze(og.Athlete)
	 * @generated
	 */
	EOperation getIndividualEvent__SetBronze__Athlete();

	/**
	 * Returns the meta object for the '{@link og.IndividualEvent#setSilver(og.Athlete) <em>Set Silver</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Silver</em>' operation.
	 * @see og.IndividualEvent#setSilver(og.Athlete)
	 * @generated
	 */
	EOperation getIndividualEvent__SetSilver__Athlete();

	/**
	 * Returns the meta object for the '{@link og.IndividualEvent#setGold(og.Athlete) <em>Set Gold</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Gold</em>' operation.
	 * @see og.IndividualEvent#setGold(og.Athlete)
	 * @generated
	 */
	EOperation getIndividualEvent__SetGold__Athlete();

	/**
	 * Returns the meta object for class '{@link og.Athlete <em>Athlete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Athlete</em>'.
	 * @see og.Athlete
	 * @generated
	 */
	EClass getAthlete();

	/**
	 * Returns the meta object for the container reference '{@link og.Athlete#getInvitedCommittee <em>Invited Committee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Invited Committee</em>'.
	 * @see og.Athlete#getInvitedCommittee()
	 * @see #getAthlete()
	 * @generated
	 */
	EReference getAthlete_InvitedCommittee();

	/**
	 * Returns the meta object for the attribute '{@link og.Athlete#getAge <em>Age</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Age</em>'.
	 * @see og.Athlete#getAge()
	 * @see #getAthlete()
	 * @generated
	 */
	EAttribute getAthlete_Age();

	/**
	 * Returns the meta object for the attribute '{@link og.Athlete#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see og.Athlete#getWeight()
	 * @see #getAthlete()
	 * @generated
	 */
	EAttribute getAthlete_Weight();

	/**
	 * Returns the meta object for the reference list '{@link og.Athlete#getTeamMembership <em>Team Membership</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Team Membership</em>'.
	 * @see og.Athlete#getTeamMembership()
	 * @see #getAthlete()
	 * @generated
	 */
	EReference getAthlete_TeamMembership();

	/**
	 * Returns the meta object for the '{@link og.Athlete#getInvitedCommitte() <em>Get Invited Committe</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Invited Committe</em>' operation.
	 * @see og.Athlete#getInvitedCommitte()
	 * @generated
	 */
	EOperation getAthlete__GetInvitedCommitte();

	/**
	 * Returns the meta object for class '{@link og.Team <em>Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Team</em>'.
	 * @see og.Team
	 * @generated
	 */
	EClass getTeam();

	/**
	 * Returns the meta object for the reference list '{@link og.Team#getTeamMembers <em>Team Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Team Members</em>'.
	 * @see og.Team#getTeamMembers()
	 * @see #getTeam()
	 * @generated
	 */
	EReference getTeam_TeamMembers();

	/**
	 * Returns the meta object for the '{@link og.Team#addMember(og.Athlete) <em>Add Member</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Member</em>' operation.
	 * @see og.Team#addMember(og.Athlete)
	 * @generated
	 */
	EOperation getTeam__AddMember__Athlete();

	/**
	 * Returns the meta object for the '{@link og.Team#getInvitedCommitte() <em>Get Invited Committe</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Invited Committe</em>' operation.
	 * @see og.Team#getInvitedCommitte()
	 * @generated
	 */
	EOperation getTeam__GetInvitedCommitte();

	/**
	 * Returns the meta object for class '{@link og.Medalable <em>Medalable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Medalable</em>'.
	 * @see og.Medalable
	 * @generated
	 */
	EClass getMedalable();

	/**
	 * Returns the meta object for the attribute '{@link og.Medalable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see og.Medalable#getName()
	 * @see #getMedalable()
	 * @generated
	 */
	EAttribute getMedalable_Name();

	/**
	 * Returns the meta object for the reference list '{@link og.Medalable#getWinnerOf <em>Winner Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Winner Of</em>'.
	 * @see og.Medalable#getWinnerOf()
	 * @see #getMedalable()
	 * @generated
	 */
	EReference getMedalable_WinnerOf();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OgFactory getOgFactory();

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
		 * The meta object literal for the '{@link og.impl.OgImpl <em>Og</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see og.impl.OgImpl
		 * @see og.impl.OgPackageImpl#getOg()
		 * @generated
		 */
		EClass OG = eINSTANCE.getOg();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OG__NAME = eINSTANCE.getOg_Name();

		/**
		 * The meta object literal for the '<em><b>Disciplines</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OG__DISCIPLINES = eINSTANCE.getOg_Disciplines();

		/**
		 * The meta object literal for the '<em><b>Invited Committees</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OG__INVITED_COMMITTEES = eINSTANCE.getOg_InvitedCommittees();

		/**
		 * The meta object literal for the '<em><b>Add Committee</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OG___ADD_COMMITTEE__INVITEDCOMMITTEE = eINSTANCE.getOg__AddCommittee__InvitedCommittee();

		/**
		 * The meta object literal for the '<em><b>Add Discipline</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OG___ADD_DISCIPLINE__DISCIPLINE = eINSTANCE.getOg__AddDiscipline__Discipline();

		/**
		 * The meta object literal for the '{@link og.impl.DisciplineImpl <em>Discipline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see og.impl.DisciplineImpl
		 * @see og.impl.OgPackageImpl#getDiscipline()
		 * @generated
		 */
		EClass DISCIPLINE = eINSTANCE.getDiscipline();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DISCIPLINE__NAME = eINSTANCE.getDiscipline_Name();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISCIPLINE__EVENTS = eINSTANCE.getDiscipline_Events();

		/**
		 * The meta object literal for the '<em><b>Add Event</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DISCIPLINE___ADD_EVENT__EVENT = eINSTANCE.getDiscipline__AddEvent__Event();

		/**
		 * The meta object literal for the '{@link og.impl.InvitedCommitteeImpl <em>Invited Committee</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see og.impl.InvitedCommitteeImpl
		 * @see og.impl.OgPackageImpl#getInvitedCommittee()
		 * @generated
		 */
		EClass INVITED_COMMITTEE = eINSTANCE.getInvitedCommittee();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVITED_COMMITTEE__NAME = eINSTANCE.getInvitedCommittee_Name();

		/**
		 * The meta object literal for the '<em><b>Path To Flag Image</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVITED_COMMITTEE__PATH_TO_FLAG_IMAGE = eINSTANCE.getInvitedCommittee_PathToFlagImage();

		/**
		 * The meta object literal for the '<em><b>Number Of Gold Medals</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVITED_COMMITTEE__NUMBER_OF_GOLD_MEDALS = eINSTANCE.getInvitedCommittee_NumberOfGoldMedals();

		/**
		 * The meta object literal for the '<em><b>Team</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVITED_COMMITTEE__TEAM = eINSTANCE.getInvitedCommittee_Team();

		/**
		 * The meta object literal for the '<em><b>Athletes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVITED_COMMITTEE__ATHLETES = eINSTANCE.getInvitedCommittee_Athletes();

		/**
		 * The meta object literal for the '<em><b>Add Team</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INVITED_COMMITTEE___ADD_TEAM__TEAM = eINSTANCE.getInvitedCommittee__AddTeam__Team();

		/**
		 * The meta object literal for the '<em><b>Add Athlete</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INVITED_COMMITTEE___ADD_ATHLETE__ATHLETE = eINSTANCE.getInvitedCommittee__AddAthlete__Athlete();

		/**
		 * The meta object literal for the '{@link og.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see og.impl.EventImpl
		 * @see og.impl.OgPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__NAME = eINSTANCE.getEvent_Name();

		/**
		 * The meta object literal for the '<em><b>Add Participant</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EVENT___ADD_PARTICIPANT__MEDALABLE = eINSTANCE.getEvent__AddParticipant__Medalable();

		/**
		 * The meta object literal for the '<em><b>Get Participants</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation EVENT___GET_PARTICIPANTS = eINSTANCE.getEvent__GetParticipants();

		/**
		 * The meta object literal for the '{@link og.impl.TeamEventImpl <em>Team Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see og.impl.TeamEventImpl
		 * @see og.impl.OgPackageImpl#getTeamEvent()
		 * @generated
		 */
		EClass TEAM_EVENT = eINSTANCE.getTeamEvent();

		/**
		 * The meta object literal for the '<em><b>Gold Medal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEAM_EVENT__GOLD_MEDAL = eINSTANCE.getTeamEvent_GoldMedal();

		/**
		 * The meta object literal for the '<em><b>Silver Medal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEAM_EVENT__SILVER_MEDAL = eINSTANCE.getTeamEvent_SilverMedal();

		/**
		 * The meta object literal for the '<em><b>Bronze Medal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEAM_EVENT__BRONZE_MEDAL = eINSTANCE.getTeamEvent_BronzeMedal();

		/**
		 * The meta object literal for the '<em><b>Participants</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEAM_EVENT__PARTICIPANTS = eINSTANCE.getTeamEvent_Participants();

		/**
		 * The meta object literal for the '<em><b>Set Gold</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TEAM_EVENT___SET_GOLD__TEAM = eINSTANCE.getTeamEvent__SetGold__Team();

		/**
		 * The meta object literal for the '<em><b>Set Silver</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TEAM_EVENT___SET_SILVER__TEAM = eINSTANCE.getTeamEvent__SetSilver__Team();

		/**
		 * The meta object literal for the '<em><b>Set Bronze</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TEAM_EVENT___SET_BRONZE__TEAM = eINSTANCE.getTeamEvent__SetBronze__Team();

		/**
		 * The meta object literal for the '{@link og.impl.IndividualEventImpl <em>Individual Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see og.impl.IndividualEventImpl
		 * @see og.impl.OgPackageImpl#getIndividualEvent()
		 * @generated
		 */
		EClass INDIVIDUAL_EVENT = eINSTANCE.getIndividualEvent();

		/**
		 * The meta object literal for the '<em><b>Participants</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDIVIDUAL_EVENT__PARTICIPANTS = eINSTANCE.getIndividualEvent_Participants();

		/**
		 * The meta object literal for the '<em><b>Gold Medal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDIVIDUAL_EVENT__GOLD_MEDAL = eINSTANCE.getIndividualEvent_GoldMedal();

		/**
		 * The meta object literal for the '<em><b>Silver Medal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDIVIDUAL_EVENT__SILVER_MEDAL = eINSTANCE.getIndividualEvent_SilverMedal();

		/**
		 * The meta object literal for the '<em><b>Bronze Medal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDIVIDUAL_EVENT__BRONZE_MEDAL = eINSTANCE.getIndividualEvent_BronzeMedal();

		/**
		 * The meta object literal for the '<em><b>Set Bronze</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INDIVIDUAL_EVENT___SET_BRONZE__ATHLETE = eINSTANCE.getIndividualEvent__SetBronze__Athlete();

		/**
		 * The meta object literal for the '<em><b>Set Silver</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INDIVIDUAL_EVENT___SET_SILVER__ATHLETE = eINSTANCE.getIndividualEvent__SetSilver__Athlete();

		/**
		 * The meta object literal for the '<em><b>Set Gold</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation INDIVIDUAL_EVENT___SET_GOLD__ATHLETE = eINSTANCE.getIndividualEvent__SetGold__Athlete();

		/**
		 * The meta object literal for the '{@link og.impl.AthleteImpl <em>Athlete</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see og.impl.AthleteImpl
		 * @see og.impl.OgPackageImpl#getAthlete()
		 * @generated
		 */
		EClass ATHLETE = eINSTANCE.getAthlete();

		/**
		 * The meta object literal for the '<em><b>Invited Committee</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATHLETE__INVITED_COMMITTEE = eINSTANCE.getAthlete_InvitedCommittee();

		/**
		 * The meta object literal for the '<em><b>Age</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATHLETE__AGE = eINSTANCE.getAthlete_Age();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATHLETE__WEIGHT = eINSTANCE.getAthlete_Weight();

		/**
		 * The meta object literal for the '<em><b>Team Membership</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATHLETE__TEAM_MEMBERSHIP = eINSTANCE.getAthlete_TeamMembership();

		/**
		 * The meta object literal for the '<em><b>Get Invited Committe</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ATHLETE___GET_INVITED_COMMITTE = eINSTANCE.getAthlete__GetInvitedCommitte();

		/**
		 * The meta object literal for the '{@link og.impl.TeamImpl <em>Team</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see og.impl.TeamImpl
		 * @see og.impl.OgPackageImpl#getTeam()
		 * @generated
		 */
		EClass TEAM = eINSTANCE.getTeam();

		/**
		 * The meta object literal for the '<em><b>Team Members</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEAM__TEAM_MEMBERS = eINSTANCE.getTeam_TeamMembers();

		/**
		 * The meta object literal for the '<em><b>Add Member</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TEAM___ADD_MEMBER__ATHLETE = eINSTANCE.getTeam__AddMember__Athlete();

		/**
		 * The meta object literal for the '<em><b>Get Invited Committe</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TEAM___GET_INVITED_COMMITTE = eINSTANCE.getTeam__GetInvitedCommitte();

		/**
		 * The meta object literal for the '{@link og.impl.MedalableImpl <em>Medalable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see og.impl.MedalableImpl
		 * @see og.impl.OgPackageImpl#getMedalable()
		 * @generated
		 */
		EClass MEDALABLE = eINSTANCE.getMedalable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDALABLE__NAME = eINSTANCE.getMedalable_Name();

		/**
		 * The meta object literal for the '<em><b>Winner Of</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDALABLE__WINNER_OF = eINSTANCE.getMedalable_WinnerOf();

	}

} //OgPackage

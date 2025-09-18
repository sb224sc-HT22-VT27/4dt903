/**
 */
package olympics;

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
 * @see olympics.OlympicsFactory
 * @model kind="package"
 * @generated
 */
public interface OlympicsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "olympics";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://se.lnu.mde/olympics/clean";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "olympics";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OlympicsPackage eINSTANCE = olympics.impl.OlympicsPackageImpl.init();

	/**
	 * The meta object id for the '{@link olympics.impl.OlympicGamesImpl <em>Olympic Games</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see olympics.impl.OlympicGamesImpl
	 * @see olympics.impl.OlympicsPackageImpl#getOlympicGames()
	 * @generated
	 */
	int OLYMPIC_GAMES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OLYMPIC_GAMES__NAME = 0;

	/**
	 * The feature id for the '<em><b>Invitedcommittees</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OLYMPIC_GAMES__INVITEDCOMMITTEES = 1;

	/**
	 * The feature id for the '<em><b>Disciplines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OLYMPIC_GAMES__DISCIPLINES = 2;

	/**
	 * The number of structural features of the '<em>Olympic Games</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OLYMPIC_GAMES_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Add Committee</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OLYMPIC_GAMES___ADD_COMMITTEE__INVITEDCOMMITTEE = 0;

	/**
	 * The operation id for the '<em>Add Discipline</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OLYMPIC_GAMES___ADD_DISCIPLINE__DISCIPLINE = 1;

	/**
	 * The number of operations of the '<em>Olympic Games</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OLYMPIC_GAMES_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link olympics.impl.InvitedCommitteeImpl <em>Invited Committee</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see olympics.impl.InvitedCommitteeImpl
	 * @see olympics.impl.OlympicsPackageImpl#getInvitedCommittee()
	 * @generated
	 */
	int INVITED_COMMITTEE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVITED_COMMITTEE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Path To Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVITED_COMMITTEE__PATH_TO_FLAG = 1;

	/**
	 * The feature id for the '<em><b>Number Of Gold Medals</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVITED_COMMITTEE__NUMBER_OF_GOLD_MEDALS = 2;

	/**
	 * The feature id for the '<em><b>Athletes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVITED_COMMITTEE__ATHLETES = 3;

	/**
	 * The feature id for the '<em><b>Teams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVITED_COMMITTEE__TEAMS = 4;

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
	 * The meta object id for the '{@link olympics.impl.DisciplineImpl <em>Discipline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see olympics.impl.DisciplineImpl
	 * @see olympics.impl.OlympicsPackageImpl#getDiscipline()
	 * @generated
	 */
	int DISCIPLINE = 2;

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
	 * The meta object id for the '{@link olympics.impl.MedalableImpl <em>Medalable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see olympics.impl.MedalableImpl
	 * @see olympics.impl.OlympicsPackageImpl#getMedalable()
	 * @generated
	 */
	int MEDALABLE = 3;

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
	 * The meta object id for the '{@link olympics.impl.TeamImpl <em>Team</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see olympics.impl.TeamImpl
	 * @see olympics.impl.OlympicsPackageImpl#getTeam()
	 * @generated
	 */
	int TEAM = 4;

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
	 * The number of operations of the '<em>Team</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_OPERATION_COUNT = MEDALABLE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link olympics.impl.AthleteImpl <em>Athlete</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see olympics.impl.AthleteImpl
	 * @see olympics.impl.OlympicsPackageImpl#getAthlete()
	 * @generated
	 */
	int ATHLETE = 5;

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
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATHLETE__AGE = MEDALABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATHLETE__WEIGHT = MEDALABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Team Membership</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATHLETE__TEAM_MEMBERSHIP = MEDALABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Invitedcommittee</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATHLETE__INVITEDCOMMITTEE = MEDALABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Athlete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATHLETE_FEATURE_COUNT = MEDALABLE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Athlete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATHLETE_OPERATION_COUNT = MEDALABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link olympics.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see olympics.impl.EventImpl
	 * @see olympics.impl.OlympicsPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 6;

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
	 * The meta object id for the '{@link olympics.impl.TeamEventImpl <em>Team Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see olympics.impl.TeamEventImpl
	 * @see olympics.impl.OlympicsPackageImpl#getTeamEvent()
	 * @generated
	 */
	int TEAM_EVENT = 7;

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
	 * The feature id for the '<em><b>Bronze Medal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_EVENT__BRONZE_MEDAL = EVENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Silver Medal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_EVENT__SILVER_MEDAL = EVENT_FEATURE_COUNT + 2;

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
	 * The number of operations of the '<em>Team Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link olympics.impl.IndividualEventImpl <em>Individual Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see olympics.impl.IndividualEventImpl
	 * @see olympics.impl.OlympicsPackageImpl#getIndividualEvent()
	 * @generated
	 */
	int INDIVIDUAL_EVENT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_EVENT__NAME = EVENT__NAME;

	/**
	 * The feature id for the '<em><b>Gold Medal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_EVENT__GOLD_MEDAL = EVENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Bronze Medal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_EVENT__BRONZE_MEDAL = EVENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Silver Medal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_EVENT__SILVER_MEDAL = EVENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Participants</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_EVENT__PARTICIPANTS = EVENT_FEATURE_COUNT + 3;

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
	 * The number of operations of the '<em>Individual Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIVIDUAL_EVENT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link olympics.OlympicGames <em>Olympic Games</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Olympic Games</em>'.
	 * @see olympics.OlympicGames
	 * @generated
	 */
	EClass getOlympicGames();

	/**
	 * Returns the meta object for the attribute '{@link olympics.OlympicGames#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see olympics.OlympicGames#getName()
	 * @see #getOlympicGames()
	 * @generated
	 */
	EAttribute getOlympicGames_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link olympics.OlympicGames#getInvitedcommittees <em>Invitedcommittees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Invitedcommittees</em>'.
	 * @see olympics.OlympicGames#getInvitedcommittees()
	 * @see #getOlympicGames()
	 * @generated
	 */
	EReference getOlympicGames_Invitedcommittees();

	/**
	 * Returns the meta object for the containment reference list '{@link olympics.OlympicGames#getDisciplines <em>Disciplines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Disciplines</em>'.
	 * @see olympics.OlympicGames#getDisciplines()
	 * @see #getOlympicGames()
	 * @generated
	 */
	EReference getOlympicGames_Disciplines();

	/**
	 * Returns the meta object for the '{@link olympics.OlympicGames#addCommittee(olympics.InvitedCommittee) <em>Add Committee</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Committee</em>' operation.
	 * @see olympics.OlympicGames#addCommittee(olympics.InvitedCommittee)
	 * @generated
	 */
	EOperation getOlympicGames__AddCommittee__InvitedCommittee();

	/**
	 * Returns the meta object for the '{@link olympics.OlympicGames#addDiscipline(olympics.Discipline) <em>Add Discipline</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Discipline</em>' operation.
	 * @see olympics.OlympicGames#addDiscipline(olympics.Discipline)
	 * @generated
	 */
	EOperation getOlympicGames__AddDiscipline__Discipline();

	/**
	 * Returns the meta object for class '{@link olympics.InvitedCommittee <em>Invited Committee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invited Committee</em>'.
	 * @see olympics.InvitedCommittee
	 * @generated
	 */
	EClass getInvitedCommittee();

	/**
	 * Returns the meta object for the attribute '{@link olympics.InvitedCommittee#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see olympics.InvitedCommittee#getName()
	 * @see #getInvitedCommittee()
	 * @generated
	 */
	EAttribute getInvitedCommittee_Name();

	/**
	 * Returns the meta object for the attribute '{@link olympics.InvitedCommittee#getPathToFlag <em>Path To Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path To Flag</em>'.
	 * @see olympics.InvitedCommittee#getPathToFlag()
	 * @see #getInvitedCommittee()
	 * @generated
	 */
	EAttribute getInvitedCommittee_PathToFlag();

	/**
	 * Returns the meta object for the attribute '{@link olympics.InvitedCommittee#getNumberOfGoldMedals <em>Number Of Gold Medals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Gold Medals</em>'.
	 * @see olympics.InvitedCommittee#getNumberOfGoldMedals()
	 * @see #getInvitedCommittee()
	 * @generated
	 */
	EAttribute getInvitedCommittee_NumberOfGoldMedals();

	/**
	 * Returns the meta object for the containment reference list '{@link olympics.InvitedCommittee#getAthletes <em>Athletes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Athletes</em>'.
	 * @see olympics.InvitedCommittee#getAthletes()
	 * @see #getInvitedCommittee()
	 * @generated
	 */
	EReference getInvitedCommittee_Athletes();

	/**
	 * Returns the meta object for the containment reference list '{@link olympics.InvitedCommittee#getTeams <em>Teams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Teams</em>'.
	 * @see olympics.InvitedCommittee#getTeams()
	 * @see #getInvitedCommittee()
	 * @generated
	 */
	EReference getInvitedCommittee_Teams();

	/**
	 * Returns the meta object for the '{@link olympics.InvitedCommittee#addTeam(olympics.Team) <em>Add Team</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Team</em>' operation.
	 * @see olympics.InvitedCommittee#addTeam(olympics.Team)
	 * @generated
	 */
	EOperation getInvitedCommittee__AddTeam__Team();

	/**
	 * Returns the meta object for the '{@link olympics.InvitedCommittee#addAthlete(olympics.Athlete) <em>Add Athlete</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Athlete</em>' operation.
	 * @see olympics.InvitedCommittee#addAthlete(olympics.Athlete)
	 * @generated
	 */
	EOperation getInvitedCommittee__AddAthlete__Athlete();

	/**
	 * Returns the meta object for class '{@link olympics.Discipline <em>Discipline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discipline</em>'.
	 * @see olympics.Discipline
	 * @generated
	 */
	EClass getDiscipline();

	/**
	 * Returns the meta object for the attribute '{@link olympics.Discipline#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see olympics.Discipline#getName()
	 * @see #getDiscipline()
	 * @generated
	 */
	EAttribute getDiscipline_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link olympics.Discipline#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Events</em>'.
	 * @see olympics.Discipline#getEvents()
	 * @see #getDiscipline()
	 * @generated
	 */
	EReference getDiscipline_Events();

	/**
	 * Returns the meta object for the '{@link olympics.Discipline#addEvent(olympics.Event) <em>Add Event</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Event</em>' operation.
	 * @see olympics.Discipline#addEvent(olympics.Event)
	 * @generated
	 */
	EOperation getDiscipline__AddEvent__Event();

	/**
	 * Returns the meta object for class '{@link olympics.Medalable <em>Medalable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Medalable</em>'.
	 * @see olympics.Medalable
	 * @generated
	 */
	EClass getMedalable();

	/**
	 * Returns the meta object for the attribute '{@link olympics.Medalable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see olympics.Medalable#getName()
	 * @see #getMedalable()
	 * @generated
	 */
	EAttribute getMedalable_Name();

	/**
	 * Returns the meta object for the reference list '{@link olympics.Medalable#getWinnerOf <em>Winner Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Winner Of</em>'.
	 * @see olympics.Medalable#getWinnerOf()
	 * @see #getMedalable()
	 * @generated
	 */
	EReference getMedalable_WinnerOf();

	/**
	 * Returns the meta object for class '{@link olympics.Team <em>Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Team</em>'.
	 * @see olympics.Team
	 * @generated
	 */
	EClass getTeam();

	/**
	 * Returns the meta object for the reference list '{@link olympics.Team#getTeamMembers <em>Team Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Team Members</em>'.
	 * @see olympics.Team#getTeamMembers()
	 * @see #getTeam()
	 * @generated
	 */
	EReference getTeam_TeamMembers();

	/**
	 * Returns the meta object for the '{@link olympics.Team#addMember(olympics.Athlete) <em>Add Member</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Member</em>' operation.
	 * @see olympics.Team#addMember(olympics.Athlete)
	 * @generated
	 */
	EOperation getTeam__AddMember__Athlete();

	/**
	 * Returns the meta object for class '{@link olympics.Athlete <em>Athlete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Athlete</em>'.
	 * @see olympics.Athlete
	 * @generated
	 */
	EClass getAthlete();

	/**
	 * Returns the meta object for the attribute '{@link olympics.Athlete#getAge <em>Age</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Age</em>'.
	 * @see olympics.Athlete#getAge()
	 * @see #getAthlete()
	 * @generated
	 */
	EAttribute getAthlete_Age();

	/**
	 * Returns the meta object for the attribute '{@link olympics.Athlete#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see olympics.Athlete#getWeight()
	 * @see #getAthlete()
	 * @generated
	 */
	EAttribute getAthlete_Weight();

	/**
	 * Returns the meta object for the reference list '{@link olympics.Athlete#getTeamMembership <em>Team Membership</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Team Membership</em>'.
	 * @see olympics.Athlete#getTeamMembership()
	 * @see #getAthlete()
	 * @generated
	 */
	EReference getAthlete_TeamMembership();

	/**
	 * Returns the meta object for the container reference '{@link olympics.Athlete#getInvitedcommittee <em>Invitedcommittee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Invitedcommittee</em>'.
	 * @see olympics.Athlete#getInvitedcommittee()
	 * @see #getAthlete()
	 * @generated
	 */
	EReference getAthlete_Invitedcommittee();

	/**
	 * Returns the meta object for class '{@link olympics.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see olympics.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the attribute '{@link olympics.Event#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see olympics.Event#getName()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Name();

	/**
	 * Returns the meta object for the '{@link olympics.Event#addParticipant(olympics.Medalable) <em>Add Participant</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Participant</em>' operation.
	 * @see olympics.Event#addParticipant(olympics.Medalable)
	 * @generated
	 */
	EOperation getEvent__AddParticipant__Medalable();

	/**
	 * Returns the meta object for the '{@link olympics.Event#getParticipants() <em>Get Participants</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Participants</em>' operation.
	 * @see olympics.Event#getParticipants()
	 * @generated
	 */
	EOperation getEvent__GetParticipants();

	/**
	 * Returns the meta object for class '{@link olympics.TeamEvent <em>Team Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Team Event</em>'.
	 * @see olympics.TeamEvent
	 * @generated
	 */
	EClass getTeamEvent();

	/**
	 * Returns the meta object for the reference '{@link olympics.TeamEvent#getGoldMedal <em>Gold Medal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gold Medal</em>'.
	 * @see olympics.TeamEvent#getGoldMedal()
	 * @see #getTeamEvent()
	 * @generated
	 */
	EReference getTeamEvent_GoldMedal();

	/**
	 * Returns the meta object for the reference '{@link olympics.TeamEvent#getBronzeMedal <em>Bronze Medal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bronze Medal</em>'.
	 * @see olympics.TeamEvent#getBronzeMedal()
	 * @see #getTeamEvent()
	 * @generated
	 */
	EReference getTeamEvent_BronzeMedal();

	/**
	 * Returns the meta object for the reference '{@link olympics.TeamEvent#getSilverMedal <em>Silver Medal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Silver Medal</em>'.
	 * @see olympics.TeamEvent#getSilverMedal()
	 * @see #getTeamEvent()
	 * @generated
	 */
	EReference getTeamEvent_SilverMedal();

	/**
	 * Returns the meta object for the reference list '{@link olympics.TeamEvent#getParticipants <em>Participants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Participants</em>'.
	 * @see olympics.TeamEvent#getParticipants()
	 * @see #getTeamEvent()
	 * @generated
	 */
	EReference getTeamEvent_Participants();

	/**
	 * Returns the meta object for class '{@link olympics.IndividualEvent <em>Individual Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Individual Event</em>'.
	 * @see olympics.IndividualEvent
	 * @generated
	 */
	EClass getIndividualEvent();

	/**
	 * Returns the meta object for the reference '{@link olympics.IndividualEvent#getGoldMedal <em>Gold Medal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gold Medal</em>'.
	 * @see olympics.IndividualEvent#getGoldMedal()
	 * @see #getIndividualEvent()
	 * @generated
	 */
	EReference getIndividualEvent_GoldMedal();

	/**
	 * Returns the meta object for the reference '{@link olympics.IndividualEvent#getBronzeMedal <em>Bronze Medal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bronze Medal</em>'.
	 * @see olympics.IndividualEvent#getBronzeMedal()
	 * @see #getIndividualEvent()
	 * @generated
	 */
	EReference getIndividualEvent_BronzeMedal();

	/**
	 * Returns the meta object for the reference '{@link olympics.IndividualEvent#getSilverMedal <em>Silver Medal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Silver Medal</em>'.
	 * @see olympics.IndividualEvent#getSilverMedal()
	 * @see #getIndividualEvent()
	 * @generated
	 */
	EReference getIndividualEvent_SilverMedal();

	/**
	 * Returns the meta object for the reference list '{@link olympics.IndividualEvent#getParticipants <em>Participants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Participants</em>'.
	 * @see olympics.IndividualEvent#getParticipants()
	 * @see #getIndividualEvent()
	 * @generated
	 */
	EReference getIndividualEvent_Participants();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OlympicsFactory getOlympicsFactory();

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
		 * The meta object literal for the '{@link olympics.impl.OlympicGamesImpl <em>Olympic Games</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see olympics.impl.OlympicGamesImpl
		 * @see olympics.impl.OlympicsPackageImpl#getOlympicGames()
		 * @generated
		 */
		EClass OLYMPIC_GAMES = eINSTANCE.getOlympicGames();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OLYMPIC_GAMES__NAME = eINSTANCE.getOlympicGames_Name();

		/**
		 * The meta object literal for the '<em><b>Invitedcommittees</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OLYMPIC_GAMES__INVITEDCOMMITTEES = eINSTANCE.getOlympicGames_Invitedcommittees();

		/**
		 * The meta object literal for the '<em><b>Disciplines</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OLYMPIC_GAMES__DISCIPLINES = eINSTANCE.getOlympicGames_Disciplines();

		/**
		 * The meta object literal for the '<em><b>Add Committee</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OLYMPIC_GAMES___ADD_COMMITTEE__INVITEDCOMMITTEE = eINSTANCE.getOlympicGames__AddCommittee__InvitedCommittee();

		/**
		 * The meta object literal for the '<em><b>Add Discipline</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OLYMPIC_GAMES___ADD_DISCIPLINE__DISCIPLINE = eINSTANCE.getOlympicGames__AddDiscipline__Discipline();

		/**
		 * The meta object literal for the '{@link olympics.impl.InvitedCommitteeImpl <em>Invited Committee</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see olympics.impl.InvitedCommitteeImpl
		 * @see olympics.impl.OlympicsPackageImpl#getInvitedCommittee()
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
		 * The meta object literal for the '<em><b>Path To Flag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVITED_COMMITTEE__PATH_TO_FLAG = eINSTANCE.getInvitedCommittee_PathToFlag();

		/**
		 * The meta object literal for the '<em><b>Number Of Gold Medals</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVITED_COMMITTEE__NUMBER_OF_GOLD_MEDALS = eINSTANCE.getInvitedCommittee_NumberOfGoldMedals();

		/**
		 * The meta object literal for the '<em><b>Athletes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVITED_COMMITTEE__ATHLETES = eINSTANCE.getInvitedCommittee_Athletes();

		/**
		 * The meta object literal for the '<em><b>Teams</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVITED_COMMITTEE__TEAMS = eINSTANCE.getInvitedCommittee_Teams();

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
		 * The meta object literal for the '{@link olympics.impl.DisciplineImpl <em>Discipline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see olympics.impl.DisciplineImpl
		 * @see olympics.impl.OlympicsPackageImpl#getDiscipline()
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
		 * The meta object literal for the '{@link olympics.impl.MedalableImpl <em>Medalable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see olympics.impl.MedalableImpl
		 * @see olympics.impl.OlympicsPackageImpl#getMedalable()
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

		/**
		 * The meta object literal for the '{@link olympics.impl.TeamImpl <em>Team</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see olympics.impl.TeamImpl
		 * @see olympics.impl.OlympicsPackageImpl#getTeam()
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
		 * The meta object literal for the '{@link olympics.impl.AthleteImpl <em>Athlete</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see olympics.impl.AthleteImpl
		 * @see olympics.impl.OlympicsPackageImpl#getAthlete()
		 * @generated
		 */
		EClass ATHLETE = eINSTANCE.getAthlete();

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
		 * The meta object literal for the '<em><b>Invitedcommittee</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATHLETE__INVITEDCOMMITTEE = eINSTANCE.getAthlete_Invitedcommittee();

		/**
		 * The meta object literal for the '{@link olympics.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see olympics.impl.EventImpl
		 * @see olympics.impl.OlympicsPackageImpl#getEvent()
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
		 * The meta object literal for the '{@link olympics.impl.TeamEventImpl <em>Team Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see olympics.impl.TeamEventImpl
		 * @see olympics.impl.OlympicsPackageImpl#getTeamEvent()
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
		 * The meta object literal for the '<em><b>Bronze Medal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEAM_EVENT__BRONZE_MEDAL = eINSTANCE.getTeamEvent_BronzeMedal();

		/**
		 * The meta object literal for the '<em><b>Silver Medal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEAM_EVENT__SILVER_MEDAL = eINSTANCE.getTeamEvent_SilverMedal();

		/**
		 * The meta object literal for the '<em><b>Participants</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEAM_EVENT__PARTICIPANTS = eINSTANCE.getTeamEvent_Participants();

		/**
		 * The meta object literal for the '{@link olympics.impl.IndividualEventImpl <em>Individual Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see olympics.impl.IndividualEventImpl
		 * @see olympics.impl.OlympicsPackageImpl#getIndividualEvent()
		 * @generated
		 */
		EClass INDIVIDUAL_EVENT = eINSTANCE.getIndividualEvent();

		/**
		 * The meta object literal for the '<em><b>Gold Medal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDIVIDUAL_EVENT__GOLD_MEDAL = eINSTANCE.getIndividualEvent_GoldMedal();

		/**
		 * The meta object literal for the '<em><b>Bronze Medal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDIVIDUAL_EVENT__BRONZE_MEDAL = eINSTANCE.getIndividualEvent_BronzeMedal();

		/**
		 * The meta object literal for the '<em><b>Silver Medal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDIVIDUAL_EVENT__SILVER_MEDAL = eINSTANCE.getIndividualEvent_SilverMedal();

		/**
		 * The meta object literal for the '<em><b>Participants</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDIVIDUAL_EVENT__PARTICIPANTS = eINSTANCE.getIndividualEvent_Participants();

	}

} //OlympicsPackage

/**
 */
package og.impl;

import og.Athlete;
import og.Discipline;
import og.Event;
import og.IndividualEvent;
import og.InvitedCommittee;
import og.Medalable;
import og.Og;
import og.OgFactory;
import og.OgPackage;
import og.Team;
import og.TeamEvent;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
public class OgPackageImpl extends EPackageImpl implements OgPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ogEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass disciplineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass invitedCommitteeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass teamEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass individualEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass athleteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass teamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medalableEClass = null;

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
	 * @see og.OgPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OgPackageImpl() {
		super(eNS_URI, OgFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link OgPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OgPackage init() {
		if (isInited)
			return (OgPackage) EPackage.Registry.INSTANCE.getEPackage(OgPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredOgPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		OgPackageImpl theOgPackage = registeredOgPackage instanceof OgPackageImpl ? (OgPackageImpl) registeredOgPackage
				: new OgPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theOgPackage.createPackageContents();

		// Initialize created meta-data
		theOgPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOgPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OgPackage.eNS_URI, theOgPackage);
		return theOgPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOg() {
		return ogEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOg_Name() {
		return (EAttribute) ogEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOg_Disciplines() {
		return (EReference) ogEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOg_InvitedCommittees() {
		return (EReference) ogEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOg__AddCommittee__InvitedCommittee() {
		return ogEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getOg__AddDiscipline__Discipline() {
		return ogEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDiscipline() {
		return disciplineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDiscipline_Name() {
		return (EAttribute) disciplineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDiscipline_Events() {
		return (EReference) disciplineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDiscipline__AddEvent__Event() {
		return disciplineEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInvitedCommittee() {
		return invitedCommitteeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInvitedCommittee_Name() {
		return (EAttribute) invitedCommitteeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInvitedCommittee_PathToFlagImage() {
		return (EAttribute) invitedCommitteeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInvitedCommittee_NumberOfGoldMedals() {
		return (EAttribute) invitedCommitteeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInvitedCommittee_Team() {
		return (EReference) invitedCommitteeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInvitedCommittee_Athletes() {
		return (EReference) invitedCommitteeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInvitedCommittee__AddTeam__Team() {
		return invitedCommitteeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getInvitedCommittee__AddAthlete__Athlete() {
		return invitedCommitteeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEvent() {
		return eventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvent_Name() {
		return (EAttribute) eventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEvent__AddParticipant__Medalable() {
		return eventEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEvent__GetParticipants() {
		return eventEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTeamEvent() {
		return teamEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTeamEvent_GoldMedal() {
		return (EReference) teamEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTeamEvent_SilverMedal() {
		return (EReference) teamEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTeamEvent_BronzeMedal() {
		return (EReference) teamEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTeamEvent_Participants() {
		return (EReference) teamEventEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTeamEvent__SetGold__Team() {
		return teamEventEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTeamEvent__SetSilver__Team() {
		return teamEventEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTeamEvent__SetBronze__Team() {
		return teamEventEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIndividualEvent() {
		return individualEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIndividualEvent_Participants() {
		return (EReference) individualEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIndividualEvent_GoldMedal() {
		return (EReference) individualEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIndividualEvent_SilverMedal() {
		return (EReference) individualEventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIndividualEvent_BronzeMedal() {
		return (EReference) individualEventEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIndividualEvent__SetBronze__Athlete() {
		return individualEventEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIndividualEvent__SetSilver__Athlete() {
		return individualEventEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIndividualEvent__SetGold__Athlete() {
		return individualEventEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAthlete() {
		return athleteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAthlete_InvitedCommittee() {
		return (EReference) athleteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAthlete_Age() {
		return (EAttribute) athleteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAthlete_Weight() {
		return (EAttribute) athleteEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAthlete_TeamMembership() {
		return (EReference) athleteEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAthlete__GetInvitedCommitte() {
		return athleteEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTeam() {
		return teamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTeam_TeamMembers() {
		return (EReference) teamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTeam__AddMember__Athlete() {
		return teamEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTeam__GetInvitedCommitte() {
		return teamEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMedalable() {
		return medalableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMedalable_Name() {
		return (EAttribute) medalableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMedalable_WinnerOf() {
		return (EReference) medalableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OgFactory getOgFactory() {
		return (OgFactory) getEFactoryInstance();
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
		ogEClass = createEClass(OG);
		createEAttribute(ogEClass, OG__NAME);
		createEReference(ogEClass, OG__DISCIPLINES);
		createEReference(ogEClass, OG__INVITED_COMMITTEES);
		createEOperation(ogEClass, OG___ADD_COMMITTEE__INVITEDCOMMITTEE);
		createEOperation(ogEClass, OG___ADD_DISCIPLINE__DISCIPLINE);

		disciplineEClass = createEClass(DISCIPLINE);
		createEAttribute(disciplineEClass, DISCIPLINE__NAME);
		createEReference(disciplineEClass, DISCIPLINE__EVENTS);
		createEOperation(disciplineEClass, DISCIPLINE___ADD_EVENT__EVENT);

		invitedCommitteeEClass = createEClass(INVITED_COMMITTEE);
		createEAttribute(invitedCommitteeEClass, INVITED_COMMITTEE__NAME);
		createEAttribute(invitedCommitteeEClass, INVITED_COMMITTEE__PATH_TO_FLAG_IMAGE);
		createEAttribute(invitedCommitteeEClass, INVITED_COMMITTEE__NUMBER_OF_GOLD_MEDALS);
		createEReference(invitedCommitteeEClass, INVITED_COMMITTEE__TEAM);
		createEReference(invitedCommitteeEClass, INVITED_COMMITTEE__ATHLETES);
		createEOperation(invitedCommitteeEClass, INVITED_COMMITTEE___ADD_TEAM__TEAM);
		createEOperation(invitedCommitteeEClass, INVITED_COMMITTEE___ADD_ATHLETE__ATHLETE);

		eventEClass = createEClass(EVENT);
		createEAttribute(eventEClass, EVENT__NAME);
		createEOperation(eventEClass, EVENT___ADD_PARTICIPANT__MEDALABLE);
		createEOperation(eventEClass, EVENT___GET_PARTICIPANTS);

		teamEventEClass = createEClass(TEAM_EVENT);
		createEReference(teamEventEClass, TEAM_EVENT__GOLD_MEDAL);
		createEReference(teamEventEClass, TEAM_EVENT__SILVER_MEDAL);
		createEReference(teamEventEClass, TEAM_EVENT__BRONZE_MEDAL);
		createEReference(teamEventEClass, TEAM_EVENT__PARTICIPANTS);
		createEOperation(teamEventEClass, TEAM_EVENT___SET_GOLD__TEAM);
		createEOperation(teamEventEClass, TEAM_EVENT___SET_SILVER__TEAM);
		createEOperation(teamEventEClass, TEAM_EVENT___SET_BRONZE__TEAM);

		individualEventEClass = createEClass(INDIVIDUAL_EVENT);
		createEReference(individualEventEClass, INDIVIDUAL_EVENT__PARTICIPANTS);
		createEReference(individualEventEClass, INDIVIDUAL_EVENT__GOLD_MEDAL);
		createEReference(individualEventEClass, INDIVIDUAL_EVENT__SILVER_MEDAL);
		createEReference(individualEventEClass, INDIVIDUAL_EVENT__BRONZE_MEDAL);
		createEOperation(individualEventEClass, INDIVIDUAL_EVENT___SET_BRONZE__ATHLETE);
		createEOperation(individualEventEClass, INDIVIDUAL_EVENT___SET_SILVER__ATHLETE);
		createEOperation(individualEventEClass, INDIVIDUAL_EVENT___SET_GOLD__ATHLETE);

		athleteEClass = createEClass(ATHLETE);
		createEReference(athleteEClass, ATHLETE__INVITED_COMMITTEE);
		createEAttribute(athleteEClass, ATHLETE__AGE);
		createEAttribute(athleteEClass, ATHLETE__WEIGHT);
		createEReference(athleteEClass, ATHLETE__TEAM_MEMBERSHIP);
		createEOperation(athleteEClass, ATHLETE___GET_INVITED_COMMITTE);

		teamEClass = createEClass(TEAM);
		createEReference(teamEClass, TEAM__TEAM_MEMBERS);
		createEOperation(teamEClass, TEAM___ADD_MEMBER__ATHLETE);
		createEOperation(teamEClass, TEAM___GET_INVITED_COMMITTE);

		medalableEClass = createEClass(MEDALABLE);
		createEAttribute(medalableEClass, MEDALABLE__NAME);
		createEReference(medalableEClass, MEDALABLE__WINNER_OF);
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
		teamEventEClass.getESuperTypes().add(this.getEvent());
		individualEventEClass.getESuperTypes().add(this.getEvent());
		athleteEClass.getESuperTypes().add(this.getMedalable());
		teamEClass.getESuperTypes().add(this.getMedalable());

		// Initialize classes, features, and operations; add parameters
		initEClass(ogEClass, Og.class, "Og", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOg_Name(), ecorePackage.getEString(), "name", null, 0, 1, Og.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOg_Disciplines(), this.getDiscipline(), null, "disciplines", null, 0, -1, Og.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOg_InvitedCommittees(), this.getInvitedCommittee(), null, "invitedCommittees", null, 0, -1,
				Og.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getOg__AddCommittee__InvitedCommittee(), null, "addCommittee", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, this.getInvitedCommittee(), "theCommittee", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getOg__AddDiscipline__Discipline(), null, "addDiscipline", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDiscipline(), "theDiscipline", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(disciplineEClass, Discipline.class, "Discipline", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiscipline_Name(), ecorePackage.getEString(), "name", null, 0, 1, Discipline.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiscipline_Events(), this.getEvent(), null, "events", null, 0, -1, Discipline.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getDiscipline__AddEvent__Event(), null, "addEvent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEvent(), "theEvent", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(invitedCommitteeEClass, InvitedCommittee.class, "InvitedCommittee", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInvitedCommittee_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				InvitedCommittee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getInvitedCommittee_PathToFlagImage(), ecorePackage.getEString(), "pathToFlagImage", null, 0, 1,
				InvitedCommittee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getInvitedCommittee_NumberOfGoldMedals(), ecorePackage.getEInt(), "numberOfGoldMedals", null, 0,
				1, InvitedCommittee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getInvitedCommittee_Team(), this.getTeam(), null, "team", null, 0, -1, InvitedCommittee.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInvitedCommittee_Athletes(), this.getAthlete(), this.getAthlete_InvitedCommittee(),
				"athletes", null, 0, -1, InvitedCommittee.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getInvitedCommittee__AddTeam__Team(), null, "addTeam", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTeam(), "theTeam", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getInvitedCommittee__AddAthlete__Athlete(), null, "addAthlete", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, this.getAthlete(), "theAthlete", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(eventEClass, Event.class, "Event", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEvent_Name(), ecorePackage.getEString(), "name", null, 0, 1, Event.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getEvent__AddParticipant__Medalable(), null, "addParticipant", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMedalable(), "theParticipant", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getEvent__GetParticipants(), null, "getParticipants", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(teamEventEClass, TeamEvent.class, "TeamEvent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTeamEvent_GoldMedal(), this.getTeam(), null, "goldMedal", null, 0, 1, TeamEvent.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTeamEvent_SilverMedal(), this.getTeam(), null, "silverMedal", null, 0, 1, TeamEvent.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTeamEvent_BronzeMedal(), this.getTeam(), null, "bronzeMedal", null, 0, 1, TeamEvent.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTeamEvent_Participants(), this.getTeam(), null, "participants", null, 0, -1, TeamEvent.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getTeamEvent__SetGold__Team(), null, "setGold", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTeam(), "theGold", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTeamEvent__SetSilver__Team(), null, "setSilver", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTeam(), "theSilver", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTeamEvent__SetBronze__Team(), null, "setBronze", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTeam(), "theBronze", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(individualEventEClass, IndividualEvent.class, "IndividualEvent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIndividualEvent_Participants(), this.getAthlete(), null, "participants", null, 0, -1,
				IndividualEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIndividualEvent_GoldMedal(), this.getAthlete(), null, "goldMedal", null, 0, 1,
				IndividualEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIndividualEvent_SilverMedal(), this.getAthlete(), null, "silverMedal", null, 0, 1,
				IndividualEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIndividualEvent_BronzeMedal(), this.getAthlete(), null, "bronzeMedal", null, 0, 1,
				IndividualEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getIndividualEvent__SetBronze__Athlete(), null, "setBronze", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAthlete(), "theBronze", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getIndividualEvent__SetSilver__Athlete(), null, "setSilver", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAthlete(), "theSilver", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getIndividualEvent__SetGold__Athlete(), null, "setGold", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAthlete(), "theGold", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(athleteEClass, Athlete.class, "Athlete", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAthlete_InvitedCommittee(), this.getInvitedCommittee(), this.getInvitedCommittee_Athletes(),
				"invitedCommittee", null, 0, 1, Athlete.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAthlete_Age(), ecorePackage.getEInt(), "age", null, 0, 1, Athlete.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAthlete_Weight(), ecorePackage.getEDouble(), "weight", null, 0, 1, Athlete.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAthlete_TeamMembership(), this.getTeam(), this.getTeam_TeamMembers(), "teamMembership", null,
				0, -1, Athlete.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getAthlete__GetInvitedCommitte(), null, "getInvitedCommitte", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(teamEClass, Team.class, "Team", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTeam_TeamMembers(), this.getAthlete(), this.getAthlete_TeamMembership(), "teamMembers", null,
				0, -1, Team.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getTeam__AddMember__Athlete(), null, "addMember", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAthlete(), "theAthlete", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTeam__GetInvitedCommitte(), null, "getInvitedCommitte", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(medalableEClass, Medalable.class, "Medalable", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMedalable_Name(), ecorePackage.getEString(), "name", null, 0, 1, Medalable.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMedalable_WinnerOf(), this.getEvent(), null, "winnerOf", null, 0, -1, Medalable.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //OgPackageImpl

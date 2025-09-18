/**
 */
package olympics.impl;

import olympics.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OlympicsFactoryImpl extends EFactoryImpl implements OlympicsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OlympicsFactory init() {
		try {
			OlympicsFactory theOlympicsFactory = (OlympicsFactory)EPackage.Registry.INSTANCE.getEFactory(OlympicsPackage.eNS_URI);
			if (theOlympicsFactory != null) {
				return theOlympicsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OlympicsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OlympicsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case OlympicsPackage.OLYMPIC_GAMES: return createOlympicGames();
			case OlympicsPackage.INVITED_COMMITTEE: return createInvitedCommittee();
			case OlympicsPackage.DISCIPLINE: return createDiscipline();
			case OlympicsPackage.TEAM: return createTeam();
			case OlympicsPackage.ATHLETE: return createAthlete();
			case OlympicsPackage.TEAM_EVENT: return createTeamEvent();
			case OlympicsPackage.INDIVIDUAL_EVENT: return createIndividualEvent();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OlympicGames createOlympicGames() {
		OlympicGamesImpl olympicGames = new OlympicGamesImpl();
		return olympicGames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InvitedCommittee createInvitedCommittee() {
		InvitedCommitteeImpl invitedCommittee = new InvitedCommitteeImpl();
		return invitedCommittee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Discipline createDiscipline() {
		DisciplineImpl discipline = new DisciplineImpl();
		return discipline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Team createTeam() {
		TeamImpl team = new TeamImpl();
		return team;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Athlete createAthlete() {
		AthleteImpl athlete = new AthleteImpl();
		return athlete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TeamEvent createTeamEvent() {
		TeamEventImpl teamEvent = new TeamEventImpl();
		return teamEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IndividualEvent createIndividualEvent() {
		IndividualEventImpl individualEvent = new IndividualEventImpl();
		return individualEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OlympicsPackage getOlympicsPackage() {
		return (OlympicsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OlympicsPackage getPackage() {
		return OlympicsPackage.eINSTANCE;
	}

} //OlympicsFactoryImpl

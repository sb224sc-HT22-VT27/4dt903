/**
 */
package og.impl;

import og.*;

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
public class OgFactoryImpl extends EFactoryImpl implements OgFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OgFactory init() {
		try {
			OgFactory theOgFactory = (OgFactory) EPackage.Registry.INSTANCE.getEFactory(OgPackage.eNS_URI);
			if (theOgFactory != null) {
				return theOgFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OgFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OgFactoryImpl() {
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
		case OgPackage.OG:
			return createOg();
		case OgPackage.DISCIPLINE:
			return createDiscipline();
		case OgPackage.INVITED_COMMITTEE:
			return createInvitedCommittee();
		case OgPackage.TEAM_EVENT:
			return createTeamEvent();
		case OgPackage.INDIVIDUAL_EVENT:
			return createIndividualEvent();
		case OgPackage.ATHLETE:
			return createAthlete();
		case OgPackage.TEAM:
			return createTeam();
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
	public Og createOg() {
		OgImpl og = new OgImpl();
		return og;
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
	public OgPackage getOgPackage() {
		return (OgPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OgPackage getPackage() {
		return OgPackage.eINSTANCE;
	}

} //OgFactoryImpl

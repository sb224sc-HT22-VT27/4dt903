package olympics.impl;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import olympics.CustomOlympicsFactory;
import olympics.Discipline;
import olympics.IndividualEvent;
import olympics.InvitedCommittee;
import olympics.OlympicGames;
import olympics.OlympicsFactory;
import olympics.OlympicsPackage;
import olympics.Team;
import olympics.TeamEvent;

public class CustomOlympicsFactoryImpl extends OlympicsFactoryImpl implements CustomOlympicsFactory {

	public CustomOlympicsFactoryImpl() {
		super();
	}

	public static OlympicsFactory init() {
		try {
			OlympicsFactory theOlympicsFactory = (OlympicsFactory) EPackage.Registry.INSTANCE
					.getEFactory(OlympicsPackage.eNS_URI);
			if (theOlympicsFactory != null) {
				return theOlympicsFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CustomOlympicsFactoryImpl();
	}

	@Override
	public Team createTeam() {
		return new CustomTeamImpl();
	}

	@Override
	public InvitedCommittee createInvitedCommittee() {
		return new CustomInvitedCommitteeImpl();
	}

	@Override
	public Discipline createDiscipline() {
		return new CustomDisciplineImpl();
	}

	@Override
	public IndividualEvent createIndividualEvent() {
		return new CustomIndividualEventImpl();
	}

	@Override
	public TeamEvent createTeamEvent() {
		return new CustomTeamEventImpl();
	}

	@Override
	public OlympicGames createOlympicGames() {
		return new CustomOlympicGamesImpl();
	}
}

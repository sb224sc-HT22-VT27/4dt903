package olympics;

public interface CustomOlympicsFactory extends OlympicsFactory {

	OlympicsFactory eINSTANCE = olympics.impl.CustomOlympicsFactoryImpl.init();
	
	@Override
	Team createTeam();
	
	@Override
	InvitedCommittee createInvitedCommittee();
	
	@Override
	Discipline createDiscipline();
	
	@Override
	IndividualEvent createIndividualEvent();
	
	@Override
	TeamEvent createTeamEvent();
	
	@Override
	OlympicGames createOlympicGames();
	
}

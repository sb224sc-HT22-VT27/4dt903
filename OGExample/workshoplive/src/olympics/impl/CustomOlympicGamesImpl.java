package olympics.impl;

import olympics.Discipline;
import olympics.InvitedCommittee;

public class CustomOlympicGamesImpl extends OlympicGamesImpl {


	@Override
	public void addCommittee(InvitedCommittee theCommittee) {
		getInvitedcommittees().add(theCommittee);
	}


	@Override
	public void addDiscipline(Discipline theDiscipline) {
		getDisciplines().add(theDiscipline);
	}

	
}

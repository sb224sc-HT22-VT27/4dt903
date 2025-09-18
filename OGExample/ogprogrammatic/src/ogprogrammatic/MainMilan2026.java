package ogprogrammatic;

import og.Athlete;
import og.Discipline;
import og.IndividualEvent;
import og.InvitedCommittee;
import og.Medalable;
import og.Og;
import og.OgFactory;
import og.OgPackage;
import og.Team;
import og.TeamEvent;

public class MainMilan2026 {

	
	private static OgPackage justForInit = OgPackage.eINSTANCE;
	private static OgFactory factory = OgFactory.eINSTANCE;
	
	public static void main(String[] args) {
		Og og = factory.createOg();
		og.setName("Milan- Cortina d’Ampezzo 2026");
		
		InvitedCommittee sweden = factory.createInvitedCommittee();
		sweden.setName("Sweden");
		
		Athlete sven = factory.createAthlete();
		sven.setName("Sven");
		sven.setAge(20);
		
		sweden.addAthlete(sven);
		og.addCommittee(sweden);
		
		Athlete per = factory.createAthlete();
		per.setName("Per");
		per.setAge(21);
		sweden.addAthlete(per);
		
		Athlete maria = factory.createAthlete();
		maria.setName("Maria");
		maria.setAge(25);
		sweden.addAthlete(maria);
		
		Team swedishBiathlon = factory.createTeam();
		swedishBiathlon.setName("Swedish biathlon");
		
		System.out.println("The committee of Sven is: " + sven.getInvitedCommittee());
				

		Discipline biathlon = factory.createDiscipline();
		biathlon.setName("Biathlon");
		og.addDiscipline(biathlon);
		
		IndividualEvent men10k = factory.createIndividualEvent();
		men10k.setName("Men biathlon 10k");
		
		men10k.setGold(sven);
		
	}

}

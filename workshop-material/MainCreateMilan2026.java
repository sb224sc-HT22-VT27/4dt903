package mains;


import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;

import olympics.Athlete;
import olympics.CustomOlympicsFactory;
import olympics.Discipline;
import olympics.Event;
import olympics.IndividualEvent;
import olympics.InvitedCommittee;
import olympics.OlympicGames;
import olympics.OlympicsFactory;
import olympics.OlympicsPackage;
import olympics.Team;
import olympics.TeamEvent;

public class MainCreateMilan2026 {

	private static final OlympicsFactory factory = CustomOlympicsFactory.eINSTANCE;
	private static final OlympicsPackage justForInit = OlympicsPackage.eINSTANCE;
	private static final String NL = System.getProperty("line.separator");
	private static final Random gen = new Random();
	private static ResourceSet rs;

	public static void main(String[] args) {
		

		MainCreateMilan2026 creator = new MainCreateMilan2026();
		OlympicGames theGames = creator.createMilanOlympics();
		setupResource();
		creator.save(theGames, "./target/Milan2026.olympics");

		System.out.println(NL+NL);
		// Check how the opposite relation works
		printTeamsOfPlayers(theGames);
		System.out.println(NL+NL);
		// print events won by an athlete
		printEventsWonByAthlete(theGames);
		System.out.println(NL+NL);
		// printMedalsOfPlayers(theGames);
		printNumberOfGoldMedalsOfCommittees(theGames);

	}

	private static void printEventsWonByAthlete(OlympicGames theGames) {
		for (InvitedCommittee c : theGames.getInvitedcommittees()) {
			for (Athlete a : c.getAthletes()) {
				System.out.println(" Committee " + c.getName() + " athlete: " + a.getName() + " has won "
						+ a.getWinnerOf().size() + " events, the following : ");
				for (Event e : a.getWinnerOf()) {
					System.out.println("   " + e.getName());
				}
			}
		}

	}

	private static void printNumberOfGoldMedalsOfCommittees(OlympicGames theGames) {
		for (InvitedCommittee c : theGames.getInvitedcommittees()) {
			System.out.println("Number of golds of " + c.getName() + " is: " + c.getNumberOfGoldMedals());
		}

	}

	private static void printTeamsOfPlayers(OlympicGames theGames) {
		for (InvitedCommittee c : theGames.getInvitedcommittees()) {
			for (Athlete a : c.getAthletes()) {
				System.out.println(
						" Committee " + c.getName() + " athlete: " + a.getName() + " participates in teams: ");
				for (Team t : a.getTeamMembership()) {
					System.out.println("   " + t.getName());
				}
			}
		}

	}

	private OlympicGames createMilanOlympics() {
		OlympicGames games = factory.createOlympicGames();
		games.setName("Milan- Cortina d’Ampezzo 2026");

		// The swedish team
		InvitedCommittee sweden = factory.createInvitedCommittee();
		sweden.setName("Sweden");
		games.addCommittee(sweden);

		Athlete sven, johan, per, maria;
		sven = factory.createAthlete();
		sven.setName("Sven");
		setAthleteParameters(sven);

		johan = factory.createAthlete();
		johan.setName("Johan");
		setAthleteParameters(johan);

		per = factory.createAthlete();
		per.setName("Per");
		setAthleteParameters(per);

		maria = factory.createAthlete();
		maria.setName("Maria");
		setAthleteParameters(maria);

		Team swedishBiathlonTeam = factory.createTeam();

		swedishBiathlonTeam.setName("Swedish biathlon team");
		swedishBiathlonTeam.addMember(maria);
		swedishBiathlonTeam.addMember(sven);

		sweden.addTeam(swedishBiathlonTeam);
		sweden.addAthlete(maria);
		sweden.addAthlete(per);
		sweden.addAthlete(johan);
		sweden.addAthlete(sven);
		
		
		

		// The Spanish team
		InvitedCommittee spain = factory.createInvitedCommittee();
		spain.setName("Spain");
		games.addCommittee(spain);
		
		Athlete juan, pedro, conchita;
		juan = setAthleteParametes("Juan");
		pedro = setAthleteParametes("Pedro");
		conchita = setAthleteParametes("Conchita");

		Team spanishBiathlonTeam = factory.createTeam();
		spanishBiathlonTeam.setName("Spanish biathlon team");
		spanishBiathlonTeam.addMember(pedro);
		spanishBiathlonTeam.addMember(conchita);
		spain.addTeam(spanishBiathlonTeam);
		spain.addAthlete(conchita);
		spain.addAthlete(pedro);
		spain.addAthlete(juan);
		
		
		
		
		
		// The norwegian team
		InvitedCommittee norway = factory.createInvitedCommittee();
		norway.setName("Norway");
		games.addCommittee(norway);

		Athlete jakob, emma, nora;
		jakob = factory.createAthlete();
		jakob.setName("Jakob");
		setAthleteParameters(jakob);

		emma = factory.createAthlete();
		emma.setName("Emma");
		setAthleteParameters(emma);

		
		nora = factory.createAthlete();
		nora.setName("Nora");
		setAthleteParameters(nora);

		Team norwegianBiathlonTeam = factory.createTeam();

		norwegianBiathlonTeam.setName("Norwegian biathlon team");
		norwegianBiathlonTeam.addMember(jakob);
		norwegianBiathlonTeam.addMember(nora);

		norway.addTeam(norwegianBiathlonTeam);
		norway.addAthlete(jakob);
		norway.addAthlete(emma);
		norway.addAthlete(nora);

		
		
		


		games.addDiscipline(getcreateDisciplineBiathlon());


		biathlonMen10k.addParticipant(pedro);
		biathlonMen10k.addParticipant(juan);

		biathlonMen10k.addParticipant(per);
		biathlonMen10k.addParticipant(johan);
		biathlonMen10k.addParticipant(sven);
		
		biathlonMen10k.addParticipant(jakob);
		
		
		biathlonWomen15k.addParticipant(conchita);
		biathlonWomen15k.addParticipant(maria);
		biathlonWomen15k.addParticipant(nora);
		biathlonWomen15k.addParticipant(emma);

		
		biathlonMixedRelay.addParticipant(spanishBiathlonTeam);
		biathlonMixedRelay.addParticipant(swedishBiathlonTeam);
		biathlonMixedRelay.addParticipant(norwegianBiathlonTeam);

		
		
		// Winner of men single spain-sweden-sweden
		System.out.println("  Sven wins gold in Biathlon men 10K");
		biathlonMen10k.setGoldMedal(sven);
		biathlonMen10k.setSilverMedal(pedro);
		biathlonMen10k.setBronzeMedal(per);
		
		//Winner of female single maria-conchita-nobody
		System.out.println("  Nora wins gold in Biathlon Women 15k");
		biathlonWomen15k.setGoldMedal(nora);
		biathlonWomen15k.setSilverMedal(emma);
		biathlonWomen15k.setBronzeMedal(maria);
		// Winner of double sweden-spain-nobody

		System.out.println("  Sweden wins gold in Biathlon mixed Rel");
		biathlonMixedRelay.setGoldMedal(swedishBiathlonTeam);
		biathlonMixedRelay.setSilverMedal(spanishBiathlonTeam);
		biathlonMixedRelay.setBronzeMedal(norwegianBiathlonTeam);

		return games;

	}

	private Athlete setAthleteParametes(String name) {
		Athlete a = factory.createAthlete();
		a.setName(name);
		setAthleteParameters(a);
		return a;
	}

	private IndividualEvent biathlonMen10k = factory.createIndividualEvent();
	private IndividualEvent biathlonWomen15k = factory.createIndividualEvent();
	private TeamEvent biathlonMixedRelay = factory.createTeamEvent();

	private Discipline getcreateDisciplineBiathlon() {
		Discipline biathlon = factory.createDiscipline();
		biathlon.setName("Biathlon");

		biathlonMen10k.setName("Biathlon Men 10K");
		biathlonWomen15k.setName("Biathlon Women 15K");
		biathlonMixedRelay.setName("Biathlon Mixed relay 4x6K");

		biathlon.addEvent(biathlonMen10k);
		biathlon.addEvent(biathlonWomen15k);
		biathlon.addEvent(biathlonMixedRelay);

		return biathlon;

	}

	private void setAthleteParameters(Athlete a) {
		a.setAge(16 + gen.nextInt(20));
		a.setWeight(50.0 + gen.nextDouble(30));

	}

	private static void setupResource() {
		rs = new ResourceSetImpl();

		String[] fileextensions = new String[] { "olympics" };

		for (String fileext : fileextensions) {
			rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put(fileext, new XMLResourceFactoryImpl());
		}

	}

	private void save(OlympicGames theGames, String filename) {
		URI uri = URI.createFileURI(filename);
		Resource gamesResource = rs.createResource(uri);
		((ResourceImpl) gamesResource).setIntrinsicIDToEObjectMap(new HashMap());

		gamesResource.getContents().add(theGames);
		System.out.println("In the middle of saving...");
		Map saveOptions = ((XMLResource) gamesResource).getDefaultSaveOptions();
		saveOptions.put(XMLResource.OPTION_CONFIGURATION_CACHE, Boolean.TRUE);
		saveOptions.put(XMLResource.OPTION_USE_CACHED_LOOKUP_TABLE, new ArrayList());
		try {
			gamesResource.save(saveOptions);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

	}

}

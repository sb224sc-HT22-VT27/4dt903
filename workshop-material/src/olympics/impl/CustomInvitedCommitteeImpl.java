package olympics.impl;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;

import olympics.Athlete;
import olympics.InvitedCommittee;
import olympics.OlympicsPackage;
import olympics.Team;

public class CustomInvitedCommitteeImpl extends InvitedCommitteeImpl {

	public CustomInvitedCommitteeImpl() {
		super();
		
		Adapter adapter = new AdapterImpl() {
            public void notifyChanged(Notification n) {
                InvitedCommittee ev = (InvitedCommittee) n.getNotifier();
               // System.out.println("The name of the notifier of the event is " + ev.getName());
                int t = n.getEventType();
                int f = n.getFeatureID(OlympicsPackage.class);
                
                if(t==Notification.SET && f==OlympicsPackage.INVITED_COMMITTEE__NUMBER_OF_GOLD_MEDALS) {
                	System.out.println("New Gold Medal for " + ev.getName() + " !!!!");
                    
                
                }
                	
            }
        };
        eAdapters().add(adapter);
	}
	
	
	@Override
	public void addTeam(Team theTeam) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		getTeams().add(theTeam);
	}


	@Override
	public void addAthlete(Athlete theAthlete) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		getAthletes().add(theAthlete);
	}
	

	
	
}

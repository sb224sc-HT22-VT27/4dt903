package olympics.impl;

import olympics.InvitedCommittee;
import olympics.OlympicsPackage;
import olympics.Team;
import olympics.TeamEvent;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;

public class CustomTeamEventImpl extends TeamEventImpl {

	public CustomTeamEventImpl() {
		super();
		
		Adapter adapter = new AdapterImpl() {
            public void notifyChanged(Notification n) {
                TeamEvent ev = (TeamEvent) n.getNotifier();
                //System.out.println("The name of the notifier of the event is " + ev.getName());
                int t = n.getEventType();
                int f = n.getFeatureID(OlympicsPackage.class);
                
                if(t==Notification.SET && f==OlympicsPackage.TEAM_EVENT__GOLD_MEDAL) {
                	//Athlete olda = (Athlete) n.getOldValue();
                    Team newt = (Team) n.getNewValue();
                	newt.getWinnerOf().add(ev);
                	InvitedCommittee comm = (InvitedCommittee) newt.eContainer();
                	comm.setNumberOfGoldMedals(comm.getNumberOfGoldMedals()+1);
                
                }
                	
            }
        };
        eAdapters().add(adapter);
	}
	


}

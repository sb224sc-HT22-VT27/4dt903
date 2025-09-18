package olympics.impl;

import olympics.IndividualEvent;
import olympics.OlympicsPackage;
import olympics.Athlete;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;

public class CustomIndividualEventImpl extends IndividualEventImpl {

	public CustomIndividualEventImpl() {
		super();
		
		Adapter adapter = new AdapterImpl() {
            public void notifyChanged(Notification n) {
                IndividualEvent ev = (IndividualEvent) n.getNotifier();
                //System.out.println("The name of the notifier of the event is " + ev.getName());
                int t = n.getEventType();
                int f = n.getFeatureID(OlympicsPackage.class);
                
                if(t==Notification.SET && f==OlympicsPackage.INDIVIDUAL_EVENT__GOLD_MEDAL) {
                    Athlete newa = (Athlete) n.getNewValue();
                	newa.getWinnerOf().add(ev);
                	newa.getInvitedcommittee().setNumberOfGoldMedals(newa.getInvitedcommittee().getNumberOfGoldMedals()+1);
                }
                	
            }
        };
        eAdapters().add(adapter);
	}
	


}

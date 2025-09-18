package olympics.impl;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EReference;

import olympics.Athlete;
import olympics.OlympicsPackage;
import olympics.TeamEvent;

public class CustomTeamImpl extends TeamImpl {

	

	@Override
	public void addMember(Athlete theAthlete) {
		getTeamMembers().add(theAthlete);
	}

	public CustomTeamImpl() {
		super();


		Adapter adapter = new AdapterImpl() {
			public void notifyChanged(Notification n) {
				super.notifyChanged(n);
				//Team ev = (Team) n.getNotifier();
				//System.out.println("   CustomTeamImpl The name of the notifier of the event is " + ev.getName()
				//		+ " the event type= " + n.getEventType() + " the featureID=" + n.getFeatureID(OlympicsPackage.class));
				int t = n.getEventType();
				int f = n.getFeatureID(OlympicsPackage.class);
				// String classobject = n.getNewValue().getClass().getCanonicalName();
				// System.out.println(" and the event type=" +t +" and feature_id=" + f + " and
				// the class of the new value is: " + classobject);

				if (t == Notification.ADD && f == 1 && ((EReference) n.getFeature()).getName().equals("winnerOf")) {
					TeamEvent newte = (TeamEvent) n.getNewValue();
					for (Athlete a : getTeamMembers()) {
						a.getWinnerOf().add(newte);
					}
				}

			}
		};
		eAdapters().add(adapter);
	}

}

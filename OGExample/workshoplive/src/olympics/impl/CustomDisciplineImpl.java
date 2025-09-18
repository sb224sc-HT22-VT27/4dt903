package olympics.impl;

import olympics.Event;

public class CustomDisciplineImpl extends DisciplineImpl{

	@Override
	public void addEvent(Event theEvent) {
		getEvents().add(theEvent);
	}
	
}

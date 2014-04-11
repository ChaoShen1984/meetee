/**
 * 
 */
package com.chao.apps.meetee.datastore;

import java.util.Date;
import java.util.List;

import com.chao.apps.meetee.datamodel.Address;
import com.chao.apps.meetee.datamodel.Description;
import com.chao.apps.meetee.datamodel.Event;
import com.chao.apps.meetee.datamodel.Person;

/**
 * EventData interface
 * Provided API to do event level data operation
 * 
 * @author chaoshen
 *
 */
public interface EventData {
	
	public void saveEvent(Event event);
	
	public Event getEventById(int eventId);
	
	public List<Event> getEventByName(String eventName);
	
	public List<Event> getEventByAddress(Address address);
	
	public List<Event> getEventByOrganizer(Person organizer);
	
	public List<Event> getEventByTime(Date time);
	
	public List<Event> getEventByDescription(Description description);
	
	public List<Event> getEvent(Event event);

}

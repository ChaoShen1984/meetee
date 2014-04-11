package com.chao.apps.meetee.datastore.impl;

import java.util.Date;
import java.util.List;

import com.chao.apps.meetee.datamodel.Address;
import com.chao.apps.meetee.datamodel.Description;
import com.chao.apps.meetee.datamodel.Event;
import com.chao.apps.meetee.datamodel.Person;
import com.chao.apps.meetee.datastore.EventData;

/**
 * @author chaoshen
 *
 */
public class EventImp implements EventData{

	@Override
	public void saveEvent(Event event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Event getEventById(int eventId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Event> getEventByName(String eventName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Event> getEventByAddress(Address address) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Event> getEventByOrganizer(Person organizer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Event> getEventByTime(Date time) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Event> getEventByDescription(Description description) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Event> getEvent(Event event) {
		// TODO Auto-generated method stub
		return null;
	}

}

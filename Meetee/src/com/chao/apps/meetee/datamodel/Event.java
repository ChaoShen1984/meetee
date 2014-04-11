/**
 * 
 */
package com.chao.apps.meetee.datamodel;

import java.util.Date;
import java.util.List;

/**
 * Event data model
 * Attributes:
 * String eventName
 * Address address;
 * List persons
 * Date time;
 * String action;
 * Description description;
 * int eventType;
 * 
 * @author chaoshen
 *
 */
public class Event {
	public static final int MEETING_EVENT_TYPE = 0;
	public static final int PARTY_EVENT_TYPE = 1;
	
	private String eventName;
	private Address address;
	private List<Person> persons;
	private Date time;
	private String action;
	private List<Description> descriptions;
	private int eventType;
	private int eventId;
	
	/**
	 * @return the eventName
	 */
	public String getEventName() {
		return eventName;
	}
	/**
	 * @param eventName the eventName to set
	 */
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}
	/**
	 * @return the persons
	 */
	public List<Person> getPersons() {
		return persons;
	}
	/**
	 * @param persons the persons to set
	 */
	public void setPersons(List<Person> persons) {
		this.persons = persons;
	}
	/**
	 * @return the time
	 */
	public Date getTime() {
		return time;
	}
	/**
	 * @param time the time to set
	 */
	public void setTime(Date time) {
		this.time = time;
	}
	/**
	 * @return the action
	 */
	public String getAction() {
		return action;
	}
	/**
	 * @param action the action to set
	 */
	public void setAction(String action) {
		this.action = action;
	}
	/**
	 * @return the descriptions
	 */
	public List<Description> getDescriptions() {
		return descriptions;
	}
	/**
	 * @param descriptions the descriptions to set
	 */
	public void setDescriptions(List<Description> descriptions) {
		this.descriptions = descriptions;
	}
	/**
	 * @return the eventType
	 */
	public int getEventType() {
		return eventType;
	}
	/**
	 * @param eventType the eventType to set
	 */
	public void setEventType(int eventType) {
		this.eventType = eventType;
	}
	/**
	 * @return the eventId
	 */
	public int getEventId() {
		return eventId;
	}
	/**
	 * @param eventId the eventId to set
	 */
	public void setEventId(int eventId) {
		this.eventId = eventId;
	}

}

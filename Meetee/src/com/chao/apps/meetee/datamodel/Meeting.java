/**
 * 
 */
package com.chao.apps.meetee.datamodel;

/**
 * Meeting data model extends from Event
 * Have fixed event type of meeting.
 * 
 * @author chaoshen
 *
 */
public class Meeting extends Event{
	
	public Meeting(){
		this.setEventType(Event.MEETING_EVENT_TYPE);
	}
}

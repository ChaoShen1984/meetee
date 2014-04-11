/**
 * 
 */
package com.chao.apps.meetee.datamodel;

/**
 * PersonRelation data model
 * Attributes:
 * Person person;
 * Person relatedPerson;
 * int Relationship;
 * 
 * @author chaoshen
 *
 */
public class PersonRelation {
	public static final int FRIEND_RELATIONSHIP = 0;
	public static final int EVENT_ORGANIZER_PARTICIPANT_RELATIONSHIP = 1;
	
	private Person person;
	private Person relatedPerson;
	private int relationship;
	private int relationshipId;
	
	/**
	 * @return the person
	 */
	public Person getPerson() {
		return person;
	}
	/**
	 * @param person the person to set
	 */
	public void setPerson(Person person) {
		this.person = person;
	}
	/**
	 * @return the relatedPerson
	 */
	public Person getRelatedPerson() {
		return relatedPerson;
	}
	/**
	 * @param relatedPerson the relatedPerson to set
	 */
	public void setRelatedPerson(Person relatedPerson) {
		this.relatedPerson = relatedPerson;
	}
	/**
	 * @return the relationship
	 */
	public int getRelationship() {
		return relationship;
	}
	/**
	 * @param relationship the relationship to set
	 */
	public void setRelationship(int relationship) {
		this.relationship = relationship;
	}
	/**
	 * @return the relationshipId
	 */
	public int getRelationshipId() {
		return relationshipId;
	}
	/**
	 * @param relationshipId the relationshipId to set
	 */
	public void setRelationshipId(int relationshipId) {
		this.relationshipId = relationshipId;
	}
}

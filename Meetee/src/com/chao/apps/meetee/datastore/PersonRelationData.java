package com.chao.apps.meetee.datastore;

import java.util.List;

import com.chao.apps.meetee.datamodel.Person;
import com.chao.apps.meetee.datamodel.PersonRelation;

/**
 * PersonRelation interface
 * Provides API for person relation level data operations
 * 
 * @author chaoshen
 *
 */
public interface PersonRelationData {
	
	public PersonRelation createRelationshipBetween(Person person, Person relatedPerson, int relationship);
	
	public void savePersonRelation(PersonRelation personRelation);
	
	public PersonRelation getPersonRelationById(int personRelationId);
	
	public List<PersonRelation> getPersonRelationByPerson(Person person);
	
	public List<PersonRelation> getPersonRelationByrelatedPerson(Person relatedPerson);
	
	public List<PersonRelation> getPersonRelation(PersonRelation personRelation);
}

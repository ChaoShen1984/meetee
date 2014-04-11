/**
 * 
 */
package com.chao.apps.meetee.datastore.impl;

import java.util.List;

import com.chao.apps.meetee.datamodel.Person;
import com.chao.apps.meetee.datamodel.PersonRelation;
import com.chao.apps.meetee.datastore.PersonRelationData;

/**
 * @author chaoshen
 *
 */
public class PersonRelationImpl implements PersonRelationData{

	@Override
	public PersonRelation createRelationshipBetween(Person person,
			Person relatedPerson, int relationship) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void savePersonRelation(PersonRelation personRelation) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public PersonRelation getPersonRelationById(int personRelationId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PersonRelation> getPersonRelationByPerson(Person person) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PersonRelation> getPersonRelationByrelatedPerson(
			Person relatedPerson) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PersonRelation> getPersonRelation(PersonRelation personRelation) {
		// TODO Auto-generated method stub
		return null;
	}

}

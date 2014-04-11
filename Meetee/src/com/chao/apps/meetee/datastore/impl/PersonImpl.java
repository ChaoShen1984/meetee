/**
 * 
 */
package com.chao.apps.meetee.datastore.impl;

import java.util.List;

import com.chao.apps.meetee.datamodel.Person;
import com.chao.apps.meetee.datastore.PersonData;

/**
 * @author chaoshen
 *
 */
public class PersonImpl implements PersonData{

	@Override
	public void savePerson(Person person) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Person findPerson(int personId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Person> findPersonByName(String personName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Person findPersonByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Person findPersonByPhone(String phone) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean modifyPerson(int personId, Person modifiedPerson) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Person> findPerson(Person person) {
		// TODO Auto-generated method stub
		return null;
	}

}

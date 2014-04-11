/**
 * 
 */
package com.chao.apps.meetee.datastore;

import java.util.List;

import com.chao.apps.meetee.datamodel.Person;

/**
 * PersonData interface
 * Provides API for person level data operations
 * 
 * @author chaoshen
 *
 */
public interface PersonData {
	
	public void savePerson(Person person);
	
	public Person findPerson(int personId);
	
	public List<Person> findPersonByName(String personName);
	
	public Person findPersonByEmail(String email);
	
	public Person findPersonByPhone(String phone);
	
	public boolean modifyPerson(int personId, Person modifiedPerson);
	
	public List<Person> findPerson(Person person);
}

/**
 * 
 */
package com.chao.apps.meetee.datastore.impl.test;

import java.util.List;

import com.chao.apps.meetee.datamodel.Address;
import com.chao.apps.meetee.datastore.AddressData;
import com.chao.apps.meetee.datastore.impl.AddressImpl;

/**
 * Test AddressImpl class
 * @author chaoshen
 *
 */
public class AddressImplTest {
	
	public void testSave(){
		AddressData addressDAO = new AddressImpl();
		Address address = new Address();
		address.setCity("LEES SUMMIT");
		address.setState("MO");
		address.setStreetAddress1("1129 NE Franklin DR.");
		address.setZipcode("64064");
		addressDAO.saveAddress(address);
	}
	
	public void testGet(){
		AddressData addressDAO = new AddressImpl();
		Address address = new Address();
		address.setZipcode("64064");
		List<Address> addresses = addressDAO.getAddress(address);
		System.out.println("getAddress returns " + addresses.size() + " results for zip code 64064");
		System.out.println("They are like below:");
		for(Address currentAddress : addresses){
			System.out.println(currentAddress.toString());
		}
	}

}

/**
 * 
 */
package com.chao.apps.meetee.datastore;

import java.util.List;

import com.chao.apps.meetee.datamodel.Address;

/**
 * AddressData interface
 * Provided interface to address level data operations
 * 
 * @author chaoshen
 *
 */
public interface AddressData {

	public void saveAddress(Address address);
	
	public List<Address> getAddress(Address address);
}

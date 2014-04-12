/**
 * 
 */
package com.chao.apps.meetee.datastore.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.chao.apps.meetee.connection.ConnectionFactory;
import com.chao.apps.meetee.datamodel.Address;
import com.chao.apps.meetee.datastore.AddressData;
import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.FetchOptions;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.PreparedQuery;
import com.google.appengine.api.datastore.Query;
import com.google.appengine.api.datastore.Query.CompositeFilterOperator;
import com.google.appengine.api.datastore.Query.Filter;
import com.google.appengine.api.datastore.Query.FilterOperator;
import com.google.appengine.api.datastore.Query.FilterPredicate;

/**
 * @author chaoshen
 *
 */
public class AddressImpl implements AddressData{
	
	private DatastoreService connection;
	private Key ancestor;
	private Entity addressEntity;
	private Query addressQuery;
	private Filter addressFilter;
	private static final String addressEntityKey = "ADDRESS";
	private HashMap<String, Object> addressMapping;
	
	public AddressImpl(){
		this.connection = (DatastoreService)ConnectionFactory.createConnection(ConnectionFactory.GOOGLE_STORE_CONNECTION);
	}
	
	public AddressImpl(Key ancestor){
		this();
		this.ancestor = ancestor;
	}

	@Override
	public void saveAddress(Address address) {
		if(address.getAddressId() == 0){
			address.setAddressId(connection.allocateIds(addressEntityKey, 1l).getStart().getId());
		}
		addressEntity = createEntity();
		addressMapping = createMapping(address);
		for(String key : addressMapping.keySet()){
			addressEntity.setProperty(key, addressMapping.get(key));
		}
		connection.put(addressEntity);
	}

	@Override
	public List<Address> getAddress(Address address) {
		List<Address> addresses = new ArrayList<Address>();
		addressMapping = createMapping(address);
		addressQuery = createQuery();
		addressFilter = createFilter(addressMapping);
		addressQuery.setFilter(addressFilter);
		PreparedQuery pq = connection.prepare(addressQuery);
		List<Entity> addressEntities = pq.asList(FetchOptions.Builder.withDefaults());
		for(Entity entity: addressEntities){
			addresses.add(castEntityToAddress(entity));
		}
		return addresses;
	}
	
	private Entity createEntity(){
		if(ancestor != null){
			return new Entity(addressEntityKey, ancestor); 
		}else{
			return new Entity(addressEntityKey);
		}
	}
	
	private Query createQuery(){
		if(ancestor != null){
			return new Query(addressEntityKey, ancestor); 
		}else{
			return new Query(addressEntityKey);
		}
	}
	
	private Filter createFilter(HashMap<String, Object> mapping){
		Filter masterFilter = null;
		for(String key : mapping.keySet()){
			if(mapping.get(key) != null){
				if(masterFilter == null){
					masterFilter = new FilterPredicate(key, FilterOperator.EQUAL, mapping.get(key));
				}else{
					masterFilter = CompositeFilterOperator.and(masterFilter, new FilterPredicate(key, FilterOperator.EQUAL, mapping.get(key)));
				}
			}
		}
		return masterFilter;
	}
	
	private HashMap<String, Object> createMapping(Address address){
		HashMap<String, Object> mapping = new HashMap<String, Object>();
		mapping.put("STREETADDRESS1", address.getStreetAddress1());
		mapping.put("STREETADDRESS2", address.getStreetAddress2());
		mapping.put("CITY", address.getCity());
		mapping.put("STATE", address.getState());
		mapping.put("ZIPCODE", address.getZipcode());
		mapping.put("ADDRESSID", address.getAddressId());
		return mapping;
	}
	
	private Address castEntityToAddress(Entity entity){
		Address address = new Address();
		address.setStreetAddress1((String)entity.getProperty("STREETADDRESS1"));
		address.setStreetAddress2((String)entity.getProperty("STREETADDRESS2"));
		address.setCity((String)entity.getProperty("CITY"));
		address.setState((String)entity.getProperty("STATE"));
		address.setZipcode((String)entity.getProperty("ZIPCODE"));
		address.setAddressId((Long)entity.getProperty("ADDRESSID"));
		return address;
	}
}

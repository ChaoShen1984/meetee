/**
 * 
 */
package com.chao.apps.meetee.connection;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;

/**
 * ConnectionFactory
 * Used to connection to data source
 * 
 * @author chaoshen
 *
 */
public class ConnectionFactory {
	
	public static final int GOOGLE_STORE_CONNECTION = 0;
	/**
	 * Not yet support.
	 */
	public static final int ORACLE_DB_CONNECTION = 1;
	
	public static Object createConnection(int connectionType){
		Object connection = null;
		switch (connectionType) {
		case GOOGLE_STORE_CONNECTION:
			DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();
			connection = datastore;
			break;
		case ORACLE_DB_CONNECTION:
			//TODO: when need to connection to oracle db.
			break;
		default:
			break;
		}
		return connection;
	}

}

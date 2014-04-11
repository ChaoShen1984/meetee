/**
 * 
 */
package com.chao.apps.meetee.datastore;

import com.chao.apps.meetee.datamodel.User;

/**
 * UserData interface
 * Provided API to do user level data operations.
 * 
 * @author chaoshen
 *
 */
public interface UserData extends PersonData{
	
	public void saveUser(User user);
	
	public boolean changePassword(int userId, String password);
	
	public void changeTempToken(int userId, String tempToken);

}

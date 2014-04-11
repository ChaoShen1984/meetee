/**
 * 
 */
package com.chao.apps.meetee.datamodel;

/**
 * User data model extends from Person
 * Attributes:
 * String Password;
 * 
 * @author chaoshen
 *
 */
public class User extends Person{
	
	private String password;
	private String tempToken;

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the tempToken
	 */
	public String getTempToken() {
		return tempToken;
	}

	/**
	 * @param tempToken the tempToken to set
	 */
	public void setTempToken(String tempToken) {
		this.tempToken = tempToken;
	}

}

/**
 * 
 */
package com.chao.apps.meetee.datamodel;

/**
 * Address data model
 * Attributes:
 * String streetAddress1;
 * String streetAddress2;
 * String city;
 * String state;
 * String zipCode;
 * Long addressId;
 * 
 * @author chaoshen
 *
 */
public class Address {
	
	private String streetAddress1;
	private String streetAddress2;
	private String city;
	private String state;
	private String zipcode;
	private Long addressId;
	
	/**
	 * @return the streetAddress1
	 */
	public String getStreetAddress1() {
		return streetAddress1;
	}
	/**
	 * @param streetAddress1 the streetAddress1 to set
	 */
	public void setStreetAddress1(String streetAddress1) {
		this.streetAddress1 = streetAddress1;
	}
	/**
	 * @return the streetAddress2
	 */
	public String getStreetAddress2() {
		return streetAddress2;
	}
	/**
	 * @param streetAddress2 the streetAddress2 to set
	 */
	public void setStreetAddress2(String streetAddress2) {
		this.streetAddress2 = streetAddress2;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * @return the zipcode
	 */
	public String getZipcode() {
		return zipcode;
	}
	/**
	 * @param zipcode the zipcode to set
	 */
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	/**
	 * @return the addressId
	 */
	public Long getAddressId() {
		return addressId;
	}
	/**
	 * @param addressId the addressId to set
	 */
	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Address [streetAddress1=" + streetAddress1
				+ ", streetAddress2=" + streetAddress2 + ", city=" + city
				+ ", state=" + state + ", zipcode=" + zipcode + ", addressId="
				+ addressId + "]";
	}

}

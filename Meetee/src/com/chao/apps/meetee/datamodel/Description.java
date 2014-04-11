/**
 * 
 */
package com.chao.apps.meetee.datamodel;

/**
 * Description data model
 * Attribute:
 * int descriptionType;
 * String descriptionContent;
 * 
 * @author chaoshen
 *
 */
public class Description {
	public static final int PICTURE_DESCRIPTION = 0;
	public static final int TEXT_DESCRIPTION = 1;
	
	private int descriptionType;
	private String descriptionContent;
	private int descriptionId;

	/**
	 * @return the descriptionType
	 */
	public int getDescriptionType() {
		return descriptionType;
	}
	/**
	 * @param descriptionType the descriptionType to set
	 */
	public void setDescriptionType(int descriptionType) {
		this.descriptionType = descriptionType;
	}
	/**
	 * @return the descriptionContent
	 */
	public String getDescriptionContent() {
		return descriptionContent;
	}
	/**
	 * @param descriptionContent the descriptionContent to set
	 */
	public void setDescriptionContent(String descriptionContent) {
		this.descriptionContent = descriptionContent;
	}
	/**
	 * @return the descriptionId
	 */
	public int getDescriptionId() {
		return descriptionId;
	}
	/**
	 * @param descriptionId the descriptionId to set
	 */
	public void setDescriptionId(int descriptionId) {
		this.descriptionId = descriptionId;
	}

}

/**
 * 
 */
package com.chao.apps.meetee.datastore;

import java.util.List;

import com.chao.apps.meetee.datamodel.Description;

/**
 * DescriptionData interface
 * Provided API to do description level operations.
 * 
 * @author chaoshen
 *
 */
public interface DescriptionData {
	
	public void saveDescription(Description description);
	
	public List<Description> getDescription(Description description);
}

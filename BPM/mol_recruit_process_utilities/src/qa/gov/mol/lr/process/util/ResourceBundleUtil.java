/**
 * Class ResourceBundleUtil
 * This is a helper class for getting values from resource bundle 
 * @author Tlatif
 * @copyright (C) GBM/ictQATAR 2010
 * @date 21.03.2010
 * @history 
 */
package qa.gov.mol.lr.process.util;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleUtil {
	private static final String COMMON_PROPERTIES_FILE = "qa.gov.mol.lr.process.config.ProcessConfig"; //$NON-NLS-1$
	/**
	* This method populates a <code>Hashtable</code> with the properties from a resource file.
	* 
	* @param resourceName is the resource bundle
	* @return Hashtable of the key value pairs 
	*/
	public static Hashtable readProperties(String resourceName) {
		Hashtable returnTable = new Hashtable();
		try {
			ResourceBundle resourceBundle = ResourceBundle.getBundle(resourceName);
			Enumeration enumProperties = resourceBundle.getKeys();
			String key = null;
			String value = null;
			while (enumProperties.hasMoreElements()) {	
				key = (String) enumProperties.nextElement();
				value = resourceBundle.getString(key);
				returnTable.put(key, value);
			}
		} catch(Exception e) {
			//This method should not throws any exception
		}
		return returnTable;
	}
	
	/**
	* This method gets a <code>String</code> value for the supplied key from a supplied resource file.
	* 
	* @param resourceName is the resource bundle
	* @param key is the key for which a value is returned
	* @return String of the value of the supplied key 
	*/
	public static String getString(String resourceName, String key) {
		try {
			ResourceBundle resourceBundle = ResourceBundle.getBundle(resourceName);
			return resourceBundle.getString(key);
		} catch (Exception e) {
//			This method should not throws any exception
			return "";
		}
	}
	/**
	* This method gets a <code>String</code> value for the supplied key from a supplied resource file.
	* 
	* @param resourceName is the resource bundle
	* @param key is the key for which a value is returned
	* @param locale Locale used to determine the properties file to read from
	* @return String of the value of the supplied key 
	*/
	public static String getString(String resourceName, String key, Locale locale) {
		try {
			ResourceBundle resourceBundle = ResourceBundle.getBundle(resourceName, locale);
			return resourceBundle.getString(key);
		} catch (Exception e) {
//			This method should not throws any exception
			return "";
		}
	}
	/**
	* This method gets a <code>String</code> value for the supplied key from a supplied resource file.
	* 
	* @param resourceName is the resource bundle
	* @param key is the key for which a value is returned
	* @return String of the value of the supplied key 
	*/
	public static String getString(String key) {
		return getString(COMMON_PROPERTIES_FILE, key);
	}

}

/**
 * Class ResourceBundleUtil
 * This is a helper class used from business processes ,i.e creating process correlation ID 
 * @author Tlatif
 * @copyright (C) GBM/ictQATAR 2010
 * @date 21.03.2010
 * @history 
 */
package qa.gov.mol.lr.process.util;

public class ProcessUtil {
	/**
	 * Method createCorrelation
	 * This method is responsible of creating createCorrelation ID for a business process instance
	 * in the following format : applicationNo+"#"+year
	 * @param applicationNo,year
	 * @return applicationNo+"#"+year
	 */	
	public static String createCorrelation(String applicationNo,String year){
		return applicationNo+"#"+year;
	}

}

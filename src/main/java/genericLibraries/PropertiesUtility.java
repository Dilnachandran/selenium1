package genericLibraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * This class contain reusable methods to perform actions on property file
 * @author nikhildas
 *
 */
public class PropertiesUtility {
	private Properties property;
	/**
	 * this method is used to initialize properties file
	 * @param filePath
	 */
	public void propertiesInitialization(String filePath)
	{
		//if we use throw exception will be propegate....
		
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(filePath);
		} catch(FileNotFoundException e){
			e.printStackTrace();
		}
		 property = new Properties();
		try {
			property.load(fis);
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public  String fetchProperty(String key)
	{
		return property.getProperty(key);
	}
}

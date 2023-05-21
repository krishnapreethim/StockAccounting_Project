package utilities;

import java.util.Properties;
import java.io.FileOutputStream;

public class PropertyFileUtil
{
	public static String getValueForKey(String key) throws Exception
	{
	    Properties conprop = new Properties();
		conprop.load(new FileInputStream("./PropertyFiles/Environment.properties"));
		return conprop.getProperty(key);
		}

	

}

package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileUtil
{
	public static String getValueForKey(String key) throws Exception
	{
	    Properties conprop = new Properties();
		conprop.load(new FileInputStream("./PropertyFiles/Environment.properties"));
		return conprop.getProperty(key);
		}

	

}

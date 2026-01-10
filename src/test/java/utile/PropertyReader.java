package utile;

import java.io.InputStream;
import java.util.Properties;

public class PropertyReader {

    private static Properties properties = new Properties();
    
    static
    {
    	try
    	{
    		InputStream input = PropertyReader.class
				    			.getClassLoader()
				    			.getResourceAsStream("locators.properties"); // InputStream is the like a pipe through which Java can read file data
    		properties.load(input); //Read everything from the pipe and store it inside properties object
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    public static String get(String key)
    {
    	return properties.getProperty(key);
    }
}

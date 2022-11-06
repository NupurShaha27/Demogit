package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {

	public String getproperties(String prop) throws IOException
	{
		Properties p= new Properties();
		
		FileInputStream filename= new FileInputStream("D:\\sample\\Poratl_Cases\\src\\Properties\\Test.properties");
		p.load(filename);
		String value=p.getProperty(prop);
		return value;
		
		
		
	}
}

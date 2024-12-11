package Com.Crm.fileutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesDWS {

	public static String property(String key) throws IOException
	{
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("..//com.crm.finalMockA6//src//test//resources//DWSLogin.properties");
		prop.load(fis);
		String data=prop.getProperty(key);
		return data;
	}
}

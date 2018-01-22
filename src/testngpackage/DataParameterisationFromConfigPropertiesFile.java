package testngpackage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;
public class DataParameterisationFromConfigPropertiesFile {
	@Test
	public void takeDataFromPropertyFile() throws FileNotFoundException, IOException{
		Properties prop = new Properties();
		prop.load(new FileInputStream("./config.properties"));
		String url = prop.getProperty("url");
		System.out.println(url);
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
	}
}

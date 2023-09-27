package KeywordDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./data/config.properties");
        
		Properties prop = new Properties();
		
		prop.load(fis);
		
		String propertyData = prop.getProperty("Browser");
		System.out.println(propertyData);
	}

}

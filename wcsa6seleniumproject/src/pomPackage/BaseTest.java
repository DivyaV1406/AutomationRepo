package pomPackage;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import KeywordDrivenFramework.Flib;

public class BaseTest extends Flib implements IautoConstant{
static WebDriver driver;
	
	public void openBrowser() throws IOException
	{
		//read data from property file to get browser value
		Flib flib = new Flib();
		String browserValue = flib.readPropertyData(PROP_PATH,"Browser");
		String url = flib.readPropertyData(PROP_PATH, "Url");
		
		if (browserValue.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}
		else if (browserValue.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
		}
		
		else if (browserValue.equalsIgnoreCase("Edge")) {
			driver=new EdgeDriver();
		}
		else {
			System.out.println("Invalid Browser value:");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(url);
	}
	
	//To close the browser
	public void closeBrowser()
	{
		driver.quit();
	}


}

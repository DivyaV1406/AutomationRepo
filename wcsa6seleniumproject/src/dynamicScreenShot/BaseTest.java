package dynamicScreenShot;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class BaseTest {
  static WebDriver driver;
  
  @BeforeMethod
  public void setUp()
  {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(35));
	  driver.get("http://127.0.0.1/login.do");
  }
  
  //generic reusable method for take screenshot of failed method
  public void screenshot_of_failedmethod(String failedMethodname)
  {
	  TakesScreenshot ts = (TakesScreenshot)driver;
	 File src = ts.getScreenshotAs(OutputType.FILE);
	 File dest = new File("./Screenshots/"+failedMethodname+".png");
	 
	 try {
	 Files.copy(src, dest);
	 }
	 catch(Exception e)
	 {
		 
	 }
	 
	 
  }
  
  @AfterMethod
  public void tearDown()
  {
	  driver.quit();
  }
}

package testNGExecution;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SerachJava {
  @Test
  public void java_Search_In_Chrome() throws InterruptedException {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(35));
	  
	  driver.get("https://www.google.com");
	  driver.switchTo().activeElement().sendKeys("Java",Keys.ENTER);
	  Reporter.log("Java", true);
	  Thread.sleep(2000);
	  driver.quit();
	  
  }
}

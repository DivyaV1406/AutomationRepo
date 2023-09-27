package TestNGPackage;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class OrangeHRMAssert {
	static WebDriver driver;
  @Test
  public void logIn() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(35));
	  
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  SoftAssert sa = new SoftAssert();
	  sa.assertEquals(driver.getTitle(),"title");//soft assert
	  
	  driver.findElement(By.name("username")).sendKeys("Admin");
	  driver.findElement(By.name("password")).sendKeys("admin123");
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	  
	  String title = "OrangeHRM";
	  Assert.assertEquals(driver.getTitle(),title);//hard assert
	  
	  driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
	  WebElement logout = driver.findElement(By.partialLinkText("Logout"));
	 
	  Assert.assertEquals(logout.isDisplayed(), true);//hard assert
	  
	  logout.click();
	  sa.assertAll();
	  
	  
	  
  }
}

package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NetFlixAuto {

	public static void main(String[] args) throws InterruptedException{

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.netflix.com/in/Login");
		WebElement usn=driver.findElement(By.id("id_userLoginId"));
		usn.sendKeys("adc@1234");
		 Thread.sleep(2000);
		
	    WebElement pass=driver.findElement(By.id("id_password"));
	    pass.sendKeys("1234");
	    Thread.sleep(2000);
	    
	    WebElement Signin=driver.findElement(By.cssSelector("button[type='submit']"));
	    Signin.click();
	    Thread.sleep(4000);
	    
	    driver.close();
		

	}

}

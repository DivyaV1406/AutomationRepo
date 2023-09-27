package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkTextLocator {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("exceptions in selenium");
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("What are the Common Selenium Exceptions and How to ...")).click();
		
	}

}

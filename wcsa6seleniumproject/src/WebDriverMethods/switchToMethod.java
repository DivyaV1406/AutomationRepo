package WebDriverMethods;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchToMethod {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		//use switchTo & switch the control to activeElements on google search box
		Thread.sleep(2000);
		driver.switchTo().activeElement().sendKeys("selenium",Keys.ENTER);
		driver.close();
		
	}

}

package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://127.0.0.1/login.do;jsessionid=1g0lmhmakbt26");
		WebElement username=driver.findElement(By.name("username"));
		username.sendKeys("admin");
		WebElement password=driver.findElement(By.name("pwd"));
		password.sendKeys("manager");
		
		WebElement login=driver.findElement(By.id("loginButton"));
		login.click();
		}

}

package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpliciteWait {

	public static void main(String[] args) {
	WebDriver driver=	new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	
	driver.get("https://shoppersstack.com/");
	//click on any one product
	driver.findElement(By.cssSelector("img[alt='jeans']")).click();
	//identify the box of pin code
	driver.findElement(By.id("Check Delivery")).sendKeys("411033");
	//click on check button
	WebElement checkButton = driver.findElement(By.id("Check"));
	explicitWait(driver,30,checkButton).click();
	//Usin Explicite wait
	//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
	 //wait.until(ExpectedConditions.elementToBeClickable(checkButton)).click();
	   
	}
	public static WebElement explicitWait(WebDriver driver,int sec,WebElement el)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(sec));
		wait.until(ExpectedConditions.elementToBeClickable(el));
		return el;
		
	}
 
}

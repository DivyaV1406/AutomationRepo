package Scenarios21;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class Scenarion7 {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=	new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(35));
		//Launc the  Web Application
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		
		//andle the pop-up
		driver.findElement(By.id("denyBtn")).click();
		//Move the cursor All Jewellery
		WebElement allJw = driver.findElement(By.xpath("//a[text()='All Jewellery ']"));
		Actions act = new Actions(driver);
		act.moveToElement(allJw).perform();
		//select Kadas and click on it
		driver.findElement(By.xpath("//span[text()='Kadas']")).click();
		Thread.sleep(2000);
		
	    //Select any kada
		WebElement pro = driver.findElement(By.xpath("(//a[@id='pid_8968'])[2]"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();",pro);
		Thread.sleep(2000);
		
		//take address of parent Window
		String result = driver.getWindowHandle();
		Set<String> allAddress = driver.getWindowHandles();
		
		for(String match:allAddress)
		{
		if(!result.equals(match))
		{
			driver.switchTo().window(match);
		}
		}
		//Click on the Buy now button
		driver.findElement(By.id("buy-now")).click();
		//Check whether error message is displayed or not
		WebElement error = driver.findElement(By.className("formErrorContent"));
		//error is displayed then close the browser 
		System.out.println(error.isDisplayed());
		driver.quit();
		
		
		
		
		
		
	}

}

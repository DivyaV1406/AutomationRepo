package Scenarios21;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario8 {

	public static void main(String[] args) throws InterruptedException {
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
		//To select the size of bangle
		driver.findElement(By.xpath("//span[@class='icon-ion-android-arrow-dropdown']")).click();
		WebElement size = driver.findElement(By.xpath("//span[text()='2-4(2 4/16\")']"));
		size.click();
		String SizeValue = size.getText();
		//Click on the Buy now button
		driver.findElement(By.id("buy-now")).click();
		
		//get size of bangle in cart 
		WebElement cartSize = driver.findElement(By.name("ringselect"));
		String cartSizeValue = cartSize.getText();
		
		//compare  the size of item in cart page and Compare with selectd size
        System.out.println(SizeValue.equals(cartSizeValue));
        
        driver.quit();
		
	}

}

package WebDriverMethods;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandleFlipKart {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=	new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(35));
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("samsung flip 5");
		driver.findElement(By.className("L0Z3Pu")).submit();
		
		driver.findElement(By.xpath("//div[text()='SAMSUNG Galaxy Z Flip5 (Lavender, 256 GB)']")).click();
		
		//
		String result = driver.getWindowHandle();
		Thread.sleep(2000);
		Set<String> allWindow = driver.getWindowHandles();
		
		for(String add:allWindow)
		{
			
			if(!result.equals(add))
			{
				System.out.println(add);
			driver.switchTo().window(add);	
			}
		}
		
		driver.findElement(By.className("_36yFo0")).sendKeys("411003");
		driver.findElement(By.className("_2P_LDn")).click();
		
		
		
		
		WebElement addCart = driver.findElement(By.className("//div[@class='_1AtVbE col-12-12']/descendant::button[@class='_2KpZ6l _2U9uOA _3v1-ww']"));
		Actions act = new Actions(driver);
		act.doubleClick(addCart);
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();",addCart);
		
		//driver.findElement(By.xpath("//div[text()='Remove']")).click();
		
		

	}

}

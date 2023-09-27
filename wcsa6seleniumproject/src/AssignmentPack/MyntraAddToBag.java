package AssignmentPack;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MyntraAddToBag {

	public static void main(String[] args) throws AWTException, InterruptedException {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");

		WebDriver driver=	new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(35));

		driver.get("https://www.myntra.com/");


		String mynt = driver.getWindowHandle();
		//identify the search bar and send the 'shoes'
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("Shoes");
        //To click on ENTER key
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
        //to select the 1st product
		WebElement pro = driver.findElement(By.xpath("//div[@class='product-productMetaInfo']/descendant::h3[@class='product-brand']/following-sibling::h4[text()='Men Clarkin Sneakers']"));
		pro.click();
		Set<String> allWind = driver.getWindowHandles();
		for(String pr:allWind)
		{
			//to switch the control to the child window 
			if(!mynt.equals(pr))
			{
				driver.switchTo().window(pr);
			}
		}
		//to select the size
		driver.findElement(By.xpath("//p[text()='7']")).click();
        //to enter the pin code
		driver.findElement(By.xpath("//input[@placeholder='Enter pincode']")).sendKeys("411003");
		driver.findElement(By.xpath("//input[@value='Check']")).click();
        //Click on add to Bag 
		driver.findElement(By.xpath("//div[text()='ADD TO BAG']")).click();
        //Click on Bag icon
		driver.findElement(By.xpath("//span[text()='Bag']")).click();
        //to Handle the Pop-up
		driver.findElement(By.xpath("//div[contains(@class,'itemContainer-base-item ') ]")).click();	 
		Thread.sleep(2000);
		//To select the removing product
		driver.findElement(By.xpath("//div[@class='itemComponents-base-animationContainer ']")).click(); 	    
		driver.findElement(By.xpath("//div[@class='itemComponents-base-animationContainer ']")).click();
		Thread.sleep(2000);
		//Click on Remove
		driver.findElement(By.xpath("//button[text()='REMOVE']")).click();
		//To click on Remove in Pop-up
		driver.findElement(By.xpath("//button[text()='REMOVE' and (@class='inlinebuttonV2-base-actionButton ')]")).click();
		
		driver.quit();
	}

}

package AssignmentPack;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssignmentOnRobotandActions1 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Not now']")).click();
		
		WebElement target = driver.findElement(By.xpath("//a[@title='Watch Jewellery']"));
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		act.moveToElement(target).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='Band']")).click();
		
		//identify the filterby web Element
		WebElement filterBy = driver.findElement(By.xpath("//span[text()='FILTERED BY']"));
		
		//Copy the orderBy 
		for(int i=0;i<2;i++)
		{
		act.doubleClick(filterBy).perform();
		act.clickAndHold(filterBy).perform();
		}
		
		Robot robot = new Robot();
		//Copy the 'order By' 
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_C);
	
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_C);
		
		driver.findElement(By.id("search_query_top_elastic_search")).click();

		//Paste the copied text in search bar
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		
		driver.findElement(By.name("submit_search")).submit();
		
		Thread.sleep(5000);
		driver.quit();

	}

}

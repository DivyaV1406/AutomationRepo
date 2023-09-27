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

public class InspectNextWebEleAssign {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		driver.get("https://www.selenium.dev/");
		WebElement target = driver.findElement(By.xpath("//h2[text()='Getting Started']"));
		Actions act=new Actions(driver);
		act.moveToElement(target);
		Thread.sleep(2000);
		act.contextClick().perform();
		
		//Robot object 
		Thread.sleep(2000);
		Robot robot = new Robot();
		
		for(int i=0;i<10;i++)
		{
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
			Thread.sleep(2000);
		}
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(8000);
		driver.quit();
	
	}

}

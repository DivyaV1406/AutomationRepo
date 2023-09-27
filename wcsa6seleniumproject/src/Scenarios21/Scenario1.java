package Scenarios21;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
		
		driver.navigate().to("https://jqueryui.com/droppable/");
		Thread.sleep(2000);
		// to handle the iframe
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		//identitfy the source 'draggable'
		WebElement scr = driver.findElement(By.id("draggable"));
		Thread.sleep(2000);
		//identify the target 'droppable'
		WebElement target = driver.findElement(By.id("droppable"));
		Actions act=new Actions(driver);
		act.dragAndDrop(scr, target).perform();
		//identify 'Dropped' element
		 String text = driver.findElement(By.xpath("//p[text()='Dropped!']")).getText();
		// Verify the confirmation text()
		if(text.equals("Dropped!"))
		{
			System.out.println(text);
		}
		Thread.sleep(2000);
		 String col = driver.findElement(By.xpath("//p[text()='Dropped!']")).getCssValue("color");
		// System.out.println(col);
		// Verify the the cssValue
		if(col.equals("rgba(119, 118, 32, 1)"))
		{
			System.out.println(col);
		}
		driver.quit();

	}

}

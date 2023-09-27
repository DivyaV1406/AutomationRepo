package ActionsClass;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropActions {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  
		  // identify src webElement
		  driver.get("https://demo.guru99.com/test/drag_drop.html");
		  Thread.sleep(2000);
		  WebElement scr1 = driver.findElement(By.xpath("//a[text()=' SALES ']"));
		  WebElement scr2 = driver.findElement(By.xpath("//a[text()=' 5000']"));
		 
		  WebElement scr3 = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		  WebElement scr4 = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		  
		  //Target WebElements
		  Thread.sleep(2000);
		 WebElement target1 = driver.findElement(By.xpath("//ol[@id='loan']/li[@class='placeholder']"));
		 WebElement target2 = driver.findElement(By.xpath("//ol[@id='amt8']/li[@class='placeholder']"));
		
		 WebElement target3 = driver.findElement(By.xpath("//ol[@id='bank']/li[@class='placeholder']"));
		 WebElement target4 = driver.findElement(By.xpath("//ol[@id='amt7']/li[@class='placeholder']"));
		 
		 //Drag drop actions
		 Actions act=new Actions(driver);
		 act.dragAndDrop(scr1, target1).perform();
		 Thread.sleep(2000);
		 act.dragAndDrop(scr2, target2).perform();
		 Thread.sleep(2000);
		 act.dragAndDrop(scr3, target3).perform();
		 Thread.sleep(2000);
		 act.dragAndDrop(scr4, target4).perform();
		 driver.quit();
		 
	}

}

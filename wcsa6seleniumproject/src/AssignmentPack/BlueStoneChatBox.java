package AssignmentPack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BlueStoneChatBox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=	new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(35));
		
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.id("denyBtn")).click();
		//identify the frame
		//driver.switchTo().frame(5);
		//driver.switchTo().frame("chatIcon");
		driver.switchTo().frame("fc_widget");
		
		driver.findElement(By.id("chat-icon")).click();
		Thread.sleep(5000);
		//to Switch to the default WebPage/frame
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//input[@type='nametext']")).sendKeys("abcdse23");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='emailemail']")).sendKeys("abc23@mail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='textphone']")).sendKeys("1234567809");
		Thread.sleep(2000);
		driver.findElement(By.className("fc-button")).click();
		
		driver.quit();
	}

}

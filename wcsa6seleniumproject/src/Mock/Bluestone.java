package Mock;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Bluestone {

	public static void main(String[] args) {
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 driver.get("https://www.bluestone.com/");
	 driver.findElement(By.id("denyBtn")).click();
	 driver.findElement(By.id("video-iframe")).click();
	WebElement chat = driver.findElement(By.id("video-iframe"));
	 driver.switchTo().frame(chat);
 

	}

}

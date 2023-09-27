package AssignmentPack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameScenario1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=	new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(35));
		
		driver.get("https://www.google.com");
		Thread.sleep(2000);
	//	driver.switchTo().frame("callout");
	//	driver.findElement(By.className("M6CB1c rr4y5c")).click();
	//	
		driver.findElement(By.xpath("//a[@aria-label='Google apps']")).click();
		driver.switchTo().frame("app");
		driver.findElement(By.xpath("//span[text()='Maps']")).click();
		
		driver.quit();
	}

}

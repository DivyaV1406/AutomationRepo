package Mock;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class Realince {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(35));
		driver.get("https://www.reliancedigital.in/");
		driver.findElement(By.id("wzrk-cancel")).click();
		Thread.sleep(2000);
		WebElement home = driver.findElement(By.id("RIL_HomeAppliancesNavigationNode"));
		Actions act = new Actions(driver);
		act.moveToElement(home);
		Thread.sleep(6000);
		//driver.findElement(By.partialLinkText("Refrigerators")).click();
		driver.findElement(By.xpath("//a[@aria-label='/refrigerators/c/S101513']")).click();
		TakesScreenshot ts = (TakesScreenshot)driver;
		File scr = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots/Rel.jpg");
		Files.copy(scr, dest);

	}

}

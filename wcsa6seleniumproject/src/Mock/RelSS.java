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

public class RelSS {

	public static void main(String[] args) throws IOException, InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(35));
	
	driver.get("https://www.reliancedigital.in/");
	driver.findElement(By.id("wzrk-cancel")).click();
	Thread.sleep(2000);
	//WebElement home = driver.findElement(By.xpath("//div[(text()='Home Appliances')and(@class='nav__title')]"));
	WebElement home = driver.findElement(By.xpath("//div[text()='Home Appliances']"));
	//WebElement home = driver.findElement(By.id("RIL_HomeAppliancesNavigationNode"));
	Actions act = new Actions(driver);
	act.moveToElement(home).perform();
	Thread.sleep(4000);
	//driver.findElement(By.xpath("//a[(@aria-label='/refrigerators/c/S101513')and (text()='Refrigerators')]")).click();
	//driver.findElement(By.xpath("//a[(text()='Refrigerators')and(@aria-label='/refrigerators/c/S101513') ]")).click();
	//driver.findElement(By.partialLinkText("Refrigerators")).click();
	driver.findElement(By.xpath("//a[@aria-label='/refrigerators/c/S101513']")).click();
	TakesScreenshot ts = (TakesScreenshot)driver;
	File scr = ts.getScreenshotAs(OutputType.FILE);
	File dest = new File("./Screenshots/RelSS44.jpg");
	Files.copy(scr, dest);

	}

}

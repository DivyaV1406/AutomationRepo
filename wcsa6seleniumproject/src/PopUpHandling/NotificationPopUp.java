package PopUpHandling;

import java.time.Duration;
import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class NotificationPopUp {

	public static void main(String[] args) throws InterruptedException {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the BrowserValue:");
		String browserValue=sc.next();

		if(browserValue.equalsIgnoreCase("Chrome"))
		{
			//handle notification pop in chrome
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--disable-notifications");
			Thread.sleep(2000);
			WebDriver driver=new ChromeDriver(co);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://www.airvistara.com/");
		}
		
		else if(browserValue.equalsIgnoreCase("Edge"))
		{
			EdgeOptions eo = new EdgeOptions();
			eo.addArguments("--disable-notifications");
			Thread.sleep(2000);
			WebDriver driver=new EdgeDriver(eo);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://www.airvistara.com/");
		}
		
		else if(browserValue.equalsIgnoreCase("Edge"))
		{
			FirefoxOptions fo = new FirefoxOptions();
			fo.addArguments("--disable-notifications");
			Thread.sleep(2000);
			WebDriver driver=new FirefoxDriver(fo);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://www.airvistara.com/");
		}
		
		else
		{
			System.out.println("Enter the valid BrowserValue!!");
		}
	}

}

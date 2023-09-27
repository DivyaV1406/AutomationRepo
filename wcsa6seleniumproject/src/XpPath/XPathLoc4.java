package XpPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class XPathLoc4 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");
		
		WebDriver	driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		//xPath for from
		driver.get("https://www.spicejet.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='From']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Bhopal']")).click();
		Thread.sleep(2000);
		//xPath for To

     	driver.findElement(By.xpath("//div[text()='Chennai']")).click();
		Thread.sleep(2000);
	   //  for Departure Date
     	//driver.findElement(By.xpath("//div[text()='Departure Date']")).click();

		driver.findElement(By.xpath("(//div[(text()='27') and (@class='css-76zvg2 r-homxoj r-ubezar r-16dba41')]) [1]")).click();

		//for Return Date
    	driver.findElement(By.xpath("//div[(text()='Return Date')]")).click();
	//	driver.findElement(By.xpath("driver.findElement(By.xpath(\"//div[(text()='Return Date')]\")).click();")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[(text()='15') and (@class='css-76zvg2 r-homxoj r-ubezar r-16dba41')]) [1]")).click();
		
		
		
		
		
		
		
		

	}

}

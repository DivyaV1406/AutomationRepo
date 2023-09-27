package XpPath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathLocator3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		//xPath by using text() function [.]
		driver.get("https://www.flipkart.com/viewcart?exploreMode=true&preference=FLIPKART");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[contains(@name,'q')]")).sendKeys("puma shoes",Keys.ENTER);
		
		//driver.findElement(By.xpath("//a[contains(text(),'UP Sneakers For Men')]")).click();
		//driver.findElement(By.xpath("//a[contains(text(),'Cave V3 Sneakers For Men')]")).click();
	    driver.findElement(By.xpath("(//a[contains(text(),'Hustle V2 Running Shoes For Men')])[1]")).click();
		
		////a[contains(.,'Hustle V2 Running Shoes For Men')]
		//driver.findElement(By.xpath("//a[contains(text(),'Viz Runner Running Shoes For Men')]")).click();
		
	    //driver.findElement(By.xpath("//a[contains(text(),'BMW MMS X-Ray Speed Casuals For Men')]")).click();
		//driver.findElement(By.xpath("//a[contains(text(),'Hustle V2 Running Shoes For Men')]")).click();                                
		
		
	}

}

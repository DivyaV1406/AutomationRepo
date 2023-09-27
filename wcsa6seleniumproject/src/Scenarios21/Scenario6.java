package Scenarios21;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario6 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=	new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(35));
		//Launc the  Web Application
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		
		//andle the pop-up
		driver.findElement(By.id("denyBtn")).click();
		//Move the cursor All Jewellery
		WebElement allJw = driver.findElement(By.xpath("//a[text()='Rings ']"));
		Actions act = new Actions(driver);
		act.moveToElement(allJw).perform();
		
		driver.findElement(By.xpath("//a[text()='Diamond' and (@title='Diamond Rings')]")).click();
		List<WebElement> allPrice = driver.findElements(By.className("b-price-wrapper"));
	
		for(WebElement eachP:allPrice)
		{
			System.out.println("default Price:");
			String price = eachP.getText();
			System.out.println(price);
		}
		
		//mouse over to the drop-down
		WebElement dropDown = driver.findElement(By.className("block sort-by pull-right"));
		act.moveToElement(dropDown);
		
		//driver.findElement(By.xpath("//a[text()='Price Low to High ']")).click();

	}

}

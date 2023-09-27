package Scenario5Package;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario5 extends ResultProduct{

	
	public void productRes1(String str)
	{
		 System.out.println(str);
		 //return str;
	}
	
	public void productName2(List<WebElement> productName,int i)
	{
		String name=productName.get(i).getText();
		System.out.println(name);
	 }
	
	
	
	
	
	
	
	public void allProduct(List<WebElement> allProductName)
	{
		for(int i=1;i<allProductName.size();i++)
		{
			String name = allProductName.get(i).getText();
		    System.out.println(name);
		   // Thread.sleep(2000);
		}
	}
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=	new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(35));
	
	driver.get("https://www.ebay.com/");
	driver.findElement(By.id("gh-ac")).sendKeys("apple Watches");
	//click on search button
	driver.findElement(By.id("gh-btn")).submit();
	
	//To get the title of WebPage 'to print the result of the product'
	 String result = driver.getTitle();
     Scenario5 obj1 = new Scenario5();
	 obj1.productRes1(result);
	 Thread.sleep(2000);
	 System.out.println();
	 //to print Nth product say 10th Product.
	 List<WebElement> allProductName = driver.findElements(By.className("s-item__title"));
	 List<WebElement> productName = allProductName;
     Thread.sleep(2000);
     System.out.println("The product is:");
     obj1.productName2(productName,3);
		
	System.out.println();
	// to print all products from 1st page
   
	Thread.sleep(2000);
	System.out.println("The name of all products is:");
	obj1.allProduct(allProductName);
	
	driver.quit();
	
	
	}
}

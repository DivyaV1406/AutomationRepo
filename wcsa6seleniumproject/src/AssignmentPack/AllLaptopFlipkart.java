package AssignmentPack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLaptopFlipkart {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/viewcart?exploreMode=true&preference=FLIPKART");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Laptops");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(2000);
		//processor selection  :Core i5
	   driver.findElement(By.xpath("//div[.='Core i5' and (@class='_3879cV')]")).click();
	   	Thread.sleep(2000);
	   	//click on Brand 
		driver.findElement(By.xpath("//div[text()='Brand']")).click();
		Thread.sleep(2000);
		//selection   :HP
		driver.findElement(By.xpath("//div[text()='HP']")).click();
		Thread.sleep(2000);
		//click on OS 
		driver.findElement(By.xpath("//div[text()='Operating System']")).click();
		Thread.sleep(2000);
		//selection     :Windows 11
		driver.findElement(By.xpath("//div[text()='Windows 11']")).click();
		Thread.sleep(2000);
		//customer rating   :4★ & above
		driver.findElement(By.xpath("//div[text()='4★ & above']")).click();
		Thread.sleep(2000);
		
		//identify all the suggestions of Laptop
		List<WebElement> allLaptopSugestions = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		//identify all the suggestions of Laptop
		List<WebElement> laptopPriceSuestions = driver.findElements(By.xpath("//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']"));
		Thread.sleep(2000);
		
		for(int i=0;i<allLaptopSugestions.size();i++)
		{
			 String name = allLaptopSugestions.get(i).getText();
		   	 Thread.sleep(2000);
		      	//To match the index value of Laptop name and price value  
			for(int j=i;j<=i;j++)
			{
				 String price = laptopPriceSuestions.get(j).getText();
				 System.out.print(name+":"+ price);
				Thread.sleep(2000);
			}
			 System.out.println( );
		}
		driver.quit();
	}

}

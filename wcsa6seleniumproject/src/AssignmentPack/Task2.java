package AssignmentPack;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Task2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.google.com");
		Thread.sleep(2000);

		driver.switchTo().activeElement().sendKeys("car");
		Thread.sleep(2000);
		//driver.findElement(By.name("q")).sendKeys("car");
		List<WebElement> carSugestions = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
	//	System.out.println(carSugestions);
		Thread.sleep(2000);
		
		for(int i=0;i<carSugestions.size();i++)
		{
			System.out.println(carSugestions.get(i).getText());
			Thread.sleep(2000);
			

		}
		driver.quit();

	}

}

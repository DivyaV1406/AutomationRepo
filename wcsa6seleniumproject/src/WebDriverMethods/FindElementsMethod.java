package WebDriverMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Thread.sleep(8000);
		//switch the control to activeElement
		driver.switchTo().activeElement().sendKeys("Poha");
		Thread.sleep(8000);
		//identify all the suggestions of Poha element
		List<WebElement> pohaSuggestions = driver.findElements(By.xpath("//div[@class='wM6W7d']"));
		
		Thread.sleep(8000);
		//to print the list use looping statements
		
	/*	for (int i = 0; i < pohaSuggestions.size(); i++)
		{
			System.out.println( pohaSuggestions.get(i).getText());
			Thread.sleep(2000);
		
		}
		*/
		
		// 
		for(WebElement poha:pohaSuggestions)
		{
			System.out.println( poha.getText());
			Thread.sleep(2000);
		}
		
		driver.quit();

	}

}

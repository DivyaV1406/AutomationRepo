package AssignmentPack;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q5 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=	new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(35));
		
		driver.get("http://omayo.blogspot.com/");
        String parent = driver.getWindowHandle();
		
        WebElement popUp = driver.findElement(By.partialLinkText("Open a popup window"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(true)",popUp);
		Thread.sleep(4000);
		popUp.click();
		
		Set<String> handles = driver.getWindowHandles();
		for(String window:handles)
		{
			//maximize child window
			 if(!parent.equals(window))
			 {
				 driver.switchTo().window(window);
				 driver.manage().window().maximize();
			 }
		}
	}
}

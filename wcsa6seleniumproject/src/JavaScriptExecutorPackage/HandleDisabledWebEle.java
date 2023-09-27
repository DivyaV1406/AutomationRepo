package JavaScriptExecutorPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDisabledWebEle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver	driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    //Username textBox identify
	    driver.get("file:///C:/Users/HP/OneDrive/Desktop/WebElement/DisabledWebEle.html");
	    WebElement usn = driver.findElement(By.id("id1"));
	    usn.sendKeys("Admin");
	    //Disabled Password TextBox
	    //Explicite Type cast into the JavascriptExecutor
	    Thread.sleep(2000);
	   JavascriptExecutor jse = (JavascriptExecutor)driver;
	   jse.executeScript("document.getElementById('id2').value='manager';");

	}

}

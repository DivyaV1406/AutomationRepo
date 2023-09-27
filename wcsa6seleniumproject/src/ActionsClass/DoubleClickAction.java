package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAction {

	public static void main(String[] args) throws InterruptedException {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  
	  driver.get("http://127.0.0.1/login.do;jsessionid=1cb76jislotf6");
	  Thread.sleep(2000);
	  driver.findElement(By.name("username")).sendKeys("admin");
	  driver.findElement(By.name("pwd")).sendKeys("manager");
	  driver.findElement(By.id("loginButton")).click();
	  Thread.sleep(2000);
	  // click on settings module
	  driver.findElement(By.xpath("//div[text()='Settings']/following-sibling::img")).click();
	  driver.findElement(By.xpath("//a[text()='Logo & Color Scheme']")).click();
	  driver.findElement(By.id("uploadNewLogoOption")).click();
	  Thread.sleep(2000);
	  WebElement target = driver.findElement(By.name("formCustomInterfaceLogo.logo"));
	  Actions act=new Actions(driver);
	  act.doubleClick(target).perform();
	  Thread.sleep(2000);
	   driver.quit();
	  
	  
	 

	}

}

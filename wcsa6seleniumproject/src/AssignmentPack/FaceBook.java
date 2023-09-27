package AssignmentPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FaceBook {

	public static void main(String[] args) throws InterruptedException {
	 ChromeOptions co = new ChromeOptions();
	 co.addArguments("--disable-notifications");
	 
	 WebDriver driver=new ChromeDriver(co);
	 driver.manage().window().maximize();
	 
	// driver.get("https://www.facebook.com/r.php");
	 Thread.sleep(2000);
	 driver.get("https://www.facebook.com/");
	 driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//input[contains(@name,'firstname')]")).sendKeys("sayana");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//input[contains(@name,'lastname')]")).sendKeys("mozella");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("abc.xyz@gmail.com");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("abc.xyz@gmail.com");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//input[@data-type='password' and (@aria-label='New password')]")).sendKeys("123@abc$");
	 Thread.sleep(2000);
	 //date of Birth
	 driver.findElement(By.xpath("//select[@id='day']")).sendKeys("12");
	 driver.findElement(By.xpath("//select[@id='month']")).sendKeys("Jan");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//select[@id='year']")).sendKeys("2000");
	 Thread.sleep(2000);
	// driver.findElement(By.xpath("//label[text()='Female']")).click();
	 Thread.sleep(2000);
     driver.findElement(By.xpath("(//button[text()='Sign Up']) [1]")).click();
	 
	 
	}

}

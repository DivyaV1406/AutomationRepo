package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FireFlinkLogin {

	public static void main(String[] args) throws InterruptedException {
	 WebDriver driver=new EdgeDriver();
	 driver.manage().window().maximize();
	 
	 driver.get("https://app.fireflink.com/signin");
	 Thread.sleep(3000);
	 
	 driver.findElement(By.xpath("//input[@placeholder='Enter your email']")).sendKeys("divyavijapure14@gmail.com");
	 Thread.sleep(10000);
	 
	 driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("abnD@1406");
	 Thread.sleep(6000);
	 
	 driver.findElement(By.xpath("//button[@type='submit']")).click();
	 Thread.sleep(4000);
	 //driver.close();
	 
	 
	 /*
	 driver.findElement(By.cssSelector("input[id='mui-1']")).sendKeys("divyavijapure14@mail.com");
	 Thread.sleep(6000);
	 
	 driver.findElement(By.cssSelector("input[name^='pas']")).sendKeys("dabd@123");
	 Thread.sleep(6000);
	 
	 driver.findElement(By.cssSelector("button[type='submit']")).click();
	 */
	 
	 

	}

}

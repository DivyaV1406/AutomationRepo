package LoginPageAtomate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("driver/Chrome/driver","./drivers/Chrome.exe");
		WebDriver driver=new  ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("abc@34");
		driver.findElement(By.name("pass")).sendKeys("12$345");
		driver.findElement(By.name("login")).click();
	    Thread.sleep(2000);
       // driver.close();
	}

}

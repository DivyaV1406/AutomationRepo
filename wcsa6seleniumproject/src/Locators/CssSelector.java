package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class CssSelector {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("driver/Chrome/driver","./drivers/Chrome.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("vmin@7");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[name^='pass']")).sendKeys("12@4533");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(2000);
		driver.close();

	}

}

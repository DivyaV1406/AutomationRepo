package XpPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleAttr {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://app.fireflink.com/signin");
		driver.findElement(By.xpath("//input[contains(@placeholder,'Enter your ') and contains(@id,'mui-1')]")).sendKeys("abcd@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@placeholder,'Enter your p') and (@id='mui-2')]")).sendKeys("123@abc87");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Sign in') and (@type='submit')]")).click();

	}

}

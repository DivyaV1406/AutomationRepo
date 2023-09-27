package WebElementMetods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod_IsDisplayedMethod_IsEnabledMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("http://127.0.0.1/login.do;jsessionid=1hx141c29m2g9");
		//To select checkbox on actiTime
		driver.findElement(By.name("remember")).click();
		//to check whether the checkbox is selected or not
		WebElement checkBox = driver.findElement(By.name("remember"));
		boolean result = checkBox.isSelected();
		System.out.println(result);
		
		//To check whether the checkBox is displayed or not
		boolean res = checkBox.isDisplayed();
		System.out.println(res);
		
		Thread.sleep(3000);
		
		driver.navigate().to("https://www.instagram.com/accounts/login/");
		driver.findElement(By.name("username")).sendKeys("admin423");
		driver.findElement(By.name("password")).sendKeys("asdfg123");
		WebElement loginButton = driver.findElement(By.className("_acan _acap _acas _aj1-"));
		boolean res1 = checkBox.isEnabled();
		
		//Click on login Button
		loginButton.submit();
		System.out.println(res1);
		
		
		

	}

}

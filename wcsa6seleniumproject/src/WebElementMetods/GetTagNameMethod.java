package WebElementMetods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTagNameMethod {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("https://www.instagram.com/accounts/login/");
		//find element in Webpage
	    WebElement username = driver.findElement(By.name("username"));

	    //Get tagName from WebPage
	    String UsnTagName = username.getTagName();
	    System.out.println(username);
	    
	    String loginTagname = driver.findElement(By.xpath("//div[text()='Log in']")).getTagName();
	    System.out.println(loginTagname);
	}

}

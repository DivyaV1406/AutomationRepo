package WebElementMetods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTagNameMetod {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("https://www.instagram.com/accounts/login/");
		//To find the element on the web Page
		WebElement usn = driver.findElement(By.name("username"));
		//To get the Tagname of WebElement 
		String usnTagName = usn.getTagName();
		System.out.println(usnTagName);
		
	//	Dimension loginButton1 = driver.findElement(By.id("loginButton")).getSize();
		

	}

}

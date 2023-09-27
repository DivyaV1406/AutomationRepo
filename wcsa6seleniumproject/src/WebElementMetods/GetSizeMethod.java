package WebElementMetods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSizeMethod {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://127.0.0.1/login.do;jsessionid=1hx141c29m2g9");
		
		Dimension loginButton1 = driver.findElement(By.xpath("//a[text()='Login']")).getSize();
		
		
		int Height=loginButton1.getHeight();
		int Width=loginButton1.getWidth();
		System.out.println("This is the Height of loginButton:" +Height+" \n This is te Width of loginButton:"+Width);

	}

}

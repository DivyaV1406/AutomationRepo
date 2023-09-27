package WebElementMetods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRectMethod {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://127.0.0.1/login.do;jsessionid=1hx141c29m2g9");
		
	    Rectangle loginButton2 = driver.findElement(By.xpath("//a[text()='Login']")).getRect();
		
		int xaxis2=loginButton2.getX();
		int yaxis2=loginButton2.getY();
		
		int h=loginButton2.getHeight();
		int w=loginButton2.getWidth();
		System.out.println(xaxis2+" " +yaxis2+" "+h+" "+w);
		


	}

}

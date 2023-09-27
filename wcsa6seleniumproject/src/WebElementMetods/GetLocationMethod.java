package WebElementMetods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationMethod {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://127.0.0.1/login.do;jsessionid=1hx141c29m2g9");
		
		Point loginButton = driver.findElement(By.xpath("//a[text()='Login']")).getLocation();
		
		int xaxis=loginButton.getX();
		int yaxis=loginButton.getY();
		System.out.println("This is the xaxis of loginButton:" +xaxis+" This is te yaxis of loginButton:"+yaxis);
		

	}

}

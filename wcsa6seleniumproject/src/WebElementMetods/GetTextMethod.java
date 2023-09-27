package WebElementMetods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextMethod {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(35));
		
		driver.get("http://127.0.0.1/login.do;jsessionid=1hx141c29m2g9");
		
		String TextOfLogin = driver.findElement(By.id("loginButton")).getText();
		System.out.println(TextOfLogin);

	}

}

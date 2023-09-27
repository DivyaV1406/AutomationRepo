package AssignmentPack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeImpliciteWait {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://127.0.0.1/login.do");
		String title = driver.getTitle();
		String expectedTitle="actiTIME - Login";
		if(title.equalsIgnoreCase(expectedTitle))
		{
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		}
		String loginTitle=driver.getTitle();
		String expectedLoinTitle="actiTIME - Enter Time-Track";
		if(loginTitle.equalsIgnoreCase(expectedLoinTitle))
		{
       	driver.findElement(By.xpath("//a[text()='Logout']")).click();
		}
		
		
		

	}

}

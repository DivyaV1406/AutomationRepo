package DataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidActiTimeLogin {

	public static void main(String[] args) throws IOException {
		WebDriver driver=	new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(35));
		
		
		driver.get("http://127.0.0.1/login.do;jsessionid=4q625isgl8j2r");
		Flib flib = new Flib();
		WebElement usn = driver.findElement(By.name("username"));
		usn.sendKeys(flib.readExcelData("./data/ActiTimeLogin.xlsx","Validcre",1,0));
		WebElement passwordTB = driver.findElement(By.name("pwd"));
		passwordTB.sendKeys(flib.readExcelData("./data/ActiTimeLogin.xlsx","Validcre",1,1));
		driver.findElement(By.id("loginButton")).click();
	}

}

package DataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidLoginTestCase extends Flib{



	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(35));

		driver.get("http://127.0.0.1/login.do;jsessionid=4q625isgl8j2r");
		Flib flib = new Flib();
		
		int rc=flib.rowCount("./data/ActiTimeLogin.xlsx", "invalidCred");
		
		Thread.sleep(2000);
		for(int i=1;i<=rc;i++)
		{
			driver.findElement(By.name("username")).sendKeys(flib.readExcelData("./data/ActiTimeLogin.xlsx","invalidCred",i,0));
			driver.findElement(By.name("pwd")).sendKeys(flib.readExcelData("./data/ActiTimeLogin.xlsx","invalidCred",i,1));
			driver.findElement(By.id("loginButton")).click();
			driver.findElement(By.name("username")).clear();
		}
		Thread.sleep(2000);
		driver.quit();

	}

}

package XpPath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathUniqAtt {

	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	//xPath by using unique Attribute
	// id,name, placeholder, aria-lable
	driver.get("http://127.0.0.1/login.do;jsessionid=hgdonoe038ij");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@id='loginButton']")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//a[@class='logout']")).click();
	Thread.sleep(2000);
	driver.close();
	}
}

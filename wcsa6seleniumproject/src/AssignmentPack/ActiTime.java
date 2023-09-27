package AssignmentPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://127.0.0.1/login.do;jsessionid=4q625isgl8j2r");
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		//Enter Time-Track
		driver.findElement(By.xpath("//a[text()='Enter Time-Track']")).click();
		Thread.sleep(2000);
		//Tasks
		driver.findElement(By.xpath("//div[text()='Tasks']/following-sibling::img")).click();
		Thread.sleep(2000);
		//Reports
		driver.findElement(By.xpath("//div[text()='Reports']/following-sibling::img")).click();
		Thread.sleep(2000);
		//Users
		driver.findElement(By.xpath("//div[text()='Users']/following-sibling::img")).click();
		Thread.sleep(2000);
		//Work Schedule
		driver.findElement(By.xpath("//div[text()='Work Schedule']/following-sibling::img")).click();
		Thread.sleep(2000);
		//Settings
		driver.findElement(By.xpath("//div[text()='Settings']/following-sibling::img")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		Thread.sleep(2000);
		driver.close();

	}
}

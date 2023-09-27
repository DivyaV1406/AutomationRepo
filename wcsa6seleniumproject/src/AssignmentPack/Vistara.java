package AssignmentPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Vistara {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		
		driver.get("https://www.airvistara.com/in/en");
		driver.findElement(By.xpath("//button[@id='cookieModalCloseBtn']")).click();
		driver.findElement(By.xpath("//input[@name='flightSearchFrom']")).sendKeys("Pune");
		driver.findElement(By.xpath("//input[(@placeholder='Select Arrival City') and (@name='flightSearchTo')]")).sendKeys("Bengalore");
		Thread.sleep(2000);
		//Departure Date
		driver.findElement(By.xpath("//input[(@placeholder='Select Departure Date') ]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@data-date='4']")).click();
		Thread.sleep(2000);
		//Return Date
		driver.findElement(By.xpath("//div[@monthname='Sep']")).click();
		//Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[(text()='14') ]")).click();
	    Thread.sleep(2000); 
	    driver.findElement(By.xpath("//input[contains(@id,'passengers')]")).click();
	    driver.findElement(By.xpath("//button[contains(@id,'adds_adult')]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[contains(text(),'Done') and (@class='col-xs-12 done_btn aubergine-button-dark passengerModalBtn')]")).click();
	    Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Search Flights') ]")).click();
		
	
		
	}

}

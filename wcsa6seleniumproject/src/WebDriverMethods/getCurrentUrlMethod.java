package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getCurrentUrlMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("http://127.0.0.1/login.do");
		
		 String urlOfCurrentPage = driver.getCurrentUrl();
		 System.out.println(urlOfCurrentPage);
		 
		 driver.close();
		 
		 

	}

}

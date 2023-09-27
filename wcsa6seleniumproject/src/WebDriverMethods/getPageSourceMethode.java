package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getPageSourceMethode {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("http://127.0.0.1/login.do");
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		Thread.sleep(2000);
		driver.close();
	}

}

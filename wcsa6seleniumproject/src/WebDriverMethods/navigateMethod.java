package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigateMethod {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("http://127.0.0.1/login.do");
		//use navigate to perform backward
		Thread.sleep(2000);
		driver.navigate().back();
		//use navigate to perform forward
		Thread.sleep(2000);
		driver.navigate().forward();
		//use navigate to perform forward
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.close();

	}

}

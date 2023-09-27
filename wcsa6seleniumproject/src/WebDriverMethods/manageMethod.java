package WebDriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class manageMethod {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
// manage window
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
		Thread.sleep(2000);
		
	
	//manage method to set the size	
		Dimension targetSize = new Dimension(450,350);
		driver.manage().window().setSize(targetSize);
	    Thread.sleep(2000);
		// Manage method to set the position
		Point targetPosition=new Point(250,350);
		driver.manage().window().setPosition(targetPosition);
		Thread.sleep(2000);
		// manage to make window FullScreen
		driver.manage().window().fullscreen();
		driver.close();	
	}

}

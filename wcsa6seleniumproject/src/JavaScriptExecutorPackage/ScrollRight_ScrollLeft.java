package JavaScriptExecutorPackage;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollRight_ScrollLeft {

	public static void main(String[] args) throws InterruptedException {
		WebDriver	driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
	    driver.get("https://dashboards.handmadeinteractive.com/jasonlove/");
	    
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    
	    //To Scroll Right 2 times
	    for(int i=1;i<=2;i++)
	    {
	    	Thread.sleep(2000);
	    	 js.executeScript("window.scrollBy(4000,0)");
	    }
	   Thread.sleep(3000);

	    //To scroll Left 3 times
	    for(int i=1;i<=3;i++)
	    {
	    	Thread.sleep(2000);
	    	 js.executeScript("window.scrollBy(-4000,0)");
	    }
	   
	}

}

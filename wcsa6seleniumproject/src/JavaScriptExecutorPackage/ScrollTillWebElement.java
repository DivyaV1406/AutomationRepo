package JavaScriptExecutorPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScrollTillWebElement {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver	driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
	    driver.get("https://www.selenium.dev/");
	    WebElement WebEle = driver.findElement(By.xpath("//h2[text()='News']"));
	    Point loc = WebEle.getLocation();
	    System.out.println(loc);
	    Thread.sleep(2000);
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	   // js.executeScript("window.scrollBy("+loc.getX()+","+(loc.getY()-90)+")");
	    
	    js.executeAsyncScript("aruments[0].scrollIntoView(true))",WebEle);
	    Thread.sleep(2000);
	    //take ss
	    File src = WebEle.getScreenshotAs(OutputType.FILE);
        File dest = new File("./Screensots/ElementSS.jpg");
        Files.copy(src, dest);
	}

}

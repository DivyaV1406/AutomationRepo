package TakeScreenShotPack;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ByUsingExplicitTypeCasting {

	public static void main(String[] args) throws IOException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
	
	driver.get("https://www.selenium.dev/");
	
	// take a screenshot by using explicit typecasting into TakesScreenshot (I)
   TakesScreenshot	ts=(TakesScreenshot)driver;
   File scr = ts.getScreenshotAs(OutputType.FILE);
   File dest = new File("./Screenshots/SS1.jpg");
   Files.copy(scr, dest);

	}

}

package DropDownHandle;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptionsMethod {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		   
		   // To launch Multi select drop down
		   driver.get("file:///C:/Users/HP/OneDrive/Desktop/WebElement/multiseldropdown.html");
		   
		   WebElement dropdownOpt = driver.findElement(By.id("menu"));
		   Select sel = new Select(dropdownOpt);
			// select the options from dropDown
			for(int i=0;i<4;i++)
			{
				Thread.sleep(2000);
				sel.selectByIndex(i);
			}
			
			Thread.sleep(5000);
			//  to read the options that are selected
			List<WebElement> allOpts = sel.getAllSelectedOptions();
			
			// print the options that are selected
			for(WebElement opt:allOpts)
			{
				Thread.sleep(2000);
				System.out.println( opt.getText()); 
			}
		   
	}

}

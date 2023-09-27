package DropDownHandle;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptionsMethod {

	public static void main(String[] args) throws InterruptedException {
		   WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		   
		   //Single select drop down
		   driver.get("file:///C:/Users/HP/OneDrive/Desktop/WebElement/Dropdown.html");
		   WebElement dropdownOpt = driver.findElement(By.id("menu"));
		   Select sel=new Select(dropdownOpt);
		   //to read all options from dropDown 
		   List<WebElement> allOption = sel.getOptions();
//		   
		   //to read the list of webelement use for loop 
//		   for(int i=0;i<allOption.size();i++)
//		   {
//			   if (allOption.get(i).getText().equals("Misal"))
//			   {
//				   Thread.sleep(2000);
//				   allOption.get(i).click();
//				   break;
//				}
//		   }
		   
		   	    // use for each loop
	       for(WebElement opt:allOption)
	       {
	    	
	    	   String op = opt.getText();
	    	   Thread.sleep(2000);
	    	   System.out.println(op);
	    	   
	       }
		   
	}

}

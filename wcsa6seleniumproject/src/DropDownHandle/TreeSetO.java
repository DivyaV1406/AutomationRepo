package DropDownHandle;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TreeSetO {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		   
		   // To launch Multi select drop down
		   driver.get("file:///C:/Users/HP/OneDrive/Desktop/WebElement/multiseldropdown.html");
		   
		   WebElement dropdownOpt = driver.findElement(By.id("menu"));
		   //handle the drop down
		   Select sel = new Select(dropdownOpt);
		   
		   //remove duplicate from dropdown
		   TreeSet<String>ts=new TreeSet<String>();
		   //read the option from dropdown
		   List<WebElement> options = sel.getOptions();
		   //add the options in TreeSet
		   for(int i=0;i<options.size();i++)
		   {
			   
			   String text = options.get(i).getText();
			   ts.add(text);
		   }
		   //read the treset options after removing duplicates  
		   for(String op:ts)
		   {
			   Thread.sleep(2000);
			   System.out.println(op);
			   
		   }
		   
		   

	}

}

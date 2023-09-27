package DropDownHandle;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectMetods {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		   //multi select drop down
		   driver.get("file:///C:/Users/HP/OneDrive/Desktop/WebElement/multiseldropdown.html");
		   WebElement dropdownOpt = driver.findElement(By.id("menu"));
		   Select sel=new Select(dropdownOpt);
		   //select by using index value
	//	   sel.selectByIndex(3);
		   
//		   //select multiple option
//		   for(int i=0;i<3;i++)
//		   {
//			   sel.selectByIndex(i);
//		   }
//		   Thread.sleep(4000);
//		  //Deselect multi selected options
//		   for(int i=0;i<3;i++)
//		   {
//			   sel.deselectByIndex(i);
//		   }

		   
		   //By using Values
		   String []arr={"v1","v2","v3","v4","v5"};
		   for(int i=0;i<arr.length;i++)
		   {
			   Thread.sleep(2000);
			   sel.selectByValue(arr[i]);
			 
		   }
		   Thread.sleep(4000);
		   for(int i=0;i<arr.length;i++)
		   {
			   Thread.sleep(2000);
			   sel.deselectByValue(arr[i]);
			 
		   }
		   
		   
		   

	}

}

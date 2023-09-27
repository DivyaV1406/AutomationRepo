package DropDownHandle;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultipleMetod {

	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		   
		   //Multi select Drop down
//		   driver.get("file:///C:/Users/HP/OneDrive/Desktop/WebElement/multiseldropdown.html");
//		   WebElement dropdownOpt = driver.findElement(By.id("menu"));
//		   Select sel=new Select(dropdownOpt);
//		   System.out.println(sel.isMultiple());	   
		   
		   //Single select Drop down
		   driver.get("file:///C:/Users/HP/OneDrive/Desktop/WebElement/Dropdown.html");
		   WebElement dropdownOpt = driver.findElement(By.id("menu"));
		   Select sel=new Select(dropdownOpt);
		   System.out.println(sel.isMultiple());	   

	}

}

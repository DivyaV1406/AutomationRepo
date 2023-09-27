package DropDownHandle;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectionMetods {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=	new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
	//Single select dropdown 
	/*
	driver.get("file:///C:/Users/HP/OneDrive/Desktop/WebElement/Dropdown.html");
	WebElement dropDownEl = driver.findElement(By.id("menu"));
    Select sel = new Select(dropDownEl);
    sel.selectByIndex(2);
    Thread.sleep(2000);
    sel.selectByValue("v4");
    sel.selectByVisibleText("Poha");
    */
    //multi select dropdown
    driver.navigate().to("file:///C:/Users/HP/OneDrive/Desktop/WebElement/multiseldropdown.html");
    WebElement dropDownEl2 = driver.findElement(By.id("menu"));
    Select sel2 = new Select(dropDownEl2);
    for(int i=0;i<4;i++)
    {
    	 sel2.selectByIndex(i);
      }
  
    
	}

}

package DropDownHandle;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownException {

	public static void main(String[] args) throws InterruptedException {
	   WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   //Single select drop down
	   driver.get("file:///C:/Users/HP/OneDrive/Desktop/WebElement/Dropdown.html");
	   WebElement dropDownEle = driver.findElement(By.id("menu"));
	   Select sel=new Select(dropDownEle);
	   //By using selectByIndex Method
	   sel.selectByIndex(2);
	   
	   Thread.sleep(2000);
	   sel.deselectByIndex(2);

	}

}

package DropDownHandle;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WrappedElementMethod {

	public static void main(String[] args) {
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
	    //Launch the Multi select option drop down
	    driver.get("file:///C:/Users/HP/OneDrive/Desktop/WebElement/multiseldropdown.html");
	    //identify the dropdown webElement
	    WebElement allOptions = driver.findElement(By.name("menu"));
	    
	    Select sel=new Select(allOptions);
	    //Using the getWrappedElement method(Operational method)
	   WebElement wpEle = sel.getWrappedElement();
	   System.out.println(wpEle.getText());

	}

}

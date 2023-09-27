package PopUpHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopUp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver	driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
	    
	    driver.get("file:///C:/Users/HP/OneDrive/Desktop/WebElement/Confirmation.html");
	    WebElement button = driver.findElement(By.xpath("//input[@type='submit']"));
	    button.click();
	    //To switch to the alert
	    Alert al = driver.switchTo().alert();
	    Thread.sleep(2000);
	   // System.out.println(al.getText());//To get the Text of PopUp
	    //al.accept(); //To accept the PopUp
	    al.dismiss();//To dismiss the PopUp
	  
	    driver.close();    
		

	}

}

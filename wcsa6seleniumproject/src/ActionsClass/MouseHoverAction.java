package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		//BlueStone WebApplication
		driver.get("https://www.bluestone.com/");
	    //Handle the hidden Pop up
		driver.findElement(By.id("denyBtn")).click();
		//identify WebElement 'Watch Jewellery '
		WebElement target = driver.findElement(By.xpath("//a[text()='Watch Jewellery ']"));
		//to handle mouse actions using Actions class
		Actions act = new Actions(driver);
		act.moveToElement(target).perform();
		driver.findElement(By.xpath("//a[text()='Band']")).click();

	}

}

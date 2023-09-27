package WebElementMetods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClearMetod_ClickMetod {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver =new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
    
    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(60));
    driver.get("http://127.0.0.1/login.do;jsessionid=eqi02oab73jj1");
    //find te username textBox and pass the input
    //invalid username
    driver.findElement(By.name("username")).sendKeys("admin124");
    WebElement passwordTextBox = driver.findElement(By.name("pwd"));
    passwordTextBox.sendKeys("manager");
    
    driver.findElement(By.id("loginButton")).click();
    Thread.sleep(4000);
    //clear the username textBox
    driver.findElement(By.name("username")).clear();

    //valid username and password
    driver.findElement(By.name("username")).sendKeys("admin");
    driver.findElement(By.name("pwd")).sendKeys("manager");
    driver.findElement(By.id("loginButton")).click();

    
    
    
		

	}

}

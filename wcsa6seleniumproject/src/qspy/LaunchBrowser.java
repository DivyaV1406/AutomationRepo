package qspy;
import java.util.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {
	static WebDriver driver;
	
public static void main(String[] args)throws InterruptedException {
	
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Browser value!!");
    String browserValue=sc.next();
    
    if (browserValue.equalsIgnoreCase("Chrome")) {
    	driver=new ChromeDriver();
    	Thread.sleep(2000);
    	driver.close();
    }
    	else if (browserValue.equalsIgnoreCase("Firefox")) {
    		driver=new FirefoxDriver();
        	Thread.sleep(2000);
        	driver.close();
        	
		}
    	else if (browserValue.equalsIgnoreCase("Edge")) {
    		driver=new EdgeDriver();
        	Thread.sleep(2000);
        	driver.close();
    	}
    	else 
    	    System.out.println("Enter the Browser value is incorrect!!");
    		
		
	}
    
}
    
    
    


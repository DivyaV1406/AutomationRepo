package PopUpHandling;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PdfFileUpload {

	public static void main(String[] args) throws IOException {
		WebDriver driver=	new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(35));

		driver.get("https://www.ilovepdf.com/pdf_to_word");
		driver.findElement(By.id("pickfiles")).click();
		
		//handle file upload popup
		File file = new File("./autoitFiles/PdfUpload.exe");
		String abspath = file.getAbsolutePath();
		Runtime.getRuntime().exec(abspath);
		

	}

}

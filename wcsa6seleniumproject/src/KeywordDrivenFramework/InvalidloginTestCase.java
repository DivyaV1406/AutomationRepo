package KeywordDrivenFramework;

import java.io.IOException;
import java.util.Iterator;

import org.openqa.selenium.By;

public class InvalidloginTestCase extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		//to open the browser
		BaseTest bt = new BaseTest();
		bt.openBrowser();

		//read the invalid username and password
		Flib flib = new Flib();

		//get last row count 
		int rc=flib.getLastRowCount(EXCEL_PATH, INVALID_SHEETNAME);
		for (int i = 1; i <=rc; i++) {
			
			driver.findElement(By.name("username")).sendKeys(flib.readExcelData(EXCEL_PATH, INVALID_SHEETNAME, i, 0));
			driver.findElement(By.name("pwd")).sendKeys(flib.readExcelData(EXCEL_PATH, INVALID_SHEETNAME, i, 1));
			driver.findElement(By.id("loginbutton")).click();
			driver.findElement(By.name("username")).clear();
			
		}
		Thread.sleep(2000);
		bt.closeBrowser();
			
	}

}

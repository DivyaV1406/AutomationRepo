package pomPackage;

import java.io.IOException;

public class ValidCustomer_ProjectTestCase extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		//to open & close Browser
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		
		//to read username, password, customer&projectcreds
		Flib flib = new Flib();
		
		//perform valid login
		LoginPage lp = new LoginPage(driver);
		lp.validLogin(flib.readPropertyData(PROP_PATH, "Username"),flib.readPropertyData(PROP_PATH, "Password"));
		
		Thread.sleep(2000);
		//work with all Modules of Home Page
		HomePage hp = new HomePage(driver);
        hp.click_on_Tasks_Module();
        
    	Thread.sleep(2000);
    	//Create customer and projects
    	TaskPage tp = new TaskPage(driver);
    	tp.create_New_Customer_Method(flib.readExcelData(EXCEL_PATH, CUSTOMER_PROJECTS_SHEETNAME,1,0));
    	Thread.sleep(2000);
    	tp.create_New_Project_Method(flib.readExcelData(EXCEL_PATH, CUSTOMER_PROJECTS_SHEETNAME,1,0),flib.readExcelData(EXCEL_PATH, CUSTOMER_PROJECTS_SHEETNAME,1,1));
    	Thread.sleep(2000);
    	hp.click_on_Logout_Link();
    	Thread.sleep(2000);
    	bt.closeBrowser();
	}

}

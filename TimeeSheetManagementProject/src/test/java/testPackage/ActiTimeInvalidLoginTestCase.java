package testPackage;

import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.CustomListener;
import genericPackage.Flib;
import pagePackage.LoginPage;

@Listeners(CustomListener.class)
public class ActiTimeInvalidLoginTestCase extends BaseTest {
	@Test
	public void InvalidLoginScript() throws EncryptedDocumentException, IOException, InterruptedException
	{
	LoginPage lp = new LoginPage(driver);
	Flib flib = new Flib();
	int rc = flib.getLastRowCount(EXCEL_PATH,IVALID_SHEETNAME);
	for(int i=1;i<=rc;i++)
	{
		lp.inValidLogin(flib.readExcelData(EXCEL_PATH,IVALID_SHEETNAME,i,0),flib.readExcelData(EXCEL_PATH, IVALID_SHEETNAME,i,1));
	}
	}
}

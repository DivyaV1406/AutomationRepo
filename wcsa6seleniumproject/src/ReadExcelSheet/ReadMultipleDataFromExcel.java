package ReadExcelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		for(int i=1;i<=6;i++)
		{
			FileInputStream fis = new FileInputStream("./data/TestData.xlsx");//To select the file 
			Workbook wb = WorkbookFactory.create(fis);//to make file to ready for read
			Sheet sheet = wb.getSheet("IPL");//provide the sheet name
			Row row = sheet.getRow(i);//To get from desired row
	        Cell cell = row.getCell(1);//To get from desired cell/column
	        String data = cell.getStringCellValue();////to read the value from the cell
	        Thread.sleep(2000);
	        System.out.println(data);
		}

	}

}

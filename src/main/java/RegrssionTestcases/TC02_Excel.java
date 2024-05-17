package RegrssionTestcases;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import AllPages.LoginPPP;

public class TC02_Excel  extends LoginPPP{

	public static void main(String[] args) throws IOException {
	
		
		String username="";
		String password="";
		String path = "D:\\exdata.xlsx";

		FileInputStream fs = new FileInputStream(path);	

XSSFWorkbook workbook = new XSSFWorkbook(fs);

XSSFSheet sheet = workbook.getSheetAt(0);
//Identify how many no.of rows are there in the sheet
int rows = sheet.getLastRowNum();
// will get as 1;
		

for (int i = 1; i <= rows; i++) {

	// Get the values from the sheet
	XSSFRow row = sheet.getRow(i);

	username = row.getCell(0).getStringCellValue();
			
			
	password = row.getCell(1).getStringCellValue();

		BroserLaunch();
		Enter_Email(username);
		Enter_password(password);
		LoginIn();
		String actual="Invalid email or password";
		 
		String expected = "Invalid email or password";

		int cellCount = sheet.getRow(i).getLastCellNum();

		XSSFCell cell = row.createCell(cellCount);

		if (actual.equals(expected))
		{

		System.out.println("Test case is passed");
		cell.setCellValue("Passed");
		} else
		{
		System.out.println("Test case is failed");
		cell.setCellValue("Failed");
		}

		}

		fs.close();

		FileOutputStream fout = new FileOutputStream(path);

		workbook.write(fout);
		fout.close();

	}

}
	

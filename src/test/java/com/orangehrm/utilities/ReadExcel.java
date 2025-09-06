package com.orangehrm.utilities;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import com.orangehrm.genricscripts.I_ApplicationConstants;

public class ReadExcel implements I_ApplicationConstants
{
	@DataProvider(name="UserData")
	public String[][] ReadExcelData() throws Exception
	{
		FileInputStream fis= new FileInputStream(excelPath);
		XSSFWorkbook book= new XSSFWorkbook(fis);
		String SheetName= ReadPropertyFIle.readData("SheetName");
		XSSFSheet sheet= book.getSheet(SheetName);
		int lastRow= sheet.getLastRowNum();
		String[][] data= new String[lastRow][sheet.getRow(0).getLastCellNum()];
		for(int r=1; r<=lastRow; r++)
		{
			XSSFRow row= sheet.getRow(r);
			for(int c=0; c<row.getLastCellNum(); c++)
			{
				XSSFCell cel= row.getCell(c);
				String value= cel.getStringCellValue();
				data[r-1][c]=value;
			}
		}
		fis.close();
		book.close();
		return data;
	}

}

package com.e.lms.generic;

import java.io.FileInputStream;
import jxl.Sheet;
import jxl.Workbook;

public class ExcelReader 
{
	String FilePath = null;
	String testdata = "";
	
	public ExcelReader (String stepname)
	{
		FilePath = System.getProperty("user.dir")+"\\testdata\\"+stepname+".xls";	
	}
	
	public String readExcel(int Siteration, int Eiteration, String stepname) throws Exception 
	{
		FileInputStream fs = new FileInputStream(FilePath);
		Workbook wb = Workbook.getWorkbook(fs);

		Sheet sh = wb.getSheet(0);

		int totalNoOfRows = sh.getRows();
		int totalNoOfCols = sh.getColumns();

		for (int row=Siteration; row<=Eiteration; row++)
		{
			for (int col = 0; col < totalNoOfCols; col++) 
			{
				testdata = (sh.getCell(col, row).getContents());
				System.out.println(testdata);
			}
			System.out.println("");
		}
		
		return "";
	}

	public static void main(String args[]) throws Exception 
	{
		ExcelReader DT = new ExcelReader("login");
		DT.readExcel(1, 4, "");
	}
	
	
}

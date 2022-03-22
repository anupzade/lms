package com.e.lms.generic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TestDataReader
{
	//	static String FilePath = "C:\\WS_lms\\lms\\testdata\\login";
	//	static String FileName = "C:\\WS_lms\\lms\\testdata\\login";
	String FilePath = null;
	
	public TestDataReader(String stepname)
	{
		FilePath = System.getProperty("user.dir")+"\\testdata\\"+stepname+".txt";
	}
	
	public void GetTotalRowCount() throws Exception 
	{
		BufferedReader br = new BufferedReader(new FileReader(FilePath));
		String input;
		int count = 0;
		while ((input = br.readLine()) != null)
		{
			count ++;
		}
		//System.out.println("Total Rows available in File are :"+count);
	}
	
	@SuppressWarnings("resource")
	public String GetRowValueByRowNumber(int rowcount ) throws Exception 
	{
		FileReader fr = null; BufferedReader br = null;
        fr = new FileReader(FilePath); br = new BufferedReader(fr);
        String returnStr = null;
        for(int i = 0; i<= rowcount - 1; i++)
        {
        	returnStr = br.readLine(); 
        } 
        //System.out.println("Return String IS :" +returnStr);    
        return returnStr;
	}
	
}

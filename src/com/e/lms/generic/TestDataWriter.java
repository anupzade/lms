package com.e.lms.generic;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.xpath.operations.String;

public class TestDataWriter 
{
	java.lang.String FilePath = null;
	String FileWriter = null;
	//String BufferWriter = null;
	
	public TestDataWriter(String stepname)
	
	{	FilePath = "C:\\WS_lms\\lms\\TestLogger\\"+stepname+".txt";}

	public void FileWriter(String testdata) throws Exception
	{
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); 
		Date date = new Date();
		java.lang.String dt = dateFormat.format(date);
		
		File file = new File(FilePath);
	     if (!file.exists())
	     {
	      file.createNewFile();
	     }
	     FileWriter fw = new FileWriter(file.getAbsoluteFile());
	     BufferedWriter bw = new BufferedWriter(fw);
	     String returnStr = null;
	     String data = testdata;
	     bw.write(dt +":"+data);
	     bw.newLine();
	     bw.close();
	}    
	

}

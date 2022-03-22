package com.e.lms.generic;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExtentReportFile
{
	public String getDateTime()
	{
	    SimpleDateFormat dateFormat = new SimpleDateFormat("ddMMyyyy");
	    Date date = new Date();
	    return dateFormat.format(date);
	}
	
	public String filecreate() throws Exception
	{
		variables.file="lms_Execution_Report_"+getDateTime()+".html";
		variables.myFile = new File(System.getProperty("user.dir")+"\\TestReport\\"+variables.file);
		
		if(!variables.myFile.exists())
		{
			variables.myFile.createNewFile();
		}
	
		return variables.file;
	}
	
}

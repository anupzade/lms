package com.e.lms.generic;

import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestLogger
{
	public String getDateTime()
	{
	    SimpleDateFormat dateFormat = new SimpleDateFormat("ddMMyyyy");
	  
	    Date date = new Date();
	    return dateFormat.format(date);
	}
	
	public String eLogEvent(String Message,String Type) throws Exception
	{
		
		variables.ExecutionLogFileName="lms_Execution_Log_"+getDateTime()+".txt";
		variables.lineseparator = System.getProperty("line.separator");
		variables.myFile = new File(System.getProperty("user.dir")+"\\TestLogger\\"+variables.ExecutionLogFileName);
		
		if(!variables.myFile.exists())
		{
			variables.myFile.createNewFile();
		}
			
		variables.eoutLog = new FileWriter(System.getProperty("user.dir")+"\\TestLogger\\"+variables.ExecutionLogFileName,true);
					
			if(Type.equalsIgnoreCase("pass"))
			{
				variables.eoutLog.append("["+getDateTime()+"-PASS]   "+Message + variables.lineseparator);
						
			}
			if(Type.equalsIgnoreCase("fail"))
			{
				variables.eoutLog.append("["+getDateTime()+"-FAIL]   "+Message + variables.lineseparator);
			}
			if(Type.equalsIgnoreCase("error"))
			{
				variables.eoutLog.append("["+getDateTime()+"-ERROR]   "+Message + variables.lineseparator);
			}
			if(Type.equalsIgnoreCase("warning"))
			{
				variables.eoutLog.append("["+getDateTime()+"-WARNING]   "+Message + variables.lineseparator);
			}
			if(Type.equalsIgnoreCase("info"))
			{
				variables.eoutLog.append("["+getDateTime()+"-INFO]   "+Message + variables.lineseparator);
			}
			variables.eoutLog.flush(); 
			return null;
	}
	
	public String fLogEvent(String Message,String Type) throws Exception
	{
		variables.FunctionalLogFileName="lms_Functional_Log_"+getDateTime()+".txt";
		variables.lineseparator = System.getProperty("line.separator");
		variables.myFile = new File(System.getProperty("user.dir")+"\\TestLogger\\"+variables.FunctionalLogFileName);
		
		if(!variables.myFile.exists())
   		{
			variables.myFile.createNewFile();
   		}
		
		variables.foutLog = new FileWriter(System.getProperty("user.dir")+"\\TestLogger\\"+variables.FunctionalLogFileName,true);   
   		
   			if(Type.equalsIgnoreCase("pass"))
			{
   				variables.foutLog.append("["+getDateTime()+"-PASS]   "+Message +  variables.lineseparator);
						
			}
			if(Type.equalsIgnoreCase("fail"))
			{
				variables.foutLog.append("["+getDateTime()+"-FAIL]   "+Message +  variables.lineseparator);
			}
			if(Type.equalsIgnoreCase("error"))
			{
				variables.foutLog.append("["+getDateTime()+"-ERROR]   "+Message +  variables.lineseparator);
			}
			if(Type.equalsIgnoreCase("warning"))
			{
				variables.foutLog.append("["+getDateTime()+"-WARNING]  "+Message +  variables.lineseparator);
			}
			if(Type.equalsIgnoreCase("info"))
			{
				variables.foutLog.append("["+getDateTime()+"-WARNING]" +Message+ variables.lineseparator);
			}
			variables.foutLog.flush();
			return null;
	}
}

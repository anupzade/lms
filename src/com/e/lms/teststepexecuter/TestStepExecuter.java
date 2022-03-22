package com.e.lms.teststepexecuter;

import com.e.lms.generic.TestDataReader;
import com.e.lms.generic.variables;

public class TestStepExecuter 
{
	@SuppressWarnings("unused")
	public void ExecuteTestStep(String stepname, String stepParameterValue) throws Exception
	{
		variables.stepvalue=false;
		try
		{
			Class<?> cls = Class.forName("com.e.elms.modules."+stepname);
			
//			System.out.println("Script Name Is : "+stepname);
			
			variables.allmethods=cls.getDeclaredMethods();
			
			variables.desiredmethod = null;
			
			for (variables.method=0;variables.method<=variables.allmethods.length;variables.method++)
			{
				if(variables.allmethods[variables.method].getName().equalsIgnoreCase("execute"));
				{
					variables.desiredmethod=variables.allmethods[variables.method];
					break;
				}
			}
		
//******************************************keyword & Data Driven Code**********************************************************
			
			variables.desiredmethod.invoke(cls.newInstance(),stepParameterValue);
		
			if(stepParameterValue.toLowerCase().contains("iteration"))
			{
				TestDataReader tdr=new TestDataReader(stepname);
	    	
				variables.startIteration=Integer.parseInt(stepParameterValue.split("=")[1].split("-")[0]);
				variables.endIteration=Integer.parseInt(stepParameterValue.split("=")[1].split("-")[1]);
			
				for(variables.iterate=variables.startIteration;variables.iterate<=variables.endIteration;variables.iterate++)
				{
					variables.desiredmethod.invoke(cls.newInstance(),tdr.GetRowValueByRowNumber(variables.iterate));
				}
			}
		}
		
		catch(Exception ex)
		{
			System.out.println(ex.getLocalizedMessage());
			variables.stepvalue= true;
		}
	}
}
	


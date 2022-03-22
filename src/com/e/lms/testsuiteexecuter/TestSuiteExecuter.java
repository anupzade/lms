package com.e.lms.testsuiteexecuter;

import com.e.lms.generic.XMLOperations;
import com.e.lms.generic.variables;
import com.e.lms.testcase.TestCaseExecuter;

public class TestSuiteExecuter 
{
	public void execute(String TestSuiteName) throws Exception
	{
//		System.out.println(TestSuiteName);
		
		TestCaseExecuter tce= new TestCaseExecuter();
		
		XMLOperations xo = new XMLOperations(System.getProperty("user.dir")+"\\testsuite\\"+TestSuiteName+".xml");
		
		variables.totalTC=xo.getTotalNumberOfTestCases();
		
		for(variables.tc=1;variables.tc<=variables.totalTC;variables.tc++)
		{
			variables.bol=xo.isTestCaseMarkedForExecution(variables.tc);
			
			if(variables.bol)
			{
				tce.ExecuteTestCase(variables.tc);
			}
		}
	}

}

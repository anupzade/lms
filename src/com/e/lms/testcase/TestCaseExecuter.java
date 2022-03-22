package com.e.lms.testcase;

import com.e.lms.generic.XMLOperations;
import com.e.lms.generic.variables;
import com.e.lms.teststepexecuter.TestStepExecuter;
import com.e.lms.config.Config;

public class TestCaseExecuter
{
	public void ExecuteTestCase(int TestCaseIndex) throws Exception
	{
		TestStepExecuter tse = new TestStepExecuter();
		
		Config cfg = new Config();
		
		XMLOperations xml = new XMLOperations("testsuite\\"+cfg.getPropertyValue("suitename")+".xml");
		
		variables.totalstepsforthisTC= xml.getTotalNumberOfSteps(TestCaseIndex);
		
		for (variables.step=1;variables.step<=variables.totalstepsforthisTC;variables.step++)
		{
			variables.stepname = xml.getStepName(TestCaseIndex, variables.step);
			
			variables.stepParameterValue = xml.getParameterValue(TestCaseIndex, variables.step);
			
			tse.ExecuteTestStep(variables.stepname, variables.stepParameterValue);
		}
	}
}


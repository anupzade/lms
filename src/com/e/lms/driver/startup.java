package com.e.lms.driver;

import java.io.IOException;

import com.e.lms.config.Config;
import com.e.lms.generic.SendMail;
import com.e.lms.testsuiteexecuter.TestSuiteExecuter;

public class startup 
{
	public static int timeoutseconds=20;
	public static void main (String[] args) throws Exception
	{
		try
		{
			Config cf = new Config();
			//System.out.println(cf.getPropertyValue("suitename"));
			//timeoutseconds = Integer.parseInt(cf.getPropertyValue("maxtimeout"));
			TestSuiteExecuter tsue = new TestSuiteExecuter();
			tsue.execute("Smoke");
			SendMail sm = new SendMail();
			sm.execute("Report");
		}
		catch (IOException e)
		{
			System.out.println(e.getLocalizedMessage());
		}
	}
}

package com.e.lms.modules;

import org.openqa.selenium.By;

import com.e.lms.objects.logout_obj;

public class logout extends logout_obj
{
	public void Execute(String testdata) throws Exception
	{
		String rightlink=null;
		String logoutlink = null;
		String[] allfnfv = testdata.split(",");
		
		for (int i = 0;i<allfnfv.length;i++)
			
		{
			String[] indfnfv=allfnfv[i].split("=");
			
			if (indfnfv[0].trim().equalsIgnoreCase("rightlink"))
			
			{
			rightlink = indfnfv[1];
			Thread.sleep(1000);
			launchapplication.driver.findElement(rlogout_link_xp).click();
			
			}
			
			if (indfnfv[0].trim().equalsIgnoreCase("logoutlink"))
			
			{
			logoutlink = indfnfv[1];
			Thread.sleep(1000);
			launchapplication.driver.findElement(logout_link_xp).click();
			}
		}
    }

}

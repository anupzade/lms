package com.e.lms.modules;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.e.lms.objects.login_obj;

public class login extends login_obj
{
	public void Execute(String testdata) throws Exception
	{
		String un=null;
		String pw = null;
		String[] allfnfv = testdata.split(",");
		
		for (int i = 0;i<allfnfv.length;i++)
			
		{
			String[] indfnfv=allfnfv[i].split("=");
			
			if (indfnfv[0].trim().equalsIgnoreCase("username"))
			{
			un = indfnfv[1];
			launchapplication.driver.findElement(loginid_xp).clear();
			launchapplication.driver.findElement(loginid_xp).sendKeys(un);
			}
			
			if (indfnfv[0].trim().equalsIgnoreCase("password"))
			{
			pw = indfnfv[1];
			launchapplication.driver.findElement(password_xp).clear();
			launchapplication.driver.findElement(password_xp).sendKeys(pw);
			launchapplication.driver.findElement(submit_xp).click();
			launchapplication.driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

//			WebElement logo =  launchapplication.driver.findElement(llogout_xp);
//			if(logo.isDisplayed())
//			{
//				logo.click();
//			}
//			else
//			{
//				launchapplication.driver.findElement(lrightlink_xp).click();
//				logo.click();
//			}
  		    }
			
		}
		
		
		//
		//
		
		//System.out.println("login with multiple user is working");
	}
	
}


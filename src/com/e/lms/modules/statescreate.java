package com.e.lms.modules;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.e.lms.objects.menu;
import com.e.lms.objects.statescreate_obj;

public class statescreate extends statescreate_obj
{

	public void Execute(String testdata) throws Exception
	{
		String countrycode =null;
		String statecode = null;
		String statename = null;
		
		String[] rawvalue = testdata.split(",");
		
		for (int i = 0;i<rawvalue.length;i++)
		{
			String[] rawvalue1=rawvalue[i].split("=");
			
			if (rawvalue1[0].trim().equalsIgnoreCase("countrycode"))
			{
				launchapplication.driver.findElement(menu.homebutton).click();
				launchapplication.driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				launchapplication.driver.findElement(menu.registrationandconfiguration).click();
				launchapplication.driver.findElement(menu.geoghraphicalinformation).click();
				launchapplication.driver.findElement(menu.statesmaster).click();
				launchapplication.driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				
			countrycode = rawvalue1[1];
			System.out.println("Country Code is :"+countrycode);
			
			Select SelectValue = new Select (launchapplication.driver.findElement(scountrycode_xp));
			//launchapplication.driver.findElement(countrycode_xp).click();
			SelectValue.selectByVisibleText(countrycode);
			Thread.sleep(6000);
			}
			if (rawvalue1[0].trim().equalsIgnoreCase("statecode"))
			{
			statecode = rawvalue1[1];
			System.out.println("State Code is :"+statecode);
			launchapplication.driver.findElement(statecode_xp).sendKeys(statecode);
			}
			if (rawvalue1[0].trim().equalsIgnoreCase("statename"))
			{
			statename = rawvalue1[1];
			System.out.println("State Name is :"+statename);
	        launchapplication.driver.findElement(statename_xp).sendKeys(statename);
			}
		    launchapplication.driver.findElement(menu.savebutton).click();
					
		}
		
	 }
	
}


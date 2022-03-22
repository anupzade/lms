package com.e.lms.modules;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.e.lms.objects.citycreate_obj;
import com.e.lms.objects.menu;

public class citycreate extends citycreate_obj
{
	
	public void Execute(String testdata) throws Exception
	{
		String countrycode =null;
		String statecode = null;
		String citycode = null;
		String cityname = null;
				
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
			  launchapplication.driver.findElement(menu.citiesmaster).click();
			  launchapplication.driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			  
			countrycode = rawvalue1[1];
			System.out.println("Country Code is :"+countrycode);
			Select SelectValue = new Select (launchapplication.driver.findElement(ccountrycode_xp));
			SelectValue.selectByVisibleText(countrycode);
			Thread.sleep(6000);
			}
		
			if (rawvalue1[0].trim().equalsIgnoreCase("statecode"))
			{
			
			statecode = rawvalue1[1];
			System.out.println("State Code is :"+statecode);
			launchapplication.driver.findElement(cstatecode_xp).click();
			Select SelectValue = new Select (launchapplication.driver.findElement(cstatecode_xp));
			SelectValue.selectByVisibleText(statecode);
			Thread.sleep(6000);
			}
				
			if (rawvalue1[0].trim().equalsIgnoreCase("citycode"))
			{
			
			citycode = rawvalue1[1];
			System.out.println("City Code is :"+citycode);
		    launchapplication.driver.findElement(citycode_xp).sendKeys(citycode);
			}
			
			if (rawvalue1[0].trim().equalsIgnoreCase("cityname"))
			{
			
			cityname = rawvalue1[1];
			System.out.println("City Name is :"+cityname);
	        launchapplication.driver.findElement(cityname_xp).sendKeys(cityname);
			}
			
			launchapplication.driver.findElement(menu.savebutton).click();
			
		}
	}
}

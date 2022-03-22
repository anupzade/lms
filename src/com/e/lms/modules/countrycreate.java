package com.e.lms.modules;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.e.lms.objects.countrycreate_obj;
import com.e.lms.objects.menu;

public class countrycreate extends countrycreate_obj
{

	public void Execute(String testdata)
	{
		String countrycode =null;
		String countryname = null;
		String[] rawvalue = testdata.split(",");
			
		for (int i = 0;i<rawvalue.length;i++)
		{
			String[] rawvalue1=rawvalue[i].split("=");
			if (rawvalue1[0].trim().equalsIgnoreCase("countrycode"))
			{	
				launchapplication.driver.findElement(menu.registrationandconfiguration).click();
				launchapplication.driver.findElement(menu.geoghraphicalinformation).click();
				launchapplication.driver.findElement(menu.countriesmaster).click();
				launchapplication.driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
				
			countrycode = rawvalue1[1];
			//System.out.println("Country Code is :"+countrycode);
			launchapplication.driver.findElement(countrycode_xp).sendKeys(countrycode);	
			
			}
			
			if (rawvalue1[0].trim().equalsIgnoreCase("countryname"))
			{
			
			countryname = rawvalue1[1];
			//System.out.println("Country Name is :"+countryname);
			launchapplication.driver.findElement(countryname_xp).sendKeys(countryname);
			launchapplication.driver.findElement(menu.savebutton).click();
			launchapplication.driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			WebElement home =  launchapplication.driver.findElement(menu.homebutton);
			if(home.isDisplayed())
			{
				home.click();
			}
			}
    	}	
			
			
			//launchapplication.driver.findElement(By.xpath(".//*[@id='MainContent_tabContainer_tabCountryMaster_lblCountryMaster']")).click();
	}
		
}

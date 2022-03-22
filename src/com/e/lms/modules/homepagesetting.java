package com.e.lms.modules;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import com.e.lms.objects.homepagesetting_obj;
import com.e.lms.objects.menu;


public class homepagesetting extends homepagesetting_obj  

{
	public void Execute(String testdata) throws Exception
	{
		String logo 					=	null;
		String applicationname 			=	null;
		String hompagebanner 			=	null;
		String homepagecentralimage		=	null;
		String homepagebagroundimage	=	null;
		String loginboxcolor 			=	null;
		String bagroundcolor1 			=	null;
		String bagroundcolor2 			=	null;
		String homepagefooter 			=	null;
		String innerpagebanner 			=	null;
		String innerpagefooter 			=	null;
		String menubagroundcolor 		=	null;
		String fontcolor 				=	null;
		String innerpagebaground1		=	null;
		String innerpagebaground2		=	null;
		String remarks					=	null;
		String reset					=	null;
		
		 
		//System.out.println("Text value for country Is :"+testdata);
		String[] rawvalue = testdata.split(",");
			
		for (int i = 0;i<rawvalue.length;i++)
		{

			String[] rawvalue1=rawvalue[i].split("=");
			if (rawvalue1[0].trim().equalsIgnoreCase("applicationname"))
			{	

				//launchapplication.driver.findElement(menu.homebutton).click();
				launchapplication.driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				launchapplication.driver.findElement(menu.registrationandconfiguration).click();
				launchapplication.driver.findElement(menu.systemsetting).click();
				launchapplication.driver.findElement(menu.homepagesetting).click();
				launchapplication.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				
               
		    applicationname = rawvalue1[1];
			System.out.println("Application Name Is :"+applicationname);
			launchapplication.driver.findElement(applicationname_xp).clear();
			launchapplication.driver.findElement(applicationname_xp).sendKeys(applicationname);	
			}
			
			if (rawvalue1[0].trim().equalsIgnoreCase("loginboxcolor"))
			{
			loginboxcolor = rawvalue1[1];
			System.out.println("Login Box Color Will Be :"+loginboxcolor);
			launchapplication.driver.findElement(loginboxcolor_xp).clear();
			launchapplication.driver.findElement(loginboxcolor_xp).sendKeys(loginboxcolor);
			}
			
			if (rawvalue1[0].trim().equalsIgnoreCase("menucolor"))
			{
				
//Upload Logo Image
				launchapplication.driver.findElement(logo_xp).sendKeys("C:\\WS_lms\\lms\\testdata\\homepagesetting\\logo.png");
	            launchapplication.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                
//Upload Home Page Banner Image
				launchapplication.driver.findElement(hompagebanner_xp).sendKeys("C:\\WS_lms\\lms\\testdata\\homepagesetting\\"+applicationname+"\\homeheader.png");
                launchapplication.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
//Upload Home Page Baground Image
				launchapplication.driver.findElement(homepagebagroundimage_xp).sendKeys("C:\\WS_lms\\lms\\testdata\\homepagesetting\\"+applicationname+"\\baground.png");
                launchapplication.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                
//Upload Home Page Footer Image
				launchapplication.driver.findElement(homepagefooter_xp).sendKeys("C:\\WS_lms\\lms\\testdata\\homepagesetting\\"+applicationname+"\\Footer.png");
				launchapplication.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
//Upload Inner Page Banner Image
				launchapplication.driver.findElement(innerpagebanner_xp).sendKeys("C:\\WS_lms\\lms\\testdata\\homepagesetting\\"+applicationname+"\\innerheader.png");
	            launchapplication.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                
//Upload Inner Page Footer Image
	            launchapplication.driver.findElement(innerpagefooter_xp).sendKeys("C:\\WS_lms\\lms\\testdata\\homepagesetting\\"+applicationname+"\\Footer.png");
                launchapplication.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
			menubagroundcolor = rawvalue1[1];
			System.out.println("Menu Baground Color Will Be :"+menubagroundcolor);
			launchapplication.driver.findElement(menubagroundcolor_xp).clear();
			launchapplication.driver.findElement(menubagroundcolor_xp).sendKeys(menubagroundcolor);
			launchapplication.driver.findElement(menu.savebutton).click();
			}
			
			//launchapplication.driver.findElement(By.xpath(".//*[@id='MainContent_tabContainer_tabCountryMaster_lblCountryMaster']")).click();
		}
	}
}

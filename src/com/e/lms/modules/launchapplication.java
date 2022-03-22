package com.e.lms.modules;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.e.lms.driver.startup;

public class launchapplication 
{
		public static WebDriver driver=null;
		public static RemoteWebDriver rdriver=null;
	
		public void Execute(String TestData) throws MalformedURLException
		{
			String BrowserName=null;
			boolean use_sg=false;
			String url=null;
			String MachineName=null;
			String[] SplitedTestData=TestData.split(",");
		    DesiredCapabilities dc=null;
	
		    for(int f=0;f<SplitedTestData.length;f++)
			{
				if(SplitedTestData[f].split("=")[0].equalsIgnoreCase("browsername"))
				{
					BrowserName=SplitedTestData[f].split("=")[1];
				}
				if(SplitedTestData[f].split("=")[0].equalsIgnoreCase("url"))
				{
					url=SplitedTestData[f].split("=")[1];
				}
				if(SplitedTestData[f].split("=")[0].equalsIgnoreCase("runon"))
				{
					MachineName=SplitedTestData[f].split("=")[1];
				}
				if(SplitedTestData[f].split("=")[0].equalsIgnoreCase("use_sg"))
				{
					if(SplitedTestData[f].split("=")[1].toLowerCase()=="yes")
					{use_sg=true;}
					else
					{use_sg=false;}
						
				}
			}
			if(BrowserName.equalsIgnoreCase("ff"))
			{
				dc=new DesiredCapabilities("firefox", "any",org.openqa.selenium.Platform.WINDOWS);
				FirefoxProfile fp=new FirefoxProfile();
				fp.setPreference("browser.cache.disk.enable", false);
				driver=new FirefoxDriver();
				//	rdriver=new RemoteWebDriver(new URL("http://"+MachineName+":4444/wd/hub"),dc);
			}
			if(BrowserName.equalsIgnoreCase("ie32"))
			{
				System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"/AllDrivers/IEDriverServer_v2.41_32bit.exe");
				//System.out.println(System.getProperty("user.dir")+"/AllDrivers/IEDriverServer_v2.41_32bit.exe");
				driver = new InternetExplorerDriver();
				dc=new DesiredCapabilities("internet explorer", "11",org.openqa.selenium.Platform.WINDOWS);
				//rdriver=new RemoteWebDriver(new URL("http://"+MachineName+":4444/wd/hub"),dc);
		
			}
			if(BrowserName.equalsIgnoreCase("ch32"))
			{
				System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/AllDrivers/chromedriver_v_2.21.exe.");
				//System.out.println(System.getProperty("user.dir")+"/AllDrivers/chromedriver_v_2.21.exe");
				driver = new ChromeDriver();
				dc=new DesiredCapabilities("chrome", "any",org.openqa.selenium.Platform.WINDOWS);
				//rdriver=new RemoteWebDriver(new URL("http://"+MachineName+":4444/wd/hub"),dc);
		
			}
			if(use_sg)
			{			
				driver.manage().window().maximize();
				driver.get(url); 	
				driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				String ActualTitle=rdriver.getTitle();
				System.out.println(ActualTitle);
			}
			else
			{      
				driver.manage().window().maximize();
				driver.get(url);
				driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				String ActualTitle=driver.getTitle();
				System.out.println(ActualTitle);
			
			}
			
			
		}

		public static void main(String[] args) throws MalformedURLException 
		{
			
			launchapplication la=new launchapplication();
			//la.Execute("browsername=ch32,http://192.168.91.27:8010/default.aspx,use_sg=yes,RunOn=LocalHost,Expected=SBDC");
		}

	}


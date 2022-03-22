package com.e.lms.modules;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.e.lms.objects.gadgetmanagement;
import com.e.lms.objects.menu;

public class gadgetscreate extends gadgetmanagement
{
	public static WebDriver frmDriver=null;
		String newstype=null;
		String newstitle=null;
		String newspublishdate=null;
		String newsvaliditydate=null;
		String newseventimage=null;
		String newsdescription=null;
		String discussiontopic=null;
		String organization=null;
		String publicationtitle=null;
		String publicationdesc=null;
		String publicationdate=null;
		String opinionque=null;
		String noofoptions=null;
		String opiniondate=null;
		String externallink=null;
		String externallinkdesc=null;
		String messagefrom=null;
		String messagebrief=null;
		String messageshort=null;
		String messagelong=null;
		String photogallery=null;

		public void Execute(String testdata) throws Exception
		{
			Thread.sleep(5000);
			String[] rawvalue = testdata.split(",");
			for (int i = 0;i<rawvalue.length;i++)
			{
				String[] rawvalue1=rawvalue[i].split("=");
				System.out.println("rawvalue1 Is:" +rawvalue1);
				
				if (rawvalue1[0].trim().equalsIgnoreCase("newstype"))
				{
					System.out.println("News Event");
					news(testdata);
				}
				
				else if (rawvalue1[0].trim().equalsIgnoreCase("discussiontopic"))
				{
					System.out.println("Discussion Forum");
					discussion(testdata);
				}
				
				else if (rawvalue1[0].trim().equalsIgnoreCase("publicationtitle"))
				{
					System.out.println("Publication");
					publication(testdata);
				}
				
				else if (rawvalue1[0].trim().equalsIgnoreCase("opinionque"))
				{
					System.out.println("Opinion Poll");
					opinionpoll(testdata);
				}
				
				else if (rawvalue1[0].trim().equalsIgnoreCase("externallink"))
				{
					System.out.println("External Link");
					external_link(testdata);
				}
				
				else if (rawvalue1[0].trim().equalsIgnoreCase("messagefrom"))
				{
					System.out.println("Message From");
					messagefrom(testdata);
				}
				
				if (rawvalue1[0].trim().equalsIgnoreCase("photogallery"))
				{
					System.out.println("Photo Gallery");
					photogallery(testdata);
				}
			}	
		}
		
	//*************************************News Event ******************************************************
		
		public void news(String testdata) throws InterruptedException
		{
			String[] rawvalue = testdata.split(",");
			
			for (int i = 0;i<rawvalue.length;i++)
			{
				String[] rawvalue1=rawvalue[i].split("=");
			
				if (rawvalue1[0].trim().equalsIgnoreCase("newstype"))
				{
					//System.out.println("News Event");
					launchapplication.driver.findElement(menu.registrationandconfiguration).click();
					launchapplication.driver.findElement(menu.systemsetting).click();
					Thread.sleep(500);
					launchapplication.driver.findElement(menu.gadgetmanagement).click();
					launchapplication.driver.findElement(newstab_xp).click();
				newstype = rawvalue1[1];
				System.out.println("News Type is :"+newstype);
				Select SelectValue = new Select (launchapplication.driver.findElement(newstype_xp));
				SelectValue.selectByVisibleText(newstype);
				Thread.sleep(6000);	
				}
				
				if (rawvalue1[0].trim().equalsIgnoreCase("newstitle"))
				{
				newstitle = rawvalue1[1];
				System.out.println("News Title is :"+newstitle);
				launchapplication.driver.findElement(newstitle_xp).sendKeys(newstitle);
				}
				
				if (rawvalue1[0].trim().equalsIgnoreCase("newspublishdate"))
				{
				newspublishdate = rawvalue1[1];
				System.out.println("News Publish Date is :"+newspublishdate);
				launchapplication.driver.findElement(publishdate_xp).sendKeys(newspublishdate);
				}
				
				if (rawvalue1[0].trim().equalsIgnoreCase("newsvaliditydate"))
				{
				newsvaliditydate = rawvalue1[1];
				System.out.println("News Validity Date is :"+newsvaliditydate);
				launchapplication.driver.findElement(validitydate_xp).sendKeys(newsvaliditydate);
				
				String File="C:\\WS_lms\\lms\\testdata\\gadgetmanagement\\News & Events\\"+newstitle+".jpg";
				System.out.println("News Event Image path is :"+File);
				launchapplication.driver.findElement(imagetitle_xp).sendKeys(File);
				
				frmDriver = launchapplication.driver.switchTo().frame(launchapplication.driver.findElement(By.xpath(".//*[@id='MainContent_tabContainer_tbPnlNewsEvents_txtDescription1_ctl02_ctl00']")));
				
				if (rawvalue1[0].trim().equalsIgnoreCase("newsdescription"))
				{
				newsdescription = rawvalue1[1];
				System.out.println("News Validity Date is :"+newsdescription);
				frmDriver.findElement(newsrichtextbox_xp).sendKeys(newsdescription);
				frmDriver.switchTo().defaultContent();
				}
				
				launchapplication.driver.findElement(By.xpath("//div[@class='page-actions']"));
				launchapplication.driver.findElement(menu.savebutton).click();;
				WebElement tooltip=launchapplication.driver.findElement(menu.operationmessages);
				System.out.println(tooltip.getText());
				}
			}
		}
		
//**********************************Discussion Forum***************************************************************
		
		public void discussion(String testdata) throws InterruptedException
		{
			String[] rawvalue = testdata.split(",");
		//	Thread.sleep(5000);
			for (int i = 0;i<rawvalue.length;i++)
			{
				String[] rawvalue1=rawvalue[i].split("=");
			
				if (rawvalue1[0].trim().equalsIgnoreCase("discussiontopic"))
				{
					//System.out.println("Discussion Forum");
					Thread.sleep(1000);
					launchapplication.driver.findElement(menu.homebutton).click();
					Thread.sleep(500);
					launchapplication.driver.findElement(menu.registrationandconfiguration).click();
					Thread.sleep(500);
					launchapplication.driver.findElement(menu.systemsetting).click();
					Thread.sleep(1000);
					launchapplication.driver.findElement(menu.gadgetmanagement).click();
					launchapplication.driver.findElement(discussiontab_xp).click();
					
					discussiontopic = rawvalue1[1];
					System.out.println("Discussion Topic is :"+discussiontopic);
					Thread.sleep(5000);
					launchapplication.driver.findElement(discussiontopic_xp).sendKeys(discussiontopic);;
					Thread.sleep(6000);	
				}
				
				if (rawvalue1[0].trim().equalsIgnoreCase("organization"))
				{
					organization = rawvalue1[1];
					System.out.println("Organization:"+organization);
					Thread.sleep(500);
					Select SelectValue = new Select (launchapplication.driver.findElement(organization_xp));
					SelectValue.selectByVisibleText(organization);
					Thread.sleep(6000);	
					launchapplication.driver.findElement(By.xpath("//div[@class='page-actions']"));
					launchapplication.driver.findElement(menu.savebutton).click();;
					WebElement tooltip=launchapplication.driver.findElement(menu.operationmessages);
					System.out.println(tooltip.getText());
				}
				
			}
		}
		
//********************************************Publication***********************************************
		
		public void publication(String testdata) throws InterruptedException
		{
			String[] rawvalue = testdata.split(",");
			
			for (int i = 0;i<rawvalue.length;i++)
			{
				String[] rawvalue1=rawvalue[i].split("=");
			
				if (rawvalue1[0].trim().equalsIgnoreCase("publicationtitle"))
				{
					
					launchapplication.driver.findElement(menu.homebutton).click();
					Thread.sleep(500);
					launchapplication.driver.findElement(menu.registrationandconfiguration).click();
					Thread.sleep(500);
					launchapplication.driver.findElement(menu.systemsetting).click();
					Thread.sleep(1000);
					launchapplication.driver.findElement(menu.gadgetmanagement).click();
					launchapplication.driver.findElement(publicationtab_xp).click();
					
					publicationtitle = rawvalue1[1];
					System.out.println("Publication Title is :"+publicationtitle);
					Thread.sleep(5000);
					launchapplication.driver.findElement(publicationtitle_xp).sendKeys(publicationtitle);;
					Thread.sleep(6000);	
					String publicationlogo="C:\\WS_lms\\lms\\testdata\\gadgetmanagement\\Publications\\publication.png";
					launchapplication.driver.findElement(publicationimage_xp).sendKeys(publicationlogo);
				}
				
				if (rawvalue1[0].trim().equalsIgnoreCase("publicationdesc"))
				{
					publicationdesc = rawvalue1[1];
					System.out.println("Publication Description:"+publicationdesc);
					launchapplication.driver.findElement(publicationdesc_xp).sendKeys(publicationdesc);
					String publicationfile="C:\\WS_lms\\lms\\testdata\\gadgetmanagement\\Publications\\"+publicationtitle+".pdf";
					//System.out.println(publicationfile);
					launchapplication.driver.findElement(publicationpdf_xp).sendKeys(publicationfile);
				}
				
				if (rawvalue1[0].trim().equalsIgnoreCase("publicationdate"))
				{
					publicationdate = rawvalue1[1];
					System.out.println("Publication Date:"+publicationdate);
					launchapplication.driver.findElement(publicationdate_xp).sendKeys(publicationdate);
					launchapplication.driver.findElement(By.xpath("//div[@class='page-actions']"));
					launchapplication.driver.findElement(menu.savebutton).click();;
					WebElement tooltip=launchapplication.driver.findElement(menu.operationmessages);
					System.out.println(tooltip.getText());
				}
			}
		}
		
//*************************************************Opinion Poll***************************************************************

		public void opinionpoll(String testdata) throws InterruptedException
		{
			String[] rawvalue = testdata.split(",");
			
			for (int i = 0;i<rawvalue.length;i++)
			{
				String[] rawvalue1=rawvalue[i].split("=");
			
				if (rawvalue1[0].trim().equalsIgnoreCase("opinionque"))
				{
					
					launchapplication.driver.findElement(menu.savebutton).click();
					Thread.sleep(500);
					launchapplication.driver.findElement(menu.registrationandconfiguration).click();
					Thread.sleep(500);
					launchapplication.driver.findElement(menu.systemsetting).click();
					Thread.sleep(1000);
					launchapplication.driver.findElement(menu.gadgetmanagement).click();
					launchapplication.driver.findElement(opiniopolltab_xp).click();
					
					opinionque = rawvalue1[1];
					System.out.println("Opinion Poll Question is :"+opinionque);
					Thread.sleep(5000);
					launchapplication.driver.findElement(opinionque_xp).sendKeys(opinionque);;
					
				}
				
				if (rawvalue1[0].trim().equalsIgnoreCase("noofoptions"))
				{
					noofoptions = rawvalue1[1];
					System.out.println("Number of Options is :"+noofoptions);
					Select SelectValue = new Select (launchapplication.driver.findElement(noofoptions_xp));
					SelectValue.selectByVisibleText(noofoptions);
					Thread.sleep(6000);	
					launchapplication.driver.findElement(option1_xp).sendKeys("Yes");
					launchapplication.driver.findElement(option2_xp).sendKeys("No");
					launchapplication.driver.findElement(option3_xp).sendKeys("Can't Say");
				}
				if (rawvalue1[0].trim().equalsIgnoreCase("opiniondate"))
				{
					opiniondate = rawvalue1[1];
					System.out.println("Opinion Poll Validity Date is :"+opiniondate);
					launchapplication.driver.findElement(opiniondate_xp).sendKeys(opiniondate);
					launchapplication.driver.findElement(By.xpath("//div[@class='page-actions']"));
					launchapplication.driver.findElement(menu.savebutton).click();;
					WebElement tooltip=launchapplication.driver.findElement(menu.operationmessages);
					System.out.println(tooltip.getText());
				}
			}
		}
		
//******************************************External Link*******************************************************************
		
		public void external_link(String testdata) throws InterruptedException
		{
			String[] rawvalue = testdata.split(",");
			
			for (int i = 0;i<rawvalue.length;i++)
			{
				String[] rawvalue1=rawvalue[i].split("=");
		
				if (rawvalue1[0].trim().equalsIgnoreCase("externallink"))
				{
					externallink = rawvalue1[1];
					launchapplication.driver.findElement(menu.homebutton).click();
					Thread.sleep(500);
					launchapplication.driver.findElement(menu.registrationandconfiguration).click();
					Thread.sleep(500);
					launchapplication.driver.findElement(menu.systemsetting).click();
					Thread.sleep(1000);
					launchapplication.driver.findElement(menu.gadgetmanagement).click();
					launchapplication.driver.findElement(externallinktab_xp).click();
					System.out.println("External Link is :"+externallink);
					Thread.sleep(500);
					launchapplication.driver.findElement(externallink_xp).sendKeys(externallink);
					Thread.sleep(500);
				}
				if (rawvalue1[0].trim().equalsIgnoreCase("externallinkdesc"))
				{
					externallinkdesc = rawvalue1[1];
					System.out.println("Link Description is :"+externallinkdesc);
					Thread.sleep(500);
					launchapplication.driver.findElement(externaldesc_xp).sendKeys(externallinkdesc);
					Thread.sleep(500);
					launchapplication.driver.findElement(By.xpath("//div[@class='page-actions']"));
					launchapplication.driver.findElement(menu.savebutton).click();;
					WebElement tooltip=launchapplication.driver.findElement(menu.operationmessages);
					System.out.println(tooltip.getText());
				}
			}
		}
		
//********************************************Message From*************************************************************
		
		public void messagefrom(String testdata) throws InterruptedException
		{
			String[] rawvalue = testdata.split(",");
			
			for (int i = 0;i<rawvalue.length;i++)
			{
				String[] rawvalue1=rawvalue[i].split("=");
		
				if (rawvalue1[0].trim().equalsIgnoreCase("messagefrom"))
				{
					messagefrom = rawvalue1[1];
					launchapplication.driver.findElement(menu.homebutton).click();
					Thread.sleep(500);
					launchapplication.driver.findElement(menu.registrationandconfiguration).click();
					Thread.sleep(500);
					launchapplication.driver.findElement(menu.systemsetting).click();
					Thread.sleep(1000);
					launchapplication.driver.findElement(menu.gadgetmanagement).click();
					launchapplication.driver.findElement(messagefromtab_xp).click();
					System.out.println("Message By:"+messagefrom);
					Thread.sleep(500);
					launchapplication.driver.findElement(messageby_xp).sendKeys(messagefrom);
					Thread.sleep(500);
				}
				if (rawvalue1[0].trim().equalsIgnoreCase("messagebrief"))
				{
					messagebrief = rawvalue1[1];
					System.out.println("Brief Introduction is :"+messagebrief);
					Thread.sleep(500);
					launchapplication.driver.findElement(briefintroduction_xp).sendKeys(messagebrief);
					Thread.sleep(500);
				}
				if (rawvalue1[0].trim().equalsIgnoreCase("messageshort"))
				{
					messageshort = rawvalue1[1];
					System.out.println("Short Message is :"+messageshort);
					Thread.sleep(500);
					launchapplication.driver.findElement(shortmessage_xp).sendKeys(messageshort);
					Thread.sleep(500);
					String upload="D:\\WS_LMS\\LMS\\Test Data\\gadgetsmanage\\"+messagefrom+".jpg";
					launchapplication.driver.findElement(messagebyimage_xp).sendKeys(upload);
				}
				if (rawvalue1[0].trim().equalsIgnoreCase("messagelong"))
				{
					messagelong = rawvalue1[1];
					System.out.println("Long Message is :"+messagelong);
					Thread.sleep(500);
					frmDriver = launchapplication.driver.switchTo().frame(launchapplication.driver.findElement(By.xpath(".//*[@id='MainContent_tabContainer_tbPnlAdminBuyerMessages_txtDetailMessage1_ctl02_ctl00']")));
					frmDriver.findElement(messagerichtextbox_xp).sendKeys(messagelong);
					frmDriver.switchTo().defaultContent();
					launchapplication.driver.findElement(By.xpath("//div[@class='page-actions']"));
					launchapplication.driver.findElement(menu.savebutton).click();;
					WebElement tooltip=launchapplication.driver.findElement(menu.operationmessages);
					System.out.println(tooltip.getText());
				}
			}
		}
		
//******************************************Photo Gallery***********************************************
		
		public void photogallery(String testdata) throws InterruptedException
		{
			String[] rawvalue = testdata.split(",");
			String file1="C:\\WS_lms\\lms\\testdata\\gadgetmanagement\\PhotoGallery\\";
			File myFile=new File(file1);
			File[] listOfFiles = myFile.listFiles();
			for (int i = 0;i<rawvalue.length;i++)
			{
				String[] rawvalue1=rawvalue[i].split("=");
				System.out.println("RawValue1 Is :" +rawvalue1);
		
				if (rawvalue1[0].trim().equalsIgnoreCase("photogallery"))
				{
					photogallery = rawvalue1[1];
					System.out.println("Photo Gallery Name Is :" +photogallery);
					launchapplication.driver.findElement(menu.homebutton).click();
					Thread.sleep(500);
					launchapplication.driver.findElement(menu.registrationandconfiguration).click();
					Thread.sleep(500);
					launchapplication.driver.findElement(menu.systemsetting).click();
					Thread.sleep(1000);
					launchapplication.driver.findElement(menu.gadgetmanagement).click();
					launchapplication.driver.findElement(photogallerytab_xp).click();
					Thread.sleep(5000);

					WebElement SelectValue = launchapplication.driver.findElement(selectalbum_xp);
					Select select = new Select(SelectValue);
				    //List<WebElement> options = select.getOptions();
					for(int k=0 ;k<select.getOptions().size(); k++)
					{
						String item = select.getOptions().get(k).getText(); 
					
						if(item.equals(photogallery));
						{
						launchapplication.driver.findElement(selectalbum_xp).click();
						Select SelectValue1 = new Select (launchapplication.driver.findElement(selectalbum_xp));
						SelectValue1.selectByVisibleText(photogallery);
						Thread.sleep(6000);
							for (File file : listOfFiles) 
							{
////							   	if (file.isFile()) 
////							    {
////							        System.out.println(file.getName());
////							    }
								launchapplication.driver.findElement(imagename_xp).clear();
							    launchapplication.driver.findElement(imagename_xp).sendKeys(file.getName());
							    String fileToUpload="C:\\WS_lms\\lms\\testdata\\gadgetmanagement\\PhotoGallery\\"+file.getName().toString();
							    launchapplication.driver.findElement(imagepath_xp).sendKeys(fileToUpload);
							    launchapplication.driver.findElement(uploadbutton_xp).click();
							    launchapplication.driver.findElement(By.xpath("//div[@class='page-actions']"));
								launchapplication.driver.findElement(menu.savebutton).click();;
								WebElement tooltip1=launchapplication.driver.findElement(menu.operationmessages);
								System.out.println(tooltip1.getText()); break;
							} 
						}
						
						if (item != photogallery)
						{
						launchapplication.driver.findElement(newalbum_xp).click();
						//Thread.sleep(5000);
						launchapplication.driver.findElement(albumname_xp).clear();
						launchapplication.driver.findElement(albumname_xp).sendKeys(photogallery);
						Thread.sleep(5000);
							for (File file : listOfFiles) 
							{
//						   		if (file.isFile()) 
//						    	{
//						        System.out.println(file.getName());
//						    	}
							launchapplication.driver.findElement(imagename_xp).clear();
							launchapplication.driver.findElement(imagename_xp).sendKeys(file.getName());
						    String fileToUpload="C:\\WS_lms\\lms\\testdata\\gadgetmanagement\\PhotoGallery\\"+file.getName().toString();
						    launchapplication.driver.findElement(imagepath_xp).sendKeys(fileToUpload);
						    launchapplication.driver.findElement(uploadbutton_xp).click();
						    launchapplication.driver.findElement(By.xpath("//div[@class='page-actions']"));
							launchapplication.driver.findElement(menu.savebutton).click();;
							WebElement tooltip1=launchapplication.driver.findElement(menu.operationmessages);
							System.out.println(tooltip1.getText()); break;
							}
						}
					}
			 } // gallery if
		}//gallery loop
	} //gallery class
}//main class
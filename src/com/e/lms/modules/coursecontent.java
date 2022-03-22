package com.e.lms.modules;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.e.lms.objects.coursecontent_obj;
import com.e.lms.objects.menu;

public class coursecontent extends coursecontent_obj {
	
	String coursecategory=null;
	String coursesubcategory=null;
	String trainingtype=null;
	String coursetitle=null;
	int scorm=0;
	String objectdescription=null;
	String startuppage=null;
	String uploadcontent=null;
	String objecttype=null;
	
	//**********************************E-Learning Type Code Start Here***************************************
		public void elearning(String TestData) throws InterruptedException
		{
			String[] rawvalue = TestData.split(",");
		
			for (int i = 0;i<rawvalue.length;i++)
			{
				String[] rawvalue1=rawvalue[i].split("=");

				if (rawvalue1[0].trim().equalsIgnoreCase("coursecategory"))
				{
					launchapplication.driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				//	launchapplication.driver.findElement(menu.coursesmanagementsystem).click();
					launchapplication.driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				//	launchapplication.driver.findElement(menu.coursesbasicinformation).click();
					launchapplication.driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
					launchapplication.driver.findElement(menu.contentmaster).click();
					launchapplication.driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
					coursecategory = rawvalue1[1];
					System.out.println("CourseCategory is :"+coursecategory);
			
					Select SelectValue = new Select (launchapplication.driver.findElement(coursecategory_xp));
					SelectValue.selectByVisibleText(coursecategory);
					Thread.sleep(6000);	
				}
		
				if (rawvalue1[0].trim().equalsIgnoreCase("coursesubcategory"))
				{
					coursesubcategory = rawvalue1[1];
					System.out.println("CourseSubCategory is :"+coursesubcategory);
			
					Select SelectValue = new Select (launchapplication.driver.findElement(coursesubcategory_xp));
					SelectValue.selectByVisibleText(coursesubcategory);
					Thread.sleep(6000);	
				}
		
				if (rawvalue1[0].trim().equalsIgnoreCase("trainingtype"))
				{
					trainingtype = rawvalue1[1];
					System.out.println("Training Type is :"+trainingtype);
			
					WebElement dropdown = launchapplication.driver.findElement(trainingtype_xp);
					dropdown.click();
					List<WebElement> options = dropdown.findElements(By.tagName("option"));
					for(WebElement option : options)
					{
						String optTxt = option.getText();
						
						if(optTxt.contains(trainingtype))
						{
							option.click();
							break;
						}
					}
					Thread.sleep(6000);
				}
		
				if (rawvalue1[0].trim().equalsIgnoreCase("coursetitle"))
				{
			
					coursetitle = rawvalue1[1];
					System.out.println("Course Title is :"+coursetitle);
					launchapplication.driver.findElement(coursetitle_xp).sendKeys(coursetitle);
				}
		
				if(rawvalue1[0].trim().equalsIgnoreCase("scorm"))
				{
					scorm=Integer.parseInt(rawvalue[i].split("=")[1]);
					if(scorm==1)
					{
						System.out.println("Elearning course Scorm Compliant::"+scorm);
						launchapplication.driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
						launchapplication.driver.findElement(By.xpath(".//*[@id='MainContent_rdSCORMCompliant_0']")).click();
					}
					else
					{
						launchapplication.driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
						launchapplication.driver.findElement(By.xpath(".//*[@id='MainContent_rdSCORMCompliant_1']")).click();
						System.out.println("Elearning course Scorm Compliant::"+scorm);
				
					}	
			
				}
		
				if(rawvalue1[0].trim().equalsIgnoreCase("objdesc"))
				{
					objectdescription=rawvalue1[1];
					System.out.println("Object Description :"+objectdescription);
					launchapplication.driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
					launchapplication.driver.findElement(objectdesc_xp).sendKeys(objectdescription);
				}
		
		
				if(rawvalue1[0].trim().equalsIgnoreCase("startuppage"))
				{
					startuppage=rawvalue1[1];
					if(scorm==0)
					{
						System.out.println("Start Up Page :"+startuppage);
						launchapplication.driver.findElement(startuppage_xp).sendKeys(startuppage);	
					}
					else
						System.out.println("Scorm Complaint No");
			
			//Upload content as per course title
					String File="D:\\WS_LMS\\LMS\\Test Data\\elearning\\"+coursetitle+".zip";
					System.out.println("upload file path is :"+File);
					launchapplication.driver.findElement(upload_xp).sendKeys(File);
					launchapplication.driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
					launchapplication.driver.findElement(save_xp).click();
					WebElement tooltip=launchapplication.driver.findElement(notification_xp);
					System.out.println(tooltip.getText());
			
				}
		
			} //main for loop close
		} //method close
	
		
		//**********************************Resource Type Code Start Here***************************************	
		public void resource(String TestData) throws InterruptedException
		{
			String[] rawvalue = TestData.split(",");
			
			for (int i = 0;i<rawvalue.length;i++)
			{
				String[] rawvalue1=rawvalue[i].split("=");
				if (rawvalue1[0].trim().equalsIgnoreCase("coursecategory"))
				{
					launchapplication.driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
					//launchapplication.driver.findElement(menu.coursesmanagementsystem).click();
					launchapplication.driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				//	launchapplication.driver.findElement(menu.coursesbasicinformation).click();
					launchapplication.driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
					launchapplication.driver.findElement(menu.contentmaster).click();
					launchapplication.driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
					coursecategory = rawvalue1[1];
					System.out.println("CourseCategory is :"+coursecategory);
			
					Select SelectValue = new Select (launchapplication.driver.findElement(coursecategory_xp));
					SelectValue.selectByVisibleText(coursecategory);
					Thread.sleep(6000);	
				}
		
				if (rawvalue1[0].trim().equalsIgnoreCase("coursesubcategory"))
				{
					coursesubcategory = rawvalue1[1];
					System.out.println("CourseSubCategory is :"+coursesubcategory);
			
					Select SelectValue = new Select (launchapplication.driver.findElement(coursesubcategory_xp));
					SelectValue.selectByVisibleText(coursesubcategory);
					Thread.sleep(6000);	
				}
		
				if (rawvalue1[0].trim().equalsIgnoreCase("trainingtype"))
				{
					trainingtype = rawvalue1[1];
					System.out.println("Training Type is :"+trainingtype);
			
					WebElement dropdown = launchapplication.driver.findElement((trainingtype_xp));
					dropdown.click();
					List<WebElement> options = dropdown.findElements(By.tagName("option"));
					for(WebElement option : options)
					{
						String optTxt = option.getText();
						
						if(optTxt.contains(trainingtype))
						{
							option.click();
							break;
						}
					}
					Thread.sleep(6000);
				}
		
				if (rawvalue1[0].trim().equalsIgnoreCase("coursetitle"))
				{
			
					//Upload content as per course title
					String file1="C:\\WS_lms\\lms\\testdata\\content\\resource";
					File myFile=new File(file1);
					File[] listOfFiles = myFile.listFiles();

					for (File file : listOfFiles) 
					{
					    if (file.isFile()) 
					    {
					        System.out.println(file.getName());//resource course file names
					        coursetitle = rawvalue1[1];
							System.out.println("Course Title is :"+coursetitle);
							launchapplication.driver.findElement(coursetitle_xp).sendKeys(coursetitle);
				
					        if(file.getName().toString().contains(coursetitle+"."))
							{
					        	
					        	if(file.getName().endsWith(".png")|file.getName().endsWith(".jpg")|file.getName().endsWith(".bmp"))
					        	{
					        		Select type = new Select (launchapplication.driver.findElement(objecttype_xp));
									type.selectByVisibleText("Image");
									launchapplication.driver.findElement(objectdesc_xp).clear();
									launchapplication.driver.findElement(objectdesc_xp).sendKeys("Image");
									String fileToUpload="C:\\WS_lms\\lms\\testdata\\content\\resource\\"+file.getName().toString();
									launchapplication.driver.findElement(upload_xp).sendKeys(fileToUpload);
									Thread.sleep(500);	
					        	}
					        	else if(file.getName().endsWith(".doc")|file.getName().endsWith(".docx")|file.getName().endsWith(".pdf")|file.getName().endsWith(".xlsx"))
					        	{
					        		Select type = new Select (launchapplication.driver.findElement(objecttype_xp));
									type.selectByVisibleText("Document");
									launchapplication.driver.findElement(objectdesc_xp).clear();
									launchapplication.driver.findElement(objectdesc_xp).sendKeys("Document");
									String fileToUpload="C:\\WS_lms\\lms\\testdata\\content\\resource\\"+file.getName().toString();
									launchapplication.driver.findElement(upload_xp).sendKeys(fileToUpload);
									Thread.sleep(500);	
					        	}
					        	else if(file.getName().endsWith(".swf")|file.getName().endsWith(".gif"))
					        	{
					        		Select type = new Select (launchapplication.driver.findElement(objecttype_xp));
									type.selectByVisibleText("Animation");
									launchapplication.driver.findElement(objectdesc_xp).clear();
									launchapplication.driver.findElement(objectdesc_xp).sendKeys("Animation");
									String fileToUpload="C:\\WS_lms\\lms\\testdata\\content\\resource\\"+file.getName().toString();
									launchapplication.driver.findElement(upload_xp).sendKeys(fileToUpload);
									Thread.sleep(500);	
					        	}
					        	else if(file.getName().endsWith(".mp3")|file.getName().endsWith(".wma"))
					        	{
					        		Select type = new Select (launchapplication.driver.findElement(objecttype_xp));
									type.selectByVisibleText("Audio");
									launchapplication.driver.findElement(objectdesc_xp).clear();
									launchapplication.driver.findElement(objectdesc_xp).sendKeys("Audio");
									String fileToUpload="C:\\WS_lms\\lms\\testdata\\content\\resource\\"+file.getName().toString();
									launchapplication.driver.findElement(upload_xp).sendKeys(fileToUpload);
									Thread.sleep(500);	
					        	}
					        	else if(file.getName().endsWith(".mp4")|file.getName().endsWith(".wmv")|file.getName().endsWith(".avi"))
					        	{
					        		Select type = new Select (launchapplication.driver.findElement(objecttype_xp));
									type.selectByVisibleText("Video");
									launchapplication.driver.findElement(objectdesc_xp).clear();
									launchapplication.driver.findElement(objectdesc_xp).sendKeys("Video");
									String fileToUpload="C:\\WS_lms\\lms\\testdata\\content\\resource\\"+file.getName().toString();
									launchapplication.driver.findElement(upload_xp).sendKeys(fileToUpload);
									Thread.sleep(500);	
					        	}
					      
								
								launchapplication.driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
								launchapplication.driver.findElement(save_xp).click();
								Thread.sleep(500);
								WebElement tooltip=launchapplication.driver.findElement(notification_xp);
								System.out.println(tooltip.getText());	
					
							}
					        		
					    }
					}
				}			
			}// for loop close		
		} //mothod close 

		//**********************************Resource Type Code Start Here***************************************	
		public void classroom(String TestData) throws InterruptedException
		{
					String[] rawvalue = TestData.split(",");
					
					for (int i = 0;i<rawvalue.length;i++)
					{
						String[] rawvalue1=rawvalue[i].split("=");
						if (rawvalue1[0].trim().equalsIgnoreCase("coursecategory"))
						{
							launchapplication.driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
						//	launchapplication.driver.findElement(menu.coursesmanagementsystem).click();
							launchapplication.driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
						//	launchapplication.driver.findElement(menu.coursesbasicinformation).click();
							launchapplication.driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
							launchapplication.driver.findElement(menu.contentmaster).click();
							launchapplication.driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
					
							coursecategory = rawvalue1[1];
							System.out.println("CourseCategory is :"+coursecategory);
					
							Select SelectValue = new Select (launchapplication.driver.findElement(coursecategory_xp));
							SelectValue.selectByVisibleText(coursecategory);
							Thread.sleep(6000);	
						}
				
						if (rawvalue1[0].trim().equalsIgnoreCase("coursesubcategory"))
						{
							coursesubcategory = rawvalue1[1];
							System.out.println("CourseSubCategory is :"+coursesubcategory);
					
							Select SelectValue = new Select (launchapplication.driver.findElement(coursesubcategory_xp));
							SelectValue.selectByVisibleText(coursesubcategory);
							Thread.sleep(6000);	
						}
				
						if (rawvalue1[0].trim().equalsIgnoreCase("trainingtype"))
						{
							trainingtype = rawvalue1[1];
							System.out.println("Training Type is :"+trainingtype);
					
							WebElement dropdown = launchapplication.driver.findElement((trainingtype_xp));
							dropdown.click();
							List<WebElement> options = dropdown.findElements(By.tagName("option"));
							for(WebElement option : options)
							{
								String optTxt = option.getText();
								
								if(optTxt.contains(trainingtype))
								{
									option.click();
									break;
								}
							}
							Thread.sleep(6000);
						}
				
						if (rawvalue1[0].trim().equalsIgnoreCase("coursetitle"))
						{
					
							//Upload content as per course title
							String file1="C:\\WS_lms\\lms\\testdata\\content\\resource";
							File myFile=new File(file1);
							File[] listOfFiles = myFile.listFiles();

							for (File file : listOfFiles) 
							{
							    if (file.isFile()) 
							    {
							        System.out.println(file.getName());//resource course file names
							        coursetitle = rawvalue1[1];
									System.out.println("Course Title is :"+coursetitle);
									launchapplication.driver.findElement(coursetitle_xp).sendKeys(coursetitle);
						
							        if(file.getName().toString().contains(coursetitle+"."))
									{
							        	
							        	if(file.getName().endsWith(".png")|file.getName().endsWith(".jpg")|file.getName().endsWith(".bmp"))
							        	{
							        		Select type = new Select (launchapplication.driver.findElement(objecttype_xp));
											type.selectByVisibleText("Image");
											launchapplication.driver.findElement(objectdesc_xp).clear();
											launchapplication.driver.findElement(objectdesc_xp).sendKeys("Image");
											String fileToUpload="C:\\WS_lms\\lms\\testdata\\content\\resource\\"+file.getName().toString();
											launchapplication.driver.findElement(upload_xp).sendKeys(fileToUpload);
											Thread.sleep(500);	
							        	}
							        	else if(file.getName().endsWith(".doc")|file.getName().endsWith(".docx")|file.getName().endsWith(".pdf")|file.getName().endsWith(".xlsx"))
							        	{
							        		Select type = new Select (launchapplication.driver.findElement(objecttype_xp));
											type.selectByVisibleText("Document");
											launchapplication.driver.findElement(objectdesc_xp).clear();
											launchapplication.driver.findElement(objectdesc_xp).sendKeys("Document");
											String fileToUpload="C:\\WS_lms\\lms\\testdata\\content\\resource\\"+file.getName().toString();
											launchapplication.driver.findElement(upload_xp).sendKeys(fileToUpload);
											Thread.sleep(500);	
							        	}
							        	else if(file.getName().endsWith(".swf")|file.getName().endsWith(".gif"))
							        	{
							        		Select type = new Select (launchapplication.driver.findElement(objecttype_xp));
											type.selectByVisibleText("Animation");
											launchapplication.driver.findElement(objectdesc_xp).clear();
											launchapplication.driver.findElement(objectdesc_xp).sendKeys("Animation");
											String fileToUpload="C:\\WS_lms\\lms\\testdata\\content\\resource\\"+file.getName().toString();
											launchapplication.driver.findElement(upload_xp).sendKeys(fileToUpload);
											Thread.sleep(500);	
							        	}
							        	else if(file.getName().endsWith(".mp3")|file.getName().endsWith(".wma"))
							        	{
							        		Select type = new Select (launchapplication.driver.findElement(objecttype_xp));
											type.selectByVisibleText("Audio");
											launchapplication.driver.findElement(objectdesc_xp).clear();
											launchapplication.driver.findElement(objectdesc_xp).sendKeys("Audio");
											String fileToUpload="C:\\WS_lms\\lms\\testdata\\content\\resource\\"+file.getName().toString();
											launchapplication.driver.findElement(upload_xp).sendKeys(fileToUpload);
											Thread.sleep(500);	
							        	}
							        	else if(file.getName().endsWith(".mp4")|file.getName().endsWith(".wmv")|file.getName().endsWith(".avi"))
							        	{
							        		Select type = new Select (launchapplication.driver.findElement(objecttype_xp));
											type.selectByVisibleText("Video");
											launchapplication.driver.findElement(objectdesc_xp).clear();
											launchapplication.driver.findElement(objectdesc_xp).sendKeys("Video");
											String fileToUpload="C:\\WS_lms\\lms\\testdata\\content\\resource\\"+file.getName().toString();
											launchapplication.driver.findElement(upload_xp).sendKeys(fileToUpload);
											Thread.sleep(500);	
							        	}
							      
										
										launchapplication.driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
										launchapplication.driver.findElement(save_xp).click();
										Thread.sleep(500);
										WebElement tooltip=launchapplication.driver.findElement(notification_xp);
										System.out.println(tooltip.getText());	
							
									}
							        		
							    }
							}
						}			
					}// for loop close		
				} //mothod close 

	//************************************Execute Method Starts Here**************************************************

		public void Execute(String TestData) throws InterruptedException
		{
			//System.out.println(TestData);
			String[] rawvalue = TestData.split(",");
			String course=null;
			for (int i = 0;i<rawvalue.length;i++)
			{
				String[] rawvalue1=rawvalue[i].split("=");
				if (rawvalue1[0].trim().equalsIgnoreCase("trainingtype"))
				{
					course=rawvalue1[1];
					System.out.println(course);
					if (course.equals("e-Learning"))
					{
						//System.out.println("e-Leaning Course");
						elearning(TestData);
					}
					else if(course.equals("Resource"))
					{
						//System.out.println("Resource Course");
						resource(TestData);
						
					}
					else 
						System.out.println("Classroom Course");
					
				}
		
			}

		}
	}


package com.e.lms.modules;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.e.lms.objects.coursecreate_obj;
import com.e.lms.objects.menu;

public class coursecreate extends coursecreate_obj

{	
		String applicabletoall=null;
		String coursecode =null;
		String coursetitle = null;
		String trainingtype = null;
		String trainertype=null;
		int duration = 0;
		String language=null;
		String coursecategory=null;
		String coursesubcategory=null;
		String keywordsforsearch=null;
		String synopsis=null;
		String objectives=null;
		String author=null;
		String expirydate=null;
		String assessmenttype=null;
		int passingpercentage=0;
		int maxnoattempts=0;
		int goldscore=0;
		int bronzescore=0;
		int silverscore=0;
		int goldattempt=0;
		int bronzeattempt=0;
		int silverattempt=0;
		int creditscore=0;
		String batchsize=null;
		String save=null;
		
		//**********************************E-Learning Type Code Start Here***************************************		
		
	public void elearning(String testdata) throws Exception
	{
		String[] rawvalue = testdata.split(",");
		
		for (int i = 0;i<rawvalue.length;i++)
		{
			String[] rawvalue1=rawvalue[i].split("=");
							
		if (rawvalue1[0].trim().equalsIgnoreCase("coursecode"))
			{
				
			//	launchapplication.driver.findElement(menu.coursesmanagementsystem).click();
				Thread.sleep(500);
			//	launchapplication.driver.findElement(menu.coursesbasicinformation).click();
				Thread.sleep(500);
				launchapplication.driver.findElement(menu.coursesmaster).click();
				Thread.sleep(500);
				
				coursecode=rawvalue1[1];
				//System.out.println("Course Code is :"+coursecode);
				launchapplication.driver.findElement(coursecode_xp).sendKeys(coursecode);
			}
		
			if (rawvalue1[0].trim().equalsIgnoreCase("coursetitle"))
			{
				
				coursetitle = rawvalue1[1];
			//	System.out.println("Course Title is :"+coursetitle);
				launchapplication.driver.findElement(coursetitle_xp).sendKeys(coursetitle);
			}
			
			if (rawvalue1[0].trim().equalsIgnoreCase("coursecategory"))
			{
				coursecategory = rawvalue1[1];
			//	System.out.println("CourseCategory is :"+coursecategory);
				
				Select SelectValue = new Select (launchapplication.driver.findElement(coursecategory_xp));
				SelectValue.selectByVisibleText(coursecategory);
				Thread.sleep(6000);	
			}
			
			if (rawvalue1[0].trim().equalsIgnoreCase("coursesubcategory"))
			{
				coursesubcategory = rawvalue1[1];
			//	System.out.println("CourseSubCategory is :"+coursesubcategory);
				
				Select SelectValue = new Select (launchapplication.driver.findElement(coursesubcategory_xp));
				SelectValue.selectByVisibleText(coursesubcategory);
				Thread.sleep(6000);	
			}
				
			if (rawvalue1[0].trim().equalsIgnoreCase("trainingtype"))
			{
				trainingtype = rawvalue1[1];
			//	System.out.println("Training Type is :"+trainingtype);
				
				WebElement dropdown = launchapplication.driver.findElement((trainingtype_xp));
			    dropdown.click();
				List<WebElement> options = dropdown.findElements(By.tagName("option"));
			    for(WebElement option : options){
			        String optTxt = option.getText();
			        if(optTxt.contains(trainingtype))
			        {
			            option.click();
			            break;
			        }
			    }
			    Thread.sleep(6000);
				
			}
			
			if(rawvalue1[0].trim().equalsIgnoreCase("duration"))
			{
				duration=Integer.parseInt(rawvalue1[1]);
			//	System.out.println("duration is--> "+duration);
				launchapplication.driver.findElement(duration_xp).sendKeys(String.valueOf(duration));
			}
			
			if (rawvalue1[0].trim().equalsIgnoreCase("language"))
			{
				language = rawvalue1[1];
			//	System.out.println("Instructional Language is :"+language);
				Thread.sleep(500);
				Select SelectValue = new Select (launchapplication.driver.findElement(language_xp));
				SelectValue.selectByVisibleText(language);
				Thread.sleep(6000);	
			}
			
		
			if (rawvalue1[0].trim().equalsIgnoreCase("keywordsforsearch"))
			{
				keywordsforsearch = rawvalue1[1];
			//	System.out.println("Keywords for search is :"+keywordsforsearch);
				launchapplication.driver.findElement(keywordsforsearch_xp).sendKeys(keywordsforsearch);
				 
				launchapplication.driver.findElement(basicinformationtab_xp).click(); //basic in formation tab
				launchapplication.driver.findElement(additionalinformationtab_xp).click(); // additional info tab
				Thread.sleep(500);
				
			}
			
			if (rawvalue1[0].trim().equalsIgnoreCase("synopsis"))
			{
				
				synopsis = rawvalue1[1];
			//	System.out.println("Synopsis is :"+synopsis);
				Thread.sleep(500);
				launchapplication.driver.findElement(additionalinformationtab_xp).click();//additional tab
				launchapplication.driver.findElement(additionalinformationtab_xp).click(); //additional tab
				launchapplication.driver.findElement(additionalinformationtab1_xp).click(); //additionaltab1
				Thread.sleep(500);
				launchapplication.driver.findElement(synopsis_xp).sendKeys(synopsis);
			}
			
			if (rawvalue1[0].trim().equalsIgnoreCase("objectives"))
			{
				
				objectives = rawvalue1[1];
			//	System.out.println("Objectives is :"+objectives);
				Thread.sleep(500);
				launchapplication.driver.findElement(objectives_xp).sendKeys(objectives);
			}
			
			if (rawvalue1[0].trim().equalsIgnoreCase("author"))
			{
				
				author = rawvalue1[1];
			//	System.out.println("Author is :"+author);
				Thread.sleep(500);
				launchapplication.driver.findElement(author_xp).sendKeys(author);
			}
			
//			if(rawvalue1[0].trim().equalsIgnoreCase("expirydate"))
//			{
				
//              String threedaysafter = "";
//			    Date date = new Date();
//			    Calendar cal = Calendar.getInstance();
//			    cal.setTime(date);
//
//			    cal.add(Calendar.DAY_OF_YEAR, +120);
//			    Date before = cal.getTime();
//			    SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
//			    threedaysafter = formatter.format(before);
//			    System.out.println("ExpiryDate is:"+threedaysafter);
//				WebElement calendarManualInput = launchapplication.driver.findElement(expirydate_xp);
//				calendarManualInput.sendKeys(threedaysafter);
//			 }
			
			if(rawvalue1[0].trim().equalsIgnoreCase("assessmenttype"))
			{
				
				launchapplication.driver.findElement(commonparametertab_xp).click();
				Thread.sleep(500);
				
				WebDriverWait wt=new WebDriverWait(launchapplication.driver,50);
				wt.until(ExpectedConditions.presenceOfElementLocated(applicabletoallemployee_xp)); //applicableto all
				launchapplication.driver.findElement(applicabletoallemployee_xp).click(); //applicable to all
				launchapplication.driver.findElement(feedback_xp).click(); // feedback
				
				assessmenttype = rawvalue1[1];
			//	System.out.println("AssessmentType is :"+assessmenttype);
				launchapplication.driver.findElement(assessment_xp).click(); //assessment must
				Thread.sleep(500);
				Select SelectValue = new Select (launchapplication.driver.findElement(assessmenttype_xp)); //assessment type
				Thread.sleep(500);
				SelectValue.selectByVisibleText(assessmenttype);
				Thread.sleep(6000);	
			}
			
			if(rawvalue1[0].trim().equalsIgnoreCase("passingpercentage"))
			{
				passingpercentage=Integer.parseInt(rawvalue1[1]);
			//	System.out.println("Passing Percentage is--> "+passingpercentage);
				launchapplication.driver.findElement(passingpercentage_xp).clear();
				launchapplication.driver.findElement(passingpercentage_xp).sendKeys(String.valueOf(passingpercentage));
				Thread.sleep(500);
			}
			
			if(rawvalue1[0].trim().equalsIgnoreCase("maxnoattempts"))
			{
				maxnoattempts=Integer.parseInt(rawvalue1[1]);
			//	System.out.println("Max Number of Attempts is--> "+maxnoattempts);
				launchapplication.driver.findElement(maxnoattempts_xp).sendKeys(String.valueOf(maxnoattempts));
				Thread.sleep(500);
				launchapplication.driver.findElement(awardmedals_xp).click(); //award medals
			}
			
			if(rawvalue1[0].trim().equalsIgnoreCase("goldscore"))
			{
				goldscore=Integer.parseInt(rawvalue1[1]);
			//	System.out.println("Gold Medal Score is--> "+goldscore);
				launchapplication.driver.findElement(goldscore_xp).sendKeys(String.valueOf(goldscore));
				Thread.sleep(500);
			}
			if(rawvalue1[0].trim().equalsIgnoreCase("goldattempt"))
			{
				goldattempt=Integer.parseInt(rawvalue1[1]);
			//	System.out.println("Gold Medal Attempt is--> "+goldattempt);
				launchapplication.driver.findElement(goldattempt_xp).sendKeys(String.valueOf(goldattempt));
				Thread.sleep(500);
			}
			
			if(rawvalue1[0].trim().equalsIgnoreCase("silverscore"))
			{
				silverscore=Integer.parseInt(rawvalue1[1]);
			//	System.out.println("Silver Medal Score is--> "+silverscore);
				launchapplication.driver.findElement(silverscore_xp).sendKeys(String.valueOf(silverscore));
				Thread.sleep(500);
			}
			if(rawvalue1[0].trim().equalsIgnoreCase("silverattempt"))
			{
				silverattempt=Integer.parseInt(rawvalue1[1]);
			//	System.out.println("Silver Medal Attempt is--> "+silverattempt);
				launchapplication.driver.findElement(silverattempt_xp).sendKeys(String.valueOf(silverattempt));
				Thread.sleep(500);
			}
			
			if(rawvalue1[0].trim().equalsIgnoreCase("bronzescore"))
			{
				bronzescore=Integer.parseInt(rawvalue1[1]);
			//	System.out.println("Bronze Medal Score is--> "+bronzescore);
				launchapplication.driver.findElement(bronzescore_xp).sendKeys(String.valueOf(bronzescore));
				Thread.sleep(500);
			}
			if(rawvalue1[0].trim().equalsIgnoreCase("bronzeattempt"))
			{
				bronzeattempt=Integer.parseInt(rawvalue1[1]);
			//	System.out.println("Bronze Medal Attempt is--> "+bronzeattempt);
				launchapplication.driver.findElement(bronzeattempt_xp).sendKeys(String.valueOf(bronzeattempt));
				Thread.sleep(500);
			}
			
			if(rawvalue1[0].trim().equalsIgnoreCase("creditscore"))
			{
				creditscore=Integer.parseInt(rawvalue[i].split("=")[1]);
			//	System.out.println("Credit Score is--> "+creditscore);
				launchapplication.driver.findElement(creditscore_xp).clear();
				launchapplication.driver.findElement(creditscore_xp).sendKeys(String.valueOf(creditscore));
				Thread.sleep(500);
				launchapplication.driver.findElement(certificateissued_xp).click(); // certificate issues
				Thread.sleep(500);
			
				
				launchapplication.driver.findElement(By.xpath(".//*[@id='pagerightcolumn']")).click();
			    Thread.sleep(500);
				launchapplication.driver.findElement(By.xpath(".//*[@id='dvPageActions']")).click();
				Thread.sleep(500);
				launchapplication.driver.findElement(menu.savebutton).click();
				WebElement tooltip=launchapplication.driver.findElement(By.xpath(".//*[@id='lblErroeMessage']"));
				System.out.println(tooltip.getText());
				//System.out.println("Course created successfully!!!");
				Thread.sleep(500);
				launchapplication.driver.findElement(menu.homebutton).click();
				Thread.sleep(500);
			
			}
			
		}//if for loop closed
	} //elearning method
	
	//**********************************Resource Type Code Start Here***************************************	
	public void resource(String testdata) throws Exception
	{
		String[] rawvalue = testdata.split(",");
		
		for (int i = 0;i<rawvalue.length;i++)
		{
			String[] rawvalue1=rawvalue[i].split("=");
							
		if (rawvalue1[0].trim().equalsIgnoreCase("coursecode"))
			{
				
		//		launchapplication.driver.findElement(menu.coursesmanagementsystem).click();
				Thread.sleep(500);
			//	launchapplication.driver.findElement(menu.coursesbasicinformation).click();
				Thread.sleep(500);
				launchapplication.driver.findElement(menu.coursesmaster).click();
				Thread.sleep(500);
				
				coursecode=rawvalue1[1];
				//System.out.println("Course Code is :"+coursecode);
				launchapplication.driver.findElement(coursecode_xp).sendKeys(coursecode);
			}
		
			if (rawvalue1[0].trim().equalsIgnoreCase("coursetitle"))
			{
				
				coursetitle = rawvalue1[1];
			//	System.out.println("Course Title is :"+coursetitle);
				launchapplication.driver.findElement(coursetitle_xp).sendKeys(coursetitle);
			}
			
			if (rawvalue1[0].trim().equalsIgnoreCase("coursecategory"))
			{
				coursecategory = rawvalue1[1];
			//	System.out.println("CourseCategory is :"+coursecategory);
				
				Select SelectValue = new Select (launchapplication.driver.findElement(coursecategory_xp));
				SelectValue.selectByVisibleText(coursecategory);
				Thread.sleep(6000);	
			}
			
			if (rawvalue1[0].trim().equalsIgnoreCase("coursesubcategory"))
			{
				coursesubcategory = rawvalue1[1];
			//	System.out.println("CourseSubCategory is :"+coursesubcategory);
				
				Select SelectValue = new Select (launchapplication.driver.findElement(coursesubcategory_xp));
				SelectValue.selectByVisibleText(coursesubcategory);
				Thread.sleep(6000);	
			}
				
			if (rawvalue1[0].trim().equalsIgnoreCase("trainingtype"))
			{
				trainingtype = rawvalue1[1];
			//	System.out.println("Training Type is :"+trainingtype);
				
				WebElement dropdown = launchapplication.driver.findElement((trainingtype_xp));
			    dropdown.click();
				List<WebElement> options = dropdown.findElements(By.tagName("option"));
			    for(WebElement option : options){
			        String optTxt = option.getText();
			        if(optTxt.contains(trainingtype))
			        {
			            option.click();
			            break;
			        }
			    }
			    Thread.sleep(6000);
				
			}
			
			if(rawvalue1[0].trim().equalsIgnoreCase("duration"))
			{
				duration=Integer.parseInt(rawvalue1[1]);
			//	System.out.println("duration is--> "+duration);
				launchapplication.driver.findElement(duration_xp).sendKeys(String.valueOf(duration));
			}
			
			if (rawvalue1[0].trim().equalsIgnoreCase("language"))
			{
				language = rawvalue1[1];
			//	System.out.println("Instructional Language is :"+language);
				Thread.sleep(500);
				Select SelectValue = new Select (launchapplication.driver.findElement(language_xp));
				SelectValue.selectByVisibleText(language);
				Thread.sleep(6000);	
			}
			
		
			if (rawvalue1[0].trim().equalsIgnoreCase("keywordsforsearch"))
			{
				keywordsforsearch = rawvalue1[1];
			//	System.out.println("Keywords for search is :"+keywordsforsearch);
				launchapplication.driver.findElement(keywordsforsearch_xp).sendKeys(keywordsforsearch);
				launchapplication.driver.findElement(basicinformationtab_xp).click(); //basic in formation tab
				launchapplication.driver.findElement(additionalinformationtab_xp).click(); // additional info tab
				Thread.sleep(500);
				
			}
			
			if (rawvalue1[0].trim().equalsIgnoreCase("synopsis"))
			{
				
				synopsis = rawvalue1[1];
			//	System.out.println("Synopsis is :"+synopsis);
				Thread.sleep(500);
				launchapplication.driver.findElement(additionalinformationtab_xp).click(); //additional tab
				launchapplication.driver.findElement(additionalinformationtab1_xp).click(); //additionaltab1
				Thread.sleep(500);
				launchapplication.driver.findElement(synopsis_xp).sendKeys(synopsis);
			}
			
			if (rawvalue1[0].trim().equalsIgnoreCase("objectives"))
			{
				
				objectives = rawvalue1[1];
			//	System.out.println("Objectives is :"+objectives);
				Thread.sleep(500);
				launchapplication.driver.findElement(objectives_xp).sendKeys(objectives);
			}
			
			if (rawvalue1[0].trim().equalsIgnoreCase("author"))
			{
				
				author = rawvalue1[1];
			//	System.out.println("Author is :"+author);
				Thread.sleep(500);
				launchapplication.driver.findElement(author_xp).sendKeys(author);
			}
			
//			if(rawvalue1[0].trim().equalsIgnoreCase("expirydate"))
//			{
				
//              String threedaysafter = "";
//			    Date date = new Date();
//			    Calendar cal = Calendar.getInstance();
//			    cal.setTime(date);
//
//			    cal.add(Calendar.DAY_OF_YEAR, +120);
//			    Date before = cal.getTime();
//			    SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
//			    threedaysafter = formatter.format(before);
//			    System.out.println("ExpiryDate is:"+threedaysafter);
//				WebElement calendarManualInput = launchapplication.driver.findElement(expirydate_xp);
//				calendarManualInput.sendKeys(threedaysafter);
//			 }
			
			if(rawvalue1[0].trim().equalsIgnoreCase("assessmenttype"))
			{
				
				launchapplication.driver.findElement(commonparametertab_xp).click();
				Thread.sleep(500);
				
				WebDriverWait wt=new WebDriverWait(launchapplication.driver,50);
				wt.until(ExpectedConditions.presenceOfElementLocated(applicabletoallemployee_xp)); //applicableto all
				launchapplication.driver.findElement(applicabletoallemployee_xp).click(); //applicable to all
				launchapplication.driver.findElement(feedback_xp).click(); // feedback
				
				assessmenttype = rawvalue1[1];
			//	System.out.println("AssessmentType is :"+assessmenttype);
				launchapplication.driver.findElement(assessment_xp).click(); //assessment must
				Thread.sleep(500);
				Select SelectValue = new Select (launchapplication.driver.findElement(assessmenttype_xp)); //assessment type
				Thread.sleep(500);
				SelectValue.selectByVisibleText(assessmenttype);
				Thread.sleep(6000);	
			}
			
			if(rawvalue1[0].trim().equalsIgnoreCase("passingpercentage"))
			{
				passingpercentage=Integer.parseInt(rawvalue1[1]);
			//	System.out.println("Passing Percentage is--> "+passingpercentage);
				launchapplication.driver.findElement(passingpercentage_xp).clear();
				launchapplication.driver.findElement(passingpercentage_xp).sendKeys(String.valueOf(passingpercentage));
				Thread.sleep(500);
			}
			
			if(rawvalue1[0].trim().equalsIgnoreCase("maxnoattempts"))
			{
				maxnoattempts=Integer.parseInt(rawvalue1[1]);
			//	System.out.println("Max Number of Attempts is--> "+maxnoattempts);
				launchapplication.driver.findElement(maxnoattempts_xp).sendKeys(String.valueOf(maxnoattempts));
				Thread.sleep(500);
				launchapplication.driver.findElement(awardmedals_xp).click(); //award medals
			}
			
			if(rawvalue1[0].trim().equalsIgnoreCase("goldscore"))
			{
				goldscore=Integer.parseInt(rawvalue1[1]);
			//	System.out.println("Gold Medal Score is--> "+goldscore);
				launchapplication.driver.findElement(goldscore_xp).sendKeys(String.valueOf(goldscore));
				Thread.sleep(500);
			}
			if(rawvalue1[0].trim().equalsIgnoreCase("goldattempt"))
			{
				goldattempt=Integer.parseInt(rawvalue1[1]);
			//	System.out.println("Gold Medal Attempt is--> "+goldattempt);
				launchapplication.driver.findElement(goldattempt_xp).sendKeys(String.valueOf(goldattempt));
				Thread.sleep(500);
			}
			
			if(rawvalue1[0].trim().equalsIgnoreCase("silverscore"))
			{
				silverscore=Integer.parseInt(rawvalue1[1]);
			//	System.out.println("Silver Medal Score is--> "+silverscore);
				launchapplication.driver.findElement(silverscore_xp).sendKeys(String.valueOf(silverscore));
				Thread.sleep(500);
			}
			if(rawvalue1[0].trim().equalsIgnoreCase("silverattempt"))
			{
				silverattempt=Integer.parseInt(rawvalue1[1]);
			//	System.out.println("Silver Medal Attempt is--> "+silverattempt);
				launchapplication.driver.findElement(silverattempt_xp).sendKeys(String.valueOf(silverattempt));
				Thread.sleep(500);
			}
			
			if(rawvalue1[0].trim().equalsIgnoreCase("bronzescore"))
			{
				bronzescore=Integer.parseInt(rawvalue1[1]);
			//	System.out.println("Bronze Medal Score is--> "+bronzescore);
				launchapplication.driver.findElement(bronzescore_xp).sendKeys(String.valueOf(bronzescore));
				Thread.sleep(500);
			}
			if(rawvalue1[0].trim().equalsIgnoreCase("bronzeattempt"))
			{
				bronzeattempt=Integer.parseInt(rawvalue1[1]);
			//	System.out.println("Bronze Medal Attempt is--> "+bronzeattempt);
				launchapplication.driver.findElement(bronzeattempt_xp).sendKeys(String.valueOf(bronzeattempt));
				Thread.sleep(500);
			}
			
			if(rawvalue1[0].trim().equalsIgnoreCase("creditscore"))
			{
				creditscore=Integer.parseInt(rawvalue[i].split("=")[1]);
			//	System.out.println("Credit Score is--> "+creditscore);
				launchapplication.driver.findElement(creditscore_xp).clear();
				launchapplication.driver.findElement(creditscore_xp).sendKeys(String.valueOf(creditscore));
				Thread.sleep(500);
				launchapplication.driver.findElement(certificateissued_xp).click(); // certificate issues
				Thread.sleep(500);
			
				
				launchapplication.driver.findElement(By.xpath(".//*[@id='pagerightcolumn']")).click();
			    Thread.sleep(500);
				launchapplication.driver.findElement(By.xpath(".//*[@id='dvPageActions']")).click();
				Thread.sleep(500);
				launchapplication.driver.findElement(menu.savebutton).click();
				WebElement tooltip=launchapplication.driver.findElement(notification_xp);
				System.out.println(tooltip.getText());
				//System.out.println("Course created successfully!!!");
				Thread.sleep(500);
				launchapplication.driver.findElement(menu.homebutton).click();
				Thread.sleep(500);
			
			}
			
		}//if for loop closed
		
	} //Resource method
	
	//**********************************Classroom Type Code Start Here***************************************		
	
	public void classroom(String testdata) throws InterruptedException
	{
		String[] rawvalue = testdata.split(",");
		
		for (int i = 0;i<rawvalue.length;i++)
		{
			String[] rawvalue1=rawvalue[i].split("=");
							
		if (rawvalue1[0].trim().equalsIgnoreCase("coursecode"))
			{
				
			//	launchapplication.driver.findElement(menu.coursesmanagementsystem).click();
				Thread.sleep(500);
			//	launchapplication.driver.findElement(menu.coursesbasicinformation).click();
				Thread.sleep(500);
				launchapplication.driver.findElement(menu.coursesmaster).click();
				Thread.sleep(500);
				
				coursecode=rawvalue1[1];
				//System.out.println("Course Code is :"+coursecode);
				launchapplication.driver.findElement(coursecode_xp).sendKeys(coursecode);
			}
		
			if (rawvalue1[0].trim().equalsIgnoreCase("coursetitle"))
			{
				
				coursetitle = rawvalue1[1];
			//	System.out.println("Course Title is :"+coursetitle);
				launchapplication.driver.findElement(coursetitle_xp).sendKeys(coursetitle);
			}
			
			if (rawvalue1[0].trim().equalsIgnoreCase("coursecategory"))
			{
				coursecategory = rawvalue1[1];
			//	System.out.println("CourseCategory is :"+coursecategory);
				
				Select SelectValue = new Select (launchapplication.driver.findElement(coursecategory_xp));
				SelectValue.selectByVisibleText(coursecategory);
				Thread.sleep(6000);	
			}
			
			if (rawvalue1[0].trim().equalsIgnoreCase("coursesubcategory"))
			{
				coursesubcategory = rawvalue1[1];
			//	System.out.println("CourseSubCategory is :"+coursesubcategory);
				
				Select SelectValue = new Select (launchapplication.driver.findElement(coursesubcategory_xp));
				SelectValue.selectByVisibleText(coursesubcategory);
				Thread.sleep(6000);	
			}
				
			if (rawvalue1[0].trim().equalsIgnoreCase("trainingtype"))
			{
				trainingtype = rawvalue1[1];
			//	System.out.println("Training Type is :"+trainingtype);
				
				WebElement dropdown = launchapplication.driver.findElement((trainingtype_xp));
			    dropdown.click();
				List<WebElement> options = dropdown.findElements(By.tagName("option"));
			    for(WebElement option : options){
			        String optTxt = option.getText();
			        if(optTxt.contains(trainingtype))
			        {
			            option.click();
			            break;
			        }
			    }
			    Thread.sleep(6000);
				
			}
			
			if (rawvalue1[0].trim().equalsIgnoreCase("trainertype"))
			{
				trainertype = rawvalue1[1];				
				Select SelectValue = new Select (launchapplication.driver.findElement(trainertype_xp));
				SelectValue.selectByVisibleText(trainertype);
				Thread.sleep(5000);	
			}
			
			if(rawvalue1[0].trim().equalsIgnoreCase("duration"))
			{
				duration=Integer.parseInt(rawvalue1[1]);
			//	System.out.println("duration is--> "+duration);
				launchapplication.driver.findElement(duration_xp).sendKeys(String.valueOf(duration));
			}
			
			if (rawvalue1[0].trim().equalsIgnoreCase("language"))
			{
				language = rawvalue1[1];
			//	System.out.println("Instructional Language is :"+language);
				Thread.sleep(500);
				Select SelectValue = new Select (launchapplication.driver.findElement(language_xp));
				SelectValue.selectByVisibleText(language);
				Thread.sleep(5000);	
			}
			
		
			if (rawvalue1[0].trim().equalsIgnoreCase("keywordsforsearch"))
			{
				keywordsforsearch = rawvalue1[1];
			//	System.out.println("Keywords for search is :"+keywordsforsearch);
				launchapplication.driver.findElement(keywordsforsearch_xp).sendKeys(keywordsforsearch);
				launchapplication.driver.findElement(basicinformationtab_xp).click(); //basic in formation tab
				launchapplication.driver.findElement(additionalinformationtab_xp).click(); // additional info tab
				Thread.sleep(500);
				
			}
			
			if (rawvalue1[0].trim().equalsIgnoreCase("synopsis"))
			{
				
				synopsis = rawvalue1[1];
			//	System.out.println("Synopsis is :"+synopsis);
				Thread.sleep(500);
				launchapplication.driver.findElement(additionalinformationtab_xp).click(); //additional tab
				launchapplication.driver.findElement(additionalinformationtab1_xp).click(); //additionaltab1
				Thread.sleep(500);
				launchapplication.driver.findElement(synopsis_xp).sendKeys(synopsis);
			}
			
			if (rawvalue1[0].trim().equalsIgnoreCase("objectives"))
			{
				
				objectives = rawvalue1[1];
			//	System.out.println("Objectives is :"+objectives);
				Thread.sleep(500);
				launchapplication.driver.findElement(objectives_xp).sendKeys(objectives);
			}
			
			if (rawvalue1[0].trim().equalsIgnoreCase("author"))
			{
				
				author = rawvalue1[1];
			//	System.out.println("Author is :"+author);
				Thread.sleep(500);
				launchapplication.driver.findElement(author_xp).sendKeys(author);
			}
			
//			if(rawvalue1[0].trim().equalsIgnoreCase("expirydate"))
//			{
				
//              String threedaysafter = "";
//			    Date date = new Date();
//			    Calendar cal = Calendar.getInstance();
//			    cal.setTime(date);
//
//			    cal.add(Calendar.DAY_OF_YEAR, +120);
//			    Date before = cal.getTime();
//			    SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
//			    threedaysafter = formatter.format(before);
//			    System.out.println("ExpiryDate is:"+threedaysafter);
//				WebElement calendarManualInput = launchapplication.driver.findElement(expirydate_xp);
//				calendarManualInput.sendKeys(threedaysafter);
//			 }
			
			if(rawvalue1[0].trim().equalsIgnoreCase("assessmenttype"))
			{
				
				launchapplication.driver.findElement(commonparametertab_xp).click();
				Thread.sleep(500);
				
				WebDriverWait wt=new WebDriverWait(launchapplication.driver,50);
				wt.until(ExpectedConditions.presenceOfElementLocated(applicabletoallemployee_xp)); //applicableto all
				launchapplication.driver.findElement(applicabletoallemployee_xp).click(); //applicable to all
				launchapplication.driver.findElement(feedback_xp).click(); // feedback
				
				assessmenttype = rawvalue1[1];
			//	System.out.println("AssessmentType is :"+assessmenttype);
				launchapplication.driver.findElement(assessment_xp).click(); //assessment must
				Thread.sleep(500);
				Select SelectValue = new Select (launchapplication.driver.findElement(assessmenttype_xp)); //assessment type
				Thread.sleep(500);
				SelectValue.selectByVisibleText(assessmenttype);
				Thread.sleep(6000);	
			}
			
			if(rawvalue1[0].trim().equalsIgnoreCase("passingpercentage"))
			{
				passingpercentage=Integer.parseInt(rawvalue1[1]);
			//	System.out.println("Passing Percentage is--> "+passingpercentage);
				launchapplication.driver.findElement(passingpercentage_xp).clear();
				launchapplication.driver.findElement(passingpercentage_xp).sendKeys(String.valueOf(passingpercentage));
				Thread.sleep(500);
			}
			
			if(rawvalue1[0].trim().equalsIgnoreCase("maxnoattempts"))
			{
				maxnoattempts=Integer.parseInt(rawvalue1[1]);
			//	System.out.println("Max Number of Attempts is--> "+maxnoattempts);
				launchapplication.driver.findElement(maxnoattempts_xp).sendKeys(String.valueOf(maxnoattempts));
				Thread.sleep(500);
				launchapplication.driver.findElement(awardmedals_xp).click(); //award medals
			}
			
			if(rawvalue1[0].trim().equalsIgnoreCase("goldscore"))
			{
				goldscore=Integer.parseInt(rawvalue1[1]);
			//	System.out.println("Gold Medal Score is--> "+goldscore);
				launchapplication.driver.findElement(goldscore_xp).sendKeys(String.valueOf(goldscore));
				Thread.sleep(500);
			}
			if(rawvalue1[0].trim().equalsIgnoreCase("goldattempt"))
			{
				goldattempt=Integer.parseInt(rawvalue1[1]);
			//	System.out.println("Gold Medal Attempt is--> "+goldattempt);
				launchapplication.driver.findElement(goldattempt_xp).sendKeys(String.valueOf(goldattempt));
				Thread.sleep(500);
			}
			
			if(rawvalue1[0].trim().equalsIgnoreCase("silverscore"))
			{
				silverscore=Integer.parseInt(rawvalue1[1]);
			//	System.out.println("Silver Medal Score is--> "+silverscore);
				launchapplication.driver.findElement(silverscore_xp).sendKeys(String.valueOf(silverscore));
				Thread.sleep(500);
			}
			if(rawvalue1[0].trim().equalsIgnoreCase("silverattempt"))
			{
				silverattempt=Integer.parseInt(rawvalue1[1]);
			//	System.out.println("Silver Medal Attempt is--> "+silverattempt);
				launchapplication.driver.findElement(silverattempt_xp).sendKeys(String.valueOf(silverattempt));
				Thread.sleep(500);
			}
			
			if(rawvalue1[0].trim().equalsIgnoreCase("bronzescore"))
			{
				bronzescore=Integer.parseInt(rawvalue1[1]);
			//	System.out.println("Bronze Medal Score is--> "+bronzescore);
				launchapplication.driver.findElement(bronzescore_xp).sendKeys(String.valueOf(bronzescore));
				Thread.sleep(500);
			}
			if(rawvalue1[0].trim().equalsIgnoreCase("bronzeattempt"))
			{
				bronzeattempt=Integer.parseInt(rawvalue1[1]);
			//	System.out.println("Bronze Medal Attempt is--> "+bronzeattempt);
				launchapplication.driver.findElement(bronzeattempt_xp).sendKeys(String.valueOf(bronzeattempt));
				Thread.sleep(500);
			}
			
			if(rawvalue1[0].trim().equalsIgnoreCase("creditscore"))
			{
				creditscore=Integer.parseInt(rawvalue[i].split("=")[1]);
			//	System.out.println("Credit Score is--> "+creditscore);
				launchapplication.driver.findElement(creditscore_xp).clear();
				launchapplication.driver.findElement(creditscore_xp).sendKeys(String.valueOf(creditscore));
				Thread.sleep(500);
			}
			
			if(rawvalue1[0].trim().equalsIgnoreCase("batchsize"))	
			{	
				batchsize = rawvalue1[1];
				launchapplication.driver.findElement(By.xpath(".//*[@id='MainContent_tabContainer_tabILTParameters_tab']/span")).click();
				
				Thread.sleep(500);
				//System.out.println("Batch Size::"+batchsize);
				launchapplication.driver.findElement(batchsize_xp).sendKeys(batchsize);
				
				launchapplication.driver.findElement(coursewaredist_xp).click();
				
				launchapplication.driver.findElement(By.xpath(".//*[@id='pagerightcolumn']")).click();
			    Thread.sleep(500);
				launchapplication.driver.findElement(By.xpath(".//*[@id='dvPageActions']")).click();
				Thread.sleep(500);
				launchapplication.driver.findElement(menu.savebutton).click();
				WebElement tooltip=launchapplication.driver.findElement(notification_xp);
				System.out.println(tooltip.getText());
				//System.out.println("Course created successfully!!!");
				Thread.sleep(500);
				launchapplication.driver.findElement(menu.homebutton).click();
				Thread.sleep(500);
			
			}
			
		}//if for loop closed

	}//classroom closed
	
	public void Execute(String testdata) throws Exception
	{
		
		String[] rawvalue = testdata.split(",");
		String course=null;
		for (int i = 0;i<rawvalue.length;i++)
		{
			String[] rawvalue1=rawvalue[i].split("=");
			
			if (rawvalue1[0].trim().equalsIgnoreCase("trainingtype"))
			{
				course=rawvalue1[1];
				System.out.println(course);
				if (course.contains("e-Learning"))	
				{
					elearning(testdata);
				}
				else if (course.contains("Resource"))
				{
					resource(testdata);
				}
				else
				{
					classroom(testdata);
				}
			}
		}
	}
	
} //main class


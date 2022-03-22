package com.e.lms.objects;

import org.openqa.selenium.By;

public class menu

{
	//*******************Menu Button******************************************
	public static By newbutton= By.xpath(".//*[@id='pageActionControl_btnAdd']");
	public static By editbutton= By.xpath(".//*[@id='pageActionControl_btnUpdate']");
	public static By savebutton= By.xpath(".//*[@id='pageActionControl_btnSave']");
	public static By deletebutton= By.xpath(".//*[@id='pageActionControl_btnDelete']");
	public static By viewbutton= By.xpath(".//*[@id='pageActionControl_btnView']");
	public static By searchbutton= By.xpath(".//*[@id='pageActionControl_btnSearch']");
	public static By exportbutton = By.xpath(".//*[@id='pageActionControl_btnExport']");
	public static By printbutton = By.xpath(".//*[@id='pageActionControl_btnPrint']");
	public static By homebutton = By.xpath(".//*[@id='pageActionControl_btnHome']");
	public static By operationmessages = By.xpath(".//*[@id='lblErroeMessage']");
  
	//****************************Modules***************************************
	
public static By registrationandconfiguration= By.xpath("//label[contains(.,'Registration & Configuration')]");
public static By businessdatarepositories = By.xpath(".//label[.contains(.,'Bussiness Data Repositories')]");
public static By alliedusersmanagement = By.xpath(".//label[.contains(.,'Allied User Management')]");
public static By configurationmanagement = By.xpath(".//label[.contains(.,'Courses Management System')]");
public static By competenciesmanagement = By.xpath(".//label[.contains(.,'Competencies Management')]");
public static By iltmanagement = By.xpath(".//label[.contains(.,'ILT Management')]");
public static By learningpadministration = By.xpath(".//label[.contains(.,'Learning Administration')]");
public static By rgs = By.xpath(".//label[.contains(.,'Reports Generation System')]");

	//********************************Functions**********************************

	
	public static By geoghraphicalinformation = By.xpath(".//label[.contains(.,'Geographical Information')]");
	public static By organizationalinformation = By.xpath(".//label[.contains(.,'Organizational Information')]");
	public static By peopleposition = By.xpath(".//label[.contains(.,'People & Positions')]");
	public static By guestconfiguration = By.xpath(".//label[.contains(.,'Guests Configuration')]");
	public static By associateconfiguration = By.xpath(".//label[.contains(.,'Associate Configuration')]");
	public static By systemsetting = By.xpath("//label[contains(.,'System Settings')]");
	public static By emaillaunguage = By.xpath("//label[contains(.,'Email & Language Settings')]");
	public static By surveyconfiguration = By.xpath("//label[contains(.,'Survey Configuration')]");
	public static By coursesclassification = By.xpath("//label[contains(.,'Courses Classification')]");
	public static By coursescreation = By.xpath("//label[contains(.,'Courses Creation')]");
	public static By assessmentcertification = By.xpath("//label[contains(.,'Assessment & Certification')]");
	public static By feedbackconfiguration= By.xpath("//label[contains(.,'Feedback Configuration')]");
	public static By courseassignments= By.xpath("//label[contains(.,'Course Assignments')]");
	public static By competenciescreation= By.xpath("//label[contains(.,'Competencies Creation')]");
	public static By competecymatric = By.xpath("//label[contains(.,'Competecy Matric')]");
	public static By trainingresources = By.xpath("//label[contains(.,'Training Resources')]");
	public static By trainingagenciesmanagement= By.xpath("//label[contains(.,'Training Agencies Management')]");
	public static By schedulemanagement= By.xpath("//label[contains(.,'Schedule Management')]");
	public static By nominationsattendance= By.xpath("//label[contains(.,'Nominations & Attendance')]");
	public static By courseredinessverification = By.xpath("//label[contains(.,'Course Readiness Verification')]");
	public static By auxillarytrainingfunction = By.xpath("//label[contains(.,'Auxiliary Training Functions')]");
	
	
	//*******************************Sub Function*********************************

public static By homepagesetting = By.xpath(".//*[@id='functionDiv']/div/ul[1]/li/ul[2]/li/ul[1]/li/label/a");
public static By countriesmaster = By.xpath(".//*[@id='functionDiv']/div/ul[1]/li/ul[3]/li/ul[1]/li/label/a");
public static By statesmaster = By.xpath(".//*[@id='functionDiv']/div/ul[1]/li/ul[3]/li/ul[2]/li/label/a");
public static By citiesmaster = By.xpath(".//*[@id='functionDiv']/div/ul[1]/li/ul[3]/li/ul[3]/li/label/a");
public static By placesmaster = By.xpath(".//*[@id='functionDiv']/div/ul[1]/li/ul[3]/li/ul[4]/li/label/a");
public static By sectormaster = By.xpath(".//*[@id='functionDiv']/div/ul[2]/li/ul[1]/li/ul[1]/li/label");
public static By organizationmaster = By.xpath(".//*[@id='functionDiv']/div/ul[2]/li/ul[1]/li/ul[2]/li/label/a");
public static By unittypemaster = By.xpath(".//*[@id='functionDiv']/div/ul[2]/li/ul[1]/li/ul[3]/li/label/a");
public static By unitmaster = By.xpath(".//*[@id='functionDiv']/div/ul[2]/li/ul[1]/li/ul[4]/li/label/a");
public static By departmentmaster = By.xpath(".//*[@id='functionDiv']/div/ul[2]/li/ul[1]/li/ul[5]/li/label/a");
public static By grademaster = By.xpath(".//*[@id='functionDiv']/div/ul[2]/li/ul[2]/li/ul[1]/li/label/a");
public static By gadgetmanagement = By.xpath("//label[contains(.,'Gadgets Management')]");
public static By designationmaster = By.xpath(".//*[@id='functionDiv']/div/ul[2]/li/ul[2]/li/ul[2]/li/label/a");
public static By jobfunctionmaster = By.xpath(".//*[@id='functionDiv']/div/ul[2]/li/ul[2]/li/ul[3]/li/label/a");
public static By subfunctionmaster = By.xpath(".//*[@id='functionDiv']/div/ul[2]/li/ul[2]/li/ul[4]/li/label/a");
public static By groupsmaster = By.xpath(".//*[@id='functionDiv']/div/ul[2]/li/ul[2]/li/ul[5]/li/label/a");
public static By personalmaster = By.xpath(".//*[@id='functionDiv']/div/ul[2]/li/ul[2]/li/ul[6]/li/label/a");
public static By guestlearners = By.xpath(".//*[@id='functionDiv']/div/ul[2]/li/ul[2]/li/ul[7]/li/label/a");
public static By associateenterprisetype = By.xpath(".//*[@id='functionDiv']/div/ul[2]/li/ul[3]/li/ul[1]/li/label/a");
public static By associateenterprisemaster = By.xpath(".//*[@id='functionDiv']/div/ul[2]/li/ul[3]/li/ul[2]/li/label/a");
public static By associateusermaster = By.xpath(".//*[@id='functionDiv']/div/ul[2]/li/ul[3]/li/ul[3]/li/label/a");
public static By trainingagencymaster = By.xpath(".//*[@id='functionDiv']/div/ul[2]/li/ul[4]/li/ul[1]/li/label/a");
public static By trainingagencyuser = By.xpath(".//*[@id='functionDiv']/div/ul[2]/li/ul[4]/li/ul[2]/li/label/a");
public static By internalacademy = By.xpath(".//*[@id='functionDiv']/div/ul[2]/li/ul[4]/li/ul[3]/li/label/a");
public static By internaltrainer = By.xpath(".//*[@id='functionDiv']/div/ul[2]/li/ul[4]/li/ul[4]/li/label/a");
public static By trainingfacilitytypes = By.xpath(".//*[@id='functionDiv']/div/ul[2]/li/ul[5]/li/ul[1]/li/label/a");
public static By trainingplacesmaster = By.xpath(".//*[@id='functionDiv']/div/ul[2]/li/ul[5]/li/ul[2]/li/label/a");
public static By trainingfacilitymaster = By.xpath(".//*[@id='functionDiv']/div/ul[2]/li/ul[5]/li/ul[3]/li/label/a");
public static By coursecategorymaster = By.xpath(".//*[@id='functionDiv']/div/ul[3]/li/ul[1]/li/ul[1]/li/label/a");
public static By coursesubcategorymaster = By.xpath(".//*[@id='functionDiv']/div/ul[3]/li/ul[1]/li/ul[2]/li/label/a");
public static By coursesmaster = By.xpath(".//*[@id='functionDiv']/div/ul[3]/li/ul[2]/li/ul[1]/li/label/a");
public static By contentmaster = By.xpath(".//*[@id='functionDiv']/div/ul[3]/li/ul[2]/li/ul[2]/li/label/a");
public static By internalacademycourses = By.xpath(".//*[@id='functionDiv']/div/ul[3]/li/ul[3]/li/ul[1]/li/label/a");
public static By trainingfacilityrequirement = By.xpath(".//*[@id='functionDiv']/div/ul[3]/li/ul[3]/li/ul[2]/li/label/a");
public static By competenciescategories= By.xpath(".//*[@id='functionDiv']/div/ul[3]/li/ul[4]/li/ul[1]/li/label/a");
public static By competenciesmaster= By.xpath(".//*[@id='functionDiv']/div/ul[3]/li/ul[4]/li/ul[2]/li/label/a");
public static By standardcompetenciesmatrix= By.xpath(".//*[@id='functionDiv']/div/ul[3]/li/ul[4]/li/ul[3]/li/label/a");
public static By coursecompetenciesmatrix= By.xpath(".//*[@id='functionDiv']/div/ul[3]/li/ul[4]/li/ul[4]/li/label/a");
public static By feedbackformconfigurator= By.xpath(".//*[@id='functionDiv']/div/ul[3]/li/ul[5]/li/ul[1]/li/label/a");
public static By assessmentquestionsconfigurator= By.xpath(".//*[@id='functionDiv']/div/ul[3]/li/ul[5]/li/ul[2]/li/label/a");
public static By surveyconfigurator= By.xpath(".//*[@id='functionDiv']/div/ul[3]/li/ul[5]/li/ul[3]/li/label/a");
public static By preassessmentquestionrepository= By.xpath(".//*[@id='functionDiv']/div/ul[3]/li/ul[5]/li/ul[4]/li/label/a");
public static By coursesapplicabilityparameter = By.xpath(".//*[@id='functionDiv']/div/ul[4]/li/ul[1]/li/ul[1]/li/label/a");
public static By dynamicassessmentconfigurator = By.xpath(".//*[@id='functionDiv']/div/ul[4]/li/ul[2]/li/ul[1]/li/label/a");
public static By fixedassessmentconfigurator = By.xpath(".//*[@id='functionDiv']/div/ul[4]/li/ul[2]/li/ul[2]/li/label/a");
public static By certificatetemplatedesigner = By.xpath(".//*[@id='functionDiv']/div/ul[4]/li/ul[2]/li/ul[3]/li/label/a");
public static By preassessmentsheetconfigurator= By.xpath(".//*[@id='functionDiv']/div/ul[4]/li/ul[2]/li/ul[4]/li/label/a");
public static By prelaunchrediness = By.xpath(".//*[@id='functionDiv']/div/ul[4]/li/ul[3]/li/ul[1]/li/label/a");
public static By posttrainingredinesscheck = By.xpath(".//*[@id='functionDiv']/div/ul[4]/li/ul[3]/li/ul[2]/li/label/a");
public static By classroomtrainingschedule = By.xpath(".//*[@id='functionDiv']/div/ul[4]/li/ul[4]/li/ul[1]/li/label/a");
public static By preponementpostponement = By.xpath(".//*[@id='functionDiv']/div/ul[4]/li/ul[4]/li/ul[2]/li/label/a");
public static By schedulecancellation = By.xpath(".//*[@id='functionDiv']/div/ul[4]/li/ul[4]/li/ul[3]/li/label/a");
}



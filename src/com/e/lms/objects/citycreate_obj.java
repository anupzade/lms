package com.e.lms.objects;

import org.openqa.selenium.By;

public class citycreate_obj 
{

	public By ccountrycode_xp = By.xpath(".//*[@id='MainContent_tabContainer_tabCityMaster_ddlCountry']");
	
	public By cstatecode_xp = By.xpath(".//*[@id='MainContent_tabContainer_tabCityMaster_ddlState']");
	
	public By citycode_xp = By.xpath(".//*[@id='MainContent_tabContainer_tabCityMaster_txtCityCode']");
	
	public By cityname_xp = By.xpath(".//*[@id='MainContent_tabContainer_tabCityMaster_txtCityName']");

	public By xyz_css = By.cssSelector("div[id*='login']");
}

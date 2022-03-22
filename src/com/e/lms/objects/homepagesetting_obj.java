package com.e.lms.objects;

import org.openqa.selenium.By;

import com.e.lms.modules.launchapplication;

public class homepagesetting_obj
{
	
	public By logo_xp					=	By.xpath(".//*[@id='MainContent_fuLogo']");
	public By applicationname_xp		=	By.xpath(".//*[@id='MainContent_txtAppliactionAlias']");
	public By hompagebanner_xp 			=	By.xpath(".//*[@id='MainContent_fuBanner']");
	public By homepagecentralimage_xp	=	By.xpath(".//*[@id='MainContent_fuCentral']");
	public By homepagebagroundimage_xp	=	By.xpath(".//*[@id='MainContent_fuMainBackground']");
	public By loginboxcolor_xp 			=	By.xpath(".//*[@id='MainContent_txtLoginScreenBGColor']");
	public By bagroundcolor1_xp 		=	By.xpath(".//*[@id='MainContent_txtbgclrpicker1']");
	public By bagroundcolor2_xp 		=	By.xpath(".//*[@id='MainContent_txtbgclrpicker2']");
	public By homepagefooter_xp 		=	By.xpath(".//*[@id='MainContent_fuFooterbanner']");
	public By innerpagebanner_xp 		=	By.xpath(".//*[@id='MainContent_fuInnerPageTopBanner']");
	public By innerpagefooter_xp 		=	By.xpath(".//*[@id='MainContent_fuInnerFooter']");
	public By menubagroundcolor_xp 		=	By.xpath(".//*[@id='MainContent_txtMenuBGColor1']");
	public By fontcolor_xp 				=	By.xpath(".//*[@id='MainContent_txtFontColor']");
	public By innerpagebaground1_xp		=	By.xpath(".//*[@id='MainContent_txtLandingPageBackgroundColor1']");
	public By innerpagebaground2_xp		=	By.xpath(".//*[@id='MainContent_txtLandingPageBackgroundColor2']");
	public By remarks_xp				=	By.xpath(".//*[@id='MainContent_txtChangeDescription']");
	public By reset_xp					=	By.xpath(".//*[@id='MainContent_chkResetHomePage']");


}

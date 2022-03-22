package com.e.lms.objects;

import org.openqa.selenium.By;

public class gadgetmanagement {
	
	//*******************************News Event**************************************************
	public By newstab_xp = By.xpath(".//*[@id='MainContent_tabContainer_tbPnlNewsEvents_tab']/span");
	public By newstype_xp = By.xpath(".//*[@id='MainContent_tabContainer_tbPnlNewsEvents_ddlType']");
	public By newstitle_xp =By.xpath(".//*[@id='MainContent_tabContainer_tbPnlNewsEvents_txtTitle']");
	public By publishdate_xp= By.xpath(".//*[@id='MainContent_tabContainer_tbPnlNewsEvents_txtPublishDate']");
	public By validitydate_xp= By.xpath(".//*[@id='MainContent_tabContainer_tbPnlNewsEvents_txtValidityDate']");
	public By imagetitle_xp = By.xpath(".//*[@id='MainContent_tabContainer_tbPnlNewsEvents_fuEventImage']");
	public By newsrichtextbox_xp = By.xpath("html/body");
	
	//*******************************Discussion Forum**********************************************
	public By discussiontab_xp = By.xpath("//span[@id='MainContent_tabContainer_tbPnlDiscussionForum_lblDiscussionForum']");
	public By discussiontopic_xp = By.xpath(".//*[@id='MainContent_tabContainer_tbPnlDiscussionForum_txtDiscussionForumTopic']");
	public By organization_xp = By.xpath("//select[contains(@id,'ddlOrganization')]");
	
	//*******************************Publication****************************************************
	
	public By publicationtab_xp = By.xpath("//span[@id='MainContent_tabContainer_tbPnlPublications_lblPublications']");
	public By publicationtitle_xp = By.xpath("//input[@id='MainContent_tabContainer_tbPnlPublications_txtPublicationTitle']");
	public By publicationimage_xp = By.xpath("//input[@id='MainContent_tabContainer_tbPnlPublications_fuPublicationImage']");
	public By publicationdesc_xp = By.xpath("//input[@id='MainContent_tabContainer_tbPnlPublications_txtPublicationDescription']");
	public By publicationpdf_xp = By.xpath("//input[@id='MainContent_tabContainer_tbPnlPublications_fuPublicationFile']");
	public By publicationdate_xp = By.xpath("//input[@id='MainContent_tabContainer_tbPnlPublications_txtPublicationDate']");
	
	//**********************************Opinion Poll**************************************************
	
	public By opiniopolltab_xp = By.xpath("//span[@id='MainContent_tabContainer_tbPnlopinionPoll_lblOpinionPoll']");
	public By opinionque_xp = By.xpath("//textarea[@id='MainContent_tabContainer_tbPnlopinionPoll_txtQuestionText']");
	public By noofoptions_xp = By.xpath("//select[@id='MainContent_tabContainer_tbPnlopinionPoll_ddlNoOfOption']");
	public By option1_xp = By.xpath("//input[@id='MainContent_tabContainer_tbPnlopinionPoll_txtOption1']");
	public By option2_xp = By.xpath("//input[@id='MainContent_tabContainer_tbPnlopinionPoll_txtOption2']");
	public By option3_xp = By.xpath("//input[@id='MainContent_tabContainer_tbPnlopinionPoll_txtOption3']");
	public By option4_xp = By.xpath("//input[@id='MainContent_tabContainer_tbPnlopinionPoll_txtOption4']");
	public By opiniondate_xp = By.xpath("//input[@id='MainContent_tabContainer_tbPnlopinionPoll_txtOpenionPollValidity']");
	
	//****************************************External Link*********************************************
	
	public By externallinktab_xp = By.xpath("//span[@id='MainContent_tabContainer_tbPnlExternalLink_Label7']");
	public By externallink_xp = By.xpath("//textarea[@id='MainContent_tabContainer_tbPnlExternalLink_txtExternalLink']");
	public By externaldesc_xp = By.xpath("//textarea[@id='MainContent_tabContainer_tbPnlExternalLink_txtLinkDescription']");
	
	//****************************************Message From***********************************************
	
	public By messagefromtab_xp = By.xpath("//span[@id='MainContent_tabContainer_tbPnlAdminBuyerMessages_Label8']");
	public By messageby_xp = By.xpath("//input[@id='MainContent_tabContainer_tbPnlAdminBuyerMessages_txtMessageBy']");
	public By briefintroduction_xp = By.xpath("//textarea[@id='MainContent_tabContainer_tbPnlAdminBuyerMessages_txtBriefIntro']");
	public By shortmessage_xp = By.xpath("//input[@id='MainContent_tabContainer_tbPnlAdminBuyerMessages_txtShortMessage']");
	public By messagebyimage_xp = By.xpath("//input[@id='MainContent_tabContainer_tbPnlAdminBuyerMessages_fuUploadImage']");
	public By messagerichtextbox_xp = By.xpath("html/body");
	
	//****************************************Photo Gallery************************************************
	
	public By photogallerytab_xp = By.xpath("//span[@id='MainContent_tabContainer_tbPnlPhotoGallery_Label10']");
	public By newalbum_xp = By.xpath("//a[@id='MainContent_tabContainer_tbPnlPhotoGallery_lnkbtnCreateAlbum']");
	public By selectalbum_xp = By.xpath("//select[@id='MainContent_tabContainer_tbPnlPhotoGallery_ddlAlbumName']");
	public By albumname_xp = By.xpath("//input[@id='MainContent_tabContainer_tbPnlPhotoGallery_txtAlbumName']");
	public By imagename_xp = By.xpath("//input[contains(@id,'txtImageName')]");
	public By imagepath_xp = By.xpath("//input[contains(@id,'flUpldAlbumImage')]");
	public By uploadbutton_xp = By.xpath("//input[@id='MainContent_tabContainer_tbPnlPhotoGallery_btnUpload']");
	
	
	
}

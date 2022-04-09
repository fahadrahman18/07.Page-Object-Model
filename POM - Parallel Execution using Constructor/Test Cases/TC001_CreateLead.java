package org.leaftaps.ui.testcases_pom;

import org.leaftaps.ui.pages.LoginPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;

public class TC001_CreateLead extends ProjectSpecificMethods{
	
//	@BeforeTest
//	public void setData() {
//		excelFilePath = "./utils/tc001_datas.xlsx";
//
//	}
	
	@Test
	//String username, String password, String CompanyName, String FirstName, String LastName
	public void runTC001() {
		// TODO Auto-generated method stub
		
		new LoginPage(driver)
		.enterUsername()
		.enterPassword()
		.clickLoginButton()
		.clickCRMSFA()
		.clickLeadsTab()
		.clickCreateLead()
		.enterCompanyName()
		.enterFirstName()
		.enterLastName()
		.enterPhoneNumber()
		.clickCreateLeadButton()
		.verifyLeadID();


	}
	

}

package org.leaftaps.ui.testcases_pom;

import org.leaftaps.ui.pages.LoginPage;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;

public class TC002_EditLead extends ProjectSpecificMethods{
	
	@Test
	public void runTC002() {
		
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
		.clickEdit()
		.editCompanyName()
		.submitButton();
		
		

	}

}

package org.leaftaps.ui.pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class WelcomePage extends ProjectSpecificMethods {
	
public WelcomePage() {
	
}

public HomePage clickCRMSFA() {
	driver.findElement(By.linkText("CRM/SFA")).click();
	return new HomePage();
}

//public void clickLogout() {
	
//}

}

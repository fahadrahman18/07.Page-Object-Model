package org.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethods;

public class ViewLeadPage extends ProjectSpecificMethods {
	
public ViewLeadPage(RemoteWebDriver driver) {
	this.driver = driver;
}
public ViewLeadPage verifyLeadID() {
	// need to get text in lead id and change accordingly
	System.out.println("Title of the page: " + driver.getTitle());
	return this;
}

public EditLeadPage clickEdit() {
	driver.findElement(By.linkText("Edit")).click();
	return new EditLeadPage(driver);

}
}

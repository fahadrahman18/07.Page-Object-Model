package org.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.ProjectSpecificMethods;

public class CreateLeadPage extends ProjectSpecificMethods {
	
public CreateLeadPage() {
	
}

public CreateLeadPage enterCompanyName() {
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TL");
	return this;
}
public CreateLeadPage enterFirstName() {
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Test");
	return this;
}
public CreateLeadPage enterLastName() {
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Leaf");
	return this;
}
public CreateLeadPage enterPhoneNumber() {
	WebElement phnnum = driver.findElement(By.id("createLeadForm_primaryPhoneNumber"));
    phnnum.sendKeys("9191911234");
    return this;
}
public ViewLeadPage clickCreateLeadButton() {
	driver.findElement(By.className("smallSubmit")).click();
	return new ViewLeadPage();

}

}


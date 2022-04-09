package org.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethods;

public class EditLeadPage extends ProjectSpecificMethods {
	
	public EditLeadPage(RemoteWebDriver driver) {
		this.driver = driver;
	}
	
	public EditLeadPage editCompanyName() {
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("TL Services");
		return this;
	}
	
	public EditLeadPage submitButton() {
		driver.findElement(By.className("smallSubmit")).click();
		return this;
	}
}

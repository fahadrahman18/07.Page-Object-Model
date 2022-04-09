package org.leaftaps.ui.pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods {
	
public HomePage() {
	
}

public LeadsPage clickLeadsTab() {
	driver.findElement(By.linkText(prop_lang.getProperty("leads_linktext"))).click();
	return new LeadsPage();
}
}



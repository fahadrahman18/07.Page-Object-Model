package org.leaftaps.ui.pages;

import base.ProjectSpecificMethods;

public class ViewLeadPage extends ProjectSpecificMethods {
	
public ViewLeadPage() {
	
}
public ViewLeadPage verifyLeadID() {
	// need to get text in lead id and change accordly
	System.out.println("Title of the page: " + driver.getTitle());
	return this;
}
}

package org.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {
	
public LoginPage() {
	
}

public LoginPage enterUsername() {
	WebElement enterusername = driver.findElement(By.id("username"));
	enterusername.sendKeys("Demosalesmanager");
	return this;
}
public LoginPage enterPassword() {
	WebElement enterpassword = driver.findElement(By.id("password"));
	enterpassword.sendKeys("crmsfa");
	return this;
}

public WelcomePage clickLoginButton() {
	driver.findElement(By.className("decorativeSubmit")).click();
	return new WelcomePage();
}

}

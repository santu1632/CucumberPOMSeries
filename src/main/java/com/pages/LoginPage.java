package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	/****
	 * By Locator
	 * Constructors
	 * 
	 */
	private WebDriver driver;
	
	//1. By Locators
	private By emailID = By.id("user-name");
	private By password = By.id("password");
	private By submitButton = By.id("login-button");
	
	//2. create the constructor of page class
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//. page actions: 
	
	public String getLoginPageTitle() {
		return driver.getTitle();
	}
	
	public void enterUserName(String username) {
		driver.findElement(emailID).sendKeys(username);
	}
	
	public void enterPassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);
	}
	
	public void clickOnLogin() {
		driver.findElement(submitButton).click();
	}
}

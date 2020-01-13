package com.login.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
/**
 * @author PremSai Manthani
 * @purpose this class locates all the web element present on forgot page and perform operation
 *
 */

public class LoginPage {
	
	@FindBy(xpath = "//input[@name='uname']")
	WebElement username;

	@FindBy(xpath = "//input[@name='pass']")
	WebElement password;

	@FindBy(xpath = "//form[contains(text(),'Enter username :')] ")
	WebElement login;
	
	public void setUserName(String userName)
	{
		username.sendKeys(userName);
	}
	public void setPassword(String pswd)
	{
		password.sendKeys(pswd);
	}
	public void clickLoginButton()
	{
		login.click();
	}
	

}

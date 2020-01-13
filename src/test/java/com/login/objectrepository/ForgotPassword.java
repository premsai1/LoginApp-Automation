package com.login.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author PremSai Manthani
 * @purpose this class locates all the web element present on forgot page and perform operation
 *
 */
public class ForgotPassword {
	WebDriver driver;

	public ForgotPassword(WebDriver rdriver) {
		driver = rdriver;

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@name='username']")
	WebElement userName;

	@FindBy(xpath = "//input[@name='mail']")
	WebElement mail;

	@FindBy(xpath = "//input[@name='news']")
	WebElement newPassword;

	@FindBy(xpath = "//input[@value='resetpass']")
	WebElement confirmPassword;

	@FindBy(xpath = "//input[@value='resetpass']")
	WebElement reset;
	
	
	
	public void setUserName(String username)
	{
		userName.sendKeys(username);
	}
	public void setMail(String email)
	{
		mail.sendKeys(email);
	}
	public void setnewPassword(String newpassword)
	{
		newPassword.sendKeys(newpassword);
	}
	public void setconfirmpassword(String confirmpassword)
	{
		confirmPassword.sendKeys(confirmpassword);
	}
	
	public void setreset()
	{
		reset.click();
	}

}

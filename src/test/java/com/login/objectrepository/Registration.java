package com.login.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
/**
 * @author PremSai Manthani
 * @purpose this class locates all the web element present on registration page and perform operation
 *
 */

public class Registration {
	
	@FindBy(xpath = "//input[@name='first_name']")
	WebElement firstName;

	@FindBy(xpath = "//input[@name='username']")
	WebElement userName;

	@FindBy(xpath = "//input[@name='password']")
	WebElement password;

	@FindBy(xpath = "//input[@name='address']")
	WebElement address;

	@FindBy(xpath = "//input[@name='contact']")
	WebElement contact;

	@FindBy(xpath = "//input[@name='mail']")
	WebElement mail;

	@FindBy(xpath = "//input[@value='Submit']")
	WebElement singUp;
	
	public void setfirstName(String firstname)
	{
		firstName.sendKeys(firstname);
	}
	public void setuserName(String username)
	{
		userName.sendKeys(username);
	}
	public void setpassword(String Password)
	{
		password.sendKeys(Password);
	}
	public void setAddress(String Address)
	{
		address.sendKeys(Address);
	}
	public void setcontact(String contactdetails)
	{
		contact.sendKeys(contactdetails);
	}
	public void setMail(String email)
	{
		mail.sendKeys(email);
	}
	public void clicksignup()
	{
	singUp.click();
	}

}

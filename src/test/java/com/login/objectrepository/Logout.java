package com.login.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
/**
 * @author PremSai Manthani
 * @purpose this class locates all the web element present on logout page and perform operations
 *
 */

public class Logout {
	
	@FindBy(css = "body:nth-child(2) form:nth-child(2) > input:nth-child(1)")
	WebElement logout;
	public void clickLogoutButton()
	{
		logout.click();
	}

}

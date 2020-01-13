package com.login.base;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import loginAutomation.login_automation.logintest;
/**
 * @author PremSai Manthani
 * @purpose this class is the base class for all the class and has the properties for  launching the browser and mazimize
 */

public class Base {
	public static WebDriver driver;
	public static Properties prop;

	@BeforeTest
	public void basicSetup(String url) {
		String browserName = prop.getProperty("browser");
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"/home/user/Desktop/selenium/drivers/chromedriver_linux64/chromedriver");
			driver = new ChromeDriver();
		} else if (browserName.equals("FF")) {
			System.setProperty("webdriver.chrome.driver",
					"/home/user/Desktop/selenium/drivers/chromedriver_linux64/chromedriver");
			driver = new ChromeDriver();
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get(url);

	}

	@AfterTest
	public void quit() {
		driver.quit();
	}

}

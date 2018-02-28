package com.test.webautomation.webAutomation.testbase;

import org.openqa.selenium.WebDriver;

public class TestBase {
	
	public WebDriver driver;
	
	public Properties OR = new Properties();
	public static ExtendReports extent;
	
	public WebDriver getDriver(){
		
		return driver;
	}

}

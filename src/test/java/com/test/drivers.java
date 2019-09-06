package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class drivers {
	public static WebDriver getDriver(String Browser)
	{
		if(Browser.equals("selenium2firefox"))
		{
		return new FirefoxDriver();
		}
		{
		if(Browser.equals("selenium3firefox"))
		{
			System.getProperty("webdriver.gecko.driver","C:/Sowmya/Drivers/geckodriver.exe");
			return new FirefoxDriver();
		}
	
}

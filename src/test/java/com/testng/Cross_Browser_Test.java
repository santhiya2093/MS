package com.testng;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Cross_Browser_Test {
	
	@Parameters("browser")
	@BeforeClass
	public void browserMethods(@Optional("chrome")String browser)
	
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.out.println("Chrome");
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			System.out.println("Edge");
		}
	}
	
	@Test
	public void login()
	{
		System.out.println("Facebook");
	}

}

package com.testng;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.baseclass.Base_Class;

import PageObjectManager.Page_Object_Manager;

public class Parameter extends Base_Class{
	
	Page_Object_Manager pom;
	@BeforeClass
	public void browser()
	{
		browserLaunch("chrome");
		urlLaunch("https://adactinhotelapp.com/");
	}

	@Parameters({"Usernme","Password"})
	@Test
	public void login(@Optional("santhiya2093")String username,@Optional("4TW8V8") String password)
	{
	pom = new Page_Object_Manager(driver);
	sendValues(pom.getLoginadac().getUsername(),username);
	sendValues(pom.getLoginadac().getPassword(),password);
	clickOnElement(pom.getLoginadac().getLoginbutton());
	
	}
}

package com.testng;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

import com.baseclass.Base_Class;

import PageObjectManager.Page_Object_Manager;

public class Data_Provider extends Base_Class
{
	Page_Object_Manager pom;
	@BeforeClass
	public void browser()
	{
		browserLaunch("chrome");
		urlLaunch("https://adactinhotelapp.com/");
	}
	
	@Test(dataProvider="testdata")
	public void login(String username, String password)
	{
	pom = new Page_Object_Manager(driver);
	sendValues(pom.getLoginadac().getUsername(),username);
	sendValues(pom.getLoginadac().getPassword(),password);
	clickOnElement(pom.getLoginadac().getLoginbutton());
	
	}
	
	@DataProvider(name = "testdata")
	//Used common return type Object in Multidimentional Array
	public Object[][] testData() {
		return new Object[][] {
			{"santhiya2093","4TW8V8"},
			{"sandy","RIB89"},
			{"sjfdjsvn","65646"}};
		}
		
	}
	


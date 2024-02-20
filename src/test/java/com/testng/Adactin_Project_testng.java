package com.testng;

import org.testng.annotations.Test;

import com.baseclass.Base_Class;

import PageObjectManager.Page_Object_Manager;

public class Adactin_Project_testng extends Base_Class {

	Page_Object_Manager pom;
	
	@Test
	public void login()
	{
		browserLaunch("chrome");
		urlLaunch("https://adactinhotelapp.com/");
		sendValues(pom.getLoginadac().getUsername().username);
	}
}

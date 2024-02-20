package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion_Test {
	@Test
	public void login()
	{
		String expectedPage = "Facebook";
		String actual = "Facebo";
		
		
		// ****** Hard Assert **********
		
		Assert.assertEquals(actual,expectedPage);
		System.out.println("First");
			
		Assert.assertEquals(actual,expectedPage);
		System.out.println("Second");
		
		Assert.assertEquals(actual,expectedPage);
		System.out.println("Third");
		
		//*******Soft Assert **********
		
//		SoftAssert soft = new SoftAssert();
//		soft.assertEquals(actual, expectedPage);
//		System.out.println("First");
//		
//		soft.assertEquals(actual, expectedPage);
//		System.out.println("Second");
//		
//		soft.assertEquals(actual, expectedPage);
//		System.out.println("Third");
//		
//		soft.assertAll();
	}
	

}

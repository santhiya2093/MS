package com.testng;

//Invocation Count
//Used to execute the test cases many times. Particularly used in performance testing (Login Page)
import org.testng.annotations.Test;

public class Invocation_Count {

	@Test(priority = 3, invocationCount = 6)
	public void twitterLogin() {
		System.out.println("Twitt Login");
	}

	@Test(priority = 1)
	public void pinterestLogin() {
		System.out.println("Pin Login");
	}

	@Test(priority = -2, invocationCount = 5)
	public void yahooLogin() {
		System.out.println("Yah Login");
	}

	@Test(priority = 0)
	public void gmailLogin() {
		System.out.println("Gm Login");
	}

	@Test(priority = -5)
	public void redditLogin() {
		System.out.println("Redd Login");
	}

}

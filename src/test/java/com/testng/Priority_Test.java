package com.testng;

import org.testng.annotations.Test;
//Priority starts from Negative to Positive
public class Priority_Test {

	@Test(priority = 3)
	public void twitterLogin() {
		System.out.println("Twitt Login");
	}

	@Test(priority = 1)
	public void pinterestLogin() {
		System.out.println("Pin Login");
	}
	
    @Test(priority = -2)
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
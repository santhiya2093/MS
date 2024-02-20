package com.testng;

import org.testng.annotations.Test;

public class Grouping {

	@Test(groups = "a")
	public void twitterLogin() {
		System.out.println("Twitt Login");
	}

	@Test(groups="b")
	public void pinterestLogin() {
		System.out.println("Pin Login");
	}
	
    @Test(groups = {"a","b"})
	public void yahooLogin() {
		System.out.println("Yah Login");
	}

	@Test(groups="b")
	public void gmailLogin() {
		System.out.println("Gm Login");
	}

	@Test(groups="a")
	public void redditLogin() {
		System.out.println("Redd Login");
	}

}

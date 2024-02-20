package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Depends_On_Methods {

	@Test(dependsOnMethods = "gmailLogin")
	public void twitterLogin() {
		System.out.println("Twitt Login");
	}

	@Test(dependsOnMethods = "redditLogin")
	public void pinterestLogin() {
		System.out.println("Pin Login");
	}

	@Test
	public void yahooLogin() {
		// Assert.fail();
		// If we give Assert.fail the particular method is failed. Remaining methods are
		// skipped
		System.out.println("Yah Login");

	}

	@Test(dependsOnMethods = "pinterestLogin")
	public void gmailLogin() {
		System.out.println("Gm Login");
	}

	@Test(dependsOnMethods = "yahooLogin")
	public void redditLogin() {
		System.out.println("Redd Login");
	}

}

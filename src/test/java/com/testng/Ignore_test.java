package com.testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

//In three ways we can ignore the test
public class Ignore_test {
// Way !
	@Ignore
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

	// Way 2
	@Test(priority = 0, enabled = false)
	public void gmailLogin() {
		System.out.println("Gm Login");
	}

	@Test(priority = -5)
	public void redditLogin() {
		System.out.println("Redd Login");

		// Way 3: RC class name - testNG - Convert to testNG - In xml file add exclude
		// tag in methods.
	}

}

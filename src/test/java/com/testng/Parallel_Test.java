package com.testng;

import org.testng.annotations.Test;

public class Parallel_Test {

	@Test
	public void twitterLogin() {
		System.out.println("Twitt Login");
	}

	@Test
	public void pinterestLogin() {
		System.out.println("Pin Login");
	}
	
    @Test
	public void yahooLogin() {
		System.out.println("Yah Login");
	}

	@Test
	public void gmailLogin() {
		System.out.println("Gm Login");
	}

	@Test
	public void redditLogin() {
		System.out.println("Redd Login");
	}
	

}

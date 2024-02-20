package com.testng;

import org.testng.annotations.Test;

public class TimeoutException_Test {

	@Test(timeOut = 2000)
	public void twitterLogin() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("Twitt Login");
	}

	@Test
	public void pinterestLogin() {
		System.out.println("Pin Login");
	}
	
    @Test(timeOut = 3000)
	public void yahooLogin() throws InterruptedException {
    	Thread.sleep(1000);
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

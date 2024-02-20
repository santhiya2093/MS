package com.testng;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class SimpleAnnotation{
	
	@BeforeSuite
	public void setProperty() {
		System.out.println("Set Property");
	}
	@BeforeTest
	public void browserLaunch() {
		System.out.println("chrome");
	}
	@BeforeClass
	public void urlLaunch() {
		System.out.println("Amazon");
	}
	@BeforeMethod
	public void login() {
		System.out.println("Amazon Login");
	}
    @Test
	public void selectMobile() {
		System.out.println("Vivo");
	}
	@Test
	public void selectLaptop() {
		System.out.println("Hp");
	}
	@AfterMethod
	public void validation() {
		System.out.println("Validation");
	}
	@AfterClass
	public void logout() {
		System.out.println("Logout");
	}
	@AfterTest
	public void deleteCookies() {
		System.out.println("Delete Cookies");
	}
	@AfterSuite
	public void quitBrowser() {
		System.out.println("Quit Browser");
	}

}

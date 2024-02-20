package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConformHotel {

	public WebDriver driver;
	
	@FindBy(xpath="//input[@id='my_itinerary']")
	 private WebElement Myitinerarybutton;
	
	@FindBy(xpath="//input[@id='logout']")
	private WebElement Logout;

	public WebElement getMyitinerarybutton() {
		return Myitinerarybutton;
	}

	public WebElement getLogout() {
		return Logout;
	}

	public ConformHotel(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(this.driver, this);
	}
}

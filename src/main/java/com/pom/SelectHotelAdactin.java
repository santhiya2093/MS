package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelAdactin {
	public WebDriver driver;
	
	@FindBy(xpath="//input[@name='radiobutton_0']")
	private WebElement rbutton;
	
	@FindBy(xpath="//input[@name='continue']")
	private WebElement continuebutton;

	public WebElement getRbutton() {
		return rbutton;
	}

	public WebElement getContinuebutton() {
		return continuebutton;
	}

	public SelectHotelAdactin(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(this.driver, this);
	}
	
}

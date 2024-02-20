package com.pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class BookHotelAdactin {
	public WebDriver driver;
	
	@FindBy(xpath="//input[@name='first_name']")
	private WebElement Username;
	
	@FindBy(xpath="//input[@name='last_name']")
	private WebElement Lastname;
	
	@FindBy(xpath="//textarea[@name='address']")
	private WebElement Address;
	
	@FindBy(xpath="//input[@name='cc_num']")
	private WebElement CCnumber;
	
	@FindBy(xpath="//select[@name='cc_type']")
	private WebElement Cardtype;
	
	@FindBy(xpath="//select[@name='cc_exp_month']")
	private WebElement Expmon;
	
	@FindBy(xpath="//select[@name='cc_exp_year']")
	private WebElement Expyr;

	@FindBy(xpath="//input[@name='cc_cvv']")
	private WebElement CCVno;
	
	@FindBy(xpath="//input[@type='button']")
	private WebElement Booknow;

public WebElement getUsername() {
	return Username;
}

public WebElement getLastname() {
	return Lastname;
}

public WebElement getAddress() {
	return Address;
}

public WebElement getCCnumber() {
	return CCnumber;
}

public WebElement getCardtype() {
	return Cardtype;
}

public WebElement getExpmon() {
	return Expmon;
}

public WebElement getExpyr() {
	return Expyr;
}

public WebElement getCCVno() {
	return CCVno;
}

public WebElement getBooknow() {
	return Booknow;
}
public BookHotelAdactin(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(this.driver, this);
}
}

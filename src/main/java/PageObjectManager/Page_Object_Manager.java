package PageObjectManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pom.BookHotelAdactin;
import com.pom.ConformHotel;
import com.pom.LoginAdactin;
import com.pom.SearchHotelAdactin;
import com.pom.SelectHotelAdactin;

public class Page_Object_Manager {
public WebDriver driver;

//Declare the object page as private
//Generate the getters
//Using pageFactory to initialize the element and driver

private LoginAdactin loginadac;
private SearchHotelAdactin seachhotadac;
private SelectHotelAdactin selhotadac;
private BookHotelAdactin bookhotadac;
private ConformHotel conformhot;


public LoginAdactin getLoginadac() {

	loginadac = new LoginAdactin(driver);
	return loginadac;
}

public SearchHotelAdactin getSeachhotadac() {
	seachhotadac = new SearchHotelAdactin(driver);
	return seachhotadac;
}

public SelectHotelAdactin getSelhotadac() {
	selhotadac = new SelectHotelAdactin(driver);
	return selhotadac;
}

public BookHotelAdactin getBookhotadac() {
	bookhotadac = new BookHotelAdactin(driver);
	return bookhotadac;
}

public ConformHotel getConformhot() {
	conformhot = new ConformHotel(driver);
	return conformhot;
}

public Page_Object_Manager(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(this.driver, this);
}
}

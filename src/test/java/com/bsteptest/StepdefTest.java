package com.bsteptest;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.baseclass.Base_Class;
import com.configura.ConFigClass;
import com.google.common.collect.Maps;
import com.pom.LoginAdactin;
import com.pom.SearchHotelAdactin;

import PageObjectManager.Page_Object_Manager;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StepdefTest extends Base_Class {

private DataTable dataTable;
	 
Page_Object_Manager pom = new Page_Object_Manager(driver); 
public static ConFigClass con; 
	
@Given("^launch The Adactin Url Application$")
	public void launch_The_Adactin_Url_Application() throws Throwable {

	con = new ConFigClass();
	//urlLaunch("https://adactinhotelapp.com/");
	urlLaunch(con.getUrl());	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	}

//	@When("^user Enters The Username in the respective field$")
//	public void user_Enters_The_Username_in_the_respective_field() throws Throwable {
//		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("santhiya2093");
	
//	}
//
//	@When("^user Enters The Password in the respective field$")
//	public void user_Enters_The_Password_in_the_respective_field() throws Throwable {
//		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("4TW8V8");
//	}

//	@Then("^user Enters the LoginButton in the respective field$")
//	public void user_Enters_the_LoginButton_in_the_respective_field() throws Throwable {
//		driver.findElement(By.xpath("//input[@name='login']")).click();
//	}

// Scenario Outline - Username,Password

//	@When("^user Enters The Username \"([^\"]*)\" in the respective field$")
//	public void user_Enters_The_Username_in_the_respective_field(String username) throws Throwable {
//		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username); 
	
//	}
//
//	@When("^user Enters The Password \"([^\"]*)\" in the respective field$")
//	public void user_Enters_The_Password_in_the_respective_field(String password) throws Throwable {
//		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
//	}

	// Data Table

	@When("^user Enters The Following Credentials In The Respective Field$")
	public void user_Enters_The_Following_Credentials_In_The_Respective_Field(DataTable dataTable) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
//		List<Map<String, String>> asMaps = dataTable.asMaps(String.class, String.class);
//		String username = asMaps.get(3).get("Username");
//		String password = asMaps.get(3).get("Password");
		//driver.findElement(By.id("username")).sendKeys(username);
		//driver.findElement(By.id("password")).sendKeys(password);
//		sendValues(log.getUsername(),username);
//		sendValues(log.getPassword(),password);
//		sendValues(pom.getLoginadac().getUsername(),username);
//		sendValues(pom.getLoginadac().getPassword(),password);
		
		sendValues(pom.getLoginadac().getUsername(),con.getUsername());
		sendValues(pom.getLoginadac().getPassword(),con.getPassword());
		
}
	
	@Then("^user Enters The LoginButton And Navigate To The Search Hotel Page$")
	public void user_Enters_The_LoginButton_And_Navigate_To_The_Search_Hotel_Page() throws Throwable {
		
		// Write code here that turns the phrase above into concrete actions
		//driver.findElement(By.xpath("//input[@name='login']")).click();
		clickOnElement(pom.getLoginadac().getLoginbutton());
	}
	//***********Search Hotel*************
	
	//@When("^user Select The Location  using Dropdown$")
//	public void user_Select_The_Location_using_Dropdown() throws Throwable {
//	WebElement location = driver.findElement(By.xpath("//select[@name='location']"));
//Select s = new Select(location);
//		s.selectByIndex(8);
//	}

	
	@When("^user Select The Location  using Dropdown$")
	public void user_Select_The_Location_using_Dropdown() throws Throwable {
		//pom =  new Page_Object_Manager(driver);
		dropDown(pom.getSeachhotadac().getLocation(),"London","visible text");
		  }
	
	@When("^user Select  The Hotel using Dropdown$")
	public void user_Select_The_Hotel_using_Dropdown() throws Throwable {
//		WebElement hotel = driver.findElement(By.xpath("//select[@name='hotels']"));
//		Select s1 = new Select(hotel);
//		s1.selectByValue("Hotel Sunshine");
		dropDown(pom.getSeachhotadac().getHotel(),"Hotel Sunshine","value");
	}

	@When("^user Select The RoomType using Dropdown$")
	public void user_Select_The_RoomType_using_Dropdown() throws Throwable {
//		WebElement room_type = driver.findElement(By.xpath("//select[@id='room_type']"));
//		Select s2 = new Select(room_type);
//		s2.selectByVisibleText("Deluxe");
		dropDown(pom.getSeachhotadac().getRoom_type(),"Deluxe","visible text");
	}

	@When("^user Select The Number of Rooms using Dropdown$")
	public void user_Select_The_Number_of_Rooms_using_Dropdown() throws Throwable {
//		WebElement room_nos = driver.findElement(By.xpath("//select[@id='room_nos']"));
//		Select s3 = new Select(room_nos);
//		s3.selectByIndex(2);
		dropDown(pom.getSeachhotadac().getRoom_nos(),"2","index");
	}

	@When("^user Select The Adults Room using Dropdown$")
	public void user_Select_The_Adults_Room_using_Dropdown() throws Throwable {
//		WebElement adult_room = driver.findElement(By.xpath("//select[@name='adult_room']"));
//		Select s4 = new Select(adult_room);
//		s4.selectByValue("2");
		dropDown(pom.getSeachhotadac().getAdult_room(),"2","value");
	}

	@When("^user Select The Children Room using Dropdown$")
	public void user_Select_The_Children_Room_using_Dropdown() throws Throwable {
//		WebElement child_room = driver.findElement(By.xpath("//select[@name='child_room']"));
//		Select s5 = new Select(child_room);
//		s5.selectByVisibleText("1 - One");
		dropDown(pom.getSeachhotadac().getChild_room(),"1 - One","visible text");

	}

	@Then("^user Enters The Search Button in the respective field$")
	public void user_Enters_The_Search_Button_in_the_respective_field() throws Throwable {
		//driver.findElement(By.xpath("//input[@name='Submit']")).click();
		clickOnElement(pom.getSeachhotadac().getSubmit());

	}

	//************ Select Hotel****************
	
	@When("^user Select the RadioButton$")
	public void user_Select_the_RadioButton() throws Throwable {
		//driver.findElement(By.xpath("//input[@name='radiobutton_0']")).click();
		//pom =  new Page_Object_Manager(driver);
		clickRadioButton(pom.getSelhotadac().getRbutton());
	}

	@Then("^user Enters the Continue Button in the respective field$")
	public void user_Enters_the_Continue_Button_in_the_respective_field() throws Throwable {
		//driver.findElement(By.xpath("//input[@name='continue']")).click();
		clickOnElement(pom.getSelhotadac().getContinuebutton());
	}
	
	//************* Book Hotel*************

	@When("^user Enters the Username in the respective field$")
	public void user_Enters_the_Username_in_the_respective_field() throws Throwable {
		//driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Santhiya");
		//pom =  new Page_Object_Manager(driver);
		sendValues(pom.getBookhotadac().getUsername(),"santhiya");
	}

	@When("^user Enters the Lastname in the respective field$")
	public void user_Enters_the_Lastname_in_the_respective_field() throws Throwable {
		//driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("Sriram");
       sendValues(pom.getBookhotadac().getLastname(),"Sriram");
	}

	@When("^user Enters the Billing Address in the respective field$")
	public void user_Enters_the_Billing_Address_in_the_respective_field() throws Throwable {
		//driver.findElement(By.xpath("//textarea[@name='address']")).sendKeys("Moolapalayam,Erode");
	sendValues(pom.getBookhotadac().getAddress(),"Moolapalayam,Erode");
	}

	@When("^user Enters the Credit Card Number in the respective field$")
	public void user_Enters_the_Credit_Card_Number_in_the_respective_field() throws Throwable {
		//driver.findElement(By.xpath("//input[@name='cc_num']")).sendKeys("1234567899874561");
    sendValues(pom.getBookhotadac().getCCnumber(),"7894561231478523");
	}

	@When("^user Select the Credit Card Type using Dropdown$")
	public void user_Select_the_Credit_Card_Type_using_Dropdown() throws Throwable {
//		WebElement cardtype = driver.findElement(By.xpath("//select[@name='cc_type']"));
//		Select s6 = new Select(cardtype);
//		s6.selectByIndex(2);
		dropDown(pom.getBookhotadac().getCardtype(),"2","index");
	}

	@When("^User Select the Expiry Month using Dropdown$")
	public void user_Select_the_Expiry_Month_using_Dropdown() throws Throwable {
//		WebElement expmon = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
//		Select s7 = new Select(expmon);
//		s7.selectByIndex(4);
		dropDown(pom.getBookhotadac().getExpmon(),"4","index");
	}

	@When("^user Select the Expiry Year using Dropdown$")
	public void user_Select_the_Expiry_Year_using_Dropdown() throws Throwable {
//		WebElement expyr = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
//		Select s8 = new Select(expyr);
//		s8.selectByVisibleText("2030");
		dropDown(pom.getBookhotadac().getExpyr(),"2030","visible text");

	}

	@When("^user Enters the CCV Number in the respective field$")
	public void user_Enters_the_CCV_Number_in_the_respective_field() throws Throwable {
		//driver.findElement(By.xpath("//input[@name='cc_cvv']")).sendKeys("367");
sendValues(pom.getBookhotadac().getCCVno(),"367");
	}

	@Then("^user Enters the Book Now Button in the respective field$")
	public void user_Enters_the_Book_Now_Button_in_the_respective_field() throws Throwable {
		//driver.findElement(By.xpath("//input[@type='button']")).click();
		// Thread.sleep(5000);
		clickOnElement(pom.getBookhotadac().getBooknow());
	}

	@When("^user Clicks On Myitinerarybutton$")
	public void user_Clicks_On_Myitinerarybutton() throws Throwable {
		//driver.findElement(By.xpath("//input[@id='my_itinerary']")).click();
		clickOnElement(pom.getConformhot().getMyitinerarybutton());
	}

	@Then("^user Clicks on LogoutButton$")
	public void user_Clicks_on_LogoutButton() throws Throwable {
		//driver.findElement(By.xpath("//input[@id='logout']")).click();
     clickOnElement(pom.getConformhot().getLogout());
	}


}

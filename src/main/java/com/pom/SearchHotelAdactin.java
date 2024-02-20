package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelAdactin {

public WebDriver driver;

@FindBy(xpath="//select[@name='location']")
private WebElement location;

@FindBy(xpath="//select[@name='hotels']")
private WebElement hotel;

@FindBy(xpath="//select[@id='room_type']")
private WebElement room_type;

@FindBy(xpath="//select[@id='room_nos']")
private WebElement room_nos;

@FindBy(xpath="//select[@name='adult_room']")
private WebElement adult_room;

@FindBy(xpath="//select[@name='child_room']")
private WebElement child_room;

@FindBy(xpath="//input[@name='Submit']")
private WebElement submit;
public WebElement getLocation() {
	return location;  }
public WebElement getHotel() {
	return hotel;     }
public WebElement getRoom_type() {
	return room_type; }
public WebElement getRoom_nos() {
	return room_nos;  }
public WebElement getAdult_room() {
	return adult_room; }
public WebElement getChild_room() {
	return child_room; }
public WebElement getSubmit() {
	return submit;     }
public SearchHotelAdactin(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(this.driver, this); } }
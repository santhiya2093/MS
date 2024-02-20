package com.MiniProject;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
//Mini Project to automate adactinhotelapp.com
public class AdactinProject {
	// static variable
	static WebDriver driver;

	private static void browserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	private static void urlLaunch() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
	}

	private static void logIn() {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("santhiya2093");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("4TW8V8");
		driver.findElement(By.xpath("//input[@name='login']")).click();
	}

	private static void searchHotel() {
		WebElement location = driver.findElement(By.xpath("//select[@name='location']"));
		Select s = new Select(location);
		s.selectByIndex(8);

		WebElement hotel = driver.findElement(By.xpath("//select[@name='hotels']"));
		Select s1 = new Select(hotel);
		s1.selectByValue("Hotel Sunshine");

		WebElement room_type = driver.findElement(By.xpath("//select[@id='room_type']"));
		Select s2 = new Select(room_type);
		s2.selectByVisibleText("Deluxe");

		WebElement room_nos = driver.findElement(By.xpath("//select[@id='room_nos']"));
		Select s3 = new Select(room_nos);
		s3.selectByIndex(2);

		WebElement adult_room = driver.findElement(By.xpath("//select[@name='adult_room']"));
		Select s4 = new Select(adult_room);
		s4.selectByValue("2");

		WebElement child_room = driver.findElement(By.xpath("//select[@name='child_room']"));
		Select s5 = new Select(child_room);
		s5.selectByVisibleText("1 - One");

		driver.findElement(By.xpath("//input[@name='Submit']")).click();

	}

	private static void selectHotel() {
		driver.findElement(By.xpath("//input[@name='radiobutton_0']")).click();

		driver.findElement(By.xpath("//input[@name='continue']")).click();
	}

	private static void bookHotel() {
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Santhiya");

		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("Sriram");

		driver.findElement(By.xpath("//textarea[@name='address']")).sendKeys("Moolapalayam,Erode");

		driver.findElement(By.xpath("//input[@name='cc_num']")).sendKeys("1234567899874561");

		WebElement cardtype = driver.findElement(By.xpath("//select[@name='cc_type']"));
		Select s6 = new Select(cardtype);
		s6.selectByIndex(2);

		WebElement expmon = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		Select s7 = new Select(expmon);
		s7.selectByIndex(4);

		WebElement expyr = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
		Select s8 = new Select(expyr);
		s8.selectByVisibleText("2030");

		driver.findElement(By.xpath("//input[@name='cc_cvv']")).sendKeys("367");

		driver.findElement(By.xpath("//input[@type='button']")).click();
	}

	private static void myItinerary() {
		driver.findElement(By.xpath("//input[@id='my_itinerary']")).click();
	}

	private static void screenshotBookedItinerary() throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(
				"C:\\Users\\Admin\\eclipse-workspace\\LavenderProject\\screenshot\\adactinhotel.png");
		FileUtils.copyFile(source, destination);
	}

	private static void logOut() {
		// Scroll down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,750)");

		// Logout
		driver.findElement(By.xpath("//input[@id='logout']")).click();

	}

	private static void mainPage() {
		driver.findElement(By.xpath("//a[text()='Click here to login again']")).click();
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		browserLaunch();
		urlLaunch();
		logIn();
		searchHotel();
		selectHotel();
		bookHotel();
		myItinerary();
		screenshotBookedItinerary();
		logOut();
		mainPage();
	}

}

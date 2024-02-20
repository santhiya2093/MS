package com.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.formula.functions.Index;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Class {
	public static WebDriver driver;

	// 1.browserLaunch
	public static void browserLaunch(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
	}
   // 2.urlLaunch (Get)
	public static void urlLaunch(String url) {
		driver.get(url);
	}

	// 3.sendValues
	public static void sendValues(WebElement element, String values) {
		element.sendKeys(values);
	}

	// 4.click
	public static void clickOnElement(WebElement element) {
		element.click();
	}

	// 5.printScreen (ScreenShot)
	public static void printScreen(String filename) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(
				"C:\\Users\\Admin\\eclipse-workspace\\LavenderProject\\screenshot\\" + filename + ".png");
		FileHandler.copy(source, destination);

	}

	// 6.Navigate To
	public static void navigate_To(String url) {
		driver.navigate().to(url);
	}
   // 7. Navigate Back
	public static void navigate_Back() {
		driver.navigate().back();
	}

	// 8. Navigate Forward
	public static void navigate_Forward() {
		driver.navigate().forward();
	}

	// 9. Navigate Refresh
	public static void navigate_Refresh() {
		driver.navigate().refresh();
	}

	// 10. Close
	public static void close() {
		driver.close();
	}

	// 11.quit
	public static void quit() {
		driver.quit();
	}

	// 12.Get Title
	public static void get_Title() {
		String title = driver.getTitle();
		System.out.println(title);
	}
// 13. Get Current URL
	public static void current_URL() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}

	// 14.Get Text
	public static void get_Text(WebElement element) {
		String text = element.getText();
		System.out.println(text);
	}

	// 15. Is Enabled
	public static void isEnabled(WebElement element) {
		boolean enabled = element.isEnabled();
		System.out.println(enabled);
	}

	// 16. Is Displayed
	public static void isDisabled(WebElement element) {
		boolean displayed = element.isDisplayed();
		System.out.println(displayed);
	}

	// 17.Is Selected
	public static void isSelected(WebElement element) {
		boolean selected = element.isSelected();
		System.out.println(selected);
	}

	// 18.Check box
	public static void checkBox(WebElement element) {
		element.click();
	}

	// 19.Is Multiple
	public static void isMultiple(String locator) {
		WebElement Element = driver.findElement(By.xpath(locator));
		Select s = new Select(Element);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
	}

	// 20.Radio Button
	public static void clickRadioButton(WebElement element) {
		element.click();
	}

	// 21.Alert

	public static void alert(String action, String inputText) {
		Alert alert = driver.switchTo().alert();
		if (action.equalsIgnoreCase("accept")) {
			alert.accept();
		} else if (action.equalsIgnoreCase("dismiss")) {
			alert.dismiss();
		} else if (action.equalsIgnoreCase("prompt")) {
			alert.sendKeys(inputText);
			alert.accept();
		} else {
			System.out.println("Unsupported action:" + action);
		}

	}

	// 22.Frames
	public static void frames(WebElement element, String frameIdentifier, String value, int val) {

		switch (frameIdentifier.toLowerCase()) {
		case "index":
          	driver.switchTo().frame(val);
			break;
		case "name":
			driver.switchTo().frame(value);
			break;
        case "element":
			driver.switchTo().frame(element);
			break;
		default:
			System.out.println("Unsupported Frame Identifier");

		}

	}

	// 23.Drop Down
	public static void dropDown(WebElement singledropdown, String value, String condition) {
	
		Select s1 = new Select(singledropdown);
		switch (condition.toLowerCase()) {
		case "index":
			int index = Integer.parseInt(value);
			s1.selectByIndex(index);
			break;
		case "value":
			s1.selectByValue(value);
			break;
		case "visible text":
			s1.selectByVisibleText(value);
			break;
		default:
			System.out.println("Unsupported condition:" + condition);
		}
	}

	// 24.Get First Selected OPtion
	public static void firstSelectedOption(String locator) {
		WebElement multiple = driver.findElement(By.xpath(locator));
		Select s = new Select(multiple);
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		System.out.println("First Selected Option" + firstSelectedOption.getText());
	}

	// 25.Get All Selected Options
	public static void allSelectedOptions(String locator) {
		WebElement multiple = driver.findElement(By.xpath(locator));
		Select s = new Select(multiple);
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for (WebElement x : allSelectedOptions) {
			System.out.println("All Selected Options" + x.getText());
		}
	}

	// 26. Get Options
	public static void getOptions(String locator) {
		WebElement element = driver.findElement(By.xpath(locator));
		Select s = new Select(element);
		List<WebElement> options = s.getOptions();
		for (WebElement getOptions : options) {
			System.out.println("Get Options" + getOptions.getText());
		}
	}

	// 27.Get Attribute
	public static void getAttribute(String locator, String attributeType, String value) {
		WebElement element = driver.findElement(By.xpath(locator));
		switch (attributeType.toLowerCase()) {

		case "attribute_name":
			String attribute = element.getAttribute(value);
			System.out.println(attribute);
			break;
		case "attribute_value":
			element.sendKeys(value);
			System.out.println(element.getAttribute(value));
			break;
		default:
			System.out.println("error");
		}
	}

	// 28. Window Handles
	public static void windowHandles(int index) {

		List<String> li = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(li.get(index));
		// print id of current window
		System.out.println("current window id:" + driver.getWindowHandle());
	}

	// 29. Action
	public static void action(By sourcelocator, By targetlocator, String condition) {
		WebElement sourceElement = driver.findElement(sourcelocator);
		WebElement targetElement = driver.findElement(targetlocator);
		Actions am = new Actions(driver);
		switch (condition.toLowerCase()) {
		case "click":
			am.click(targetElement).build().perform();
		case "contextclick":
			am.contextClick(targetElement).build().perform();
		case "doubleclick":
			am.doubleClick(targetElement).build().perform();
		case "movetoelement":
			am.moveToElement(targetElement).build().perform();
		case "draganddrop":
			am.dragAndDrop(sourceElement, targetElement).build().perform();
		} }
    // 30. ScrollUp and ScrollDown
	public static void scrollWindow(String direction) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		if (direction.equalsIgnoreCase("up")) {
			js.executeScript("window.scrollBy(0,-100");

		} else if (direction.equalsIgnoreCase("down")) {
			js.executeScript("window.scrollBy(0,100");
		}
	}

	// 31. Robot Class
	public static void handleKeyBoard(int keycode) throws AWTException {
		Robot r = new Robot();
		r.keyPress(keycode);
		r.keyRelease(keycode);
	}

	// 32.wait
	public static void setImplicitWait(int time, TimeUnit unit) {
		driver.manage().timeouts().implicitlyWait(time, unit);
	}

}

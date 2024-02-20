package com.MiniProject;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chrome_Options {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		// class
		ChromeOptions option = new ChromeOptions();

		// Add Arguments
//		option.addArguments("start-maximized");
//		option.addArguments("incognito");

		// Add list of Arguments
		List<String> op = new ArrayList<>();
		op.add("start-maximized");
		op.add("incognito");

//      op.add("headless");
//		op.add("disable-extension");
//		op.add("disable-popup-blocking");
//		op.add("make-default-browser");
//		op.add("disable-infobars");

		// op.add("version");
		option.addArguments(op);

		WebDriver driver = new ChromeDriver(option);

		// To get browser name, platform and version
		
		Capabilities cap = ((RemoteWebDriver) driver).getCapabilities();
		String browserName = cap.getBrowserName().toLowerCase();
		System.out.println(browserName);
		String os = cap.getPlatform().toString();
		System.out.println(os);
		String v = cap.getVersion().toString();
		System.out.println(v);

	}

}

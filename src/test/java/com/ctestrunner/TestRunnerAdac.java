package com.ctestrunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;

import com.baseclass.Base_Class;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//Adactintestfeature", glue = "com//bsteptest", monochrome = true, plugin = {
		"pretty", "html:Reports/Cucumber_Html_Report", "json:Reports/Cucumber_json_Report.json",
		"com.cucumber.listener.ExtentCucumberFormatter:Reports/Extent_Report.html" }, tags = {
				"@Login3,@searchhotel,@selecthotel,@bookhotel,@conformhotel" },
		// dryRun=true)
		strict = true)
public class TestRunnerAdac extends Base_Class {

	@BeforeClass
	public static void setUp() {
		browserLaunch("chrome");
	}

	@AfterClass
	public static void tearDown() {
		close();
	}
}

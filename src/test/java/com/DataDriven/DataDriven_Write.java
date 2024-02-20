package com.DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataDriven_Write {
	public static void main(String[] args) throws IOException {

		// File
		File f = new File("C:\\Users\\Admin\\eclipse-workspace\\LavenderProject\\data\\read.xlsx");
		// FileInputStream - Read
		FileInputStream fim = new FileInputStream(f);
		// Workbook - XSSFworkbook
		Workbook wb = new XSSFWorkbook(fim);

		// create sheet, Row, Cell

		// wb.createSheet("mainpage").createRow(1).createCell(2).setCellValue("santhiya2093");
		// wb.getSheet("mainpage").getRow(1).createCell(1).setCellValue("Username:");
		// wb.getSheet("mainpage").createRow(2).createCell(2).setCellValue("4TW8V8");
		// wb.getSheet("mainpage").getRow(2).createCell(1).setCellValue("Password:");

		// FileOutputStream - Write
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
		wb.close();

		// Get Username
		Cell cell = wb.getSheet("mainpage").getRow(1).getCell(2);
		String username = cell.getStringCellValue();
		System.out.println(username);

		// Get Password
		Cell cell2 = wb.getSheet("mainpage").getRow(2).getCell(2);
		String password = cell2.getStringCellValue();
		System.out.println(password);

		WebDriverManager.chromedriver().setup();
		
		// ChromeOptions
		ChromeOptions op = new ChromeOptions();
		op.addArguments("start-maximized");
		WebDriver driver = new ChromeDriver(op);
		
		// Implicit Wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		// Url launch
		driver.get("https://adactinhotelapp.com/");
		
		// Pass Username and Password
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@name='login']")).click();

	}

}

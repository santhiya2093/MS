package com.DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataRead {
	static WebDriver driver;

	public static void username() throws IOException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");

		List<Object> li = new ArrayList<>();

		File f = new File("C:\\Users\\Admin\\eclipse-workspace\\LavenderProject\\data\\read.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(1);
		int numberOfRows = sheetAt.getPhysicalNumberOfRows();
		for (int i = 0; i < numberOfRows; i++) {

			Row row = sheetAt.getRow(i);

			Cell cell = row.getCell(0);

			CellType cellType = cell.getCellType();

			if (cellType.equals(cellType.STRING)) {
				String value = cell.getStringCellValue();
				li.add(value);
			} else if (cellType.equals(cellType.NUMERIC)) {
				double cellValue = cell.getNumericCellValue();
				int v = (int) cellValue;
				System.out.println(v);
			}
		}
		System.out.println(li);
		// Get 8th value from list
		Object object = li.get(7);
		// Narrowing - Higher datatype to lower datatype
		String uname = (String) object;
		driver.findElement(By.id("username")).sendKeys(uname);
		System.out.println("Username:" + uname);
	}

	public static void password() throws IOException {

		List<Object> li = new ArrayList<>();
		File f = new File("C:\\Users\\Admin\\eclipse-workspace\\LavenderProject\\data\\read.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(1);
		int numberOfRows = sheetAt.getPhysicalNumberOfRows();
		for (int i = 0; i < numberOfRows; i++) {

			Row row = sheetAt.getRow(i);

			Cell cell = row.getCell(1);

			CellType cellType = cell.getCellType();

			if (cellType.equals(cellType.STRING)) {
				String value = cell.getStringCellValue();
				li.add(value);
			} else if (cellType.equals(cellType.NUMERIC)) {
				double cellValue = cell.getNumericCellValue();
				int v = (int) cellValue;
				System.out.println(v);
			}

		}
		System.out.println(li);
		// Get 8th value from list
		Object object = li.get(7);
		// Narrowing
		String pass = (String) object;
		driver.findElement(By.id("password")).sendKeys(pass);
		System.out.println("Password:" + pass);
		//driver.findElement(By.id("login")).click();
	}

	public static void main(String[] args) throws IOException {

		username();
		password();

	}
}
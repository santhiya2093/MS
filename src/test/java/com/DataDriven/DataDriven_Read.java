package com.DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven_Read {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\Admin\\eclipse-workspace\\LavenderProject\\data\\read.xlsx");
		FileInputStream fis = new FileInputStream(f);
		// Workbook
		Workbook wb = new XSSFWorkbook(fis);
		// Sheet
		Sheet sheetAt = wb.getSheetAt(0);
		// row
		Row row = sheetAt.getRow(1);
		// cell
		Cell cell = row.getCell(3);
		// cell Type
		CellType cellType = cell.getCellType();

		// Check cellType condition
		if (cellType.equals(cellType.STRING)) {
			System.out.println(cell.getStringCellValue());
		}

		else if (cellType.equals(cellType.BOOLEAN)) {
			System.out.println(cell.getBooleanCellValue());

		}

		else if (cellType.equals(cellType.NUMERIC)) {
			double numericCellValue = cell.getNumericCellValue();
			System.out.println(numericCellValue);
		}

		else {
			System.out.println(cell.getDateCellValue());

		}
	}
}

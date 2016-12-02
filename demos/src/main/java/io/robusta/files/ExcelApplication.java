package io.robusta.files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.formula.functions.Column;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelApplication {

	public static void main(String[] args) throws IOException {

		ExcelApplication app = new ExcelApplication();
		app.readExcel();

	}

	void readExcel() throws IOException {
		String executionPath = System.getProperty("user.dir");
		String excelPath = executionPath + "/files/training.xlsx";

		XSSFWorkbook workbook = new XSSFWorkbook(excelPath);
		XSSFSheet sheet = workbook.getSheetAt(0);

		Row FRow = sheet.getRow(9);

		Cell cellF5 = FRow.getCell(5);
		System.out.println(cellF5);

		cellF5.setCellValue("\\HELLO/");

		// sheet.getCellComment(row, column)

		for (Row row : sheet) {

			for (Cell cell : row) {
				System.out.print(cell + ";");
			}
			System.out.println(); // saute une ligne

		}
		workbook.write(new FileOutputStream(new File(excelPath)));
		workbook.close();

	}

}

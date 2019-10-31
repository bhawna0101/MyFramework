package com.crm.qa.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

	public static void main(String[] args) throws IOException {
		File filename = new File("D://EclipseWorksapce//MyFrameworkArt//src//main//java//com//crm//qa//testdata//Worksheet.xlsx");

		FileInputStream fis = new FileInputStream(filename);
		Workbook TestWorkbook = new XSSFWorkbook(fis);
		//String fileExtensionName = filename.substring("Worksheet.xlsx".indexOf("."));
		//System.out.println(fileExtensionName);

		// Workbook wb = new hssf
		
		Sheet testSheet = TestWorkbook.getSheet("Sheet1");
		int rowcount = testSheet.getLastRowNum()-testSheet.getFirstRowNum();
		for (int i = 0; i < rowcount+1; i++) {

	        Row row = testSheet.getRow(i);

	        //Create a loop to print cell values in a row

	        for (int j = 0; j < row.getLastCellNum(); j++) {

	            //Print Excel data in console

	            System.out.print(row.getCell(j).getStringCellValue()+"|| ");

	        }

	}
	}

}

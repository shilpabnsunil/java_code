package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Datadriven_excel_1method {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//Step1 :- where EXCEL sheet Located ,Path of Excel sheet
		FileInputStream file1=new FileInputStream("C:\\Users\\user\\eclipse-workspace\\Selenium_Learning\\DataSheet\\excel_data.xlsx");
		//Step2 :- Open Excel Sheet
		Workbook w1=WorkbookFactory.create(file1);
		//step3:- open sheet
		Sheet s1=w1.getSheet("login");
		//step4:- get Row
		Row r1=s1.getRow(1);
		//step5:- get column
		Cell c1=r1.getCell(0);
		//step6:-get cell value
		String username=c1.getStringCellValue();
		System.out.println(username);
		
		//To Get another row /column value 
		Row r2=s1.getRow(1);
		Cell c2=r2.getCell(1);
		String password=c2.getStringCellValue();
		System.out.println(password);
	}

}

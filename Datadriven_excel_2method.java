package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Datadriven_excel_2method {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file1=new FileInputStream("C:\\Users\\user\\eclipse-workspace\\Selenium_Learning\\DataSheet\\excel_data.xlsx");
		Workbook w1=WorkbookFactory.create(file1);
		String username=w1.getSheet("login").getRow(1).getCell(0).getStringCellValue();
		String password=w1.getSheet("login").getRow(1).getCell(1).getStringCellValue();
		System.out.println(username);
		System.out.println(password);
	}

}

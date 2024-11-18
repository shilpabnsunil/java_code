package testng_program;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fectch_Data_From_Excel {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		//step 1:let the java know where exctaly is sheet present
	FileInputStream f1=new FileInputStream("C:\\Users\\user\\eclipse-workspace\\Selenium_Learning\\DataSheet\\excel_data.xlsx");
		//2 open the excel sheet
	Workbook w1=	WorkbookFactory.create(f1);
	//3 go to the actual  sheet
		Sheet s1=			w1.getSheet("login");
			Row r1=	s1.getRow(1);
			Cell c1=	r1.getCell(0);
			String un=		c1.getStringCellValue();
			System.out.println(un);
			Row r2=	s1.getRow(1);
			Cell c2=		r2.getCell(1);
			String password=	c2.getStringCellValue();
			System.out.println(password);
			
			

	}
	

}

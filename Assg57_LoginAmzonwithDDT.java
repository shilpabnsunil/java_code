package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assg57_LoginAmzonwithDDT {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream f1=new FileInputStream("C:\\Users\\user\\eclipse-workspace\\Selenium_Learning\\DataSheet\\excel_data.xlsx");
	    Workbook w1=WorkbookFactory.create(f1);
	    String username=w1.getSheet("Amzon_login").getRow(1).getCell(0).getStringCellValue();
		String password=w1.getSheet("Amzon_login").getRow(1).getCell(1).getStringCellValue();
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement sign_in=driver.findElement(By.id("nav-link-accountList"));
		sign_in.click();
		
		WebElement e1=driver.findElement(By.id("ap_email"));
		e1.sendKeys(username);
		WebElement e2=driver.findElement(By.id("continue"));
		e2.click();
		
		WebElement e3=driver.findElement(By.name("password"));
		e3.sendKeys(password);
		WebElement e4=driver.findElement(By.id("signInSubmit"));
		e4.click();
		
	
	
	
	}

}

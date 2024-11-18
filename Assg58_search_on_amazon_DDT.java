package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assg58_search_on_amazon_DDT {
	
public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream f1=new FileInputStream("C:\\Users\\user\\eclipse-workspace\\Selenium_Learning\\DataSheet\\excel_data.xlsx");
	    Workbook w1=WorkbookFactory.create(f1);
	    String product_search=w1.getSheet("search_on_Amazon").getRow(0).getCell(0).getStringCellValue();
		
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		WebElement e1=driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys(product_search);
		e1.sendKeys(Keys.ENTER);
}

}

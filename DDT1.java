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

public class DDT1 {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Ftag%3Dgoogmantxtmob170-21%26ascsubtag%3D_k_CjwKCAjw6c63BhAiEiwAF0EH1J_n6mZDuH2Y1Nh65f3T_W_BEIGI5REPxg-thu0tlrVaUQSF17S4ERoChfsQAvD_BwE_k_%26ref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		WebElement e1=driver.findElement(By.xpath("//input[@name='email']"));
		
		FileInputStream f1=new FileInputStream("C:\\Users\\user\\eclipse-workspace\\Selenium_Learning\\DataSheet\\excel_data.xlsx");
		//2 open the excel sheet
	Workbook w1=	WorkbookFactory.create(f1);
	//3 go to the actual  sheet
		Sheet s1=			w1.getSheet("login");
			Row r1=	s1.getRow(1);
			Cell c1=	r1.getCell(0);
			String un=		c1.getStringCellValue();
		e1.sendKeys(un);
			
		//e1.sendKeys("shilpabnjs4@gmail.com");
		WebElement e2=driver.findElement(By.xpath("//input[@id='continue']"));
		e2.click();
		
		WebElement e3=driver.findElement(By.xpath("//input[@id='ap_password']"));
		Row r2=	s1.getRow(1);
		Cell c2=		r2.getCell(1);
		String password=	c2.getStringCellValue();
		e3.sendKeys(password);
		//e3.sendKeys("198ghtsda");
		WebElement e4=driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		e4.click();

	}

}

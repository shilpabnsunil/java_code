package basic_selenium_program;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assg19_31_fileupload_dropdown {
	
	public static void main(String[] args) throws AWTException {
		
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/registration/");
		
		WebElement e1=driver.findElement(By.id("fname"));
		e1.sendKeys("Shilpa");
		
		WebElement e2=driver.findElement(By.id("lname"));
		e2.sendKeys("B N");
		
		WebElement e3=driver.findElement(By.id("email"));
		e3.sendKeys("shilpab@gmail.com");
		
		WebElement e4=driver.findElement(By.id("password"));
		e4.sendKeys("12345678");
		
		WebElement e5=driver.findElement(By.id("Female"));
		e5.click();

		
		WebElement e6=driver.findElement(By.id("Skills"));
		Select s1=new Select(e6);
		s1.selectByValue("select1");
		
		WebElement e7=driver.findElement(By.id("Country"));
		Select s2=new Select(e7);
		s2.selectByVisibleText("India");
		
		
		WebElement e8=driver.findElement(By.id("technicalskills"));
		Select s3=new Select(e8);
		s3.selectByVisibleText("Manual Testing");
	

		WebElement e9=driver.findElement(By.id("Present-Address"));
		e9.sendKeys("rajajinagar,bangalore");
		
		WebElement e10=driver.findElement(By.id("Permanent-Address"));
		e10.sendKeys("rajajinagar,bangalore");
		
		WebElement e11=driver.findElement(By.id("Pincode"));
		e11.sendKeys("560010");
		
		WebElement e12=driver.findElement(By.id("Relegion"));
		Select s4=new Select(e12);
		s4.selectByVisibleText("Hindu");
		
		WebElement fileupload=driver.findElement(By.id("file"));
		fileupload.sendKeys("C:\\Users\\user\\Documents\\dummy-pdf_2.pdf");
		
		
		WebElement e13=driver.findElement(By.id("relocate"));
		e13.click();
		
		
		WebElement e14=driver.findElement(By.name("Submit"));
		e14.click();
		
		
		
	}

}

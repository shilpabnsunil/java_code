package assertion_java;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyLogoutPageAmazon_asserrsion {
	
	@Test
	public void Verify_LogoutPage_Asserrsion() throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement sign_button=driver.findElement(By.id("nav-link-accountList"));
		Actions a1=new Actions(driver);
		a1.moveToElement(sign_button).perform();
		sign_button.click();
		
		WebElement UN=driver.findElement(By.xpath("//input[@name='email']"));
		UN.sendKeys("shilpabnjs4@gmail.com");
		
		WebElement cont=driver.findElement(By.xpath("//input[@id='continue']"));
		cont.click();
		
		WebElement PWD=driver.findElement(By.xpath("//input[@id='ap_password']"));
		PWD.sendKeys("Shjs42013$");
		PWD.sendKeys(Keys.ENTER);
		
		WebElement hover=driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		Actions a2=new Actions(driver);
		a2.moveToElement(hover).perform();
		
		WebElement logout=driver.findElement(By.xpath("//span[.='Sign Out']"));
		logout.click();
		
		Thread.sleep(2000);
		//using assertion we are verifying after logout enter email id field is present or not 
		WebElement email_textfield=driver.findElement(By.xpath("//input[@id='ap_email']"));
		Assert.assertEquals(email_textfield.isDisplayed(), true);
		
		
	}

}

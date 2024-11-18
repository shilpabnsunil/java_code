package testng_program;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Asserssion2 {
	
	@Test
	public static void amazon_logout() throws InterruptedException
	{
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.Amazon.in/");
		Thread.sleep(1000);
		WebElement e1=driver.findElement(By.id("nav-link-accountList"));
		Actions a1=new Actions(driver);
		a1.moveToElement(e1).perform();
		e1.click();
		
		WebElement UN=driver.findElement(By.xpath("//input[@name='email']"));
		UN.sendKeys("vishwasgowda20@gmail.com");
		
		WebElement cont=driver.findElement(By.xpath("//input[@id='continue']"));
		cont.click();
		
		WebElement PWD=driver.findElement(By.xpath("//input[@id='ap_password']"));
		PWD.sendKeys("thehulk001");
		PWD.sendKeys(Keys.ENTER);
		
		WebElement hover=driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		Actions a2=new Actions(driver);
		a2.moveToElement(hover).perform();
		
		WebElement logout=driver.findElement(By.xpath("//span[.='Sign Out']"));
		logout.click();
		
		WebElement signin=driver.findElement(By.xpath("//h1[@class='a-spacing-small']"));
		boolean b1=signin.isDisplayed();
		Assert.assertEquals(b1, true);
	}

}

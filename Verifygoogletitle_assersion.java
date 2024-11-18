package assertion_java;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Verifygoogletitle_assersion {
	
	@Test
	public void pagetitle()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		//verifying page title using assertion 
		//excepted is hand written as google 
		//actual is coming from pre-defined method
		Assert.assertEquals(driver.getTitle(), "Google");
		
		WebElement e1=driver.findElement(By.name("q"));
		e1.sendKeys("India" + Keys.ENTER);
		
		
	}

}

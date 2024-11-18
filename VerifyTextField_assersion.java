package assertion_java;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyTextField_assersion {
	
	@Test
	public void pagetitle()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");	
		WebElement search_textfield=driver.findElement(By.name("q"));
		//verifying search_textfield is displayed using assertion 
		//excepted is hand written as google 
		//actual is coming from pre-defined method
		//using method isDisplayed() we are verifying search text field is displayed or not
		Assert.assertEquals(search_textfield.isDisplayed(), true);
		search_textfield.sendKeys("India" + Keys.ENTER);
		
		
	}

}

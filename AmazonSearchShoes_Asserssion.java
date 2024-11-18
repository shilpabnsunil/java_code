package assertion_java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonSearchShoes_Asserssion {
	
	@Test
	public void verify_searchdata_present() throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement e1=driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("shoes");
		e1.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		//here to verify multiple search shoes is displayed using collect list concept
		List<WebElement> li=driver.findElements(By.tagName("a"));
			
		Assert.assertEquals(li.size()>100,true);
	}

}

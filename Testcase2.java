package amazon_tests;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Testcase2 extends LunchBrowser
{

	@Test
	public void Add_product_cart()
	{
		WebElement e1=	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));

		e1.sendKeys("shoes");
		e1.sendKeys(Keys.ENTER);
		WebElement e2=driver.findElement(By.xpath("(//div[@class='s-image-padding'])[1]"));
		e2.click();
		
		Set<String> s1=driver.getWindowHandles();
		
		Iterator<String> l1=s1.iterator();
		String parentId=l1.next();
		String ChildId=l1.next();
		
		driver.switchTo().window(ChildId);
		
		WebElement e3=driver.findElement(By.id("add-to-cart-button"));
		e3.click();
	}
	
}

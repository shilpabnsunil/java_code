package basic_selenium_program;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assg33_Amazon_additem_cart {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement e1=driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("Shoes"+Keys.ENTER);
		
		Thread.sleep(1000);
		
		WebElement e2=driver.findElement(By.xpath("(//div[@class='s-image-padding'])[1]"));
		e2.click();
		
		Set<String> s1=driver.getWindowHandles();
		System.out.println(s1);
		
		Iterator<String> l1=s1.iterator();
		String parentId=l1.next();
		String ChildId=l1.next();
		
		driver.switchTo().window(ChildId);
		
		WebElement e3=driver.findElement(By.id("add-to-cart-button"));
		e3.click();
		
	}

}

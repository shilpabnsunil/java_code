package basic_selenium_program;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assg21_amazonautosuggtion {
	
public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement e1=driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("shoes");

		Thread.sleep(1000);
		List<WebElement> e2=driver.findElements(By.xpath("//div[@class='s-suggestion-container']"));
	     e2.get(1).click();
		
	}
	
	

}

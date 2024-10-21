package basic_selenium_program;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assg20_google6thautosuggestion {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		WebElement e1=driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		e1.sendKeys("Bangalore");
		Thread.sleep(1000);
		List<WebElement> l1=driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
	     l1.get(5).click();
		
	}


}

package basic_selenium_program;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assg5_SearchOnYoutube {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		Thread.sleep(2000);
		WebElement e1=driver.findElement(By.name("search_query"));
		e1.sendKeys("GroTechMinds");
		e1.sendKeys(Keys.ENTER);
	}

}

package basic_selenium_program;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assg42_Youtubesearch_scroll_Infinte {
	
public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		
		Thread.sleep(3000);
		WebElement e1=driver.findElement(By.name("search_query"));
		e1.sendKeys("India");
		e1.sendKeys(Keys.ENTER);
		
		Point p1=e1.getLocation();//points to location 
		int x=p1.getX();//get x coordinator
		int y=p1.getY();//get y coordinator
		
		System.out.println(x);
		System.out.println(y);
		
		
		
		Thread.sleep(3000);
		//ctrl+shift+o it will import javascriptExecutor
		JavascriptExecutor j1=driver;//upcasting driver to javascript executor
		j1.executeScript("window.scrollBy(0,"+y+")");//page scroll down,y coordinate will come positive value  
		
		
	}

}

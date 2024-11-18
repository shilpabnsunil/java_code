package basic_selenium_program;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		WebElement e1=driver.findElement(By.name("q"));
		e1.sendKeys("Bangalore");
		Thread.sleep(1000);
		List<WebElement> l1=driver.findElements(By.xpath("(//div[@class='OBMEnb'])/ul/li"));
	     //l1.get(5).click();to get particular index auto suggestion to print
		int count=l1.size();
		//System.out.println(count);
		
		l1.get(count-1).click();//Gives last auto suggestionex:- 13-1=12--> last one  
		//l1.get(count-10).click();//Gives first auto suggestion
		
	}

}

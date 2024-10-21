package basic_selenium_program;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assg24_amazonprintAllAutoSuggestion {
	
	
public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement e1=driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("shoes");

		Thread.sleep(1000);
		List<WebElement> li=driver.findElements(By.xpath("//div[@class='s-suggestion-container']"));
		int count=li.size();
	 	System.out.println(count);
	 	//e2.get(count-1).click();
	 	for(int i=0;i<count;i++)
		{
			WebElement e2=li.get(i);
			String s1=e2.getText();
			System.out.println(s1);
		}
		
		
	}

}

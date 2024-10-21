package basic_selenium_program;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assg23_PrintAllgoogleautosuggestion {
	
	
public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		WebElement e1=driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		e1.sendKeys("Bangalore");

		Thread.sleep(1000);
		List<WebElement> li=driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
	    int count=li.size();
	 	System.out.println(count);
	 	//e2.get(count-1).click();
	 	for(int i=0;i<count;i++)
		{
			WebElement e3=li.get(i);
			String s1=e3.getText();
			System.out.println(s1);
		}
		
	}

}

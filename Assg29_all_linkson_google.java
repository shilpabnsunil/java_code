package basic_selenium_program;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assg29_all_linkson_google {
	public static void main(String[] args) {

	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	
	List<WebElement> li=driver.findElements(By.tagName("a"));
	int count=li.size();
	System.out.println(count);
	
	for(int i=0;i<count;i++)
	{
		WebElement e1=li.get(i);
		String s1=e1.getText();
		System.out.println(s1);
	}
	
	
	
	
	
	}	

}

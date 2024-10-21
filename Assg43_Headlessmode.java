package basic_selenium_program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Assg43_Headlessmode {
	
public static void main(String[] args) {
	
	//running program in headless mode
	ChromeOptions c1=new ChromeOptions();
	c1.addArguments("--headless");
	
		
		ChromeDriver driver=new ChromeDriver(c1);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement e1=driver.findElement(By.id("searchDropdownBox"));
		Select s1=new Select(e1); 
	    s1.selectByVisibleText("Computers & Accessories");
	}

}

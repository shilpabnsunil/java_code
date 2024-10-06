package basic_selenium_program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assg12_TagNameLocator {
	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/user/Desktop/learningHTML1%20-%20Copy.html");
		
		WebElement e1=driver.findElement(By.tagName("a"));
		e1.click();
	}

}

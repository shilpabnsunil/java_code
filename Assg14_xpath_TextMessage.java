package basic_selenium_program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assg14_xpath_TextMessage
{
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(1000);
		//xpath by using text message
		WebElement e1=driver.findElement(By.xpath("(//span[.='Fashion'])[2]"));
		e1.click();
		}

}

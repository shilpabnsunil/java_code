package basic_selenium_program;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assg11_relative_amozonlogin {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(1000);
		WebElement e1=driver.findElement(By.xpath("//input[@name='field-keywords']"));
		e1.sendKeys("mobile");
		e1.sendKeys(Keys.ENTER);
	}

}

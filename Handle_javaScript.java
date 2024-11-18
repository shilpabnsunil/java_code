package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_javaScript {
	
	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/javascript-popup/");
		
		WebElement e1=driver.findElement(By.xpath("//div[@class='elementor-shortcode']"));
		e1.click();
		
		//handle javascript popup
		driver.switchTo().alert().accept();
		
		
	}

}

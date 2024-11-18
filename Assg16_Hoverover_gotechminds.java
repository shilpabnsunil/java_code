package basic_selenium_program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Assg16_Hoverover_gotechminds{
	public static void main(String[] args) throws InterruptedException {
		
	
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://grotechminds.com/hoverover/");
	Thread.sleep(1000);
	WebElement e1=driver.findElement(By.xpath("//div[@class='has_eae_slider elementor-element elementor-element-1857001 e-con-full e-flex e-con e-child']"));
	Actions a1=new Actions(driver);
	a1.moveToElement(e1).perform();
	
	Select s1=new Select(e1);
	s1.selectByIndex(1);
	
}
}

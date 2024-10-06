package basic_selenium_program;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class Assg15_Hoverover_language_amazon {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.Amazon.in/");
		Thread.sleep(1000);
		WebElement e1=driver.findElement(By.id("icp-nav-flyout"));
		Actions a1=new Actions(driver);
		a1.moveToElement(e1).perform();
		e1.click();
		
		WebElement e2=driver.findElement(By.xpath("(//span[@id='icp-language-translation-hint'])[4]"));
		e2.click();
		
		
		
		
		
	}

}

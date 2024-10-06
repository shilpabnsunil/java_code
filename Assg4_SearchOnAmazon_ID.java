package basic_selenium_program;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assg4_SearchOnAmazon_ID {
	
	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=713930224968&hvpos=&hvnetw=g&hvrand=10953594325258451766&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062067&hvtargid=kwd-10573980&hydadcr=14453_2402227&gad_source=1");
		WebElement e1=driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("Coffee powder");
		e1.sendKeys(Keys.ENTER);
	}

}

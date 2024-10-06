package basic_selenium_program;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assg6_LinkedText_Locator {
	
	public static void main(String[] args) {
	
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=713930225169&hvpos=&hvnetw=g&hvrand=11439761771790313633&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062067&hvtargid=kwd-64107830&hydadcr=14452_2402225&gad_source=1");
	driver.manage().window().maximize();
	WebElement e1=driver.findElement(By.linkText("Mobiles"));
	e1.click();
	
	
	}

}

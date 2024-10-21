package basic_selenium_program;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assg36_storscreenshot_wrong_location {
	public static void main(String[] args) throws IOException {
		
	
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://grotechminds.com/javascript-popup/");
	
	TakesScreenshot ts=driver;
	File Source=ts.getScreenshotAs(OutputType.FILE);
	File Destination=new File("K:\\Users\\user\\Documents\\"+new Assg35_screenshot()+driver.getClass()+Math.random()+".png");
	//storeing file in wrong location k drive wic is not present 
	FileHandler.copy(Source, Destination);
	//"java.io.FileNotFoundException:"==exception displays 
	}
}

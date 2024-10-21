package basic_selenium_program;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class Assg35_screenshot {
public static void main(String[] args) throws IOException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		TakesScreenshot ts=    driver;//ctrl+shift+o  screenshot interface will import
		
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\user\\Documents\\"+new Assg35_screenshot()+driver.getClass()+Math.random()+".png");
		 
		FileHandler.copy(source, destination);//storing screenshot source to destination place 
		
		
		
		
	}

}

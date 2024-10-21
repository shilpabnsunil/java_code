package basic_selenium_program;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assg37_screenshot_currentTime {
	
	public static void main(String[] args) throws IOException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		//Code for current time 
		
		Date d1=new Date();
		Date Current_Time=new Date(d1.getTime() +(1000*60*60*24*0));
		System.out.println(Current_Time);
		
		String s1=Current_Time.toString();
		String s2=s1.replaceAll("[ :]","");
		

		//code for screen shot 
        TakesScreenshot ts=    driver;//ctrl+shift+o  screenshot interface will import
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\user\\Documents\\"+s2+new Assg37_screenshot_currentTime()+driver.getClass()+Math.random()+".png");
		FileHandler.copy(source, destination);
		
		
		
	}

}

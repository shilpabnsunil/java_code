package programs;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot1 {

	public static void main(String[] args) throws IOException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		TakesScreenshot ts=    driver;//ctrl+shift+o  screenshot interface will import
		
		File source=ts.getScreenshotAs(OutputType.FILE);
		//File destination=new File("C:\\Users\\user\\Documents\\test1.png");//file name is hard coded one screendhot 
		//it will take again run screenshot will be overridden
		//File destination=new File("C:\\Users\\user\\Documents\\test1"+Math.random()+".png");
		//math.random will takedifferent screenshot with different ids
		//creating object of object class and getting class name by its get.class method 
		File destination=new File("C:\\Users\\user\\Documents\\"+new Screenshot1()+driver.getClass()+Math.random()+".png");
		//above code screenshot name will store by its packagename+class name+random number.png 
		FileHandler.copy(source, destination);//storing screenshot source to destination place 
		
		
		
		
	}
}

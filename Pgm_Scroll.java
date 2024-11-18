package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pgm_Scroll {
	
public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement e1=driver.findElement(By.xpath("//a[.='About Amazon']"));
		Point p1=e1.getLocation();//points to location 
		int x=p1.getX();//get x coordinator
		int y=p1.getY();//get y coordinator
	
		System.out.println(x);
		System.out.println(y);
		
		//ctrl+shift+o it will import javascriptExecutor
		JavascriptExecutor j1=driver;//upcasting driver to javascript executor
		j1.executeScript("window.scrollBy(0,"+y+")");//page scroll down,y coordinate will come positive value  
		
		/*Thread.sleep(2000);
		
		j1.executeScript("window.scrollBy(0,"+-y+")");// page scroll up ,y coordinate will come negative value 
*/
	}
	
	
}

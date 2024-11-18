package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Coordinatex_y {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement e1=driver.findElement(By.xpath("//a[.='About Amazon']"));
		Point p1=e1.getLocation();//points to location 
		int x=p1.getX();
		int y=p1.getY();
		System.out.println(x);
		System.out.println(y);
		
		
	}

}

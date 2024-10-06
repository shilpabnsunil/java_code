package basic_selenium_program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assg17_18_draganddrop {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/drag-and-drop/");
		
		WebElement e1=driver.findElement(By.xpath("//div[@id='container-10']"));
		WebElement e2=driver.findElement(By.xpath("//div[@id='div2']"));
		
		Actions a1=new Actions (driver);
		a1.dragAndDrop(e1, e2).perform();
		//Thread.sleep(1000);
		
		WebElement e3=driver.findElement(By.xpath("//img[@id='drag11']"));
		WebElement e4=driver.findElement(By.xpath("//div[@id='container-10']"));
		
		Actions a2=new Actions(driver);
		a2.dragAndDrop(e3, e4).perform();
	}
}

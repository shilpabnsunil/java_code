package testng_program;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class TestCase1 
{
	@Test
	public void scenerio1() throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		WebElement e1=driver.findElement(By.xpath("//input[@name='q']"));
		e1.sendKeys("Mobiles");

		Thread.sleep(1000);
		List<WebElement> e2=driver.findElements(By.xpath("//a[@class='oleBil']"));
	    int count=e2.size();
	 	System.out.println(count);
	 	
	 	for(int i=0;i<count;i++)
	 	{
	 		WebElement tt=e2.get(i);
	 		String s1=tt.getText();
	 		
	 		System.out.println(s1);
	 	}
		
	}
	
}

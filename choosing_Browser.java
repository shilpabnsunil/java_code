package crossBroswer_ParallelTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class choosing_Browser {
	
	WebDriver driver;
	@Test
	@Parameters("browser")
	
	public void testcase1(String nameofbrowser)
	{
	
	if(nameofbrowser.equals("chrome"))
	{
		driver=new ChromeDriver();
	}

	if(nameofbrowser.equals("firefox"))
	{
		driver=new FirefoxDriver();
	}
	
	if(nameofbrowser.equals("edge"))
	{
		driver=new EdgeDriver();
	}
	
	driver.get("https://www.amazon.in");
	driver.manage().window().maximize();
	
	WebElement e1=driver.findElement(By.id("twotabsearchtextbox"));
	e1.sendKeys("Power of Minds");
	e1.sendKeys(Keys.ENTER);
}
	
}

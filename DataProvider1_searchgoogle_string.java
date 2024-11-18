package dataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1_searchgoogle_string {
	@DataProvider(name="set1")
	public Object[][] method1()
	{
		return new Object[][] {{"India"},{"South Korea"},{"London"}};
	}
	
	@Test(dataProvider="set1")
	public void search_On_google(String input)
	{
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		WebElement e1=driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		e1.sendKeys( input + Keys.ENTER);
	}

}

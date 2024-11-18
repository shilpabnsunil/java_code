package dataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Search10inputs_Amazon {
	
	@DataProvider(name="things_to_search")
	public Object[][] search()
	{
		return new Object[][] {{"Books"},{"shoes"},{"toys"},{"mobiles"},{"computer"},{"TV"},{"Plants"},{"solar"},{"LED lights"},{"pen"}};
		
	}
	
	@Test(dataProvider="things_to_search")
	public void method1(String input) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement e1=driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys(input + Keys.ENTER);
		
		
	}

}

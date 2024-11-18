package groupingtests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Googleseach_retry {
	
	@Test(retryAnalyzer=groupingtests.Retrytestcase.class)
	public void test() {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		WebElement e1=driver.findElement(By.xpath("////textarea[@id='APjFqb']"));
		//above xpath is wrong so this test case 2 times it will retry 
		e1.sendKeys("Bangalore" + Keys.ENTER);
	}

}

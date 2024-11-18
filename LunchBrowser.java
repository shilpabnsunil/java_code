package amazon_tests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class LunchBrowser {
	
	WebDriver driver;
	@BeforeMethod
	@Parameters("browser")
	
	
	public void drivers(String browsername) throws InterruptedException
	{
		if(browsername.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		driver.get("https://www.Amazon.in/");
		
	
	}
	
	@AfterMethod
	public void logout()
	{
	
		
		driver.close();
	}

}

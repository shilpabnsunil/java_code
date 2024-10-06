package basic_selenium_program;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Assg1_Lunch_Browser {

	public static void main(String[] args) {

		/*
		  ChromeDriver driver=new ChromeDriver();
		  driver.get("https://www.facebook.com");
		 */

		/*
		  FirefoxDriver driver=new FirefoxDriver();
		  driver.get("https://www.facebook.com");
		 */

		/*
		 * EdgeDriver driver = new EdgeDriver(); driver.get("https://www.facebook.com");
		 */
		
		SafariDriver driver = new SafariDriver();
		driver.get("https://www.facebook.com");

	}

}

package basic_selenium_program;

import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Title {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		Thread.sleep(2000);
		driver.getTitle();
		
		
	}

}

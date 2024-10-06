package basic_selenium_program;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assg8_WindowHandler_Method {
	
	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		String s1=driver.getWindowHandle();	
		System.out.println(s1);
		
		
		
	}

}

package basic_selenium_program;

import org.openqa.selenium.chrome.ChromeDriver;

public class get_titleofpage {
	
	public static void main(String[] args) {
		
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		String Title=driver.getTitle();
		System.out.println(Title);
		
		
	}

}

package broken_Links;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_Broken_Links {
	
	public static void main(String[] args) throws IOException {

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		List<WebElement> li=driver.findElements(By.tagName("a"));
		int count=li.size();
		System.out.println(count);
		
		for(int i=0;i<count;i++)
		{
			WebElement e1=li.get(i);
			String url=e1.getAttribute("href");
			System.out.println(url);
			verifiylinks(url);
		}

}
	
	static void verifiylinks(String url) throws IOException {
		//predefined class in java is URL we are importing using its reference variable
		URL u1=new URL(url);
		//verifying each link is valid are not 
		//oprnConnection is a method of URL and we are upcasting to HttpURLConnection
		HttpURLConnection u2=(HttpURLConnection) u1.openConnection();
		
		//verify linkvslid or not
		if(u2.getResponseCode()==200)
		{
			System.out.println("Link is valid" + "  " + url);
		}
		else
		{
			System.out.println("Link is not valid" + "  " + url);
		}
		
	}
}

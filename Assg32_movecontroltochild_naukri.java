package basic_selenium_program;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assg32_movecontroltochild_naukri {
	
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver(); 
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.xpath("//span[.='Google']"));
		e1.click();
		
		Set<String> s1=driver.getWindowHandles();
		System.out.println(s1);
		
		Iterator<String> l1=s1.iterator();
		String parentId=l1.next();
		String ChildId=l1.next();
		
		System.out.println(parentId);
		System.out.println(ChildId);
		
		driver.switchTo().window(ChildId);
		driver.close();
		
		
	}

}

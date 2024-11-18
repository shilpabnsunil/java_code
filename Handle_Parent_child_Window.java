package programs;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_Parent_child_Window {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.xpath("//span[.='Google']"));
		e1.click();
		//using getwindowhandles finding ids 
		Set<String> s1=driver.getWindowHandles();
		System.out.println(s1);//printing windows ids
		//using iterator we are going to print seperate ids 
		Iterator<String> li=s1.iterator();
		String parentId=li.next();
		String ChildId=li.next();
		
		System.out.println(parentId);
		System.out.println(ChildId);
		
		//driver.close();//close parent window or close window which has control 
		//driver.quit();//close both parent and child window
		driver.switchTo().window(ChildId);//move control from parent window to child window
		driver.close();//control moved to child window to child window will close
	}
}

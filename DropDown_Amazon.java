package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_Amazon {
	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement e1=driver.findElement(By.id("searchDropdownBox"));
		Select s1=new Select(e1);
		//s1.selectByIndex(3); //select by index it is selecting from drop down
		//s1.selectByValue("search-alias=jewelry"); //select by value it is selecting from drop down 
	     s1.selectByVisibleText("Computers & Accessories");//selecting drop down by visible text
	     
	}

}

package basic_selenium_program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assg9_learning_absolutexpath {
	
	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/user/Desktop/learningHTML1%20-%20Copy.html");
	
		//Absolute xpaths on learning html 
		WebElement e1=driver.findElement(By.xpath("(/html/body/input)[1]"));
		e1.sendKeys("shilpa");
		
		WebElement e2=driver.findElement(By.xpath("(/html/body/input)[2]"));
		e2.sendKeys("birth name");
		
		WebElement e3=driver.findElement(By.xpath("(/html/body/input)[3]"));
		e3.sendKeys("shilpa123");
		
		WebElement e4=driver.findElement(By.xpath("(/html/body/form/input)[1]"));
		e4.sendKeys("shilpa B N");	
		
		WebElement e5=driver.findElement(By.xpath("(/html/body/form/input)[4]"));
		e5.click();
		
		WebElement e6=driver.findElement(By.xpath("(/html/body/form/input)[5]"));
		e6.click();
		
		WebElement e7=driver.findElement(By.xpath("(/html/body/form/input)[6]"));
		e7.click();
		
		
		WebElement e8=driver.findElement(By.xpath("(/html/body/input)[4]"));
		e8.click();
		
		WebElement e9=driver.findElement(By.xpath("(/html/body/input)[5]"));
		e9.click();
		
		WebElement e10=driver.findElement(By.xpath("(/html/body/input)[6]"));
		e10.click();
		
		WebElement e11=driver.findElement(By.xpath("(/html/body/a)"));
		e11.click();
			
	}
	

}

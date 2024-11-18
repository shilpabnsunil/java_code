package dataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Loginwith5inputs_DP {
	
	@DataProvider(name="logins")
	public Object[][] crediantials()
	{
		Object data1[][]=new Object[5][2];
		//1st row data
		data1[0][0]= "shilpa@gmail.com";
		data1[0][1]="12345678";
		//2nd row data
		data1[1][0]="manish@gmail.com";
		data1[1][1]="87654321";
		//3rd row value
		data1[2][0]="dhanvi@gmail.com";
		data1[2][1]="87325342";
		//4rd row value
		data1[3][0]="sunil@gmail.com";
		data1[3][1]="7560192827";
		//5rd row value
		data1[4][0]="hima@gmail.com";
		data1[4][1]="474619433";
		return data1;
		
	}
	
	@Test(dataProvider="logins")
	public void lunch_facebook(String username,String password)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement e1=driver.findElement(By.id("email"));
		e1.sendKeys(username);
		WebElement e2=driver.findElement(By.xpath("//input[@id='pass']"));
		e2.sendKeys(password);
		WebElement login=driver.findElement(By.xpath("(//div[@class='_6ltg'])[1]"));
		login.click();
	}

}

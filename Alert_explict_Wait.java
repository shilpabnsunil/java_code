package synchronization_waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alert_explict_Wait {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
        driver.get("https://grotechminds.com/javascript-popup/");
        driver.manage().window().maximize();
        
        driver.findElement(By.xpath("//button[.='Click ']")).click();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
	}

}

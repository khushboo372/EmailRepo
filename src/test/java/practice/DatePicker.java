package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker {
	WebDriver driver;
	
	@BeforeTest
	public void LaunchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");
		
	}
	@Test
	public void datepicker() throws InterruptedException {
		WebElement frame=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		driver.findElement(By.id("datepicker")).click();
		
		String date="25";
	    String moy="May 2026";
		Thread.sleep(3000);
		
		String givendate=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		
		while(true) {
			if(givendate.equals(moy)) {
				driver.findElement(By.xpath("//tbody/tr/td/a[text()="+date+"]")).click();
				break;
				
			}
				
				
			else {
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			}
			givendate=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
			
			
		}
		
		
		
		
		
	
		
	}

}

package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadFile {
	WebDriver driver;
	
	@BeforeTest
	public  void BrowserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/howto/howto_html_file_upload_button.asp");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));	
		
		
	}
	
	
	@Test
	public void UploadFile() {
		driver.findElement(By.id("myFile")).sendKeys("C:\\Users\\ANUPAM KUMAR\\Downloads\\Comprehension_assignment.pdf");
		
		
	}
	

}

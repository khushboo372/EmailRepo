package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;  //why public static
	
	@BeforeTest
	public void BaseClass1() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://altoro.testfire.net/login.jsp");
		Thread.sleep(2000);
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
	}
		
	

}

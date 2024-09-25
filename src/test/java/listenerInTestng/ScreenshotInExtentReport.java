package listenerInTestng;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(ITestListenerClass2ForScreenshotAndExtentReport.class)
public class ScreenshotInExtentReport  {
	public static WebDriver driver;
	public static JavascriptExecutor js;
	
     @BeforeTest
     public void launchBrowswer() {
    	
			driver = new ChromeDriver();
			js = (JavascriptExecutor) driver;
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
			driver.manage().window().maximize();
     }
     
     @Test
		public void login() {
			driver.get("https://demo.testfire.net/login.jsp");
			driver.findElement(By.id("uid")).sendKeys("jsmith");
			driver.findElement(By.id("passw")).sendKeys("demo1234");
			js.executeScript("document.getElementsByName('btnSubmit')[0].click()");
			System.out.println("Login Successfull");
			Assert.assertEquals(false, true);
			System.out.println("login not success");
     }	
}

package testNGCode;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoTest {
	public static WebDriver driver;
	public static JavascriptExecutor js;
	SoftAssert softass=new SoftAssert();

	@BeforeTest
	public void init() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		js = (JavascriptExecutor) driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().window().maximize();

	}
// This is a login test  
	@Test
	public void login() {
		driver.get("https://demo.testfire.net/login.jsp");
		driver.findElement(By.id("uid")).sendKeys("jsmith");
		driver.findElement(By.id("passw")).sendKeys("demo1234");
		js.executeScript("document.getElementsByName('btnSubmit')[0].click()");
		System.out.println("Login Successfull");
	
//		boolean b=driver.findElement(By.xpath("//font[text()='Sign Off']")).isDisplayed();
//		Assert.assertEquals(b, true,"not login");
//		System.out.println("check again");
	}
		
//		softass.assertEquals(false, true);
//		System.out.println("login not success");
//		softass.assertAll();
		
		
	//@Test
	public void verifyLogin() {
		WebElement signoff=driver.findElement(By.xpath("//font[text()='Sign Off']"));
		if(signoff.isDisplayed()) {
			System.out.println("user login success");
		}
		
		
	}	
	
	//@AfterTest
	public void teardown() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
	}
}

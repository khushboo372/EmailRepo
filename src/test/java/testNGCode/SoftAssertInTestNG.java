package testNGCode;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SoftAssertInTestNG {
	WebDriver driver;
	SoftAssert sfassert = new SoftAssert();
	JavascriptExecutor js;
	
	
	@BeforeTest
	
	public void BrowserLaunch() {
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    js = (JavascriptExecutor) driver;
	    driver.manage().window().maximize();
		
	}
	
	
	@Test
	public void UrlLaunch()
	{
//		driver.get("https://demo.testfire.net/login.jsp");
//		driver.findElement(By.id("uid")).sendKeys("jsmith");
//		driver.findElement(By.id("passw")).sendKeys("demo1234");
//		js.executeScript("document.getElementsByName('btnSubmit')[0].click()");
//		System.out.println("Login successfull");
		
		driver.get("https://demo.testfire.net/login.jsp");
		driver.findElement(By.id("uid")).sendKeys("jsmith");
		driver.findElement(By.id("passw")).sendKeys("demo1234");
		js.executeScript("document.getElementsByName('btnSubmit')[0].click()");
		System.out.println("url Launch Successfull");
	}
	
	
	@Test
	
	public void verifyLogin() {
	 String expected="Hello John Smith";	
	 String actual=driver.findElement(By.xpath("//h1[contains(text(),'Hello')]")).getText();
//	 sfassert.assertEquals(actual,expected,"not login");
	 System.out.println(expected);
	 System.out.println(actual);
	 
	 System.out.println("Login successfull");	 
	}
	
	@Test
	public void verifyLogin1()
	{
		String actual=driver.getCurrentUrl();
		String expected="https://demo.testfire.net/bank/main.jsp";
//		sfassert.assertEquals(actual,expected);
//		sfassert.assertAll();
		
	}
	@Test
	public void dropdown() {
		List<WebElement> web=driver.findElements(By.id("listAccounts"));
		for(WebElement ws:web) {
	    String str=ws.getText();	
		Select sc=new Select(ws);
		sc.selectByIndex(1);
		System.out.println(str);
		}
		driver.findElement(By.id("btnGetAccount")).click();
	}
	
	
	
	
	@AfterTest
	public void browserclose() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
		driver.quit();
		
	}
	

}

package testNGCode;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

		public class HardAssertInTestng {
			public static WebDriver driver;
			public static JavascriptExecutor js;
			SoftAssert softass=new SoftAssert();

			@BeforeTest
			public void init() {
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
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
				softass.assertEquals(false, true);
				System.out.println("login not success");
				softass.assertAll();
				
				
				
			}
			@Test
			public void verifyLogin() {
			String expected="Hello John Smith";
			 WebElement we=	driver.findElement(By.xpath("//h1[contains(text(),'Hello')]"));
			 String st= we.getText();
			 System.out.println(st);
			 Assert.assertEquals(st, expected,"login  not successfull phir se");
			 
			}		
			@Test
			public void verifyLogin1() {
				WebElement signoff=driver.findElement(By.xpath("//font[text()='Sign Off']"));
				if(signoff.isDisplayed()) {
					System.out.println("user login success");
				}
				
			}
			
			@Test
			public void verifyLogin2() {
				boolean b=driver.findElement(By.xpath("//font[text()='Sign Off']")).isDisplayed();
				Assert.assertEquals(b, true,"Not showing and login");
				System.out.println("user login phir se");
			}
			
			@AfterTest
			public void teardown() throws InterruptedException {
				Thread.sleep(2000);
				driver.close();
			}
		


	}



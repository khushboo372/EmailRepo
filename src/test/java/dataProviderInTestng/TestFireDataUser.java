package dataProviderInTestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestFireDataUser {
	@Test(dataProvider="Provider",dataProviderClass=TestFireDataProvider.class)
	public void Login(String uname,String pwd) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("http://altoro.testfire.net/login.jsp");	
		driver.findElement(By.id("uid")).sendKeys(uname);	
		driver.findElement(By.id("passw")).sendKeys(pwd);
		Thread.sleep(1000);
		driver.findElement(By.name("btnSubmit")).click();		
		boolean b=driver.findElement(By.xpath("//font[text()='Sign Off']")).isDisplayed();
		 
		Assert.assertEquals(b,true,"not login" );
		
        driver.close();
        driver.quit();
		
		
	}

}

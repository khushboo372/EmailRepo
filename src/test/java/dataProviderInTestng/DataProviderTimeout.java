package dataProviderInTestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderTimeout {
	@Test(dataProvider="Provider",dataProviderClass=TestFireDataProvider.class,timeOut=2000)
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
	}
}
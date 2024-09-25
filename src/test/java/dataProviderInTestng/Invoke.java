package dataProviderInTestng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Invoke {
  @Test (invocationCount=3)
  public void Randomuser() throws InterruptedException {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  driver.get("https://randomuser.me/");
	  Thread.sleep(3000);
	  String name=driver.findElement(By.id("user_value")).getText();
	  System.out.println(name);
	  Thread.sleep(1000);
	  driver.close();
  }
}

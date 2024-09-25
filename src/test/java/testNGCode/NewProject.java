package testNGCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewProject {
	WebDriver driver;
	
	
  @Test
  public void launchBrowser() {
	  WebDriverManager.edgedriver().setup();
	  driver=new EdgeDriver();
	  driver.navigate().to("https://app.arcfacilities.com/");
	  driver.manage().window().maximize();
	  
  }
  
  @Test
  public void login() {
	  driver.findElement(By.id("UserID")).sendKeys("qatest-interview@yopmail.com");
	  driver.findElement(By.id("Password")).sendKeys("QATest@n");
	  driver.findElement(By.id("btnLogin")).click();
	  
  }
  
  public void switchtoframe() {
	  WebElement frm=driver.findElement(By.id("myFrameSPA"));
	  driver.switchTo().frame(frm);
	  driver.findElement(By.xpath("//a[@href='javascript: void(0)']")).click();
  }
}

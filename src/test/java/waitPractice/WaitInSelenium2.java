package waitPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitInSelenium2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));//bydefault  constructor call hota hai
	    driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		driver.findElement(By.id("btn1")).click();
		WebElement we=wait.until(ExpectedConditions.presenceOfElementLocated(By.id("txt1")));// tbtk wait krega jbtk ye textbox present ni hoga, maximum 10 sec wait krega
		driver.findElement(By.id("txt1"));
		we.sendKeys("This is me");
		
		driver.findElement(By.id("btn2")).click();
		WebElement we1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txt2")));
		we1.sendKeys("This is me part2");
     	
	}

}

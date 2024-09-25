package screenshotInSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitInSelenium {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		driver.findElement(By.id("btn1")).click();
		Wait<WebDriver> wat=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(1))
				.ignoring(Exception.class);
		
		WebElement we=wat.until(ExpectedConditions.presenceOfElementLocated(By.id("txt1")));
		we.sendKeys("You are your teacher");
		driver.findElement(By.id("btn2")).click();
		
		WebElement we1=wat.until(ExpectedConditions.visibilityOfElementLocated(By.id("txt2")));
		we1.sendKeys("Love Yourself");
		
		
		
		
//
	}

}

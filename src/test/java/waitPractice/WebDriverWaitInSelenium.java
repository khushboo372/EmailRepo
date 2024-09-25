package waitPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWaitInSelenium {

	public static void main(String[] args) {
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
//		WebDriverWait wat=new WebDriverWait(driver,Duration.ofSeconds(10));
//		driver.findElement(By.id("btn1")).click();
//		WebElement we=wat.until(ExpectedConditions.presenceOfElementLocated(By.id("txt1")));
//		we.sendKeys("You are best");
//		
//		driver.findElement(By.id("btn2")).click();
//		WebElement we1=wat.until(ExpectedConditions.visibilityOfElementLocated(By.id("txt2")));
//		we1.sendKeys("Talk About yourself");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.navigate().to("https://www.hyrtutorials.com/p/waits-demo.html");
		driver.findElement(By.id("btn1")).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("txt1"))).sendKeys("Hello Explicit Wait");
		driver.findElement(By.id("btn2")).click();
		WebElement we= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txt2")));
		we.sendKeys("Waiting from 10 seconds");
		driver.close();
	}
	}

package javaScriptExecuter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollinSelenium2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,3000)");
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,1000)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,3000)");
		Thread.sleep(1000);
		//driver.findElement(By.xpath(""));
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");//scroll till bottom
	}

}

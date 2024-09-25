package javaScriptExecuter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollinSelenium {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		driver.get("https://www.hyrtutorials.com/");
		js.executeScript("window.scrollTo(0,4000)");
		
	   driver.findElement(By.xpath("//a[text()='Yada Giri Reddy ']")).click();
	//	driver.findElement(By.xpath("//a[@class='back-to-top']")).click();
		
		
		
	}

}

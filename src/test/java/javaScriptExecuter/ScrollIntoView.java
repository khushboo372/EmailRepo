package javaScriptExecuter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollIntoView {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement we=driver.findElement(By.xpath("//div[@class='ty_footer_copyright']/child::a[text()='Yada Giri Reddy ']"));
		js.executeScript("arguments[0].scrollIntoView()",we); //scroll krega tbtak object dikh ni jata
		
	}
	

}

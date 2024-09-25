package cssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicCssSelector {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://altoro.testfire.net/login.jsp");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input#uid")).sendKeys("jsmith");
		driver.findElement(By.cssSelector("input#passw")).sendKeys("demo1234");
		driver.findElement(By.cssSelector("input[name=btnSubmit]")).click();
		
		
		

	}

}

package selleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class NewBrowser {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("http://altoro.testfire.net/login.jsp");
		Thread.sleep(1000);
		driver.findElement(By.id("uid")).sendKeys("jsmith");
		Thread.sleep(1000);
		//driver.findElement(By.name("passw")).sendKeys("demo1234");
		driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/div/form/table/tbody/tr[2]/td[2]/input")).sendKeys("demo1234");
		Thread.sleep(1000);
		driver.findElement(By.name("btnSubmit")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("View Recent Transactions")).click();
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("Funds")).click();
		
		
		
		
		
		
		
	

		
		

	}

}

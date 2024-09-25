package waitPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitPracticeInSelenium {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://www.hyrtutorials.com/p/waits-demo.html");
		//timing match so didn't give error 
		driver.findElement(By.id("btn1")).click();
		//Thread.sleep(5000);
		driver.findElement(By.id("txt1")).sendKeys("My Name is Khushboo");
		
	//	timing didn't match so give error
		driver.findElement(By.id("btn2")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("txt2")).sendKeys("My name is Neha");
		
	  //  driver.manage().timeouts().implicitlyWait(Duration.Seconds(5));
		//driver.findElement(By.id("btn2")).sendKeys("My name is neha");
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		

	}

}

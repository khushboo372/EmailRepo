package framePractice;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IframeInSelenium2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		Thread.sleep(3000);	
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("This is main frame");
		
		
		WebElement web=driver.findElement(By.id("frm2")); //switching to frame 2 from main frame with help of webelement
		driver.switchTo().frame(web);
		driver.findElement(By.id("firstName")).sendKeys("Khushboo");
		
		int i=driver.findElements(By.tagName("iframe")).size();
		System.out.println(i);
		
		
		
		
		
	}

}

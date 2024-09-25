package framePractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IframeInSelenium {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("This is parent frame text");
		
	//	driver.findElements(By.xpath("//h3[text()='Frame1:']/following-sibling::iframe[@id='frm1']"));
		driver.switchTo().frame("frm1");
		
		WebElement we=driver.findElement(By.xpath("//label[@class='inp']/preceding-sibling::select[@id='course']"));
		Select sl=new Select(we);
		sl.selectByIndex(1);
		
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//input[@id='name']")).clear();
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("This is parent frame text-repeat");
		
		
		

		
	}

}

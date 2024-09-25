package framePractice;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IframeInSelenium3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.findElement(By.id("name")).sendKeys("Parent Frame");
		
		driver.switchTo().frame("frm3");
		driver.findElement(By.id("name")).sendKeys("This is frame 3");
		driver.switchTo().frame("frm1");
		
		WebElement we=driver.findElement(By.id("selectnav1"));
		Select sl=new Select(we);
		sl.selectByVisibleText("-- Automation Testing");
		sl.selectByValue("https://www.hyrtutorials.com/search/label/Java");
		sl.selectByIndex(4);
		driver.switchTo().parentFrame();
		driver.switchTo().frame("frm2");
		WebElement we1=driver.findElement(By.id("selectnav1"));
		String str=we1.getText();
		System.out.print(str);
		Select sl2=new Select(we1);
		sl2.selectByVisibleText("- Dot Net");
		driver.switchTo().frame("oauth2relay783696453");
		Thread.sleep(3000);
		
		
		
	}

}

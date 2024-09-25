package ignoreInTestng;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScenarioTest {
	WebDriver driver;
	@BeforeTest
	public void browserLaunch() {
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	}

	
	@Test
	public void windowhandle() throws InterruptedException {
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");//
		driver.manage().window().maximize();
		//window handle for new window
		String pwindow=driver.getWindowHandle();
		driver.findElement(By.xpath("//p[contains(text(),'This textbox is ')]/following-sibling::input")).sendKeys("This is parent window");
		System.out.println(pwindow);
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//p[contains(text(),'This button is ')]/following-sibling::button")).click();
		Set<String> cwindow=driver.getWindowHandles();
		Thread.sleep(1000);
		for(String str: cwindow) {
			if(!str.equals(pwindow)) {
				driver.switchTo().window(str);
				System.out.println(cwindow);
				String title=driver.getTitle();
				System.out.println(title);
				driver.findElement(By.xpath("//label[@class='inp']/following-sibling::input[@id='firstName']")).sendKeys("Khushboo");
				driver.close();				
			}
		}
		driver.switchTo().window(pwindow);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//p[contains(text(),'This textbox is ')]/following-sibling::input")).clear();
		driver.findElement(By.xpath("//p[contains(text(),'This textbox is ')]/following-sibling::input")).sendKeys("This is update");
	
	}
	
	@Test
	public void scroll() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		driver.get("https://www.hyrtutorials.com/");
		js.executeScript("window.scrollTo(0,4000)");
		
	   driver.findElement(By.xpath("//a[text()='Yada Giri Reddy ']")).click();
	}
	
	@Test
	public void frame() throws InterruptedException {
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

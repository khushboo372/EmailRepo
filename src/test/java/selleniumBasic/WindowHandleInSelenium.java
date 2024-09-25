package selleniumBasic;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandleInSelenium {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
//		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
//		String pwindow=driver.getWindowHandle();
//		System.out.println(pwindow);
	//	driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Text at parent page");
//	    driver.findElement(By.xpath("//button[@id='newWindowBtn']")).click();
//		
//		Set<String> cwindows=driver.getWindowHandles();
//		for(String we:cwindows) {
//			System.out.println(we);
//			
//		}
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		driver.getWindowHandle();
		
		driver.findElement(By.xpath("//div[@class='post-body entry-content']/descendant::input[@id='name']")).sendKeys("main Window");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@id='newWindowBtn']")).click();
		Set<String> winId= driver.getWindowHandles();
		for(String str : winId)
		{
			System.out.println(str);
		}
		
	}

}

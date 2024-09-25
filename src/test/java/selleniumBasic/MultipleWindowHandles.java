package selleniumBasic;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindowHandles {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		Thread.sleep(2000);
		
		String parentwin=driver.getWindowHandle();
		System.out.println("Parent Window ID= "+parentwin);
		
		Thread.sleep(2000);
		//driver.findElement(By.id("fileupload1")).click();
	//	driver.findElement(By.xpath("//button[@id='windowhandling1']")).click();
		
		driver.findElement(By.id("newTabsWindowsBtn")).click();
		
		
		Set<String> allwindow=driver.getWindowHandles();
		
		ArrayList<String> win=new ArrayList<>(allwindow);
		
		driver.switchTo().window(win.get(1));
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		
		
		
//		System.out.println("All window:");
//		for(String winz:allwindow) {
//			
//			System.out.println(driver.getTitle());
//			System.out.println(winz);
//			System.out.println();
//		}
		
		
		
		
		

	}

}

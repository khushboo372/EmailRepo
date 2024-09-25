package selleniumBasic;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandleInSelenium4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("This is parent tab");
		String bc=""; //Basic Controls
		String cm=""; //Contact Me
		String xp=""; // Xpath Practice
		String ad=""; // Alert Demo
		
		driver.findElement(By.id("newTabsWindowsBtn")).click();
		String pwindow=driver.getWindowHandle();
		System.out.println(pwindow);
		
		driver.findElement(By.id("newTabsWindowsBtn")).click();
		Set<String> cwindow= driver.getWindowHandles();
		
		
		for(String str:cwindow) {
			if(!str.equals(pwindow)) {
				driver.switchTo().window(str);
				String title=driver.getTitle();
				if(title.contains("Basic Controls")) {
					bc=str;	
					
					System.out.println(bc);
				}
				else if(title.contains("Contact Me")) {
					cm=str;
					
					System.out.println(cm);
				}
				else if(title.contains("Xpath Practice")) {
					xp=str;
					
					System.out.println(xp);
				}
				else if(title.contains("Alert Demo")) {
					ad=str;
					
					System.out.println(ad);
				}
				
				
			}
		}
		
		//Working on Basic Control
		driver.switchTo().window(bc);
		String str1=driver.getCurrentUrl();
		System.out.println(str1);
		driver.close();
		
//		        //Working on Basic Control
//				driver.switchTo().window(cm);
//				String str2=driver.getCurrentUrl();
//				System.out.println(str1);
//				driver.close();
//				
//				//Working on Basic Control
//				driver.switchTo().window(xp);
//				String str3=driver.getCurrentUrl();
//				System.out.println(str1);
//				driver.close();
//				
//				//Working on Basic Control
//				driver.switchTo().window(ad);
//				String str4=driver.getCurrentUrl();
//				System.out.println(str1);
//				driver.close();
				
		
	}
}	
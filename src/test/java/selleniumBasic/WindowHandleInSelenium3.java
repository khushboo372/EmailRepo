package selleniumBasic;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandleInSelenium3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("This is parent tab");
		String ptab=driver.getWindowHandle();
		System.out.println(ptab);
	    driver.findElement(By.xpath("//button[@id='newTabBtn']")).click();
	    Set<String> ctab=driver.getWindowHandles();
	    for(String str:ctab) {
	    	if(!str.equals(ptab)) {
	    		driver.switchTo().window(str);
	    		System.out.println(str);
	    		String title=driver.getTitle();
	    		System.out.println(title);
	    		driver.close();	    	}
	    }
	    driver.switchTo().window(ptab);
	    driver.findElement(By.xpath("//input[@id='name']")).clear();
	    driver.findElement(By.xpath("//input[@id='name']")).sendKeys("This is updated parent tab");
	    Thread.sleep(5000);
	    
	}
}	
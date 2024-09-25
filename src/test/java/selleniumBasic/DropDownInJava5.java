package selleniumBasic;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownInJava5 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		driver.manage().window().maximize();
		
		List<WebElement> lst= driver.findElements(By.xpath("//div[@class='basicControls']/child::select[@id='course']/option")); //locate dropdown
		
		
		System.out.println(lst.size());
		for(WebElement we:lst) {
			String ss=we.getText();
			System.out.println(ss);
			//how to select option without using select class
			
		}
		


	}

}

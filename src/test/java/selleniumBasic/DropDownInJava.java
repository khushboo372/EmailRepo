package selleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownInJava {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		driver.manage().window().maximize();
		
		WebElement dropdown= driver.findElement(By.id("course")); //locate dropdown
		Thread.sleep(3000);
		//to handle dropdown we have to use select class
		Select sl=new Select(dropdown); //dropdown webelement ka instance select me daal diya,finally dropdown ka instance sl me h 	
		//sl me 3 method mostly use krte h. selectByIndex(),selectByValue, selectByVisibleText
		
//		sl.selectByIndex(0);
//		Thread.sleep(3000);
//		sl.selectByIndex(1);
//		Thread.sleep(3000);
//		sl.selectByIndex(2);
//		Thread.sleep(3000);
//		sl.selectByIndex(3);
//		Thread.sleep(3000);
//		sl.selectByIndex(4);
//		Thread.sleep(3000);
		
//		sl.selectByVisibleText("Select");
//		sl.selectByVisibleText("Java");
//		sl.selectByVisibleText("Dot Net");
//		sl.selectByVisibleText("Javascript");
		
		sl.selectByValue("net");
		sl.selectByValue("js");
		
		

	}

}

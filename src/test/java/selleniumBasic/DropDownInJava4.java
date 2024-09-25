package selleniumBasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownInJava4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		driver.manage().window().maximize();
		
		WebElement dropdown= driver.findElement(By.id("ide")); //locate dropdown
		Thread.sleep(3000);
		//to handle dropdown we have to use select class
		Select sl=new Select(dropdown); //dropdown webelement ka instance select me daal diya,finally dropdown ka instance sl me h 	
		//sl me 3 method mostly use krte h. selectByIndex(),selectByValue, selectByVisibleText
		List<WebElement> we=sl.getOptions(); //getoption method options ko get kiya, ye list return krega
		for(WebElement ss: we) {
			String str=ss.getText(); //getText webelement ke text ko get krta h
			
			sl.selectByVisibleText(str); //ye select krega jo visible text jo str me paas hoke aaya h
			System.out.println(str);
		}
		

	}

}

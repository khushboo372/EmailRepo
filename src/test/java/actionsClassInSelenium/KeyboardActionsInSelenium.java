package actionsClassInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardActionsInSelenium {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://text-compare.com/");
		
		WebElement input1=driver.findElement(By.xpath("//textarea[@name='text1']"));
		input1.sendKeys("This is my journey");
		WebElement input2=driver.findElement(By.xpath("//textarea[@name='text2']"));
		Actions act=new Actions(driver);
		
		//CTRL+a
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.keyUp(Keys.CONTROL);
		act.build().perform();
		
		//ctrl+c
		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.keyUp(Keys.CONTROL);
		act.build().perform();
		
		//change focus
		act.sendKeys(Keys.TAB).build().perform();
		
		//ctrl+v
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.keyUp(Keys.CONTROL);
		act.build().perform();
		
		String str1=input1.getText();
		String str2=input2.getText();
		
		if(str1.equals(str2)) {
			System.out.println("Test case is pass");
		}
		else {
			System.out.println("Test case is failed");
		}
		
		
		
		
		
		
		

	}

}

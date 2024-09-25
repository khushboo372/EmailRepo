package actionsClassInSelenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElementInSelenium {
		public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to("https://www.flipkart.com/");
			Actions act=new Actions(driver);
		    WebElement fashion=driver.findElement(By.xpath("//span[text()='Fashion']"));
		    act.moveToElement(fashion).build().perform();
		    WebElement footwear= driver.findElement(By.xpath("//a[text()='Men Footwear']"));
		    act.moveToElement(footwear).build().perform();
		    WebElement shoecare= driver.findElement(By.xpath("//div[@class='_31z7R_']/descendant::a[text()='Shoe Care']"));
		    act.click(shoecare).build().perform();
		    
		    

		}
}

package actionsClassInSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ContextClickInSelenium {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		Actions act=new Actions(driver);
		WebElement we= driver.findElement(By.xpath("//span[text()='right click me']"));
		act.contextClick(we).build().perform();
		WebElement cut=driver.findElement(By.xpath("//span[text()='Cut']"));
		act.contextClick(cut).click().build().perform();
		
		
		Alert al=driver.switchTo().alert();
		
		System.out.println(al.getText());
		//al.accept();
		
		
		
		
		
		
	}

}

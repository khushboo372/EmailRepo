package selleniumBasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathAxesInSelenium {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		driver.manage().window().maximize();
//		String str=driver.findElement(By.xpath("(//td[text()='5000'])[1]")).getText();
//		System.out.println(str);
		
//		List<WebElement> we=driver.findElements(By.xpath("(//td[text()!='5000'])"));
//    	for(WebElement web:we) {
//			String ss=web.getText();
//			System.out.println(ss);
//		}
		
		//driver.findElement(By.xpath("//a[contains(text(),'account')]")).click(); //it takes partially text
		
		WebElement ss=driver.findElement(By.xpath("//label[normalize-space(text()='First Name ')]"));
		String str=ss.getText();
		System.out.println(str);
		
		driver.findElement(By.xpath("//label[text()='Last Name']/preceding-sibling::input")).sendKeys("Kumar");
		
		driver.findElement(By.xpath("//label[text()='Email']/following-sibling::input[1]")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//td[text()='Mexico']/preceding-sibling::td[2]/child::input")).click();
		
		
		
		
		
		

	}

}

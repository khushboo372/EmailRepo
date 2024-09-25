package selleniumBasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hyrtutorial {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		driver.manage().window().maximize();
		
		
//		WebElement value=driver.findElement(By.xpath("(//td[text()='5000'])[1]"));
//		String s=value.getText();
//		System.out.println(s);
		
		List<WebElement> fiscal=driver.findElements(By.xpath("//td[text()<='5000']")); 
		
//		for(WebElement ll:fiscal) {
//		System.out.println(ll.getText());
//	    }
		
//		
		int sum=0;
		for(WebElement we:fiscal) {
			String str= we.getText();  // tes
			int num=Integer.parseInt(str); //convert string into integer
			System.out.println("Value="+num);
			sum=sum+num;			
		}
		System.out.println(sum);
		

		
//		

	}

}

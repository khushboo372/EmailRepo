package selleniumBasic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertInSelenium {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		driver.manage().window().maximize();
		//Thread.sleep(1000);
		
		
       // driver.findElement(By.id("alertBox")).click();
     //   driver.findElement(By.id("confirmBox")).click();
       // driver.findElement(By.xpath("//div[contains(text(),'prompt box')]/button")).click(); 
	//	Thread.sleep(1000);
	//	Alert al=driver.switchTo().alert();
	//	Thread.sleep(1000);
		
	//	al.sendKeys("Test QA");	
		Thread.sleep(2000);
	//	al.accept();
		
//		WebElement output=driver.findElement(By.xpath("//div[@id='output']"));
//		String str = output.getText();
//		System.out.println(str);
		
		driver.findElement(By.xpath("//div[contains(text(),'prompt box')]/button")).click();
		Alert al = driver.switchTo().alert();
		Thread.sleep(2000);
		al.sendKeys("chanchal");
		Thread.sleep(5000);
		al.accept();
//		
//		WebElement out = driver.findElement(By.xpath("//div[@id='output']"));
//		String str = out.getText();
//		System.out.println(str);
//		driver.quit();
		

	}

}

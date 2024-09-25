package selleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathAxes2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//label[text()='Last Name']/preceding-sibling::input")).sendKeys("Rashmi");//firstname
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[text()='First Name ']/following-sibling::input[2]")).sendKeys("Kumari");//lastname
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='container']/child::input[3]")).sendKeys("abcd123@gmail.com");//email
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='container']/child::div[2]/input")).sendKeys("1235"); //password
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='container']/descendant::input[5]")).sendKeys("124");//repeat password
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//td[text()='Mexico']/preceding-sibling::td[2]/child::input")).click(); //working
		
		//driver.findElement(By.xpath("//div[@class='container']/descendant::button[@type='submit']")).click();  //register,working
       
		//driver.findElement(By.xpath("//div[@class='container']/descendant::button[2]")).click();   //clear button, working
	// 	driver.findElement(By.xpath("//div[@class='container']/descendant::button[@type='reset']")).click();   //reset button, working
		
		
		//driver.findElement(By.xpath("//div[@class='container']/child::div[3]/button[2]")).click(); //clear button,working
		//driver.findElement(By.xpath("//div[@class='container']/child::div[3]/button[3]")).click();  //reset button,working
	  //driver.findElement(By.xpath("//div[@class='container']/child::div[3]/input[@type='submit']")).click();   //refresh, working
		
		
	//	driver.findElement(By.xpath("//div[@class='container']/descendant::input[6]")).click();  //refresh, working
		
		
		
		
		}

}

package javaScriptExecuter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice.AllArguments;

public class JavaScriptExecuterInSelenium {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://altoro.testfire.net/login.jsp");
		Thread.sleep(1000);
		JavascriptExecutor js=(JavascriptExecutor)(driver);
		//js.executeScript("document.getElementById('uid').value='jsmith'");
		//js.executeScript("document.getElementsByName('passw')[0].value='demo1234'");
		
		//Thread.sleep(3000);
		//js.executeScript("document.getElementsByTagName('input')[4].click()");
//		js.executeScript("document.getElementsByName('btnSubmit')[0].style.color='red'");
//    	js.executeScript("document.getElementsByName('btnSubmit')[0].style.border='13px Solid red'");
//    	js.executeScript("document.getElementsByName('btnSubmit')[0].style.border='13px double red'");
//    	js.executeScript("document.getElementsByName('btnSubmit')[0].style.border='13px dotted green'");
		
    	WebElement uname=driver.findElement(By.id("uid"));  
    	js.executeScript("arguments[0].value='jsmith'",uname);
    	
    	WebElement pass=driver.findElement(By.id("passw"));
    	js.executeScript("arguments[0].value='demo1234'",pass);
    	
    	WebElement login=driver.findElement(By.name("btnSubmit"));
    	js.executeScript("arguments[2].click()",uname,pass,login);
    	
    	 
    	
    	
    	
    	Thread.sleep(8000);
    	driver.quit();
    	
		
		
	}

}

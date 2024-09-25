package assignment;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.astroyogi.com/kundli");
		driver.findElement(By.id("Kund_Name")).sendKeys("Manya");
		WebElement we=driver.findElement(By.id("UserGender"));
		
		Select sl=new Select(we);
		sl.selectByVisibleText("Female");
		
		WebElement date=driver.findElement(By.id("Date"));
		Select sl2=new Select(date);
		sl2.selectByVisibleText("5");
		
		List<WebElement> month=driver.findElements(By.id("Month"));		
		for(WebElement wem:month) {
		Select slmonth=new Select(wem);
		 slmonth.selectByValue("5");
		}
		
		List<WebElement> yem=driver.findElements(By.id("Year"));
		for(WebElement slyear:yem) {
			Select sls=new Select(slyear);
			sls.selectByIndex(3);
		}
		
		List<WebElement> y=driver.findElements(By.id("Kund_F_BirthPlace_Hour"));
		for(WebElement slyear:y) {
			Select sls=new Select(slyear);
			sls.selectByIndex(3);
		}
		
		WebElement time=driver.findElement(By.id("Kund_F_BirthPlace_Minute"));
		Select set=new Select(time);
		set.selectByIndex(5);
		
		WebElement am=driver.findElement(By.id("Kund_F_BirthPlace_AM"));
		Select ps=new Select(am);
		ps.selectByVisibleText("AM");
//		
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("document.getElementById('Kund_BirthPlace').value='bokaro'");
//		
		
		Actions act=new Actions(driver);
		
		WebElement web=driver.findElement(By.id("Kund_BirthPlace"));
//		//act.moveToElement(web);
//		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("Kund_BirthPlace")));
//		
		web.sendKeys("bokaro");
		Thread.sleep(2000);
		
		act.sendKeys(web,Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		WebElement target=driver.findElement(By.xpath("//div[text()='Bokaro, Jharkhand, IN']"));
		act.moveToElement(target).click().build().perform();
		Thread.sleep(2000);
//		act.moveToElement(Bokaro, Jharkhand, IN);
		
		driver.findElement(By.id("kundli_submit")).click();
//		
		
		
		
		
		
		
		
		
		
		
		Thread.sleep(20000);
		driver.quit();
	
		
		
		
		
		
		
		
	}

}

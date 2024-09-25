package pageClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.BaseClass2;

public class LoginPage2 extends BaseClass2 {
	
	public LoginPage2()  throws Exception {
		
	}
	
	WebElement uname=driver.findElement(By.id("uid"));
	WebElement pwd=driver.findElement(By.id("passw"));
	WebElement login=driver.findElement(By.name("btnSubmit"));
	
	public void enterUsername(String user) {
		uname.sendKeys(user);
		
	}
	
	public void enterPassword(String password) {
		pwd.sendKeys(password);
	}
	
	public void clickLogin() {
		login.click();
	}
	
	

}

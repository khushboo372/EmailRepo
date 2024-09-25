package testClass;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import base.BaseClass2;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageClass.LoginPage2;

public class LoginTest2 extends BaseClass2 {
	
	 LoginPage2 lpe;
	
	public LoginTest2() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		String pageurl=prop.getProperty("url");
		
		driver.get(pageurl);
		Thread.sleep(2000);
		lpe=new LoginPage2();
	}
		
	
	@Test
	public void loginPageTest() {
		
		String user=prop.getProperty("username");
		String pass=prop.getProperty("password");
		
		lpe.enterUsername(user);		
		lpe.enterPassword(pass);
		lpe.clickLogin();
		
	}

}

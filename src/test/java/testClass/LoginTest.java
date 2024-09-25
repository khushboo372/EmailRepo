package testClass;

import org.testng.annotations.Test;


import base.BaseClass;
import pageClass.LoginPage;

public class LoginTest extends BaseClass {
	LoginPage lp;
	
	@Test
	public void loginPageTest() {
		lp=new LoginPage();
		lp.enterUsername("jsmith");
		lp.enterPassword("demo1234");
		lp.clickLogin();
		
	}

}

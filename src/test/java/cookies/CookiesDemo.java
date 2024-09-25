package cookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CookiesDemo {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		//capture all cookies
	Set <Cookie> cookielist=driver.manage().getCookies();
	
	//size of cookies/ number of cookies
	System.out.println(cookielist.size());
	
	//print name and value of cookies
//	for(Cookie ck: cookielist) {
//		System.out.println(ck.getName()+":"+ck.getValue());
//		System.out.println();
//	}
	
	
	//get specific cookies according to name
//	System.out.println(driver.manage().getCookieNamed("ubid-acbin"));
	
	//create cookies
	Cookie cookieobj=new Cookie("testcookies","sfkjdwdhed");
	
	//add cookies
	driver.manage().addCookie(cookieobj);
	
	//again capture cookies
	Set <Cookie> cookielist2=driver.manage().getCookies();
	
	//print size of cookies
	System.out.println(cookielist2.size());
	
	//delete cookies
	driver.manage().deleteCookie(cookieobj);
	
	//again capture cookies
		Set <Cookie> cookielist3=driver.manage().getCookies();
		
		//print size of cookies
		System.out.println(cookielist3.size());
		
		
		
	
	
	driver.quit();

	}

}

package base;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass2 {
	public static WebDriver driver; 
	public static Properties prop;
	public BaseClass2() throws Exception {
		prop=new Properties();
		String path="D:\\Khushboo\\Java\\javaeclipse\\Custom\\src\\test\\java\\TestData.properties";
	    File f=new File(path);
	    if(f.exists()) {
	    	System.out.println("File Exists");
	    }
	    else {
	    	System.out.println("File does not exist");
	    }
	    FileInputStream fis=new FileInputStream(f);
	    prop.load(fis);
	    System.out.println(prop.getProperty("browser"));
	}
	
//	@BeforeTest
//	public void connest() throws InterruptedException {
//		WebDriverManager.chromedriver().setup();
//		driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		
//		String pageurl=prop.getProperty("url");
//		
//		driver.get(pageurl);
//		Thread.sleep(2000);
//	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
	}
		
	

}

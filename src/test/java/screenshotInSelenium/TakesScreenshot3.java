package screenshotInSelenium;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakesScreenshot3 {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/");
//		TakesScreenshot ts=(TakesScreenshot)driver;
//		String path="D:\\Khushboo\\Java\\javaeclipse\\Custom\\Screenshots\\image2.png";
//		FileOutputStream fos=new FileOutputStream(path);
//		String base64= ts.getScreenshotAs(OutputType.BASE64);
//		byte[] bt=Base64.getDecoder().decode(base64);
//		fos.write(bt);
        		
		
		TakesScreenshot ts= (TakesScreenshot)driver;
		String path="D:\\Khushboo\\Java\\javaeclipse\\Custom\\Screenshots\\image3.png";
		FileOutputStream fos=new FileOutputStream(path);
		String str= ts.getScreenshotAs(OutputType.BASE64);
		byte[] byt=Base64.getDecoder().decode(str);
		fos.write(byt);
		

	}

}

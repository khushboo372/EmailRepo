package listenerInTestng;

import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/");
		TakesScreenshot ts=(TakesScreenshot)driver;
		LocalDateTime ltd=LocalDateTime.now();
		System.out.println(ltd);
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("ddMMyyyyHHmmss");
		String str=ltd.format(dtf);
		String path="D:\\Khushboo\\Java\\javaeclipse\\Custom\\Screenshots\\"+str+".png";
		FileOutputStream fos=new FileOutputStream(path);
		byte[] bts=ts.getScreenshotAs(OutputType.BYTES);
		fos.write(bts);
		
		
		

	}

}

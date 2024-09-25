package screenshotInSelenium;

import java.io.FileOutputStream;
import java.io.IOException;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakesScreenshot4 {

	private static FileOutputStream fos;

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.geeksforgeeks.org//");
        TakesScreenshot ts=(TakesScreenshot)driver;
        String path=".\\Screenshots\\image3.png";
        fos = new FileOutputStream(path);
        byte[] byt=  ts.getScreenshotAs(OutputType.BYTES);
        fos.write(byt);

	}

}

package screenshotInSelenium;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakesScreenShot1 {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.geeksforgeeks.org/");
		driver.manage().window().maximize();
		TakesScreenshot ts=(TakesScreenshot)driver; //casting driver to TekesScreenshot
		File srcfile=ts.getScreenshotAs(OutputType.FILE);
		String path="D:\\Khushboo\\Java\\javaeclipse\\Custom\\Screenshots\\image1.png";
		File targettfile=new File(path);
		FileUtils.copyFile(srcfile, targettfile);
		

	}

}

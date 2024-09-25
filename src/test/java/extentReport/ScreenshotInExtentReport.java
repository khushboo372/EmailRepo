package extentReport;

import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.CodeLanguage;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotInExtentReport {
    
	@Test
	public void TakesScreenshotmethod() throws IOException, InterruptedException {
	      
		 ExtentReports extentReport=new ExtentReports();
		 ExtentSparkReporter sparkReporter=new ExtentSparkReporter("D:\\Khushboo\\Java\\javaeclipse\\Custom\\TestExtentReport\\report2.html");
		 extentReport.attachReporter(sparkReporter);
				
		  WebDriverManager.chromedriver().setup();
	      WebDriver driver=new ChromeDriver();
	      
	      driver.manage().window().maximize();
	    
	      
	      TakesScreenshot ts=(TakesScreenshot)driver;
	      LocalDateTime lt=LocalDateTime.now();
	    //  System.out.println(lt);
	      
	      DateTimeFormatter format=DateTimeFormatter.ofPattern("ddMMyyyyHHmmss");
	   //   System.out.println(format);
	      
	      String dtf=lt.format(format);
	      driver.get("https://www.google.com/");
	      Thread.sleep(2000);	
	      System.out.println(dtf);
	      
	      String path="D:\\Khushboo\\Java\\javaeclipse\\Custom\\Screenshots\\"+dtf+".png";
	      
	      FileOutputStream fos=new FileOutputStream(path);
	      byte[] arrby=ts.getScreenshotAs(OutputType.BYTES);
	      fos.write(arrby);
	     
	      
	      extentReport.createTest("ScreenshotTest")  //creating test case
	      .info("This is info message")              
	      .addScreenCaptureFromPath(path,"GoogleHomePage")
	      .assignDevice("window 10")
	      .assignCategory("Smoke Testing");  
	   //   fos.close();
	      driver.quit();
	      
	      
	      
	      
	      ExtentTest Test=extentReport.createTest("Test");
			
			Test.log(Status.SKIP,"Test case skip")
			.log(Status.PASS, "<b>Test case pass</b>")
			.log(Status.FAIL,"<i>Test cases is failed</i>")
			.log(Status.WARNING,"Warning1")
			.log(Status.INFO,"Test Information")
			.log(Status.WARNING,"Warning2");
			
			//printing json data
			String JSONData="{'name':'QA','Address':'IQ INDIA'}";
			Test.info(MarkupHelper.createCodeBlock(JSONData,CodeLanguage.JSON));
			Test.assignAuthor("Khushboo");	//assigning author
			
			//creating exception 
			try {
				int i=10/0;
				}catch(Exception e) {
					extentReport.createTest("Custom Exception").info("Hiii");
				}
	      
	      extentReport.flush();
	      
	      
	      
	      
	}
}

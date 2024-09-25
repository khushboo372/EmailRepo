package listenerInTestng;

import java.io.FileOutputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ITestListenerClass2ForScreenshotAndExtentReport  extends ScreenshotInExtentReport implements ITestListener  {

	public void onTestStart(ITestResult result) {
		System.out.println("on test start");
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("on test success");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("on test failure");
		

		ExtentReports extentReports = new ExtentReports();
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter(
				"D:\\Khushboo\\Java\\javaeclipse\\Custom\\TestExtentReport\\reportlistener.html");

		extentReports.attachReporter(sparkReporter);
		
		//WebDriver driver=null;

//		//to call instance of driver
//		try {
//			driver = (WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
//		} catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		TakesScreenshot ts = (TakesScreenshot) driver;
		LocalDateTime lt = LocalDateTime.now();
		// System.out.println(lt);

		DateTimeFormatter format = DateTimeFormatter.ofPattern("ddMMyyyyHHmmss");
		// System.out.println(format);

		String dtf = lt.format(format);
		

		System.out.println(dtf);
		String path;
		try {
			Thread.sleep(2000);
			 path = "D:\\Khushboo\\Java\\javaeclipse\\Custom\\Screenshots\\" + dtf + ".png";

			FileOutputStream fos = new FileOutputStream(path);
			byte[] arrby = ts.getScreenshotAs(OutputType.BYTES);
			fos.write(arrby);
		
		
		extentReports.createTest("ScreenshotTest")  //creating test case	                   
	      .addScreenCaptureFromPath(path,"HomePage");  
	   
	      
		} catch (Exception e) {
			System.out.println(e);
		}
		
		extentReports.flush();

	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("on test skipped");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("on test failed within success percentages");
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("failed with timeout");
	}

	public void onStart(ITestContext context) {
		System.out.println("on start");
	}

	public void onFinish(ITestContext context) {
		System.out.println("on finish");
	}

}

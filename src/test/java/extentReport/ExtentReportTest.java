package extentReport;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.ExtentSparkReporterConfig;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportTest {
   @Test
	public void extentTest() {
	   
		ExtentReports extentReports = new ExtentReports();
		ExtentSparkReporter sparkReporter=new ExtentSparkReporter("D:\\Khushboo\\Java\\javaeclipse\\Custom\\TestExtentReport\\report.html");
		
		extentReports.attachReporter(sparkReporter);
		
		ExtentTest Test1=extentReports.createTest("Test1");
		
		Test1.pass("<b>Test is pass</b>"); 
		Test1.fail("<i>Test is fail</i>");
		Test1.assignAuthor("Khushboo");
		
		ExtentTest ext2=extentReports.createTest("Test2");		
		ext2.pass("Test");
		ext2.assignAuthor("Neha");
		
		//creating dark theme
//		sparkReporter.config(
//				  ExtentSparkReporterConfig.builder()
//				    .theme(Theme.DARK)
//				    .documentTitle("MyReport")
//				    .build()
//				);
		
		
		sparkReporter.config().setTheme(Theme.DARK);
		
		//giving title of report
		sparkReporter.config().setDocumentTitle("MyReport of khushboo");
		
		extentReports.flush();
		
		
		
	}



}

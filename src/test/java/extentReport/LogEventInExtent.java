package extentReport;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.CodeLanguage;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class LogEventInExtent {
    
	@Test
	public void ExtentTest() {
		ExtentReports extentReports=new ExtentReports();
		ExtentSparkReporter sparkreporter=new ExtentSparkReporter("D:\\Khushboo\\Java\\javaeclipse\\Custom\\TestExtentReport\\report1.html");
		extentReports.attachReporter(sparkreporter);
		
		ExtentTest Test=extentReports.createTest("Test");
		
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
				extentReports.createTest("Custom Exception").info("Hiii");
			}
				
		extentReports.flush();
		
		
		
	}
}

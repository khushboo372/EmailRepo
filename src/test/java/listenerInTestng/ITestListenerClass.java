package listenerInTestng;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestListenerClass implements ITestListener {
     
	public void onTestStart(ITestResult result) {
		System.out.println("on test start");
	}
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("on test success");
	}
	
	public void onTestFailure(ITestResult result) {
		System.out.println("on test failure");
		
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

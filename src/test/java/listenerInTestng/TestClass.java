package listenerInTestng;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ITestListenerClass.class)  //using @Listener annotation 
public class TestClass {
    
	@Test(priority=1)
	public void Test1() {
		System.out.println("inside test1");
	}
	
	@Test(priority=2)
	public void Test2() {
		System.out.println("inside test2");
	}
	
	@Test(priority=3, timeOut=200)
	public void Test3() throws InterruptedException {
		System.out.println("inside test3");
		Thread.sleep(1000);
	}
	
	@Test(priority=4,dependsOnMethods="Test3")
	public void Test4() {
		System.out.println("inside test4");
	}
}

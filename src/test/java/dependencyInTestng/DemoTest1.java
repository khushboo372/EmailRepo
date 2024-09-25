package dependencyInTestng;

import org.testng.annotations.Test;

public class DemoTest1 {
	@Test (groups="smoke")
    public void TC001() {
    	System.out.println("Test Case001");
    }
	
	
	@Test (groups={"sanity"})
    public void TC002() {
    	System.out.println("Test Case002");
    }
	
	@Test(groups="Regression")
    public void TC003() {
    	System.out.println("Test Case003");
    }
	
	@Test(groups="weekly")
    public void TC004() {
    	System.out.println("Test Case004");
    }
	
	
	@Test
    public void TC005() {
    	System.out.println("Test Case005");
    }
}

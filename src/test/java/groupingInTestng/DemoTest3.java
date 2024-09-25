package groupingInTestng;

import org.testng.annotations.Test;

public class DemoTest3 {
	@Test (groups="os.mac")
    public void TC011() {
    	System.out.println("Test Case011");
    }	
	
	@Test (groups="sanity")
    public void TC012() {
    	System.out.println("Test Case012");
    }
	
	@Test (groups="regression")
    public void TC013() {
    	System.out.println("Test Case013");
    }
	
	
	@Test (groups={"dailybuild","weeklybuild"})
    public void TC014() {
    	System.out.println("Test Case014");
    }
	
	@Test (groups= {"sanity","smoke"})
    public void TC015() {
    	System.out.println("Test Case015");
	}
}

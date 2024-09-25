package dependencyInTestng;

import org.testng.annotations.Test;

public class DemoTest2 {
	@Test (groups="smoke")
    public void TC006() {
    	System.out.println("Test Case006");
    }	
	
	@Test (groups="sanity")
    public void TC007() {
    	System.out.println("Test Case007");
    }
	
	@Test (groups="regression")
    public void TC008() {
    	System.out.println("Test Case008");
    }
	
	
	@Test (groups={"dailybuild","weeklybuild"})
    public void TC009() {
    	System.out.println("Test Case009");
    }
	
	@Test (groups= {"smoke"})
    public void TC010() {
    	System.out.println("Test Case010");
	}
}

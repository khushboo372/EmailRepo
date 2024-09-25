package ignoreInTestng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnoreInTest2 {
	@Test
    public void TC006() {
    	System.out.println("Test Case006");
    }
	
	@Ignore
	@Test
    public void TC007() {
    	System.out.println("Test Case007");
    }
	
	@Test
    public void TC008() {
    	System.out.println("Test Case008");
    }
	
	@Ignore
	@Test
    public void TC009() {
    	System.out.println("Test Case009");
    }
	
	@Test
    public void TC0010() {
    	System.out.println("Test Case010");
    }
}

package ignoreInTestng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnoreInTest {
	@Test
    public void TC001() {
    	System.out.println("Test Case001");
    }
	
	@Ignore
	@Test
    public void TC002() {
    	System.out.println("Test Case002");
    }
	
	@Test
    public void TC003() {
    	System.out.println("Test Case003");
    }
	
	@Test
    public void TC004() {
    	System.out.println("Test Case004");
    }
	
	@Ignore
	@Test
    public void TC005() {
    	System.out.println("Test Case005");
    }
}

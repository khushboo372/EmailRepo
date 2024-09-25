package ignoreInTestng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnoreInTest3 {
	@Test
    public void TC011() {
    	System.out.println("Test Case011");
    }
	
	@Ignore
	@Test
    public void TC012() {
    	System.out.println("Test Case012");
    }
	
	@Test
    public void TC013() {
    	System.out.println("Test Case013");
    }
	
	@Test
    public void TC014() {
    	System.out.println("Test Case014");
    }
	
	@Ignore
	@Test
    public void TC015() {
    	System.out.println("Test Case015");
    }
}

package enableDesableInTestng;


import org.testng.annotations.Test;

public class Test1 {
	@Test
    public void TC001() {
    	System.out.println("Test Case001");
    }
	
	
	@Test
    public void TC002() {
    	System.out.println("Test Case002");
    }
	
	@Test(enabled=false)
    public void TC003() {
    	System.out.println("Test Case003");
    }
	
	@Test
    public void TC004() {
    	System.out.println("Test Case004");
    }
	
	
	@Test
    public void TC005() {
    	System.out.println("Test Case005");
    }

}

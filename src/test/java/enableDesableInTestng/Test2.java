package enableDesableInTestng;


import org.testng.annotations.Test;

public class Test2 {
	
	@Test(enabled=false)
    public void TC006() {
    	System.out.println("Test Case006");
    }	
	
	@Test
    public void TC007() {
    	System.out.println("Test Case007");
    }
	
	@Test(enabled=false)
    public void TC008() {
    	System.out.println("Test Case008");
    }
	
	
	@Test
    public void TC009() {
    	System.out.println("Test Case009");
    }
	
	@Test
    public void TC010() {
    	System.out.println("Test Case010");
	}
}


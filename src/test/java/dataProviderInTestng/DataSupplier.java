package dataProviderInTestng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataSupplier {
	@Test(dataProvider="test")
	public void Test(String s1) { // three test bnayega alag alag value ke liye
		System.out.println(s1);
	}
	
	@DataProvider(name="test")
	public String[] DataSource() {
		String[] s=new String[] {"Test","QA","Dev"};
		return s;
	}

}

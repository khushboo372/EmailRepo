package dataProviderInTestng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataSupplier1 {
	
	@Test(dataProvider="giver")
	public void Datauser(String st) {  
		System.out.println(st);
	}
	

	
	@DataProvider(name="giver")
	public String[] DataSource() {  //returning array of string
		String[] st=new String[]{"Data","Set"}; //defining array of string
		return st;
	}
}

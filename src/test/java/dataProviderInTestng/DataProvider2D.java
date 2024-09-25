package dataProviderInTestng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class DataProvider2D {
	
   @Test (dataProvider="test")
   public void DataUser(Object ob1,Object ob2) {
	   System.out.print(ob1);
	   System.out.print("-");
	   System.out.print(ob2);
	   
	  System.out.println();
   }
	
	
	
	@DataProvider(name="test")
	public Object[][] dataSource() {
		Object[][] ob=new Object[][]{ 
			{"s1","s2"},
			{"s4","s5"},
			{"s6","s8"}};
		return ob;
	}
}

package dataProviderInTestng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataSupplierObject {
	
	@Test(dataProvider="DataSource")  //name ni denge data provider ka to method ka name hi data provider ka name hoga
	public void User(Object ob) {
		System.out.println(ob);
	}

	@DataProvider
	public Object[] DataSource() {
		Object[] ob=new Object[] {"Set","String","345",34,23.5};
		return ob;
	}
}

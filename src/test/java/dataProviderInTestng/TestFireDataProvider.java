package dataProviderInTestng;

import org.testng.annotations.DataProvider;

public class TestFireDataProvider {

	//parallel by default false hoga isse true krne pe hi hm xml file me suite level
	//pe (data-provider-thread-count="3")likhenge to kaam krega ni to ni krega 
	
	//indices se hm particular index pe data to use kr sakte hai
	
	@DataProvider(name="Provider",parallel=true,indices= {0,3,5})
	public Object[][] Datasource() {
		Object[][] ob=new Object[][]
				{{"jsmith","demo1234"},
				{"jssmith","demo12345"},
				{"jsmithh1","demo12"},
				{"jsmith4","demo1234"},
				{"jssmith","demo12345"},
				{"jsmithh2","demo12"},
				{"jsmith","demo1234"},
				{"jssmith2","demo12345"},
				{"jsmithh","demo12"}};
		return ob;
	}

}

package examples;


import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(TestNGListenerExample.class)
public class DataProviderExample {
//	boolean r= true;
	int a=10;
	int b=5;
//	@Test (dataProvider = "data-provider")
	public void test(int a, int b) {
		
		int result = a / b;
//		if(result==5) {
//			r= true;
//		}
	System.out.println(result);
	
//	Assert.assertEquals(r, true);
	}
	
//	@DataProvider (name = "data-provider")
	
	
//	public Object[][] dpMethod() {
//		return  new Object[][] {{2},{5}};
//	}
	
}

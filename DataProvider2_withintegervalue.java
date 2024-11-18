package dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider2_withintegervalue {
	
	@DataProvider(name="set1")
	public Object[][] intvalue()
	{
		return new Object[][] {{200},{400},{600},{800}};
	}
	
	@Test(dataProvider="set1")
	public void addition(int input)
	{
		int sum=100+input;
		System.out.println(sum);
	}

}
